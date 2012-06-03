package br.com.while42.rpgcs.persist;

import java.util.List;

import android.database.sqlite.SQLiteDatabase;
import android.test.AndroidTestCase;
import android.util.Log;
import br.com.while42.rpgcs.model.character.RpgCharacter;
import br.com.while42.rpgcs.model.character.RpgCharacterTest;
import br.com.while42.rpgcs.persist.table.RpgCharacterTable;

public class DataManagerTest extends AndroidTestCase {

	SQLiteDatabase db;
	DataManager dataManager;

	//RpgCharacterDAO rpgCharacterDAO;

	protected void setUp() throws Exception {
		super.setUp();

		dataManager = new DataManager(getContext(), true);
		db = dataManager.getDb();
		clearAllTables();

		//rpgCharacterDAO = new RpgCharacterDAO(db);
	}

	protected void tearDown() throws Exception {
		dataManager.closeDb();
		super.tearDown();
	}

	public void clearAllTables() {
		RpgCharacterTable.clear(db);
	}

	public void testCloseDb() {
		assertTrue(dataManager.closeDb());
		assertFalse(dataManager.closeDb());
	}

	public void testOpenDb() {
		assertFalse(dataManager.openDb());
		dataManager.closeDb();
		assertTrue(dataManager.openDb());
	}

	public void testSaveRpgCharacter() {

		RpgCharacter rpgCharacter = RpgCharacterTest.getInstance();

		Long id = dataManager.saveRpgCharacter(rpgCharacter);

		// match
		assertTrue(id > 0);
		assertEquals(id, rpgCharacter.getId());
	}

	public void testRetrieveRpgCharacter() {
		clearAllTables();
		
		RpgCharacter rpgCharacter = RpgCharacterTest.getInstance();

		Long id = dataManager.saveRpgCharacter(rpgCharacter);
		Log.i("**", id.toString());
		
		RpgCharacter rpgCharacter2 = dataManager.retrieveRpgCharacter(id);

		
		Log.i("**: ", rpgCharacter.toString());
		Log.i("**: ", rpgCharacter2.toString());
		
		assertTrue(rpgCharacter.equals(rpgCharacter2));		
	}
	
	public void testRetrieveAllRpgCharacters() {
		clearAllTables();
		
		for (RpgCharacter rc: RpgCharacterTest.getList()) {
			dataManager.saveRpgCharacter(rc);
		}
		
		List<RpgCharacter> rpgCharacters = dataManager.retrieveAllRpgCharacters();
		for (RpgCharacter rc: RpgCharacterTest.getList()) {
			assertTrue(rpgCharacters.contains(rc));
		}
		
		assertEquals(rpgCharacters.size(), RpgCharacterTest.getList().size());
	}
	
	public void testDeleteRpgCharacter() {
		List<RpgCharacter> list = RpgCharacterTest.getList();
		
		for (RpgCharacter rc: list) {
			dataManager.saveRpgCharacter(rc);
		}
		
		assertTrue(dataManager.retrieveAllRpgCharacters().size() > 0);
		
		for (RpgCharacter rc: list) {
			dataManager.deleteRpgCharacter(rc);
		}
		
		assertTrue(dataManager.retrieveAllRpgCharacters().isEmpty());
	}
}
