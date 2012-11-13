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

	protected Characteristics(Characteristics characteristics) {
		if (characteristics == null)
			return;

		name = characteristics.name;

		race = characteristics.race;
		alignment = characteristics.alignment;
		religion = characteristics.religion;

		size = characteristics.size;
		age = characteristics.age;
		gender = characteristics.gender;
		height = characteristics.height;
		weight = characteristics.weight;
		eye = characteristics.eye;
		hair = characteristics.hair;
		skin = characteristics.skin;
		vision = characteristics.vision;
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
	public boolean equals(Object characteristics) {

		if (this == characteristics)
			return true;

		if (!(characteristics instanceof Characteristics))
			return false;

		Characteristics charact = (Characteristics) characteristics;

		return name.equals(charact.name) && race.equals(charact.race) && alignment.equals(charact.alignment) && religion.equals(charact.religion)
				&& size.equals(charact.size) && age.equals(charact.age) && gender.equals(charact.gender) && height.equals(charact.height)
				&& weight.equals(charact.weight) && eye.equals(charact.eye) && hair.equals(charact.hair) && skin.equals(charact.skin);
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
