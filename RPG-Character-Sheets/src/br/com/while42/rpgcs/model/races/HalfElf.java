package br.com.while42.rpgcs.model.races;

import java.util.Arrays;
import java.util.List;

import br.com.while42.rpgcs.model.character.attributes.TypeRpgReligion;

public class HalfElf extends AbstractRace {

	public static final int MIDDLE_AGE = 62; 
	public static final int OLD_AGE = 93;
	public static final int VENERABLE_AGE = 125;
	
	private static final TypeRpgReligion religions[] = { TypeRpgReligion.CORELLON_LARENTHIAN, TypeRpgReligion.EHLONNA };
	
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
