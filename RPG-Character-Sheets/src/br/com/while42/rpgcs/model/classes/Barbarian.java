package br.com.while42.rpgcs.model.classes;

import br.com.while42.rpgcs.model.HitDiceType;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgClass;

public class Barbarian implements CharacterClass {
	
	@Override
	public HitDiceType getHitDice() {		
		return HitDiceType.d12;
	}
	
	@Override
	public TypeRpgClass getClassType() {
		return TypeRpgClass.BARBARIAN;
	}
	
	@Override
	public int getBaseAttackBonus(int level) {
		return 0;
	}
	
	@Override
	public int getFortSave(int level) {
		return 0;
	}
	
	@Override
	public int getRefSave(int level) {
		return 0;
	}
	
	@Override
	public int getWillSave(int level) {
		return 0;
	}
}
