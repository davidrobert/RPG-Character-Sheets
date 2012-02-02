package br.com.while42.rpgcs.model.races;

import br.com.while42.rpgcs.model.character.attributes.TypeRpgClass;

public class HalfOrc extends AbstractRace {
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
