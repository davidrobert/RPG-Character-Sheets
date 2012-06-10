package br.com.while42.rpgcs.model.character;

import java.io.Serializable;

public class SkillOther implements Serializable {
	private static final long serialVersionUID = 1L;

	private String name;
	private Integer modifier;
	
	public SkillOther(String name, Integer modifier) {
		this.name = name;
		this.modifier = modifier;
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

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;

		if (!(o instanceof SkillOther))
			return false;

		SkillOther skill = (SkillOther) o;
		
		return name.equals(skill.name) &&
				modifier.equals(skill.modifier);
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + modifier.hashCode();
	}
}
