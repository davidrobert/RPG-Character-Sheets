package br.com.while42.rpgcs.model.classes;

import br.com.while42.rpgcs.model.HitDice;
import br.com.while42.rpgcs.model.HitDiceType;
import br.com.while42.rpgcs.model.TypeCode;


public interface CharacterClass extends TypeCode {
	
	HitDiceType getHitDice();
	int getBaseAttackBonus();
	int getFortSave();
	int getRefSave();
	int getWillSave();
	HitDice getStartingGold();
	
}
