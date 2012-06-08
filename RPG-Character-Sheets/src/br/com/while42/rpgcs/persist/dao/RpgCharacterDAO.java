package br.com.while42.rpgcs.persist.dao;

import java.util.ArrayList;
import java.util.List;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.provider.BaseColumns;
import android.util.Log;
import br.com.while42.rpgcs.model.character.RpgCharacter;
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

	public RpgCharacterDAO(SQLiteDatabase db) {
		this.db = db;
		insertStatement = db.compileStatement(INSERT);
	}
	
	@Override
	public Long save(RpgCharacter rpgCharacter) {
		if (rpgCharacter.getId() == 0) {
			
			//db.insert(RpgCharacterTable.NAME, nullColumnHack, values)
			insertStatement.clearBindings();
			
			insertStatement.bindString(1, rpgCharacter.getName());
			insertStatement.bindLong(2, RpgCharacter.getSerialVersionUID());
			insertStatement.bindBlob(3, RpgCharacter.serialize(rpgCharacter));
			
			rpgCharacter.setId(insertStatement.executeInsert());
			
		} else {
			this.update(rpgCharacter);
		}
		
		return rpgCharacter.getId();
	}

	@Override
	public void update(RpgCharacter rpgCharacter) {
		db.update(RpgCharacterTable.NAME, RpgCharacterTable.toContentValues(rpgCharacter), BaseColumns._ID
				+ " = ?", new String[] { String.valueOf(rpgCharacter.getId()) });
	}

	@Override
	public void delete(RpgCharacter rpgCharacter) {
		if (rpgCharacter.isPersistent()) {
			db.delete(RpgCharacterTable.NAME, BaseColumns._ID + " = ?",
					new String[] { String.valueOf(rpgCharacter.getId()) });
			
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
			
			long atual = RpgCharacter.getSerialVersionUID();
			long retrieve = cursor.getLong(2);
			
			if (atual != retrieve) {
				Log.e("ERROR", "Diferente Serial Version UID! [atual: " + atual + ", retrieve: " + retrieve + "]");
				return null;
			}
			
			rpgCharacter = RpgCharacter.deserialize(cursor.getBlob(3));
			rpgCharacter.setId(cursor.getLong(0));
		}

		return rpgCharacter;
	}
}
