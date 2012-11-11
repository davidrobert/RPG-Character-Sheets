package br.com.while42.rpgcs.model.character;

import java.io.Serializable;

import br.com.while42.rpgcs.model.character.attributes.TypeEyeColor;
import br.com.while42.rpgcs.model.character.attributes.TypeGender;
import br.com.while42.rpgcs.model.character.attributes.TypeHairColor;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgAlignment;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgRace;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgReligion;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgSize;
import br.com.while42.rpgcs.model.character.attributes.TypeSkinColor;
import br.com.while42.rpgcs.model.character.attributes.TypeVision;


public class Characteristics implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String name;
	
	private TypeRpgRace race;
	private TypeRpgAlignment alignment;
	private TypeRpgReligion religion;

	private TypeRpgSize size;
	private Integer age;
	private TypeGender gender;
	private Integer height;
	private Integer weight;
	private TypeEyeColor eye;
	private TypeHairColor hair;
	private TypeSkinColor skin;
	private TypeVision vision;

	protected Characteristics() {		
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

	public TypeRpgAlignment getAlignment() {
		return alignment;
	}

	public void setAlignment(TypeRpgAlignment alignment) {
		this.alignment = alignment;
	}

	public TypeRpgReligion getReligion() {
		return religion;
	}

	public void setReligion(TypeRpgReligion religion) {
		this.religion = religion;
	}

	public TypeRpgSize getSize() {
		return size;
	}

	public void setSize(TypeRpgSize size) {
		this.size = size;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public TypeGender getGender() {
		return gender;
	}

	public void setGender(TypeGender gender) {
		this.gender = gender;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public TypeEyeColor getEye() {
		return eye;
	}

	public void setEye(TypeEyeColor eye) {
		this.eye = eye;
	}

	public TypeHairColor getHair() {
		return hair;
	}

	public void setHair(TypeHairColor hair) {
		this.hair = hair;
	}

	public TypeSkinColor getSkin() {
		return skin;
	}

	public void setSkin(TypeSkinColor skin) {
		this.skin = skin;
	}
	
	public TypeVision getVision() {
		return vision;
	}

	public void setVision(TypeVision vision) {
		this.vision = vision;
	}

	@Override
	public boolean equals(Object attributes) {

		if (this == attributes)
			return true;

		if (!(attributes instanceof Characteristics))
			return false;

		Characteristics attr = (Characteristics) attributes;

		return name.equals(attr.name) &&
				race.equals(attr.race) && 
				alignment.equals(attr.alignment) && 
				religion.equals(attr.religion) && 
				size.equals(attr.size) && 
				age.equals(attr.age) && 
				gender.equals(attr.gender) &&
				height.equals(attr.height) && 
				weight.equals(attr.weight) && 
				eye.equals(attr.eye) &&
				hair.equals(attr.hair) && 
				skin.equals(attr.skin);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("");
		
		sb.append(" name: ").append(name);
		sb.append(" race: ").append(race);
		sb.append(" alignment: ").append(alignment);
		sb.append(" religion: ").append(religion);
		sb.append(" size: ").append(size);
		sb.append(" age: ").append(age);
		sb.append(" gender: ").append(gender);
		sb.append(" height: ").append(height);
		sb.append(" weight: ").append(weight);
		sb.append(" eye: ").append(eye);
		sb.append(" hair: ").append(hair);
		sb.append(" skin: ").append(skin);
		
		return sb.toString();
	}
}
