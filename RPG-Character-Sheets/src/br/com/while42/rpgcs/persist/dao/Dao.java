package br.com.while42.rpgcs.persist.dao;

import java.util.List;

public interface Dao<T> {
	Long save(T type);

	void update(T type);

	void delete(T type);
	
	T retrieve(long id);
	
	List<T> retrieveAll();
}
