package br.com.while42.rpgcs.model.equip.armor.light;

import br.com.while42.rpgcs.model.equip.armor.Armor;
import br.com.while42.rpgcs.model.equip.armor.BasicArmor;

public class ChainShirt extends AbstractLightArmor implements Armor {

	private static final BasicArmor armor;
	static {
		armor = new BasicArmor(0);
		armor.setCost(100);
		armor.setArmorBonus(4);
		armor.setMaximumDexBonus(4);
		armor.setArmorCheckPenalty(-2);
		armor.setArcaneSpellFailureChance(20);
		armor.setSpeed(30);
		armor.setWeight(12.5);
	}
	
	public ChainShirt() {
		super(armor);
	}

}
