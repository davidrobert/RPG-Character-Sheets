package br.com.while42.rpgcs.model.races;

import java.util.ArrayList;
import java.util.List;

import br.com.while42.rpgcs.model.character.attributes.TypeRpgClass;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgReligion;

public abstract class AbstractRace {
	
	private static final int ADJUSTMENT_DEFAULT = 0;
	
	public int getAdjustmentsOfStrength() {
		return ADJUSTMENT_DEFAULT;
	}
	
	public int getAdjustmentsOfIntelligence() {
		return ADJUSTMENT_DEFAULT;
	}
	
	public int getAdjustmentsOfDexterity() {
		return ADJUSTMENT_DEFAULT;
	}
	
	public int getAdjustmentsOfConstitution() {
		return ADJUSTMENT_DEFAULT;
	}
	
	public int getAdjustmentsOfWisdom() {
		return ADJUSTMENT_DEFAULT;
	}
	
	public int getAdjustmentsOfCharisma() {
		return ADJUSTMENT_DEFAULT;
	}
	
	public TypeRpgClass getFavoredClass() {
		return TypeRpgClass.NONE;
	}
	
	public abstract int getMiddleAge();
	public abstract int getOldAge();
	public abstract int getVenerableAge();
	
	public List<TypeRpgReligion> getReligions() {
		return new ArrayList<TypeRpgReligion>(); 
	}
}
