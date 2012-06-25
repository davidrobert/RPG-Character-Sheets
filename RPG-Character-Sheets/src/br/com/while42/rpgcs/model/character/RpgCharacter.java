package br.com.while42.rpgcs.model.character;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import android.util.Log;
import br.com.while42.rpgcs.model.equip.Equipments;

public class RpgCharacter implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String image;
	private String name;
	
	private Attributes attributes;
	
	private RpgClass classes;
	private Abilities abilities;
	private Defences defences;
	private SavingThrows savingThrows;
	private Skills skills;
	private Languages languages;
	private Money money;
	
	private Attacks attacks;
	private Armors armors;
	private Equipments otherEquipments;
	private Notes notes;
	
	private Integer baseAttackBonus;
	private Integer grapple;

	
	public RpgCharacter(String name, Attributes attributes) {
		this.name = name;
		this.attributes = attributes;
		
		this.id = 0L;
		this.image = "";
		
		this.classes = new RpgClass();
		this.abilities = new Abilities();
		this.defences = new Defences();
		this.savingThrows = new SavingThrows();
		this.skills = new Skills();
		this.languages = new Languages();
		this.money = new Money();
		
		this.attacks = new Attacks(abilities);
		this.armors = new Armors();
		this.otherEquipments = new Equipments();
		this.notes = new Notes();
		
		this.baseAttackBonus = 0;
		this.grapple = 0;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
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
	
	public void setRpgClasses(RpgClass classes) {
		this.classes = classes;
	}
	
	public RpgClass getRpgClasses() {
		return classes;
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
	
	public void setSavingThrows(SavingThrows savingThrows) {
		this.savingThrows = savingThrows;
	}
	
	public SavingThrows getSavingThrows() {
		return savingThrows;
	}
	
	public Skills getSkills() {
		return skills;
	}

	public void setSkills(Skills skills) {
		this.skills = skills;
	}

	public Languages getLanguages() {
		return languages;
	}

	public void setLanguages(Languages languages) {
		this.languages = languages;
	}

	public void setMoney(Money money) {
		this.money = money;
	}
	
	public Money getMoney() {
		return money;
	}
	
	public void setAttacks(Attacks attaks) {
		this.attacks = attaks;
	}
	
	public Attacks getAttacks() {
		return attacks;
	}
	
	public Notes getNotes() {
		return notes;
	}

	public void setNotes(Notes notes) {
		this.notes = notes;
	}

	public static byte[] serialize(RpgCharacter rpgCharacter) { 
	    ByteArrayOutputStream bos = new ByteArrayOutputStream(); 
	 
	    try { 
	      ObjectOutput out = new ObjectOutputStream(bos); 
	      out.writeObject(rpgCharacter); 
	      out.close(); 
	 
	      // Get the bytes of the serialized object 
	      byte[] buf = bos.toByteArray(); 
	 
	      return buf; 
	    } catch(IOException ioe) { 
	      Log.e("serializeObject", "error", ioe); 
	 
	      return null; 
	    } 
	  } 

	public static RpgCharacter deserialize(byte[] s) { 
	    try { 
	      ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(s)); 
	      RpgCharacter rpgCharacter = (RpgCharacter) in.readObject(); 
	      in.close(); 
	 
	      return rpgCharacter; 
	    } catch(ClassNotFoundException cnfe) { 
	      Log.e("deserializeObject", "class not found error", cnfe); 
	 
	      return null; 
	    } catch(IOException ioe) { 
	      Log.e("deserializeObject", "io error", ioe); 
	 
	      return null; 
	    } 
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
				
				classes.equals(rc.classes) &&
				attributes.equals(rc.attributes) &&
				abilities.equals(rc.abilities) &&
				defences.equals(rc.defences) &&
				savingThrows.equals(rc.savingThrows) &&
				skills.equals(rc.skills) &&
				languages.equals(rc.languages) &&
				money.equals(rc.money) &&
				attacks.equals(rc.attacks) &&
				armors.equals(rc.armors) &&
				
				otherEquipments.equals(rc.otherEquipments) &&
				notes.equals(rc.notes) &&
				
				baseAttackBonus.equals(rc.baseAttackBonus) &&
				grapple.equals(rc.grapple) );
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(" id: ").append(id);
		sb.append(" name: ").append(name);
		
		sb.append(" classes: ").append(classes);
		sb.append(" attributes: ").append(attributes);
		sb.append(" abilities: ").append(abilities);
		sb.append(" defences: ").append(defences);
		sb.append(" savingThrows: ").append(savingThrows);
		sb.append(" skills: ").append(skills);
		sb.append(" languages: ").append(languages);
		sb.append(" money: ").append(money);
		sb.append(" attacks: ").append(attacks);
		sb.append(" armors: ").append(armors);
		sb.append(" otherEquipments: ").append(otherEquipments);
		sb.append(" notes: ").append(notes);
		
		return sb.toString();
	}


}
