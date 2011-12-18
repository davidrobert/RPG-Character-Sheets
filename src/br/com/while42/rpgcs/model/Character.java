package br.com.while42.rpgcs.model;

import java.io.Serializable;

public class Character implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private long id;
	private String name;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	@Override
	public String toString() {
		return this.name;
	}
	
	public boolean isPersistent() {
		return getId() != 0;
	}
}
