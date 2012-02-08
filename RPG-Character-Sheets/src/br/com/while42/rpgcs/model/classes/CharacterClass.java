package br.com.while42.rpgcs.model.classes;

import br.com.while42.rpgcs.model.HitDiceType;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgClass;

public interface CharacterClass {
	
	HitDiceType getHitDice();
	TypeRpgClass getClassType();
	int getBaseAttackBonus();
	int getFortSave();
	int getRefSave();
	int getWillSave();
}
