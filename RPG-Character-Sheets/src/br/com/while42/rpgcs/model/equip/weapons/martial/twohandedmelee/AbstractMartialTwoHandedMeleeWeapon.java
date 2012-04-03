package br.com.while42.rpgcs.model.equip.weapons.martial.twohandedmelee;

import br.com.while42.rpgcs.model.equip.weapons.BasicWeapon;
import br.com.while42.rpgcs.model.equip.weapons.CategorieEncumbranceWeapon;
import br.com.while42.rpgcs.model.equip.weapons.CategorieUsefulnessWeapon;
import br.com.while42.rpgcs.model.equip.weapons.martial.AbstractMartialWeapon;

public abstract class AbstractMartialTwoHandedMeleeWeapon extends AbstractMartialWeapon {

	public AbstractMartialTwoHandedMeleeWeapon(BasicWeapon base) {
		super(base);
	}

	@Override
	public CategorieUsefulnessWeapon getCategorieUsefulness() {
		return CategorieUsefulnessWeapon.MELEE;
	}
	
	@Override
	public CategorieEncumbranceWeapon getCategorieEncumbrance() {
		return CategorieEncumbranceWeapon.TWO_HANDED;
	}

}
