package br.com.while42.rpgcs.model.classes;

import br.com.while42.rpgcs.model.HitDiceType;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgClass;

public abstract class AbstractClass {
	
	public HitDiceType getHitDice() {
		return HitDiceType.d4;
	}
	
	public TypeRpgClass getClassType() {
		return TypeRpgClass.NONE;
	}
	
	public int getBaseAttackBonus(int level) {
		return 0;
	}
	
	public int getFortSave(int level) {
		return 0;
	}
	
	public int getRefSave(int level) {
		return 0;
	}
	
	public int getWillSave(int level) {
		return 0;
	}
}
