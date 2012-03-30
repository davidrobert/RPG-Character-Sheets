package br.com.while42.rpgcs.model.equipment.weapons.exotic;

import br.com.while42.rpgcs.model.equipment.weapons.BasicWeapon;
import br.com.while42.rpgcs.model.equipment.weapons.CategorieWeapon;


public abstract class AbstractExoticWeapon implements BasicWeapon {
	@Override
	public final CategorieWeapon getCategorie() {
		return CategorieWeapon.EXOTIC;
	}
}
