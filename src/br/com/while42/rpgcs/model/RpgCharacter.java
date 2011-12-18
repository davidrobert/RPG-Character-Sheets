package br.com.while42.rpgcs.model;

import java.io.Serializable;
import java.util.List;

public class RpgCharacter implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private long id;
	private String image;
	
	private String name;
	private RpgRace race;
	private List<RpgClass> classes;
	private RpgAlignment alignment;
	private Sex sex;
	
	
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
	public RpgRace getRace() {
		return race;
	}
	public void setRace(RpgRace race) {
		this.race = race;
	}
	public List<RpgClass> getClasses() {
		return classes;
	}
	public void setClasses(List<RpgClass> classes) {
		this.classes = classes;
	}
	public RpgAlignment getAlignment() {
		return alignment;
	}
	public void setAlignment(RpgAlignment alignment) {
		this.alignment = alignment;
	}
	public Sex getSex() {
		return sex;
	}
	public void setSex(Sex sex) {
		this.sex = sex;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
	
	public boolean isPersistent() {
		return getId() != 0;
	}
}
