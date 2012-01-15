package br.com.while42.rpgcs.model.race;

import br.com.while42.rpgcs.model.attributes.TypeRpgClass;

public class HalfOrc extends Race {
	@Override
	public int getAdjustmentsOfStrength() {		
		return +2;
	}
	
	@Override
	public int getAdjustmentsOfIntelligence() {
		return -2;
	}
	
	@Override
	public int getAdjustmentsOfCharisma() {		
		return -2;
	}
	
	@Override
	public TypeRpgClass getFavoredClass() {		
		return TypeRpgClass.BARBARIAN;
	}
}