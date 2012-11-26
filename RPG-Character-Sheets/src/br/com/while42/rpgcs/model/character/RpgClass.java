package br.com.while42.rpgcs.model.character;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import br.com.while42.rpgcs.model.classes.AbstractRpgClass;

public class RpgClass implements Serializable {
	private static final long serialVersionUID = 1L;
	
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

	public void removeAllRpgClass() {
		rpgClass.clear();
	}
	
	public void setExperience(Long xp) {
		this.experience = xp;
	}
	
	public Long getExperience() {
		return experience;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;

		if (!(o instanceof RpgClass))
			return false;

		RpgClass rc = (RpgClass) o;
		
		return experience.equals(rc.experience) && rpgClass.equals(rc.rpgClass);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("");
		
		for (AbstractRpgClass c: rpgClass) {
			sb.append(c.getClass().getName()).append("(").append(c.getClassLevel()).append(") ");
		}
		
		return sb.toString();
	}
	
}
