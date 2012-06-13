package br.com.while42.rpgcs.model.equip.armor.especial;

import br.com.while42.rpgcs.model.equip.armor.AbstractArmor;
import br.com.while42.rpgcs.model.equip.armor.BasicArmor;
import br.com.while42.rpgcs.model.equip.armor.CategorieArmor;

public class EspecialArmor extends AbstractArmor {
	private static final long serialVersionUID = 1L;

	private String name;
	private BasicArmor armor;
	
	protected EspecialArmor(String name, BasicArmor armor) {
		super(armor);
		this.name = name;
		this.armor = armor;
	}

	@Override
	public CategorieArmor getType() {
		return armor.getType();
	}

	public String getName() {
		return name;
	}
}
