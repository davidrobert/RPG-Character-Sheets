package br.com.while42.rpgcs.model.character;

import java.io.Serializable;

import br.com.while42.rpgcs.model.character.attributes.TypeRpgSkill;

public class Skill implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private TypeRpgSkill type;
	private Integer modifier = 0;
	
	public Skill(TypeRpgSkill typeRpgSkill, Integer modifier) {
		this.type = typeRpgSkill;
		this.modifier = modifier;
	}

	public Integer getModifier() {
		return modifier;
	}

	public void setModifier(Integer modifier) {
		this.modifier = modifier;
	}

	public TypeRpgSkill getType() {
		return type;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;

		if (!(o instanceof Skill))
			return false;

		Skill skill = (Skill) o;
		
		return type.equals(skill.type) &&
				modifier.equals(skill.modifier);
	}
	
	@Override
	public int hashCode() {
		return type.getCodeName() + modifier.hashCode();
	}
}
