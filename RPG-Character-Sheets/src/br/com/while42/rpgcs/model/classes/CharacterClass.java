package br.com.while42.rpgcs.model.classes;

import java.util.Set;

import br.com.while42.rpgcs.model.HitDice;
import br.com.while42.rpgcs.model.HitDiceType;
import br.com.while42.rpgcs.model.TypeCode;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgAlignment;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgReligion;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgSize;


public interface CharacterClass extends TypeCode {
	
	Integer getClassLevel();
	void setClassLevel(Integer classLevel);
	HitDice getUnarmedDamage(TypeRpgSize size);
	Set<TypeRpgReligion> getReligions(TypeRpgAlignment alignment);
	
	HitDiceType getHitDice();
	int getBaseAttackBonus();
	int getFortSave();
	int getRefSave();
	int getWillSave();
	HitDice getStartingGold();
	
}
