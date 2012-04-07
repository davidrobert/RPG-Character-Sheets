package br.com.while42.rpgcs.persist;

import java.util.ArrayList;
import java.util.List;

import br.com.while42.rpgcs.model.character.RpgCharacter;
import br.com.while42.rpgcs.persist.dao.CharacterDAO;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;


public class DataManager {

	public static final int DATABASE_VERSION = 11;

	private Context context;
	private SQLiteDatabase db;
	private boolean useDebugDb = false;

	private CharacterDAO characterDao;

	public DataManager(Context context) {
		this.context = context;
		openDb();
	}

	public DataManager(Context context, boolean useDebugDb) {
		this.context = context;
		this.useDebugDb = useDebugDb;
		openDb();
	}

	public SQLiteDatabase getDb() {
		return db;
	}

	public boolean closeDb() {
		if (db != null && db.isOpen()) {
			try {
				db.close();
				return true;
			} catch (SQLiteException e) {
				// Log.w("DataManager", e.getMessage());
			}
		}

		return false;
	}

	public boolean openDb() {
		if (db == null || !db.isOpen()) {
			db = new OpenHelper(context, useDebugDb).getWritableDatabase();

			// since we pass db into DAO, have to recreate DAO if db is
			// re-opened
			characterDao = new CharacterDAO(context);

			return true;
		}

		return false;
	}

	// Match operations

	public long saveCharacter(RpgCharacter character) {
		long matchId = 0L;
		try {
			db.beginTransaction();
			matchId = characterDao.save(character);

			db.setTransactionSuccessful();
		} catch (SQLException e) {
			// Log.e(context.getResources().getString(R.string.app_name),
			// "Error saving match (transaction rolled back)", e);
			matchId = 0L;
		} finally {
			db.endTransaction();
		}

		return matchId;
	}

	public RpgCharacter retrieveCharacter(long characterId) {
		RpgCharacter character = characterDao.get(characterId);
		
		return character;
	}

	public List<RpgCharacter> retrieveAllCharacters() {
		List<RpgCharacter> characters = new ArrayList<RpgCharacter>();

		return characters;
	}

	public boolean deleteCharacter(RpgCharacter character) {
		boolean result = false;
		try {
			db.beginTransaction();
			if (character != null) {

				characterDao.delete(character);
			}
			db.setTransactionSuccessful();
			result = true;
		} catch (SQLException e) {
			// Log.e(context.getResources().getString(R.string.app_name),
			// "Error deleting match (transaction rolled back)", e);
		} finally {
			db.endTransaction();
		}

		return result;
	}

}

