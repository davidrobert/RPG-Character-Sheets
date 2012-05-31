package br.com.while42.rpgcs.model.races;

import java.util.Arrays;
import java.util.List;

import br.com.while42.rpgcs.model.character.attributes.TypeRpgReligion;
import br.com.while42.rpgcs.model.classes.AbstractRpgClass;
import br.com.while42.rpgcs.model.classes.Bard;

public class Gnome extends AbstractRace {
	
	public static final int MIDDLE_AGE = 100; 
	public static final int OLD_AGE = 150;
	public static final int VENERABLE_AGE = 200;
	
	private static final int ADJUSTMENTS_OF_CONSTITUTION = +2;
	private static final int ADJUSTMENTS_OF_STRENGTH = -2;
	
	private static final TypeRpgReligion religions[] = { TypeRpgReligion.GARL_GLITTERGOLD, TypeRpgReligion.EHLONNA };
	
	@Override
	public int getAdjustmentsOfConstitution() {		
		return ADJUSTMENTS_OF_CONSTITUTION;
	}
	
	@Override
	public int getAdjustmentsOfStrength() {		
		return ADJUSTMENTS_OF_STRENGTH;
	}
	
	@Override
	public Class<? extends AbstractRpgClass> getFavoredClass() {		
		return Bard.class;
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
