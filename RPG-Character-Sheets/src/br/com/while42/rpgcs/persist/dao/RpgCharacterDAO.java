package br.com.while42.rpgcs.persist.dao;

import java.util.ArrayList;
import java.util.List;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.provider.BaseColumns;
import br.com.while42.rpgcs.model.character.RpgCharacter;
import br.com.while42.rpgcs.model.character.attributes.TypeEyeColor;
import br.com.while42.rpgcs.model.character.attributes.TypeGender;
import br.com.while42.rpgcs.model.character.attributes.TypeHairColor;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgAlignment;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgRace;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgReligion;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgSize;
import br.com.while42.rpgcs.model.character.attributes.TypeSkinColor;
import br.com.while42.rpgcs.model.classes.AbstractRpgClass;
import br.com.while42.rpgcs.persist.TableColumnsUtils;
import br.com.while42.rpgcs.persist.table.RpgCharacterTable;
import br.com.while42.rpgcs.persist.table.RpgCharacterTable.RpgCharacterColumns;


public class RpgCharacterDAO implements Dao<RpgCharacter> {

	private static final String INSERT = "INSERT INTO "
			+ RpgCharacterTable.NAME
			+ "("
			+ new TableColumnsUtils().getAsCommaSeparatedStringWithoutFirstColumn(RpgCharacterColumns.get())
			+ ") VALUES "
			+ new TableColumnsUtils().getQuestionMarksWithoutFirstColumn(RpgCharacterColumns.get());

	private SQLiteDatabase db;
	private SQLiteStatement insertStatement;
	private RpgClassDAO daoClass;

	public RpgCharacterDAO(SQLiteDatabase db) {
		this.db = db;
		insertStatement = db.compileStatement(INSERT);
		daoClass = new RpgClassDAO(db);
	}
	
	@Override
	public Long save(RpgCharacter rpgCharacter) {
		if (rpgCharacter.getId() == 0) {
			
			//db.insert(RpgCharacterTable.NAME, nullColumnHack, values)
			insertStatement.clearBindings();
			
			insertStatement.bindString(1, rpgCharacter.getName());
			insertStatement.bindString(2, rpgCharacter.getRace().toString());
			insertStatement.bindString(3, rpgCharacter.getAlignment().toString());
			insertStatement.bindString(4, rpgCharacter.getReligion().toString());
			
			insertStatement.bindString(5, rpgCharacter.getSize().toString());
			insertStatement.bindString(6, rpgCharacter.getAge().toString());
			insertStatement.bindString(7, rpgCharacter.getGender().toString());
			insertStatement.bindLong(8, rpgCharacter.getHeight());
			insertStatement.bindLong(9, rpgCharacter.getWeight());
			insertStatement.bindString(10, rpgCharacter.getEye().toString());
			insertStatement.bindString(11, rpgCharacter.getHair().toString());
			insertStatement.bindString(12, rpgCharacter.getSkin().toString());
			
			rpgCharacter.setId(insertStatement.executeInsert());
			
			for (AbstractRpgClass rpgClass: rpgCharacter.getRpgClasses()) {
				daoClass.save(rpgCharacter.getId(), rpgClass);
			}
			
		} else {
			this.update(rpgCharacter);
			
			daoClass.deleteAll(rpgCharacter.getId());
			for (AbstractRpgClass rpgClass: rpgCharacter.getRpgClasses()) {
				daoClass.save(rpgCharacter.getId(), rpgClass);
			}
		}
		
		return rpgCharacter.getId();
	}

	@Override
	public void update(RpgCharacter rpgCharacter) {
		db.update(RpgCharacterTable.NAME, RpgCharacterTable.toContentValues(rpgCharacter), BaseColumns._ID
				+ " = ?", new String[] { String.valueOf(rpgCharacter.getId()) });
		
		daoClass.deleteAll(rpgCharacter.getId());
		for (AbstractRpgClass rpgClass: rpgCharacter.getRpgClasses()) {
			daoClass.save(rpgCharacter.getId(), rpgClass);
		}
	}

	@Override
	public void delete(RpgCharacter rpgCharacter) {
		if (rpgCharacter.isPersistent()) {
			db.delete(RpgCharacterTable.NAME, BaseColumns._ID + " = ?",
					new String[] { String.valueOf(rpgCharacter.getId()) });
			
			for (AbstractRpgClass rpgClass: rpgCharacter.getRpgClasses()) {
				daoClass.delete(rpgCharacter.getId(), rpgClass);
			}
			
			rpgCharacter.setId(0L);
		}
		
	}

	@Override
	public RpgCharacter retrieve(Long id) {
		RpgCharacter rpgCharacter = null;
		
		Cursor cursor = db.query(RpgCharacterTable.NAME, RpgCharacterColumns.get(),
				BaseColumns._ID + " = ?", // where
				new String[] { id.toString() }, // values
				null, // group by
				null, // having
				null, // order by
				"1");  // limit
		
		if (cursor.moveToFirst()) {
			rpgCharacter = this.buildRpgCharacterFromCursor(cursor);
			rpgCharacter.addRpgClass(daoClass.retrieveAll(rpgCharacter.getId()));
		}

		if (!cursor.isClosed()) {
			cursor.close();
		}

		return rpgCharacter;
	}

	@Override
	public List<RpgCharacter> retrieveAll() {
		List<RpgCharacter> myList = new ArrayList<RpgCharacter>();

		Cursor cursor = db.query(RpgCharacterTable.NAME, RpgCharacterColumns.get(), 
				null, // where
				null, // values
				null, // group by
				null, // having
				RpgCharacterColumns.NAME, // order by
				null); // limit

		if (cursor.moveToFirst()) {
			do {
				RpgCharacter rpgCharacter = this.buildRpgCharacterFromCursor(cursor);
				rpgCharacter.addRpgClass(daoClass.retrieveAll(rpgCharacter.getId()));
				myList.add(rpgCharacter);
			} while (cursor.moveToNext());
		}

		if (!cursor.isClosed()) {
			cursor.close();
		}

		return myList;
	}

	private RpgCharacter buildRpgCharacterFromCursor(Cursor cursor) {
		RpgCharacter rpgCharacter = null;

		if (cursor != null) {
			rpgCharacter = new RpgCharacter();
			rpgCharacter.setId(cursor.getLong(0));
			
			rpgCharacter.setName(cursor.getString(1));
			rpgCharacter.setRace(TypeRpgRace.valueOf(cursor.getString(2)));
			rpgCharacter.setAlignment(TypeRpgAlignment.valueOf(cursor.getString(3)));
			rpgCharacter.setReligion(TypeRpgReligion.valueOf(cursor.getString(4)));
			
			rpgCharacter.setSize(TypeRpgSize.valueOf(cursor.getString(5)));
			rpgCharacter.setAge(cursor.getInt(6));
			rpgCharacter.setGender(TypeGender.valueOf(cursor.getString(7)));
			rpgCharacter.setHeight(cursor.getInt(8));
			rpgCharacter.setWeight(cursor.getInt(9));
			rpgCharacter.setEye(TypeEyeColor.valueOf(cursor.getString(10)));
			rpgCharacter.setHair(TypeHairColor.valueOf(cursor.getString(11)));
			rpgCharacter.setSkin(TypeSkinColor.valueOf(cursor.getString(12)));
		}

		return rpgCharacter;
	}
	
}
