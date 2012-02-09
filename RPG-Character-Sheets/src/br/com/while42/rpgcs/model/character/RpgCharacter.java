package br.com.while42.rpgcs.model.character;

import java.io.Serializable;
import java.util.HashSet;

import br.com.while42.rpgcs.model.character.attributes.TypeEyeColor;
import br.com.while42.rpgcs.model.character.attributes.TypeGender;
import br.com.while42.rpgcs.model.character.attributes.TypeHairColor;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgAlignment;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgRace;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgReligion;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgSize;
import br.com.while42.rpgcs.model.character.attributes.TypeSkinColor;
import br.com.while42.rpgcs.model.classes.AbstractClass;

public class RpgCharacter implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private long id;
	private String image;
	
	private String name;
	private HashSet<AbstractClass> classes = new  HashSet<AbstractClass>();
	private TypeRpgRace race;	
	private TypeRpgAlignment alignment;
	private TypeRpgReligion religion;
	
	private TypeRpgSize size;
	private Integer age = 0;	
	private TypeGender gender;
	private Integer height = 0;
	private Integer weight = 0;
	private TypeEyeColor eye;
	private TypeHairColor hair;
	private TypeSkinColor skin;	
	
	private Integer hitPoints = 0;
	private Integer currentHitPoints = 0;
	
	private Integer armorClass = 0;
	
	private Integer touchArmorClass = 0;
	private Integer flatFooted = 0;
	private Integer initiative = 0;
	
	private Integer baseAttackBonus = 0;
	private Integer spellResistence = 0;
	private Integer grapple = 0;
	
	
	public RpgCharacter() {
		// TODO Auto-generated constructor stub
	}
	
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

	public HashSet<AbstractClass> getClasses() {
		return classes;
	}
	
	public void addClass(AbstractClass classe) {
		classes.add(classe);
	}
	
	public void clearClasses() {
		classes.clear();
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

}
