package br.com.while42.rpgcs.model.equip.armor.medium;

import br.com.while42.rpgcs.model.equip.armor.Armor;
import br.com.while42.rpgcs.model.equip.armor.BasicArmor;

public class ScaleMail extends AbstractMediumArmor implements Armor {

	private static final BasicArmor armor;
	static {
		armor = new BasicArmor(0);
		armor.setCost(50);
		armor.setArmorBonus(4);
		armor.setMaximumDexBonus(3);
		armor.setArmorCheckPenalty(-4);
		armor.setArcaneSpellFailureChance(25);
		armor.setSpeed(20);
		armor.setWeight(15);
	}
	
	public ScaleMail() {
		super(armor);
	}

}
