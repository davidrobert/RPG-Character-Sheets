package br.com.while42.rpgcs.model.classes;

import java.util.ArrayList;
import java.util.List;

import br.com.while42.rpgcs.model.HitDice;
import br.com.while42.rpgcs.model.HitDiceType;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgAlignment;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgReligion;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgSize;
import br.com.while42.rpgcs.model.classes.bonuses.ExperienceAndLevel;

public abstract class AbstractRpgClass implements CharacterClass {
	
	protected int classLevel;
	
	public AbstractRpgClass() {
		classLevel = ExperienceAndLevel.MIN_LEVEL;
	}
	
	public AbstractRpgClass(int classLevel) {
		setClassLevel(classLevel);
	}
	
	@Override
	public final int getClassLevel() {
		return classLevel;
	}

	@Override
	public final void setClassLevel(int classLevel) {
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
	public List<TypeRpgReligion> getReligions(TypeRpgAlignment alignment) {
		return new ArrayList<TypeRpgReligion>(); 
	}
		
	protected List<TypeRpgReligion> getReligions(TypeRpgReligion religions[], TypeRpgAlignment alignment) {
		List<TypeRpgReligion> religionsAvailable = new ArrayList<TypeRpgReligion>();
		
		for (TypeRpgReligion r: religions) {
			if (r.getAlignment() == alignment) {
				religionsAvailable.add(r);
			}
		}
		
		return religionsAvailable;
	}
}
