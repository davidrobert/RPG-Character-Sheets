package br.com.while42.rpgcs.model.equip.armor.medium;

import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.equip.armor.Armor;
import br.com.while42.rpgcs.model.equip.armor.BasicArmor;

public class Breastplate extends AbstractMediumArmor implements Armor {
	private static final long serialVersionUID = 1L;

	private static final BasicArmor armor;
	static {
		armor = new BasicArmor(R.string.armor_medium_breastplate);
		armor.setCost(200);
		armor.setArmorBonus(5);
		armor.setMaximumDexBonus(3);
		armor.setArmorCheckPenalty(-4);
		armor.setArcaneSpellFailureChance(25);
		armor.setSpeed(20);
		armor.setWeight(15.0);
	}
	
	public Breastplate() {
		super(armor);
	}

}
