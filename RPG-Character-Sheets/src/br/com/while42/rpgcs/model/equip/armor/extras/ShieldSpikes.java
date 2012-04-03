package br.com.while42.rpgcs.model.equip.armor.extras;

import br.com.while42.rpgcs.model.equip.armor.Armor;
import br.com.while42.rpgcs.model.equip.armor.BasicArmor;

public class ShieldSpikes extends AbstractExtraArmor implements Armor {

	private static final BasicArmor armor;
	static {
		armor = new BasicArmor(0);
		armor.setCost(0);
		armor.setArmorBonus(0);
		armor.setMaximumDexBonus(0);
		armor.setArmorCheckPenalty(0);
		armor.setArcaneSpellFailureChance(0);
		armor.setSpeed(0);
		armor.setWeight(0);
	}
	
	public ShieldSpikes() {
		super(armor);
	}

}
