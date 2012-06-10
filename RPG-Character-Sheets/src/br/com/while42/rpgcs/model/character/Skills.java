package br.com.while42.rpgcs.model.character;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Skills implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Set<Skill> skills = new HashSet<Skill>();
	private Set<SkillOther> others = new HashSet<SkillOther>();
	
	public void addSkill(Skill skill) {
		skills.add(skill);
	}
	
	public Set<Skill> getAll() {
		return new HashSet<Skill>(skills);
	}
	
	public void addSkill(SkillOther skill) {
		others.add(skill);
	}
	
	public Set<SkillOther> getAllOthers() {
		return new HashSet<SkillOther>(others);
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;

		if (!(o instanceof Skills))
			return false;

		Skills sks = (Skills) o;
		
		return this.skills.equals(sks.skills) &&
				this.others.equals(sks.others);
	}
	
	@Override
	public int hashCode() {
		return skills.hashCode() + others.hashCode();
	}	
}
