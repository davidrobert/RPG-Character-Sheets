package br.com.while42.rpgcs.model.character;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import br.com.while42.rpgcs.model.classes.AbstractRpgClass;

public class RpgClass {
	private Long experience = 0L;
	private HashSet<AbstractRpgClass> rpgClass = new HashSet<AbstractRpgClass>();
	
	public List<AbstractRpgClass> getAll() {
		return new ArrayList<AbstractRpgClass>(rpgClass);
	}

	public void add(List<AbstractRpgClass> rpgClasses) {
		for (AbstractRpgClass rpgClass: rpgClasses) {
			add(rpgClass);
		}
	}
	
	public void add(AbstractRpgClass rpgClass) {
		this.rpgClass.add(rpgClass);
	}

	public void clear() {
		rpgClass.clear();
	}
	
	public void setExperience(Long xp) {
		this.experience = xp;
	}
	
	public Long getExperience() {
		return experience;
	}
	
}
