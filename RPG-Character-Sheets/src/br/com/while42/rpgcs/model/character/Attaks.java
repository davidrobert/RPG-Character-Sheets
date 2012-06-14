package br.com.while42.rpgcs.model.character;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import br.com.while42.rpgcs.model.equip.weapons.SizeWeapon;
import br.com.while42.rpgcs.model.equip.weapons.Weapon;
import br.com.while42.rpgcs.model.equip.weapons.munition.Munition;

public class Attaks implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Abilities abilities;	
	private List<Attak> attks = new ArrayList<Attak>();
	private Set<Munition> munitions = new HashSet<Munition>();
	
	public Attaks(Abilities abilities) {
		this.abilities = abilities;
	}
	
	public void add(Weapon weapon, SizeWeapon size) {
		attks.add(new Attak(weapon, size, abilities));
	}
	
	public List<Attak> getAttaks() {
		return attks;
	}
	
	public void add(Munition munition) {
		munitions.add(munition);
	}
	
	public Set<Munition> getMunitions() {
		return munitions;
	}

	
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;

		if (!(o instanceof Attaks))
			return false;

		Attaks aks = (Attaks) o;
		
		return abilities.equals(aks.abilities) &&
			   attks.equals(aks.attks) &&
			   munitions.equals(aks.munitions);
	}
	
	@Override
	public int hashCode() {
		return abilities.hashCode() + attks.hashCode() + munitions.hashCode();
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(" attaks: [");
		for (Attak a: attks) {
			sb.append(a);
		}
		sb.append("]");
		sb.append(" munitions: [");
		for (Munition m: munitions) {
			sb.append(m);
		}
		sb.append("]");
		
		return sb.toString();
	}
}
