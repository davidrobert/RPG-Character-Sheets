package br.com.while42.rpgcs.model.equip.armor;

import br.com.while42.rpgcs.model.TypeCode;

public interface Armor extends TypeCode {

	public int getCost();
	public int getArmorBonus();
	public int getMaximumDexBonus();
	public int getArmorCheckPenalty();
	public int getArcaneSpellFailureChance();
	public int getSpeed();
	public double getWeight();

	public CategorieArmor getType();
}
