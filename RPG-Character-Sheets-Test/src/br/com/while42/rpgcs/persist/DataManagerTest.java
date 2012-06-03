package br.com.while42.rpgcs.persist;

import java.util.List;

import android.database.sqlite.SQLiteDatabase;
import android.test.AndroidTestCase;
import br.com.while42.rpgcs.model.character.RpgCharacter;
import br.com.while42.rpgcs.model.character.RpgCharacterTest;
import br.com.while42.rpgcs.persist.table.RpgCharacterTable;

public class DataManagerTest extends AndroidTestCase {

	SQLiteDatabase db;
	DataManager dataManager;

	protected void setUp() throws Exception {
		super.setUp();

		dataManager = new DataManager(getContext(), true);
		db = dataManager.getDb();
		clearAllTables();
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

		RpgCharacter rpgCharacter = RpgCharacterTest.getList().get(0);

		Long id = dataManager.saveRpgCharacter(rpgCharacter);

		// match
		assertTrue(id > 0);
		assertEquals(id, rpgCharacter.getId());
	}

	public void testRetrieveRpgCharacter() throws Exception {
		
		RpgCharacter rpgCharacter = RpgCharacterTest.getList().get(0);
		
		Long id = dataManager.saveRpgCharacter(rpgCharacter);
		
		RpgCharacter rpgCharacter2 = dataManager.retrieveRpgCharacter(id);
		
		assertTrue(rpgCharacter.equals(rpgCharacter2));		
	}
	
	public void testRetrieveAllRpgCharacters() {
		clearAllTables();
		
		List<RpgCharacter> list = RpgCharacterTest.getList();
		
		for (RpgCharacter rc: list) {
			dataManager.saveRpgCharacter(rc);
		}
		
		List<RpgCharacter> rpgCharacters = dataManager.retrieveAllRpgCharacters();
		for (RpgCharacter rc: list) {
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
