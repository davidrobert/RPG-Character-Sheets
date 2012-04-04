package br.com.while42.rpgcs.model.equip.armor.heavy;

import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.equip.armor.Armor;
import br.com.while42.rpgcs.model.equip.armor.BasicArmor;

public class HalfPlate extends AbstractHeavyArmor implements Armor {

	private static final BasicArmor armor;
	static {
		armor = new BasicArmor(R.string.armor_heavy_half_plate);
		armor.setCost(600);
		armor.setArmorBonus(7);
		armor.setMaximumDexBonus(0);
		armor.setArmorCheckPenalty(-7);
		armor.setArcaneSpellFailureChance(40);
		armor.setSpeed(20);
		armor.setWeight(25);
	}
	
	public HalfPlate() {
		super(armor);
	}

}
