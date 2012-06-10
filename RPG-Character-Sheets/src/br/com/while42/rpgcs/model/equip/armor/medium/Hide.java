package br.com.while42.rpgcs.model.equip.armor.medium;

import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.equip.armor.Armor;
import br.com.while42.rpgcs.model.equip.armor.BasicArmor;

public class Hide extends AbstractMediumArmor implements Armor {
	private static final long serialVersionUID = 1L;

	private static final BasicArmor armor;
	static {
		armor = new BasicArmor(R.string.armor_medium_hide);
		armor.setCost(15);
		armor.setArmorBonus(3);
		armor.setMaximumDexBonus(4);
		armor.setArmorCheckPenalty(-3);
		armor.setArcaneSpellFailureChance(20);
		armor.setSpeed(20);
		armor.setWeight(12.5);
	}
	
	public Hide() {
		super(armor);
	}

}
