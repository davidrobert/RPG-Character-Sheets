package br.com.while42.rpgcs.model.races;

import br.com.while42.rpgcs.model.character.attributes.TypeRpgClass;

public class HalfOrc extends AbstractRace implements Age {
	
	public static final int MIDDLE_AGE = 35; 
	public static final int OLD_AGE = 45;
	public static final int VENERABLE_AGE = 60;
	
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

	@Override
	public int getMiddleAge() {
		return MIDDLE_AGE;
	}

	@Override
	public int getOldAge() {
		return OLD_AGE;
	}

	@Override
	public int getVenerableAge() {
		return VENERABLE_AGE;
	}

}
