package br.com.while42.rpgcs.model.races;

import br.com.while42.rpgcs.model.classes.AbstractClass;
import br.com.while42.rpgcs.model.classes.Barbarian;

public class HalfOrc extends AbstractRace {
	
	public static final int MIDDLE_AGE = 35; 
	public static final int OLD_AGE = 45;
	public static final int VENERABLE_AGE = 60;
		
	private static final int ADJUSTMENTS_OF_STRENGTH = +2;
	private static final int ADJUSTMENTS_OF_INTELLIGENCE = -2;
	
	@Override
	public int getAdjustmentsOfStrength() {		
		return ADJUSTMENTS_OF_STRENGTH;
	}
	
	@Override
	public int getAdjustmentsOfIntelligence() {
		return ADJUSTMENTS_OF_INTELLIGENCE;
	}
	
	@Override
	public int getAdjustmentsOfCharisma() {		
		return -2;
	}
	
	@Override
	public Class<? extends AbstractClass> getFavoredClass() {		
		return Barbarian.class;
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
