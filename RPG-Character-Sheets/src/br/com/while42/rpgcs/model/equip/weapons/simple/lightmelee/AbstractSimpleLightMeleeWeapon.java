package br.com.while42.rpgcs.model.equip.weapons.simple.lightmelee;

import br.com.while42.rpgcs.model.equip.weapons.BasicWeapon;
import br.com.while42.rpgcs.model.equip.weapons.CategorieEncumbranceWeapon;
import br.com.while42.rpgcs.model.equip.weapons.CategorieUsefulnessWeapon;
import br.com.while42.rpgcs.model.equip.weapons.simple.AbstractSimpleWeapon;


public abstract class AbstractSimpleLightMeleeWeapon extends AbstractSimpleWeapon {
	
	public AbstractSimpleLightMeleeWeapon(BasicWeapon base) {
		super(base);
	}

	@Override
	public final CategorieUsefulnessWeapon getCategorieUsefulness() {
		return CategorieUsefulnessWeapon.MELEE;
	}
	
	@Override
	public final CategorieEncumbranceWeapon getCategorieEncumbrance() {
		return CategorieEncumbranceWeapon.LIGHT;
	}
	
	
}
