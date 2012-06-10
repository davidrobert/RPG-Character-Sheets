package br.com.while42.rpgcs.model.equip.armor.medium;

import br.com.while42.rpgcs.model.equip.armor.AbstractArmor;
import br.com.while42.rpgcs.model.equip.armor.BasicArmor;
import br.com.while42.rpgcs.model.equip.armor.CategorieArmor;

public abstract class AbstractMediumArmor extends AbstractArmor {
	private static final long serialVersionUID = 1L;

	public AbstractMediumArmor(BasicArmor armor) {
		super(armor);
	}

	@Override
	public final CategorieArmor getType() {
		return CategorieArmor.MEDIUM;
	}

}
