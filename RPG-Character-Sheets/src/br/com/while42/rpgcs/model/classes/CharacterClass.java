package br.com.while42.rpgcs.model.classes;

import br.com.while42.rpgcs.model.HitDiceType;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgClass;

public interface CharacterClass {
	
	public HitDiceType getHitDice();
	public TypeRpgClass getClassType();
	public int getBaseAttackBonus();
	public int getFortSave();
	public int getRefSave();
	public int getWillSave();
}
