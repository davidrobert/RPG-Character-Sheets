package br.com.while42.rpgcs.model.equip;

import java.io.Serializable;

public class Equipments implements Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;

		if (!(o instanceof Equipments))
			return false;

		//Equipments eq = (Equipments) o;
		
		return true;
	}
	
	@Override
	public int hashCode() {		
		return super.hashCode();
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		return sb.toString();
	}
}
