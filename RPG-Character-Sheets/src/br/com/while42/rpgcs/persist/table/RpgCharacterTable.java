package br.com.while42.rpgcs.persist.table;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;
import br.com.while42.rpgcs.model.character.RpgCharacter;

public final class RpgCharacterTable {

	public static final String NAME = "rpg_character";

	public static class RpgCharacterColumns implements BaseColumns {
		
		public static final String NAME = "name";
		public static final String SERIAL_VERSION = "serialVersionUID";
		public static final String SERIALIZE = "serialize";

		public static String[] get() {
			return new String[] { 
					BaseColumns._ID, 
					
					RpgCharacterColumns.NAME,
					RpgCharacterColumns.SERIAL_VERSION,
					RpgCharacterColumns.SERIALIZE,
			};
		}
	}
	
	public static ContentValues toContentValues(RpgCharacter rpgCharacter) {
		ContentValues values = new ContentValues();

		// values.put("id", a.getId()); // WRONG!
		
		values.put(RpgCharacterColumns.NAME, rpgCharacter.getAttributes().getName());
		values.put(RpgCharacterColumns.SERIAL_VERSION, RpgCharacter.getSerialVersionUID());
		values.put(RpgCharacterColumns.SERIALIZE, RpgCharacter.serialize(rpgCharacter));

		return values;
	}

	public static void onCreate(SQLiteDatabase db) {
		StringBuilder sb = new StringBuilder();
		sb.append("CREATE TABLE " + RpgCharacterTable.NAME + " (");
		sb.append(BaseColumns._ID + " INTEGER PRIMARY KEY, ");
		
		sb.append(RpgCharacterColumns.NAME + " TEXT,");
		sb.append(RpgCharacterColumns.SERIAL_VERSION + " INTEGER, ");
		sb.append(RpgCharacterColumns.SERIALIZE + " BLOB ");
		
		sb.append(");");

		db.execSQL(sb.toString());
	}

	public static void onUpgrade(SQLiteDatabase db, int oldVersion,
			int newVersion) {
		db.execSQL("DROP TABLE IF EXISTS " + RpgCharacterTable.NAME);
		onCreate(db);
	}

	public static void clear(SQLiteDatabase db) {
		db.execSQL("DELETE FROM " + RpgCharacterTable.NAME);
	}
}
