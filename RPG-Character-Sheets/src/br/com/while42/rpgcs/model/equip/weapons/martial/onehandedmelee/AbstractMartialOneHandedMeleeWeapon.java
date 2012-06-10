package br.com.while42.rpgcs.model.equip.weapons.martial.onehandedmelee;

import br.com.while42.rpgcs.model.equip.weapons.BasicWeapon;
import br.com.while42.rpgcs.model.equip.weapons.CategorieEncumbranceWeapon;
import br.com.while42.rpgcs.model.equip.weapons.CategorieUsefulnessWeapon;
import br.com.while42.rpgcs.model.equip.weapons.martial.AbstractMartialWeapon;

public abstract class AbstractMartialOneHandedMeleeWeapon extends AbstractMartialWeapon {
	private static final long serialVersionUID = 1L;

	public AbstractMartialOneHandedMeleeWeapon(BasicWeapon base) {
		super(base);
	}

	@Override
	public final CategorieUsefulnessWeapon getCategorieUsefulness() {
		return CategorieUsefulnessWeapon.MELEE;
	}
	
	@Override
	public final CategorieEncumbranceWeapon getCategorieEncumbrance() {
		return CategorieEncumbranceWeapon.ONE_HANDED;
	}

}
