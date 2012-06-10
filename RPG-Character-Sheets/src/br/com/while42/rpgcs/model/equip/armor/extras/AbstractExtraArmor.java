package br.com.while42.rpgcs.model.equip.armor.extras;

import br.com.while42.rpgcs.model.equip.armor.AbstractArmor;
import br.com.while42.rpgcs.model.equip.armor.BasicArmor;
import br.com.while42.rpgcs.model.equip.armor.CategorieArmor;

public abstract class AbstractExtraArmor extends AbstractArmor {
	private static final long serialVersionUID = 1L;

	public AbstractExtraArmor(BasicArmor armor) {
		super(armor);
	}

	@Override
	public final CategorieArmor getType() {
		return CategorieArmor.EXTRA;
	}

}
