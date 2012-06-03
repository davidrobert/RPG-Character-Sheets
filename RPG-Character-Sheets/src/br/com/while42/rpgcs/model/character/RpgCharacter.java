package br.com.while42.rpgcs.model.character;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import br.com.while42.rpgcs.model.character.attributes.TypeEyeColor;
import br.com.while42.rpgcs.model.character.attributes.TypeGender;
import br.com.while42.rpgcs.model.character.attributes.TypeHairColor;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgAlignment;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgRace;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgReligion;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgSize;
import br.com.while42.rpgcs.model.character.attributes.TypeSkinColor;
import br.com.while42.rpgcs.model.classes.AbstractRpgClass;

public class RpgCharacter implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id = 0L;
	private String image = "";

	private String name = "";
	private HashSet<AbstractRpgClass> rpgClass = new HashSet<AbstractRpgClass>();
	private TypeRpgRace race;
	private TypeRpgAlignment alignment;
	private TypeRpgReligion religion = TypeRpgReligion.NONE;

	private TypeRpgSize size = TypeRpgSize.MEDIUM;
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
		// TODO: Construir uma classe Builder para RpgCharacter
	}
	
	public RpgCharacter(String name, TypeRpgRace race, TypeRpgAlignment alignment) {
		this.name = name;
		this.race = race;
		this.alignment = alignment;
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

	public Set<AbstractRpgClass> getRpgClasses() {
		return Collections.unmodifiableSet(rpgClass);
	}

	public void addRpgClass(AbstractRpgClass rpgClass) {
		this.rpgClass.add(rpgClass);
	}

	public void clearRpgClass() {
		rpgClass.clear();
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
				race.equals(rc.race) &&
				alignment.equals(rc.alignment) &&
				religion.equals(rc.religion) &&
				size.equals(rc.size) &&
				age.equals(rc.age) &&
				gender.equals(rc.gender) &&
				height.equals(rc.height) &&
				weight.equals(rc.weight) &&
				eye.equals(rc.eye) &&
				hair.equals(rc.hair) &&
				skin.equals(rc.skin) &&
				
				hitPoints.equals(rc.hitPoints) &&
				currentHitPoints.equals(rc.currentHitPoints) &&
				
				armorClass.equals(rc.armorClass) &&
				
				touchArmorClass.equals(rc.touchArmorClass) &&
				flatFooted.equals(rc.flatFooted) &&
				initiative.equals(rc.initiative) &&
				
				baseAttackBonus.equals(rc.baseAttackBonus) &&
				spellResistence.equals(rc.spellResistence) &&
				grapple.equals(rc.grapple)
				);
		
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("");
		
		sb.append(" id: ").append(id);
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
