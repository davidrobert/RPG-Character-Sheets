package br.com.while42.rpgcs.model.classes;

import java.util.List;

import br.com.while42.rpgcs.model.HitDice;
import br.com.while42.rpgcs.model.HitDiceType;
import br.com.while42.rpgcs.model.TypeCode;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgAlignment;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgReligion;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgSize;


public interface CharacterClass extends TypeCode {
	
	int getClassLevel();
	void setClassLevel(int classLevel);
	HitDice getUnarmedDamage(TypeRpgSize size);
	List<TypeRpgReligion> getReligions(TypeRpgAlignment alignment);
	
	HitDiceType getHitDice();
	int getBaseAttackBonus();
	int getFortSave();
	int getRefSave();
	int getWillSave();
	HitDice getStartingGold();
	
}
