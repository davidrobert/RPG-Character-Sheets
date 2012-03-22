package br.com.while42.rpgcs.model.races;

import java.util.Arrays;
import java.util.List;

import br.com.while42.rpgcs.model.character.attributes.TypeRpgClass;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgReligion;

public class Halfling extends AbstractRace {
	
	public static final int MIDDLE_AGE = 50; 
	public static final int OLD_AGE = 75;
	public static final int VENERABLE_AGE = 100;
	
	private static final int ADJUSTMENTS_OF_DEXTERITY = +2;
	private static final int ADJUSTMENTS_OF_STRENGTH = -2;
	
	private static final TypeRpgReligion religions[] = { TypeRpgReligion.YONDALLA, TypeRpgReligion.EHLONNA };
	
	@Override
	public int getAdjustmentsOfDexterity() {		
		return ADJUSTMENTS_OF_DEXTERITY;
	}
	
	@Override
	public int getAdjustmentsOfStrength() {		
		return ADJUSTMENTS_OF_STRENGTH;
	}
	
	@Override
	public TypeRpgClass getFavoredClass() {		
		return TypeRpgClass.ROGUE;
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
