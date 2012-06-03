package br.com.while42.rpgcs.persist;

import br.com.while42.rpgcs.model.character.RpgCharacter;
import br.com.while42.rpgcs.model.character.RpgCharacterTest;
import br.com.while42.rpgcs.persist.dao.RpgCharacterDAO;
import br.com.while42.rpgcs.persist.table.RpgCharacterTable;
import android.database.sqlite.SQLiteDatabase;
import android.test.AndroidTestCase;

public class DataManagerTest extends AndroidTestCase {

	SQLiteDatabase db;
	DataManager dataManager;

	RpgCharacterDAO rpgCharacterDAO;

	protected void setUp() throws Exception {
		super.setUp();

		dataManager = new DataManager(getContext(), true);
		db = dataManager.getDb();
		clearAllTables();

		rpgCharacterDAO = new RpgCharacterDAO(db);
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

		RpgCharacter rpgCharacter = RpgCharacterTest.createInstanceCharacter();

		Long id = rpgCharacterDAO.save(rpgCharacter);

		// match
		assertTrue(id > 0);
		assertEquals(id, rpgCharacter.getId());
	}

	public void testRetrieveRpgCharacter() {
		
		RpgCharacter rpgCharacter = RpgCharacterTest.createInstanceCharacter();

		Long id = rpgCharacterDAO.save(rpgCharacter);
		
		RpgCharacter rpgCharacter2 = rpgCharacterDAO.retrieve(id);

		assertTrue(rpgCharacter.equals(rpgCharacter2));
	}
}
