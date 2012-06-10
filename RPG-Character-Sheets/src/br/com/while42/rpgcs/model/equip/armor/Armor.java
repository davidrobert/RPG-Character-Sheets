package br.com.while42.rpgcs.model.equip.armor;

import java.io.Serializable;

import br.com.while42.rpgcs.model.TypeCode;
import br.com.while42.rpgcs.model.equip.Equipment;

public interface Armor extends Equipment, TypeCode, Serializable {
	
	public Integer getArmorBonus();
	public Integer getMaximumDexBonus();
	public Integer getArmorCheckPenalty();
	public Integer getArcaneSpellFailureChance();
	public Integer getSpeed();
	public CategorieArmor getType();
}
