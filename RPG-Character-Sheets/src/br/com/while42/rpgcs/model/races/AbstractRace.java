package br.com.while42.rpgcs.model.races;

import java.util.ArrayList;
import java.util.List;

import br.com.while42.rpgcs.model.character.attributes.TypeRpgReligion;
import br.com.while42.rpgcs.model.classes.AbstractClass;

public abstract class AbstractRace implements Race {
	
	private static final int ADJUSTMENT_DEFAULT = 0;
	
	@Override
	public int getAdjustmentsOfStrength() {
		return ADJUSTMENT_DEFAULT;
	}
	
	@Override
	public int getAdjustmentsOfIntelligence() {
		return ADJUSTMENT_DEFAULT;
	}
	
	@Override
	public int getAdjustmentsOfDexterity() {
		return ADJUSTMENT_DEFAULT;
	}
	
	@Override
	public int getAdjustmentsOfConstitution() {
		return ADJUSTMENT_DEFAULT;
	}
	
	@Override
	public int getAdjustmentsOfWisdom() {
		return ADJUSTMENT_DEFAULT;
	}
	
	@Override
	public int getAdjustmentsOfCharisma() {
		return ADJUSTMENT_DEFAULT;
	}
	
	@Override
	public Class<? extends AbstractClass> getFavoredClass() {
		// TODO: Verificar se esta Ž a melhor maneira de implementar
		return null;
	}
	
	@Override
	public List<TypeRpgReligion> getReligions() {
		return new ArrayList<TypeRpgReligion>(); 
	}
}
