package br.com.while42.rpgcs.model.classes;

import br.com.while42.rpgcs.model.HitDiceType;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgClass;

public class Rogue implements CharacterClass {
	
	@Override
	public HitDiceType getHitDice() {		
		return HitDiceType.d6;
	}
	
	@Override
	public TypeRpgClass getClassType() {
		return TypeRpgClass.ROGUE;
	}

	@Override
	public int getBaseAttackBonus(int level) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getFortSave(int level) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getRefSave(int level) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getWillSave(int level) {
		// TODO Auto-generated method stub
		return 0;
	}
}
