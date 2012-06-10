package br.com.while42.rpgcs.model.equip.weapons.simple;

import br.com.while42.rpgcs.model.equip.weapons.AbstractWeapon;
import br.com.while42.rpgcs.model.equip.weapons.BasicWeapon;
import br.com.while42.rpgcs.model.equip.weapons.CategorieWeapon;


public abstract class AbstractSimpleWeapon extends AbstractWeapon {
	private static final long serialVersionUID = 1L;
	
	public AbstractSimpleWeapon(BasicWeapon base) {
		super(base);
	}

	@Override
	public final CategorieWeapon getCategorie() {
		return CategorieWeapon.SIMPLE;
	}
}
