package br.com.while42.rpgcs.model.race;

import br.com.while42.rpgcs.model.attributes.TypeRpgClass;

public class Dwarf extends Race {

	@Override
	public int getAdjustmentsOfConstitution() {
		return +2;
	}

	@Override
	public int getAdjustmentsOfCharisma() {
		return -2;
	}

	@Override
	public TypeRpgClass getFavoredClass() {
		return TypeRpgClass.FIGHTER;
	}

}
