package br.com.while42.rpgcs.model.equip.armor.shields;

import br.com.while42.rpgcs.model.equip.armor.Armor;
import br.com.while42.rpgcs.model.equip.armor.BasicArmor;

public class ShieldLightSteel extends AbstractShieldArmor implements Armor {

	private static final BasicArmor armor;
	static {
		armor = new BasicArmor(0);
		armor.setCost(9);
		armor.setArmorBonus(1);
		armor.setMaximumDexBonus(0);
		armor.setArmorCheckPenalty(-1);
		armor.setArcaneSpellFailureChance(5);
		armor.setSpeed(0);
		armor.setWeight(3);
	}
	
	public ShieldLightSteel() {
		super(armor);
	}

}
