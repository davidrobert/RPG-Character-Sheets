package br.com.while42.rpgcs.model.equip.weapons.simple.twohandedmelee;

import br.com.while42.rpgcs.model.equip.weapons.BasicWeapon;
import br.com.while42.rpgcs.model.equip.weapons.CategorieEncumbranceWeapon;
import br.com.while42.rpgcs.model.equip.weapons.CategorieUsefulnessWeapon;
import br.com.while42.rpgcs.model.equip.weapons.simple.AbstractSimpleWeapon;


public abstract class AbstractSimpleTwoHandedMeleeWeapon extends AbstractSimpleWeapon {
	private static final long serialVersionUID = 1L;
	
	public AbstractSimpleTwoHandedMeleeWeapon(BasicWeapon base) {
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
