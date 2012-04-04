package br.com.while42.rpgcs.model.equip.armor.extras;

import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.equip.armor.Armor;
import br.com.while42.rpgcs.model.equip.armor.BasicArmor;

public class ShieldSpikes extends AbstractExtraArmor implements Armor {

	private static final BasicArmor armor;
	static {
		armor = new BasicArmor(R.string.armor_extra_shield_spikes);
		armor.setCost(10);
		armor.setArmorBonus(0);
		armor.setMaximumDexBonus(0);
		armor.setArmorCheckPenalty(0);
		armor.setArcaneSpellFailureChance(0);
		armor.setSpeed(0);
		armor.setWeight(2.5);
	}
	
	public ShieldSpikes() {
		super(armor);
	}

}
