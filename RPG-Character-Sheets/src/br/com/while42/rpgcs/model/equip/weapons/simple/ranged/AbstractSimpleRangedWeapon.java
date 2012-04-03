package br.com.while42.rpgcs.model.equip.weapons.simple.ranged;

import br.com.while42.rpgcs.model.equip.weapons.BasicWeapon;
import br.com.while42.rpgcs.model.equip.weapons.CategorieEncumbranceWeapon;
import br.com.while42.rpgcs.model.equip.weapons.CategorieUsefulnessWeapon;
import br.com.while42.rpgcs.model.equip.weapons.simple.AbstractSimpleWeapon;


public abstract class AbstractSimpleRangedWeapon extends AbstractSimpleWeapon {
	
	public AbstractSimpleRangedWeapon(BasicWeapon base) {
		super(base);
	}

	@Override
	public final CategorieUsefulnessWeapon getCategorieUsefulness() {
		return CategorieUsefulnessWeapon.RANGED;
	}
	
	@Override
	public final CategorieEncumbranceWeapon getCategorieEncumbrance() {
		return null;
	}
	
	
}
