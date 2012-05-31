package br.com.while42.rpgcs.model.races;

import java.util.List;

import br.com.while42.rpgcs.model.character.attributes.TypeRpgReligion;
import br.com.while42.rpgcs.model.classes.AbstractRpgClass;

public interface Race {
	
	public int getAdjustmentsOfStrength();
	public int getAdjustmentsOfIntelligence();
	public int getAdjustmentsOfDexterity();
	public int getAdjustmentsOfConstitution();
	public int getAdjustmentsOfWisdom();
	public int getAdjustmentsOfCharisma();
	public Class<? extends AbstractRpgClass> getFavoredClass();
	public abstract int getMiddleAge();
	public abstract int getOldAge();
	public abstract int getVenerableAge();
	public List<TypeRpgReligion> getReligions();
	
	// public abstract int getUnencumberedSpeed();
}
