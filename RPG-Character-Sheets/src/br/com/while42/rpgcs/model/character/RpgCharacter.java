package br.com.while42.rpgcs.model.character;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import android.util.Log;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgAlignment;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgRace;

public class RpgCharacter implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id = 0L;
	private String image = "";
	private String name = "";
	
	private RpgClass classes = new RpgClass();
	private Attributes attributes = new Attributes();
	private Abilities abilities = new Abilities();
	private Defences defences = new Defences();
	private SavingThrows savingThrows = new SavingThrows();
	
	private Integer baseAttackBonus = 0;
	private Integer grapple = 0;
	
	public RpgCharacter() {
		// TODO: Construir uma classe Builder para RpgCharacter
	}
	
	public RpgCharacter(String name, TypeRpgRace race, TypeRpgAlignment alignment) {
		this.name = name;
		attributes.setRace(race);
		attributes.setAlignment(alignment);
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
				
				baseAttackBonus.equals(rc.baseAttackBonus) &&
				grapple.equals(rc.grapple) );
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("");
		
		sb.append(" id: ").append(id);
		sb.append(" name: ").append(name);
		
		sb.append(" classes: ").append(classes);
		sb.append(" attributes: ").append(attributes);
		sb.append(" abilities: ").append(abilities);
		sb.append(" defences: ").append(defences);
		sb.append(" savingThrows: ").append(savingThrows);
		
		return sb.toString();
	}


}
