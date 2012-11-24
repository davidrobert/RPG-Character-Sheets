package br.com.while42.rpgcs.persist;

import java.util.List;

import android.test.AndroidTestCase;
import android.util.Log;
import br.com.while42.rpgcs.model.character.RpgCharacter;
import br.com.while42.rpgcs.model.character.RpgCharacterTest;

public class DataManagerTest extends AndroidTestCase {

	private static boolean DEBUGDB = true;
	private DataManager dataManager;

	protected void setUp() throws Exception {
		super.setUp();

		dataManager = new DataManager(getContext(), DEBUGDB);
		clearAllTables();
	}

	public void clearAllTables() {
		dataManager.deleteAllRpgCharacter();
	}

	/*
	protected void tearDown() throws Exception {
		dataManager.closeDb();
		super.tearDown();
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
	*/

	public void testSaveRpgCharacter() {

		RpgCharacter rpgCharacter = RpgCharacterTest.getList().get(0);

		Long id = dataManager.saveRpgCharacter(rpgCharacter);

		// match
		assertTrue(id > 0);
		assertEquals(id.longValue(), rpgCharacter.getId().longValue());
	}
	
	public void testSaveRpgCharacterWithNewDataManager() {

		RpgCharacter rpgCharacter = RpgCharacterTest.getList().get(0);

		dataManager.saveRpgCharacter(rpgCharacter);

		List<RpgCharacter> characters = new DataManager(getContext(), DEBUGDB).retrieveAllRpgCharacters();
		
		// match
		assertTrue(characters.size() > 0);
		assertTrue(characters.contains(rpgCharacter));
	}

	public void testSaveRpgCharacterNull() {

		Long id = dataManager.saveRpgCharacter(null);

		// match
		assertEquals(Long.valueOf(0L), id);
	}
	
	public void testRetrieveRpgCharacter() throws Exception {
		
		RpgCharacter rpgCharacter = RpgCharacterTest.getList().get(0);
		
		Long id = dataManager.saveRpgCharacter(rpgCharacter);
		
		assertTrue(id > 0);
		
		RpgCharacter rpgCharacter2 = dataManager.retrieveRpgCharacter(id);
		
		Log.d("original:", rpgCharacter.toString());
		Log.d("salvado :", rpgCharacter2.toString());		
		
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
	
	public void testDeleteRpgCharacterNull() {
		boolean status = dataManager.deleteRpgCharacter(null);
		assertFalse(status);
	}
}
