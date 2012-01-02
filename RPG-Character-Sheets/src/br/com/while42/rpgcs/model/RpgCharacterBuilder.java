package br.com.while42.rpgcs.model;

import java.util.HashMap;

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
