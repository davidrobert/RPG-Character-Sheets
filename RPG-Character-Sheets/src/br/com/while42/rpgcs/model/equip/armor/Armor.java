package br.com.while42.rpgcs.model.equip.armor;

import br.com.while42.rpgcs.model.TypeCode;
import br.com.while42.rpgcs.model.equip.Equipment;

public interface Armor extends Equipment, TypeCode {
	
	public int getArmorBonus();
	public int getMaximumDexBonus();
	public int getArmorCheckPenalty();
	public int getArcaneSpellFailureChance();
	public int getSpeed();
	public CategorieArmor getType();
}
