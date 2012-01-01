package br.com.while42.rpgcs.persist;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import br.com.while42.rpgcs.model.RpgCharacter;

public class CharacterDAO extends SQLiteOpenHelper {
	
	private static final int VERSION = 1;
	private static final String TABLE = "rpg_character";
	private static final String[] COLS = {"id", "name"};	

	public CharacterDAO(Context context) {
		super(context, TABLE, null, VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		StringBuilder sb = new StringBuilder();		
		sb.append("CREATE TABLE ").append(TABLE).append(" (");
		sb.append("id INTEGER PRIMARY KEY, ");
		sb.append("name TEXT UNIQUE NOT NULL ");		
		sb.append(")");
		
		db.execSQL(sb.toString());

	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		
		StringBuilder sb = new StringBuilder();
		sb.append("DROP TABLE IF EXISTS ").append(TABLE);
		db.execSQL(sb.toString());
		
		onCreate(db);

	}
	
public void save(RpgCharacter rpgCharacter) {			
		
		ContentValues values = toValues(rpgCharacter);
				
		if (!rpgCharacter.isPersistent()) {
			
			long insert = getWritableDatabase().insert(TABLE, null, values);
			rpgCharacter.setId(insert);
			
		} else {
			String[] whereArgs = new String[] { Long.toString(rpgCharacter.getId()) };
			getWritableDatabase().update(TABLE, values, "id=?", whereArgs );
		}
	}
		
	public void delete(RpgCharacter student) {		
		
		String[] whereArgs = new String[] { Long.toString(student.getId()) };
		getWritableDatabase().delete(TABLE, "id=?", whereArgs);		
	}
	
	
	public List<RpgCharacter> getList() {			
		
		List<RpgCharacter> rpgCharacters = new ArrayList<RpgCharacter>();		
		Cursor cursor = getWritableDatabase().query(TABLE, 
				COLS,    // Colunas 
				null,    // where
				null,    // values
				null,    // group by
				null,    // having
				"name"); // order by
		
		while (cursor.moveToNext()) {
			
			RpgCharacter rpgCharacter = new RpgCharacter();
			
			rpgCharacter.setId(cursor.getInt(0));
			rpgCharacter.setName(cursor.getString(1));
			
			rpgCharacters.add(rpgCharacter);
		}
		
		cursor.close();
		
		return rpgCharacters;
	}
	
public ContentValues toValues(RpgCharacter rpgCharacter) {
		
		ContentValues values = new ContentValues();
		
		if (rpgCharacter.isPersistent())
		{
			values.put("id", rpgCharacter.getId());
		}
		
		values.put("name", rpgCharacter.getName());
		
		return values;
	}

}
