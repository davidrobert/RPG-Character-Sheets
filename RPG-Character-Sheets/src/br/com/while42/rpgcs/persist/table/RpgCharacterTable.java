package br.com.while42.rpgcs.persist.table;

import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;

public final class RpgCharacterTable {

	public static final String NAME = "rpg_character";

	public static class RpgCharacterColumns implements BaseColumns {
		public static final String NAME = "name";

		public static String[] get() {
			return new String[] { BaseColumns._ID, RpgCharacterColumns.NAME };
		}
	}

	public static void onCreate(SQLiteDatabase db) {
		StringBuilder sb = new StringBuilder();
		sb.append("CREATE TABLE " + RpgCharacterTable.NAME + " (");
		sb.append(BaseColumns._ID + " INTEGER PRIMARY KEY, ");
		sb.append(RpgCharacterColumns.NAME + " TEXT UNIQUE NOT NULL");
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
