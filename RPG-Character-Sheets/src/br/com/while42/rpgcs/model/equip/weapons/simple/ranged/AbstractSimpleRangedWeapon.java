package br.com.while42.rpgcs.model.equip.weapons.simple.ranged;

import br.com.while42.rpgcs.model.character.TypeMunition;
import br.com.while42.rpgcs.model.equip.weapons.BasicWeapon;
import br.com.while42.rpgcs.model.equip.weapons.CategorieEncumbranceWeapon;
import br.com.while42.rpgcs.model.equip.weapons.CategorieUsefulnessWeapon;
import br.com.while42.rpgcs.model.equip.weapons.RangedWeapon;
import br.com.while42.rpgcs.model.equip.weapons.simple.AbstractSimpleWeapon;


public abstract class AbstractSimpleRangedWeapon extends AbstractSimpleWeapon implements RangedWeapon {
	private static final long serialVersionUID = 1L;
	
	private TypeMunition typeMunition;
	
	public AbstractSimpleRangedWeapon(BasicWeapon base, TypeMunition typeMunition) {
		super(base);
		this.typeMunition = typeMunition;
	}

	@Override
	public final CategorieUsefulnessWeapon getCategorieUsefulness() {
		return CategorieUsefulnessWeapon.RANGED;
	}
	
	@Override
	public final CategorieEncumbranceWeapon getCategorieEncumbrance() {
		return null;
	}
	
	@Override
	public TypeMunition getTypeMunition() {
		return typeMunition;
	}
}
