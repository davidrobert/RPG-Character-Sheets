package br.com.while42.rpgcs.persist.dao;

import java.util.List;

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
			+ new TableColumnsUtils()
					.getAsCommaSeparatedStringWithoutFirstColumn(RpgCharacterColumns
							.get())
			+ ") VALUES "
			+ new TableColumnsUtils()
					.getQuestionMarksWithoutFirstColumn(RpgCharacterColumns.get());

	private SQLiteDatabase db;
	private SQLiteStatement insertStatement;

	public RpgCharacterDAO(SQLiteDatabase db) {
		this.db = db;
		insertStatement = db.compileStatement(INSERT);
	}
	
	@Override
	public long save(RpgCharacter rpgCharacter) {
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
			insertStatement.bindString(8, rpgCharacter.getHeight().toString());
			insertStatement.bindString(9, rpgCharacter.getWeight().toString());
			insertStatement.bindString(10, rpgCharacter.getEye().toString());
			insertStatement.bindString(11, rpgCharacter.getHair().toString());
			insertStatement.bindString(12, rpgCharacter.getSkin().toString());
			
			Log.i("SAVE", insertStatement.toString());
			
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public RpgCharacter retrieve(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RpgCharacter> retrieveAll() {
		// TODO Auto-generated method stub
		return null;
	}


	
}
