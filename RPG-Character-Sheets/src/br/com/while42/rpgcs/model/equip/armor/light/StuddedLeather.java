package br.com.while42.rpgcs.model.equip.armor.light;

import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.equip.armor.Armor;
import br.com.while42.rpgcs.model.equip.armor.BasicArmor;

public class StuddedLeather extends AbstractLightArmor implements Armor {

	private static final BasicArmor armor;
	static {
		armor = new BasicArmor(R.string.armor_light_studded_leather);
		armor.setCost(25);
		armor.setArmorBonus(3);
		armor.setMaximumDexBonus(5);
		armor.setArmorCheckPenalty(-1);
		armor.setArcaneSpellFailureChance(15);
		armor.setSpeed(30);
		armor.setWeight(10);
	}
	
	public StuddedLeather() {
		super(armor);
	}

}
