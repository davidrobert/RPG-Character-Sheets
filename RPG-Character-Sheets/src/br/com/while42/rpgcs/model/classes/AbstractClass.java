package br.com.while42.rpgcs.model.classes;

import java.util.ArrayList;
import java.util.List;

import br.com.while42.rpgcs.model.HitDice;
import br.com.while42.rpgcs.model.HitDiceType;
import br.com.while42.rpgcs.model.character.attributes.TypeCode;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgSize;
import br.com.while42.rpgcs.model.classes.bonuses.ExperienceAndLevel;

@RpgClass(name="AbstractClass")
public abstract class AbstractClass implements CharacterClass {
	
	protected int classLevel;
	
	public AbstractClass() {
		classLevel = ExperienceAndLevel.MIN_LEVEL;
	}
	
	public AbstractClass(int classLevel) {
		this.classLevel = classLevel;
	}
	
	public final int getClassLevel() {
		return classLevel;
	}

	public final void setClassLevel(int classLevel) {
		if (classLevel < ExperienceAndLevel.MIN_LEVEL || classLevel > ExperienceAndLevel.MAX_LEVEL) {
			throw new IllegalArgumentException("Invalid class level");
		}
		
		this.classLevel = classLevel;
	}
	
	public HitDice getUnarmedDamage(TypeRpgSize size) {
		return new HitDice(HitDiceType.d4);
	}
}
