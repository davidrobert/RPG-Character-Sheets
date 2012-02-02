package br.com.while42.rpgcs.model.races;

import br.com.while42.rpgcs.model.character.attributes.TypeRpgClass;

public abstract class Race {
	
	public int getAdjustmentsOfStrength() {
		return 0;
	}
	
	public int getAdjustmentsOfIntelligence() {
		return 0;
	}
	
	public int getAdjustmentsOfDexterity() {
		return 0;
	}
	
	public int getAdjustmentsOfConstitution() {
		return 0;
	}
	
	public int getAdjustmentsOfWisdom() {
		return 0;
	}
	
	public int getAdjustmentsOfCharisma() {
		return 0;
	}
	
	public TypeRpgClass getFavoredClass() {
		return TypeRpgClass.NONE;
	}
}