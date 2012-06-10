package br.com.while42.rpgcs.model.equip.weapons.exotic.lightmelee;

import br.com.while42.rpgcs.model.equip.weapons.exotic.AbstractExoticWeapon;
import br.com.while42.rpgcs.model.equip.weapons.BasicWeapon;
import br.com.while42.rpgcs.model.equip.weapons.CategorieEncumbranceWeapon;
import br.com.while42.rpgcs.model.equip.weapons.CategorieUsefulnessWeapon;

public abstract class AbstractExoticLightMelleWeapon extends AbstractExoticWeapon {
	private static final long serialVersionUID = 1L;

	public AbstractExoticLightMelleWeapon(BasicWeapon base) {
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
