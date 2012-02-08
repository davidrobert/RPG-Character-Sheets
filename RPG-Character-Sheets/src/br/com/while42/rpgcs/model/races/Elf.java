package br.com.while42.rpgcs.model.races;

import br.com.while42.rpgcs.model.character.attributes.TypeRpgClass;

public class Elf extends AbstractRace implements Age {
	
	public static final int MIDDLE_AGE = 175; 
	public static final int OLD_AGE = 263;
	public static final int VENERABLE_AGE = 350;
	
	@Override
	public int getAdjustmentsOfDexterity() {
		return +2;
	}

	@Override
	public int getAdjustmentsOfConstitution() {		
		return -2;
	}

	@Override
	public TypeRpgClass getFavoredClass() {
		return TypeRpgClass.SORCERER;
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
