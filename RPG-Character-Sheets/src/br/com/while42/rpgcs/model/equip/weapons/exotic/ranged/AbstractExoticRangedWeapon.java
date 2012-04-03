package br.com.while42.rpgcs.model.equip.weapons.exotic.ranged;

import br.com.while42.rpgcs.model.equip.weapons.BasicWeapon;
import br.com.while42.rpgcs.model.equip.weapons.CategorieEncumbranceWeapon;
import br.com.while42.rpgcs.model.equip.weapons.CategorieUsefulnessWeapon;
import br.com.while42.rpgcs.model.equip.weapons.exotic.AbstractExoticWeapon;

public abstract class AbstractExoticRangedWeapon extends AbstractExoticWeapon {

	public AbstractExoticRangedWeapon(BasicWeapon base) {
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
