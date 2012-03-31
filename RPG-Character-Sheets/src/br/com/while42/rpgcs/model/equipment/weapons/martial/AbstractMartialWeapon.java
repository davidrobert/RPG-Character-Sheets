package br.com.while42.rpgcs.model.equipment.weapons.martial;

import br.com.while42.rpgcs.model.equipment.weapons.Weapon;
import br.com.while42.rpgcs.model.equipment.weapons.CategorieWeapon;


public abstract class AbstractMartialWeapon implements Weapon {
	@Override
	public final CategorieWeapon getCategorie() {
		return CategorieWeapon.MARTIAL;
	}
}
