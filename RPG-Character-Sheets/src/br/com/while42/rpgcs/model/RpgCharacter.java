package br.com.while42.rpgcs.model;

import java.io.Serializable;
import java.util.HashMap;

import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import br.com.while42.rpgcs.model.attributes.TypeEyeColor;
import br.com.while42.rpgcs.model.attributes.TypeGender;
import br.com.while42.rpgcs.model.attributes.TypeHairColor;
import br.com.while42.rpgcs.model.attributes.TypeRpgAlignment;
import br.com.while42.rpgcs.model.attributes.TypeRpgClass;
import br.com.while42.rpgcs.model.attributes.TypeRpgRace;
import br.com.while42.rpgcs.model.attributes.TypeRpgReligion;
import br.com.while42.rpgcs.model.attributes.TypeRpgSize;
import br.com.while42.rpgcs.model.attributes.TypeSkinColor;

public class RpgCharacter implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private long id;
	private String image;
	
	private String name;
	private HashMap<TypeRpgClass, Integer> classes;
	private TypeRpgRace race;	
	private TypeRpgAlignment alignment;
	private TypeRpgReligion religion;
	
	private TypeRpgSize size;
	private int age;	
	private TypeGender gender;
	// TODO: height
	// TODO: weight
	private TypeEyeColor eye;
	private TypeHairColor hair;
	private TypeSkinColor skin;	
	
	@Override
	public String toString() {
		return this.name;
	}
	
	public boolean isPersistent() {
		return getId() != 0;
	}

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

	public HashMap<TypeRpgClass, Integer> getClasses() {
		return classes;
	}

	public void setClasses(HashMap<TypeRpgClass, Integer> classes) {
		this.classes = classes;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public TypeGender getGender() {
		return gender;
	}

	public void setGender(TypeGender gender) {
		this.gender = gender;
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
}
