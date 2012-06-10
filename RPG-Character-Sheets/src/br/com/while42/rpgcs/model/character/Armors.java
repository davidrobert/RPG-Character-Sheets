package br.com.while42.rpgcs.model.character;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.com.while42.rpgcs.model.equip.armor.Armor;

public class Armors implements Serializable {
	private static final long serialVersionUID = 1L;

	private List<Armor> arms = new ArrayList<Armor>();
	
	public void add(Armor armor) {
		arms.add(armor);
	}
	
	public List<Armor> getAll() {
		return new ArrayList<Armor>(arms);
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;

		if (!(o instanceof Armors))
			return false;

		Armors ars = (Armors) o;

		return arms.equals(ars.arms);
	}
	
	@Override
	public int hashCode() {		
		return arms.hashCode();
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(" [ ");
		for (Armor a: arms) {
			sb.append(" armor: ").append(a);
		}
		sb.append(" ] ");
		
		return sb.toString();
	}
}
