package br.com.while42.rpgcs.persist.table;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;
import android.util.Log;
import br.com.while42.rpgcs.model.classes.AbstractRpgClass;

public final class RpgClassTable {

	public static final String NAME = "rpg_class";

	public static class RpgClassColumns implements BaseColumns {
		public static final String ID_RPG_CHARACTER = "id_rpg_character";
		public static final String NAME = "name";	
		public static final String LEVEL = "level";
		
		public static String[] get() {
			return new String[] { 					
					RpgClassColumns.ID_RPG_CHARACTER,
					RpgClassColumns.NAME,
					RpgClassColumns.LEVEL
			};
		}
	}
	
	public static ContentValues toContentValues(Long idRpgCharacter, AbstractRpgClass rpgClass) {
		ContentValues values = new ContentValues();

		// values.put("id", a.getId()); // WRONG!
		values.put(RpgClassColumns.ID_RPG_CHARACTER, idRpgCharacter.toString());
		values.put(RpgClassColumns.NAME, rpgClass.getClass().getName());
		values.put(RpgClassColumns.LEVEL, rpgClass.getClassLevel());
		
		return values;
	}

	public static void onCreate(SQLiteDatabase db) {
		StringBuilder sb = new StringBuilder();
		sb.append("CREATE TABLE " + RpgClassTable.NAME + " (");
		
		sb.append(RpgClassColumns.ID_RPG_CHARACTER + " INTEGER,");
		sb.append(RpgClassColumns.NAME + " TEXT, ");
		sb.append(RpgClassColumns.LEVEL + " INTEGER, ");
		
		sb.append("PRIMARY KEY (");
		sb.append(RpgClassColumns.ID_RPG_CHARACTER).append(", ");
		sb.append(RpgClassColumns.NAME);
		sb.append(" )");
		
		sb.append(");");

		Log.i(">>", sb.toString());
		db.execSQL(sb.toString());
	}

	public static void onUpgrade(SQLiteDatabase db, int oldVersion,
			int newVersion) {
		db.execSQL("DROP TABLE IF EXISTS " + RpgClassTable.NAME);
		onCreate(db);
	}

	public static void clear(SQLiteDatabase db) {
		db.execSQL("DELETE FROM " + RpgClassTable.NAME);
	}
}
