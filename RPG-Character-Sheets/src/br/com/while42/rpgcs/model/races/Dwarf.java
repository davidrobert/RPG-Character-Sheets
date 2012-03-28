package br.com.while42.rpgcs.model.races;

import java.util.Arrays;
import java.util.List;

import br.com.while42.rpgcs.model.character.attributes.TypeRpgReligion;
import br.com.while42.rpgcs.model.classes.AbstractClass;
import br.com.while42.rpgcs.model.classes.Fighter;

public class Dwarf extends AbstractRace {

	public static final int MIDDLE_AGE = 125; 
	public static final int OLD_AGE = 188;
	public static final int VENERABLE_AGE = 250;
	
	private static final int ADJUSTMENTS_OF_CONSTITUTION = +2;
	private static final int ADJUSTMENTS_OF_CHARISMA = -2;
	
	private static final TypeRpgReligion religions[] = { TypeRpgReligion.MORADIN };
	
	@Override
	public int getAdjustmentsOfConstitution() {
		return ADJUSTMENTS_OF_CONSTITUTION;
	}

	@Override
	public int getAdjustmentsOfCharisma() {
		return ADJUSTMENTS_OF_CHARISMA;
	}
	
	@Override
	public Class<? extends AbstractClass> getFavoredClass() {
		return Fighter.class;
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

	@Override
	public List<TypeRpgReligion> getReligions() {			
		return Arrays.asList(religions);
	}
}
