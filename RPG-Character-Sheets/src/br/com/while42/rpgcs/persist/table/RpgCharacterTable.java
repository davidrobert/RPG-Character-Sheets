package br.com.while42.rpgcs.persist.table;

import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;

public final class RpgCharacterTable {

	public static final String NAME = "rpg_character";

	public static class RpgCharacterColumns implements BaseColumns {
		public static final String NAME = "name";
		public static final String RACE = "race";	
		public static final String ALIGNMENT = "alignment";
		public static final String RELIGION = "religion";
		
		public static final String SIZE = "size";
		public static final String AGE = "age";	
		public static final String GENDER = "gender";
		public static final String HEIGHT = "height";
		public static final String WEIGHT = "weight";
		public static final String EYE = "eye";
		public static final String HAIR = "hair";
		public static final String SKIN = "skin";

		public static String[] get() {
			return new String[] { 
					BaseColumns._ID, 
					RpgCharacterColumns.NAME,
					RpgCharacterColumns.RACE,
					RpgCharacterColumns.ALIGNMENT,
					RpgCharacterColumns.RELIGION,
					
					RpgCharacterColumns.SIZE,					
					RpgCharacterColumns.AGE,
					RpgCharacterColumns.GENDER,
					RpgCharacterColumns.HEIGHT,
					RpgCharacterColumns.WEIGHT,
					RpgCharacterColumns.EYE,
					RpgCharacterColumns.HAIR,
					RpgCharacterColumns.SKIN
			};
		}
	}

	public static void onCreate(SQLiteDatabase db) {
		StringBuilder sb = new StringBuilder();
		sb.append("CREATE TABLE " + RpgCharacterTable.NAME + " (");
		sb.append(BaseColumns._ID + " INTEGER PRIMARY KEY, ");
		sb.append(RpgCharacterColumns.NAME + " TEXT");
		sb.append(RpgCharacterColumns.RACE + " TEXT");
		sb.append(RpgCharacterColumns.ALIGNMENT + " TEXT");
		sb.append(RpgCharacterColumns.RELIGION + " TEXT");
		
		sb.append(RpgCharacterColumns.SIZE + " TEXT");
		sb.append(RpgCharacterColumns.AGE + " TEXT");
		sb.append(RpgCharacterColumns.GENDER + " TEXT");
		sb.append(RpgCharacterColumns.HEIGHT + " TEXT");
		sb.append(RpgCharacterColumns.WEIGHT + " TEXT");
		sb.append(RpgCharacterColumns.EYE + " TEXT");
		sb.append(RpgCharacterColumns.HAIR + " TEXT");
		sb.append(RpgCharacterColumns.SKIN + " TEXT");
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
