package br.com.while42.rpgcs.model.character;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import br.com.while42.rpgcs.model.abilities.Abilities;
import br.com.while42.rpgcs.model.abilities.Defences;
import br.com.while42.rpgcs.model.character.attributes.Attributes;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgAlignment;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgRace;
import br.com.while42.rpgcs.model.classes.AbstractRpgClass;

public class RpgCharacter implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id = 0L;
	private String image = "";

	private String name = "";
	private HashSet<AbstractRpgClass> rpgClass = new HashSet<AbstractRpgClass>();
	
	private Attributes attributes = new Attributes();
	private Abilities abilities = new Abilities();
	private Defences defences = new Defences();
	
	private Integer baseAttackBonus = 0;

	private Integer grapple = 0;
	
	private Long experience = 0L;
	

	public RpgCharacter() {
		// TODO: Construir uma classe Builder para RpgCharacter
	}
	
	public RpgCharacter(String name, TypeRpgRace race, TypeRpgAlignment alignment) {
		this.name = name;
		attributes.setRace(race);
		attributes.setAlignment(alignment);
	}

	public boolean isPersistent() {
		return getId() != 0;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<AbstractRpgClass> getRpgClasses() {
		return new ArrayList<AbstractRpgClass>(rpgClass);
	}

	public void addRpgClass(List<AbstractRpgClass> rpgClasses) {
		for (AbstractRpgClass rpgClass: rpgClasses) {
			addRpgClass(rpgClass);
		}
	}
	
	public void addRpgClass(AbstractRpgClass rpgClass) {
		this.rpgClass.add(rpgClass);
	}

	public void clearRpgClass() {
		rpgClass.clear();
	}
	
	public void setExperience(Long xp) {
		this.experience = xp;
	}
	
	public Long getExperience() {
		return experience;
	}
	
	public void setAbilities(Abilities abilities) {
		this.abilities = abilities;
	}
	
	public Abilities getAbilities() {
		return abilities;
	}
	
	public void setDefences(Defences defences) {
		this.defences = defences;
	}
	
	public Defences getDefences() {
		return defences;
	}
	
	public void setAttributes(Attributes attributes) {
		this.attributes = attributes;
	}
	
	public Attributes getAttributes() {
		return attributes;
	}

	@Override
	public boolean equals(Object rpgCharacter) {

		if (this == rpgCharacter)
			return true;

		if (!(rpgCharacter instanceof RpgCharacter))
			return false;

		RpgCharacter rc = (RpgCharacter) rpgCharacter;

		return (id.equals(rc.id) &&
				image.equals(rc.image) &&
				name.equals(rc.name) &&
				
				baseAttackBonus.equals(rc.baseAttackBonus) &&

				grapple.equals(rc.grapple) 
				
				// TODO: && rpgClass.equals(rc.rpgClass) 
				);
		
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("");
		
		sb.append(" id: ").append(id);
		sb.append(" name: ").append(name);
		
		sb.append(" classes: [");
		for (AbstractRpgClass c: rpgClass) {
			sb.append(c.getClass().getName()).append(" - ").append(c.getClassLevel()).append(" ");
		}
		sb.append("]");
		sb.append(attributes);
		
		return sb.toString();
	}
}
