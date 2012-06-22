package br.com.while42.rpgcs.model.character;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import br.com.while42.rpgcs.model.HitDice;
import br.com.while42.rpgcs.model.equip.weapons.SizeWeapon;
import br.com.while42.rpgcs.model.equip.weapons.TypeWeapon;
import br.com.while42.rpgcs.model.equip.weapons.Weapon;

public class Attack implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Weapon weapon;
	private SizeWeapon size;
	private String observation;
	
	public Attack(Weapon weapon, SizeWeapon size, Abilities abilities) {
		this.weapon = weapon;
		this.size = size;
		this.observation = new String();
	}
	
	public Weapon getWeapon() {
		return weapon;
	}
	
	public List<HitDice> getDamage() {
		return weapon.getDamage(size);
	}
	
	public Set<TypeWeapon> getType() { 
		return weapon.getType();
	}
	
	public String getObservation() {
		return observation;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;

		if (!(o instanceof Attack))
			return false;

		Attack attk = (Attack) o;
		
		return weapon.equals(attk.weapon) &&
				size.equals(attk.size) &&
				observation.equals(attk.observation);
	}
	
	@Override
	public int hashCode() {
		return weapon.hashCode() + size.hashCode() + observation.hashCode();
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(" weapon: ").append(weapon.toString());
		sb.append(" size: ").append(size);
		sb.append(" observation: ").append(observation);
		
		return sb.toString();
	}
}
