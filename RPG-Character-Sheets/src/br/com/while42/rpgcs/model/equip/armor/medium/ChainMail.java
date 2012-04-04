package br.com.while42.rpgcs.model.equip.armor.medium;

import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.equip.armor.Armor;
import br.com.while42.rpgcs.model.equip.armor.BasicArmor;

public class ChainMail extends AbstractMediumArmor implements Armor {

	private static final BasicArmor armor;
	static {
		armor = new BasicArmor(R.string.armor_medium_chainmail);
		armor.setCost(150);
		armor.setArmorBonus(5);
		armor.setMaximumDexBonus(2);
		armor.setArmorCheckPenalty(-5);
		armor.setArcaneSpellFailureChance(30);
		armor.setSpeed(20);
		armor.setWeight(20);
	}
	
	public ChainMail() {
		super(armor);
	}

}
