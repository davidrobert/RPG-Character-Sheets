package br.com.while42.rpgcs.model.equip.weapons.especial;

import br.com.while42.rpgcs.model.equip.weapons.AbstractWeapon;
import br.com.while42.rpgcs.model.equip.weapons.BasicWeapon;
import br.com.while42.rpgcs.model.equip.weapons.CategorieEncumbranceWeapon;
import br.com.while42.rpgcs.model.equip.weapons.CategorieUsefulnessWeapon;
import br.com.while42.rpgcs.model.equip.weapons.CategorieWeapon;
import br.com.while42.rpgcs.model.equip.weapons.Weapon;

public class EspecialWeapon extends AbstractWeapon implements Weapon {
	private static final long serialVersionUID = 1L;

	private String name;
	private BasicWeapon base;
	
	protected EspecialWeapon(String name, BasicWeapon base) {
		super(base);
		this.name = name;
		this.base = base;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public CategorieWeapon getCategorie() {
		return base.getCategorie();
	}

	@Override
	public CategorieUsefulnessWeapon getCategorieUsefulness() {
		return base.getCategorieUsefulness();
	}

	@Override
	public CategorieEncumbranceWeapon getCategorieEncumbrance() {
		return base.getCategorieEncumbrance();
	}

}
