package br.com.while42.rpgcs.model.character;

import java.io.Serializable;

import br.com.while42.rpgcs.model.character.attributes.TypeAbilities;

public class SkillOther implements Serializable {
	private static final long serialVersionUID = 1L;

	private String name;
	private Integer modifier;
	private TypeAbilities ability;
	
	public SkillOther(String name, Integer modifier, TypeAbilities ability) {
		this.name = name;
		this.modifier = modifier;
		this.ability = ability;
	}

	public Integer getModifier() {
		return modifier;
	}

	public void setModifier(Integer modifier) {
		this.modifier = modifier;
	}

	public String getName() {
		return name;
	}
	
	public TypeAbilities getAbility() {
		return ability;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;

		if (!(o instanceof SkillOther))
			return false;

		SkillOther skill = (SkillOther) o;
		
		return name.equals(skill.name) &&
			   modifier.equals(skill.modifier) &&
			   ability.equals(skill.ability);
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + modifier.hashCode() + ability.hashCode();
	}
}
