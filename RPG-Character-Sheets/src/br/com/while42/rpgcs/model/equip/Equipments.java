package br.com.while42.rpgcs.model.equip;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.com.while42.rpgcs.model.equip.armor.Armor;
import br.com.while42.rpgcs.model.equip.weapons.SizeWeapon;
import br.com.while42.rpgcs.model.equip.weapons.Weapon;
import br.com.while42.rpgcs.model.equip.weapons.especial.EspecialWeapon;

public class Equipments implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private List<Weapon> weapons = new ArrayList<Weapon>();
	private List<Armor> armors = new ArrayList<Armor>();
	
	// -- Weapons
	
	public void addWeapon(Weapon weapon) {
		weapons.add(weapon);
	}
	
	public void addWeapon(Weapon weapon, SizeWeapon size) {
		weapon.setSize(size);
		weapons.add(weapon);
	}
	
	public void addWeapon(Weapon weapon, SizeWeapon size, Boolean equiped) {
		weapon.setSize(size);
		weapon.setEquiped(equiped);
		weapons.add(weapon);
	}
	
	public void addWeapon(EspecialWeapon weapon) {
		weapons.add(weapon);
	}
	
	public void addWeapon(EspecialWeapon weapon, Boolean equiped) {
		weapon.setEquiped(equiped);
		weapons.add(weapon);
	}
	
	public void removeWeapon(int index) {
		weapons.remove(index);
	}
	
	public void clearWeapon() {
		weapons.clear();
	}
	
	public void setWeaponEquiped(int index, Boolean equiped) {
		weapons.get(index).setEquiped(equiped);
	}
	
	public List<Weapon> getWeapons() {
		return new ArrayList<Weapon>(weapons);
	}
	
	// -- Armors
	
	public void addArmors(Armor armor) {
		armors.add(armor);
	}
	
	public void removeArmor(int index) {
		armors.remove(index);
	}
	
	public void clearArmor() {
		armors.clear();
	}
	
	public void setArmorEquiped(int index, Boolean equiped) {
		armors.get(index).setEquiped(equiped);
	}
	
	public List<Armor> getArmors() {
		return new ArrayList<Armor>(armors);
	}

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
