package br.com.while42.rpgcs.model.classes;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import br.com.while42.rpgcs.model.HitDice;
import br.com.while42.rpgcs.model.HitDiceType;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgAlignment;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgReligion;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgSize;
import br.com.while42.rpgcs.model.classes.bonuses.ExperienceAndLevel;

public abstract class AbstractRpgClass implements CharacterClass, Serializable {
	private static final long serialVersionUID = 1L;
	
	protected Integer classLevel;
	
	public AbstractRpgClass() {
		classLevel = ExperienceAndLevel.MIN_LEVEL;
	}
	
	public AbstractRpgClass(Integer classLevel) {
		setClassLevel(classLevel);
	}
	
	@Override
	public final Integer getClassLevel() {
		return classLevel;
	}

	@Override
	public final void setClassLevel(Integer classLevel) {
		if (classLevel < ExperienceAndLevel.MIN_LEVEL || classLevel > ExperienceAndLevel.MAX_LEVEL) {
			throw new IllegalArgumentException("Invalid class level");
		}
		
		this.classLevel = classLevel;
	}
	
	@Override
	public HitDice getUnarmedDamage(TypeRpgSize size) {
		return new HitDice(HitDiceType.d4);
	}
	
	@Override
	public Set<TypeRpgReligion> getReligions(TypeRpgAlignment alignment) {
		return Collections.unmodifiableSet(new HashSet<TypeRpgReligion>()); 
	}
		
	protected Set<TypeRpgReligion> getReligions(Collection<TypeRpgReligion> religions, TypeRpgAlignment alignment) {
		Set<TypeRpgReligion> religionsAvailable = new HashSet<TypeRpgReligion>();
		
		for (TypeRpgReligion r: religions) {
			if (r.getAlignment() == alignment) {
				religionsAvailable.add(r);
			}
		}
		
		return Collections.unmodifiableSet(religionsAvailable);
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;

		if (!(o instanceof AbstractRpgClass))
			return false;

		AbstractRpgClass rc = (AbstractRpgClass) o;
		
		return classLevel.equals(rc.classLevel) && getClass().equals(rc.getClass());
	}
}
