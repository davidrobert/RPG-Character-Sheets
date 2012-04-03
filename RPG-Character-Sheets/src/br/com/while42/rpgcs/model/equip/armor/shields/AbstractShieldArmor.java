package br.com.while42.rpgcs.model.equip.armor.shields;

import br.com.while42.rpgcs.model.equip.armor.AbstractArmor;
import br.com.while42.rpgcs.model.equip.armor.BasicArmor;
import br.com.while42.rpgcs.model.equip.armor.CategorieArmor;

public abstract class AbstractShieldArmor extends AbstractArmor {

	public AbstractShieldArmor(BasicArmor armor) {
		super(armor);
	}

	@Override
	public final CategorieArmor getType() {
		return CategorieArmor.SHIELD;
	}

}
