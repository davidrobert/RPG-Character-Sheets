package br.com.while42.rpgcs.model.races;

import br.com.while42.rpgcs.model.character.attributes.TypeRpgClass;

public class Gnome extends AbstractRace implements Age {
	
	public static final int MIDDLE_AGE = 100; 
	public static final int OLD_AGE = 150;
	public static final int VENERABLE_AGE = 200;
	
	@Override
	public int getAdjustmentsOfConstitution() {		
		return +2;
	}
	
	@Override
	public int getAdjustmentsOfStrength() {		
		return -2;
	}
	
	@Override
	public TypeRpgClass getFavoredClass() {		
		return TypeRpgClass.BARD;
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
