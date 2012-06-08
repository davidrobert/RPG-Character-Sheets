package br.com.while42.rpgcs.persist;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import br.com.while42.rpgcs.persist.table.RpgCharacterTable;

public class OpenHelper extends SQLiteOpenHelper {
	OpenHelper(final Context context, boolean useDebugDatabase) {
		super(context, useDebugDatabase ? DataConstants.DEBUG_DATABASE_NAME
				: DataConstants.DATABASE_NAME, null,
				DataManager.DATABASE_VERSION);
	}

	@Override
	public void onOpen(final SQLiteDatabase db) {
		super.onOpen(db);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		RpgCharacterTable.onCreate(db);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, final int oldVersion,
			final int newVersion) {
		RpgCharacterTable.onUpgrade(db, oldVersion, newVersion);
	}

}
