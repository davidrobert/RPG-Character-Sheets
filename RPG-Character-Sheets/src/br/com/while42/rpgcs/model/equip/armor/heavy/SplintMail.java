package br.com.while42.rpgcs.model.equip.armor.heavy;

import br.com.while42.rpgcs.model.equip.armor.Armor;
import br.com.while42.rpgcs.model.equip.armor.BasicArmor;

public class SplintMail extends AbstractHeavyArmor implements Armor {

	private static final BasicArmor armor;
	static {
		armor = new BasicArmor(0);
		armor.setCost(200);
		armor.setArmorBonus(6);
		armor.setMaximumDexBonus(0);
		armor.setArmorCheckPenalty(-7);
		armor.setArcaneSpellFailureChance(40);
		armor.setSpeed(20);
		armor.setWeight(22.5);
	}
	
	public SplintMail() {
		super(armor);
	}

}
