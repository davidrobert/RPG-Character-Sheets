package br.com.while42.rpgcs.model.equipment.weapons.simple;

import br.com.while42.rpgcs.model.equipment.weapons.Weapon;
import br.com.while42.rpgcs.model.equipment.weapons.CategorieWeapon;


public abstract class AbstractSimpleWeapon implements Weapon {
	@Override
	public final CategorieWeapon getCategorie() {
		return CategorieWeapon.SIMPLE;
	}
}
