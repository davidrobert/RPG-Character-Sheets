package br.com.while42.rpgcs.model.equip.armor.shields;

import br.com.while42.rpgcs.model.equip.armor.Armor;
import br.com.while42.rpgcs.model.equip.armor.BasicArmor;

public class ShieldLightWooden extends AbstractShieldArmor implements Armor {

	private static final BasicArmor armor;
	static {
		armor = new BasicArmor(0);
		armor.setCost(3);
		armor.setArmorBonus(1);
		armor.setMaximumDexBonus(0);
		armor.setArmorCheckPenalty(-1);
		armor.setArcaneSpellFailureChance(5);
		armor.setSpeed(0);
		armor.setWeight(2.5);
	}
	
	public ShieldLightWooden() {
		super(armor);
	}

}
