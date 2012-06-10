package br.com.while42.rpgcs.model.character;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.com.while42.rpgcs.model.equip.weapons.SizeWeapon;
import br.com.while42.rpgcs.model.equip.weapons.Weapon;

public class Attaks implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Abilities abilities;	
	private List<Attak> attks = new ArrayList<Attak>();
	
	public Attaks(Abilities abilities) {
		this.abilities = abilities;
	}
	
	public void add(Weapon weapon, SizeWeapon size) {
		attks.add(new Attak(weapon, size, abilities));
	}
	
	public List<Attak> getAll() {
		return attks;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;

		if (!(o instanceof Attaks))
			return false;

		Attaks aks = (Attaks) o;
		
		return abilities.equals(aks.abilities) &&
				attks.equals(aks.attks);
	}
	
	@Override
	public int hashCode() {
		return abilities.hashCode() + attks.hashCode();
	}
}
