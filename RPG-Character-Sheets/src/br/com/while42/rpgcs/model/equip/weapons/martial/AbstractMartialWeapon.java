package br.com.while42.rpgcs.model.equip.weapons.martial;

import br.com.while42.rpgcs.model.equip.weapons.AbstractWeapon;
import br.com.while42.rpgcs.model.equip.weapons.BasicWeapon;
import br.com.while42.rpgcs.model.equip.weapons.CategorieWeapon;

public abstract class AbstractMartialWeapon extends AbstractWeapon {

	public AbstractMartialWeapon(BasicWeapon base) {
		super(base);
	}

	@Override
	public final CategorieWeapon getCategorie() {
		return CategorieWeapon.MARTIAL;
	}

}
