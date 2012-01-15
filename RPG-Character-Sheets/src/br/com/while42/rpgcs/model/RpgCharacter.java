package br.com.while42.rpgcs.model;

import java.io.Serializable;
import java.util.HashMap;

import br.com.while42.rpgcs.model.attributes.TypeGender;
import br.com.while42.rpgcs.model.attributes.TypeRpgAlignment;
import br.com.while42.rpgcs.model.attributes.TypeRpgClass;
import br.com.while42.rpgcs.model.attributes.TypeRpgRace;

public class RpgCharacter implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private long id;
	private String image;
	
	private String name;
	private TypeRpgRace race;
	private HashMap<TypeRpgClass, Integer> classes;
	private TypeRpgAlignment alignment;
	private TypeGender gender;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	public TypeRpgRace getRace() {
		return race;
	}
	public void setRace(TypeRpgRace race) {
		this.race = race;
	}
	public HashMap<TypeRpgClass, Integer> getClasses() {
		return classes;
	}
	public void setClasses(HashMap<TypeRpgClass, Integer> classes) {
		this.classes = classes;
	}
	public TypeRpgAlignment getAlignment() {
		return alignment;
	}
	public void setAlignment(TypeRpgAlignment alignment) {
		this.alignment = alignment;
	}
	public TypeGender getGender() {
		return gender;
	}
	public void setSex(TypeGender gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
	
	public boolean isPersistent() {
		return getId() != 0;
	}
}
