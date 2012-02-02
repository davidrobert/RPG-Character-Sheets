package br.com.while42.rpgcs.model.races;

import br.com.while42.rpgcs.model.attributes.TypeRpgClass;

public class Gnome extends Race {
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
}
