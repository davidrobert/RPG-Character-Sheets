package br.com.while42.rpgcs.persist.dao;

import java.util.ArrayList;
import java.util.List;

import android.database.sqlite.SQLiteDatabase;
import android.test.AndroidTestCase;
import br.com.while42.rpgcs.model.classes.AbstractRpgClass;
import br.com.while42.rpgcs.model.classes.Barbarian;
import br.com.while42.rpgcs.model.classes.Monk;
import br.com.while42.rpgcs.persist.DataManager;
import br.com.while42.rpgcs.persist.table.RpgClassTable;

public class RpgClassDAOTest extends AndroidTestCase {

	private SQLiteDatabase db;
	private DataManager dataManager;
	private RpgClassDAO dao;

	protected void setUp() throws Exception {
		super.setUp();

		dataManager = new DataManager(getContext(), true);
		db = dataManager.getDb();
		clearAllTables();

		dao = new RpgClassDAO(db);
	}

	protected void tearDown() throws Exception {
		dataManager.closeDb();
		super.tearDown();
	}

	public void clearAllTables() {
		RpgClassTable.clear(db);
	}

	public void testSave() {
		Barbarian barbarian = new Barbarian();
		barbarian.setClassLevel(1);

		long id = dao.save(1L, barbarian);

		assertTrue(id > 0);
	}

	public void testRetrieveAll() {
		clearAllTables();

		List<AbstractRpgClass> list = new ArrayList<AbstractRpgClass>();
		
		Barbarian barbarian = new Barbarian();
		barbarian.setClassLevel(1);
		list.add(barbarian);

		Monk monk = new Monk();
		monk.setClassLevel(10);
		list.add(monk);
		
		for (AbstractRpgClass rpgClass: list) {
			long id = dao.save(1L, rpgClass);
			assertTrue(id > 0);
		}

		List<AbstractRpgClass> retrieveAll = dao.retrieveAll(1L);
		
		assertEquals(list.size(), retrieveAll.size());
		
		// Estou assumindo que a ordem dos elementos dentro do retrieveAll esta em ordem alfabetica de class
		
		assertEquals(barbarian.getClass(), retrieveAll.get(0).getClass());
		assertEquals(barbarian.getClassLevel(), retrieveAll.get(0).getClassLevel());
		
		assertEquals(monk.getClass(), retrieveAll.get(1).getClass());
		assertEquals(monk.getClassLevel(), retrieveAll.get(1).getClassLevel());	
	}
	
	public void testDelete() {
		clearAllTables();

		List<AbstractRpgClass> list = new ArrayList<AbstractRpgClass>();
		
		Barbarian barbarian = new Barbarian();
		barbarian.setClassLevel(1);
		list.add(barbarian);

		Monk monk = new Monk();
		monk.setClassLevel(10);
		list.add(monk);
		
		for (AbstractRpgClass rpgClass: list) {
			long id = dao.save(1L, rpgClass);
			assertTrue(id > 0);
		}

		List<AbstractRpgClass> retrieveAll = dao.retrieveAll(1L);
		
		assertEquals(list.size(), retrieveAll.size());
		
		dao.delete(1L, barbarian);
		
		retrieveAll = dao.retrieveAll(1L);
		assertEquals(1, retrieveAll.size());
		
		assertEquals(monk.getClass(), retrieveAll.get(0).getClass());
		assertEquals(monk.getClassLevel(), retrieveAll.get(0).getClassLevel());
		
		dao.delete(1L, monk);
		
		assertTrue(dao.retrieveAll(1L).isEmpty());
	}
	
	public void testDeleteAll() {
		clearAllTables();

		List<AbstractRpgClass> list = new ArrayList<AbstractRpgClass>();
		
		Barbarian barbarian = new Barbarian();
		barbarian.setClassLevel(1);
		list.add(barbarian);

		Monk monk = new Monk();
		monk.setClassLevel(10);
		list.add(monk);
		
		for (AbstractRpgClass rpgClass: list) {
			long id = dao.save(1L, rpgClass);
			assertTrue(id > 0);
		}

		List<AbstractRpgClass> retrieveAll = dao.retrieveAll(1L);
		
		assertEquals(list.size(), retrieveAll.size());
		
		dao.deleteAll(1L);
		
		assertTrue(dao.retrieveAll(1L).isEmpty());
	}

}
