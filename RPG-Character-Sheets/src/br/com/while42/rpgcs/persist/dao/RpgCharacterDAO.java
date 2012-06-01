package br.com.while42.rpgcs.persist.dao;

import java.util.List;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
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
	public long save(RpgCharacter type) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void update(RpgCharacter type) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(RpgCharacter type) {
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
