package br.com.while42.rpgcs.model.equip.armor.shields;

import br.com.while42.rpgcs.model.equip.armor.Armor;
import br.com.while42.rpgcs.model.equip.armor.BasicArmor;

public class ShieldTower extends AbstractShieldArmor implements Armor {

	private static final BasicArmor armor;
	static {
		armor = new BasicArmor(0);
		armor.setCost(30);
		armor.setArmorBonus(4);
		armor.setMaximumDexBonus(2);
		armor.setArmorCheckPenalty(-10);
		armor.setArcaneSpellFailureChance(50);
		armor.setSpeed(0);
		armor.setWeight(22.5);
	}
	
	public ShieldTower() {
		super(armor);
	}

}
