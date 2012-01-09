package br.com.while42.rpgcs.model.race;

import br.com.while42.rpgcs.model.attributes.TypeRpgClass;

public class Elf extends Race {
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
}
