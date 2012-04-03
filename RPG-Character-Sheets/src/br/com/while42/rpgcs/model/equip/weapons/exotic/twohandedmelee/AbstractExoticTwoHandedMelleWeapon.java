package br.com.while42.rpgcs.model.equip.weapons.exotic.twohandedmelee;

import br.com.while42.rpgcs.model.equip.weapons.BasicWeapon;
import br.com.while42.rpgcs.model.equip.weapons.CategorieEncumbranceWeapon;
import br.com.while42.rpgcs.model.equip.weapons.CategorieUsefulnessWeapon;
import br.com.while42.rpgcs.model.equip.weapons.exotic.AbstractExoticWeapon;

public abstract class AbstractExoticTwoHandedMelleWeapon extends AbstractExoticWeapon {

	public AbstractExoticTwoHandedMelleWeapon(BasicWeapon base) {
		super(base);
	}

	@Override
	public final CategorieUsefulnessWeapon getCategorieUsefulness() {
		return CategorieUsefulnessWeapon.MELEE;
	}
	
	@Override
	public final CategorieEncumbranceWeapon getCategorieEncumbrance() {
		return CategorieEncumbranceWeapon.TWO_HANDED;
	}
}
