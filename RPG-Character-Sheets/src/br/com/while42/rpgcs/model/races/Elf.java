package br.com.while42.rpgcs.model.races;

import java.util.Arrays;
import java.util.List;

import br.com.while42.rpgcs.model.character.attributes.TypeRpgReligion;
import br.com.while42.rpgcs.model.classes.AbstractClass;
import br.com.while42.rpgcs.model.classes.Sorcerer;

public class Elf extends AbstractRace {
	
	public static final int MIDDLE_AGE = 175; 
	public static final int OLD_AGE = 263;
	public static final int VENERABLE_AGE = 350;
	
	private static final int ADJUSTMENTS_OF_DEXTERITY = +2;
	private static final int ADJUSTMENTS_OF_CONSTITUTION = -2;
	
	private static final TypeRpgReligion religions[] = { TypeRpgReligion.CORELLON_LARENTHIAN, TypeRpgReligion.EHLONNA };
	
	@Override
	public int getAdjustmentsOfDexterity() {
		return ADJUSTMENTS_OF_DEXTERITY;
	}

	@Override
	public int getAdjustmentsOfConstitution() {		
		return ADJUSTMENTS_OF_CONSTITUTION;
	}

	@Override
	public Class<? extends AbstractClass> getFavoredClass() {
		return Sorcerer.class;
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
