package br.com.while42.rpgcs.model;

import java.util.HashMap;

import br.com.while42.rpgcs.model.attributes.TypeEyeColor;
import br.com.while42.rpgcs.model.attributes.TypeGender;
import br.com.while42.rpgcs.model.attributes.TypeHairColor;
import br.com.while42.rpgcs.model.attributes.TypeRpgAlignment;
import br.com.while42.rpgcs.model.attributes.TypeRpgClass;
import br.com.while42.rpgcs.model.attributes.TypeRpgRace;
import br.com.while42.rpgcs.model.attributes.TypeRpgReligion;
import br.com.while42.rpgcs.model.attributes.TypeRpgSize;
import br.com.while42.rpgcs.model.attributes.TypeSkinColor;

import android.graphics.Color;

public class RpgCharacterBuilder {

	private String name;
	private HashMap<TypeRpgClass, Integer> classes;
	private TypeRpgRace race;
	private TypeRpgAlignment alignment;
	private TypeRpgReligion deity;
	private TypeRpgSize size;
	private int age;
	private TypeGender gender;
	private int height;
	private int weight;
	private TypeEyeColor eye;
	private TypeHairColor hair;
	private TypeSkinColor skin;
	
	// StrengthModifier
	private int strength;
	private int dextery;
	private int constitution;
	private int intelligence;
	private int wisdom;
	private int charisma;
		
}
