package br.com.while42.rpgcs.model.races;

import br.com.while42.rpgcs.model.character.attributes.TypeRpgClass;

public class Elf extends AbstractRace {
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
