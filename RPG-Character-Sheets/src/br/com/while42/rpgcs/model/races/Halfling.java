package br.com.while42.rpgcs.model.races;

import br.com.while42.rpgcs.model.attributes.TypeRpgClass;

public class Halfling extends Race {
	@Override
	public int getAdjustmentsOfDexterity() {		
		return +2;
	}
	
	@Override
	public int getAdjustmentsOfStrength() {		
		return -2;
	}
	
	@Override
	public TypeRpgClass getFavoredClass() {		
		return TypeRpgClass.ROGUE;
	}
}
