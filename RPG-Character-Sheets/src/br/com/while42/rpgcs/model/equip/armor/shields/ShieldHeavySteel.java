package br.com.while42.rpgcs.model.equip.armor.shields;

import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.equip.armor.Armor;
import br.com.while42.rpgcs.model.equip.armor.BasicArmor;

public class ShieldHeavySteel extends AbstractShieldArmor implements Armor {
	private static final long serialVersionUID = 1L;

	private static final BasicArmor armor;
	static {
		armor = new BasicArmor(R.string.armor_shield_heavy_steel);
		armor.setCost(20);
		armor.setArmorBonus(2);
		armor.setMaximumDexBonus(0);
		armor.setArmorCheckPenalty(-2);
		armor.setArcaneSpellFailureChance(15);
		armor.setSpeed(0);
		armor.setWeight(7.5);
	}
	
	public ShieldHeavySteel() {
		super(armor);
	}

}
