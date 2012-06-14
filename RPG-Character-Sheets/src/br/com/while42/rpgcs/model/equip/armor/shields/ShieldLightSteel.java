package br.com.while42.rpgcs.model.equip.armor.shields;

import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.equip.armor.Armor;
import br.com.while42.rpgcs.model.equip.armor.BasicArmor;

public class ShieldLightSteel extends AbstractShieldArmor implements Armor {
	private static final long serialVersionUID = 1L;

	private static final BasicArmor armor;
	static {
		armor = new BasicArmor(R.string.armor_shield_light_steel);
		armor.setCost(9L);
		armor.setArmorBonus(1);
		armor.setMaximumDexBonus(0);
		armor.setArmorCheckPenalty(-1);
		armor.setArcaneSpellFailureChance(5);
		armor.setSpeed(0);
		armor.setWeight(3.0);
	}
	
	public ShieldLightSteel() {
		super(armor);
	}

}
