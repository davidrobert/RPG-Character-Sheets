package br.com.while42.rpgcs.model;

import java.io.Serializable;
import java.util.List;

public class RpgCharacter implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private long id;
	private String image;
	
	private String name;
	private TypeRpgRace race;
	private List<TypeRpgClass> classes;
	private TypeRpgAlignment alignment;
	private TypeSex typeSex;
	
	
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
	public List<TypeRpgClass> getClasses() {
		return classes;
	}
	public void setClasses(List<TypeRpgClass> classes) {
		this.classes = classes;
	}
	public TypeRpgAlignment getAlignment() {
		return alignment;
	}
	public void setAlignment(TypeRpgAlignment alignment) {
		this.alignment = alignment;
	}
	public TypeSex getSex() {
		return typeSex;
	}
	public void setSex(TypeSex typeSex) {
		this.typeSex = typeSex;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
	
	public boolean isPersistent() {
		return getId() != 0;
	}
}
