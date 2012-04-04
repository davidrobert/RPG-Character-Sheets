package br.com.while42.rpgcs.model.equip.armor.heavy;

import br.com.while42.rpgcs.model.equip.armor.Armor;
import br.com.while42.rpgcs.model.equip.armor.BasicArmor;

public class BandedMail extends AbstractHeavyArmor implements Armor {

	private static final BasicArmor armor;
	static {
		armor = new BasicArmor(0);
		armor.setCost(250);
		armor.setArmorBonus(6);
		armor.setMaximumDexBonus(1);
		armor.setArmorCheckPenalty(-6);
		armor.setArcaneSpellFailureChance(35);
		armor.setSpeed(20);
		armor.setWeight(17.5);
	}
	
	public BandedMail() {
		super(armor);
	}

}
