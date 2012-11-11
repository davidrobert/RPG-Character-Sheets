package br.com.while42.rpgcs.model.character;

import br.com.while42.rpgcs.model.character.attributes.TypeEyeColor;
import br.com.while42.rpgcs.model.character.attributes.TypeGender;
import br.com.while42.rpgcs.model.character.attributes.TypeHairColor;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgAlignment;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgRace;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgReligion;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgSize;
import br.com.while42.rpgcs.model.character.attributes.TypeSkinColor;
import br.com.while42.rpgcs.model.character.attributes.TypeVision;

public class BuilderCharacteristics {

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
	
	public BuilderCharacteristicsWithName setName(String name) {
		return new BuilderCharacteristicsWithName(name);
	}
	
	public class BuilderCharacteristicsWithName {
		private BuilderCharacteristicsWithName(String n) {
			name = n;
		}
		public BuilderCharacteristicsWithRace setRace(TypeRpgRace race) {
			return new BuilderCharacteristicsWithRace(race);
		}
	}
	
	public class BuilderCharacteristicsWithRace {
		private BuilderCharacteristicsWithRace(TypeRpgRace r) {
			race = r;
		}
		public BuilderCharacteristicsWithAlignment setAlignment(TypeRpgAlignment alignment) {
			return new BuilderCharacteristicsWithAlignment(alignment);
		}
	}
	
	public class BuilderCharacteristicsWithAlignment {
		private BuilderCharacteristicsWithAlignment(TypeRpgAlignment a) {
			alignment = a;
		}
		public BuilderCharacteristicsWithReligion setReligion(TypeRpgReligion religion) {
			return new BuilderCharacteristicsWithReligion(religion);
		}
	}
	
	public class BuilderCharacteristicsWithReligion {
		private BuilderCharacteristicsWithReligion(TypeRpgReligion r) {
			religion = r;
		}
		public BuilderCharacteristicsWithSize setSize(TypeRpgSize size) {
			return new BuilderCharacteristicsWithSize(size);
		}
	}
	
	public class BuilderCharacteristicsWithSize {
		private BuilderCharacteristicsWithSize(TypeRpgSize s) {
			size = s;
		}
		public BuilderCharacteristicsWithAge setAge(Integer age) {
			return new BuilderCharacteristicsWithAge(age);
		}
	}
	
	public class BuilderCharacteristicsWithAge {
		private BuilderCharacteristicsWithAge(Integer a) {
			age = a;
		}
		public BuilderCharacteristicsWithGender setGender(TypeGender gender) {
			return new BuilderCharacteristicsWithGender(gender);
		}
	}
	
	public class BuilderCharacteristicsWithGender {
		private BuilderCharacteristicsWithGender(TypeGender g) {
			gender = g;
		}
		public BuilderCharacteristicsWithHeight setHeight(Integer height) {
			return new BuilderCharacteristicsWithHeight(height);
		}
	}
	
	public class BuilderCharacteristicsWithHeight {
		private BuilderCharacteristicsWithHeight(Integer h) {
			height = h;
		}
		public BuilderCharacteristicsWithWeight setWeight(Integer weight) {
			return new BuilderCharacteristicsWithWeight(weight);
		}
	}
	
	public class BuilderCharacteristicsWithWeight {
		private BuilderCharacteristicsWithWeight(Integer w) {
			weight = w;
		}
		public BuilderCharacteristicsWithEye setEye(TypeEyeColor color) {
			return new BuilderCharacteristicsWithEye(color);
		}
	}
	
	public class BuilderCharacteristicsWithEye {
		private BuilderCharacteristicsWithEye(TypeEyeColor color) {
			eye = color;
		}
		public BuilderCharacteristicsWithHair setHair(TypeHairColor color) {
			return new BuilderCharacteristicsWithHair(color);
		}
	}
	
	public class BuilderCharacteristicsWithHair {
		private BuilderCharacteristicsWithHair(TypeHairColor color) {
			hair = color;
		}
		public BuilderCharacteristicsWithSkin setSkin(TypeSkinColor color) {
			return new BuilderCharacteristicsWithSkin(color);
		}
	}
	
	public class BuilderCharacteristicsWithSkin {
		private BuilderCharacteristicsWithSkin(TypeSkinColor color) {
			skin = color;
		}
		public BuilderCharacteristicsWithVision setVision(TypeVision vision) {
			return new BuilderCharacteristicsWithVision(vision);
		}
	}
	
	public class BuilderCharacteristicsWithVision {
		private BuilderCharacteristicsWithVision(TypeVision v) {
			vision = v;
		}

		public Characteristics toAttributes() {
			Characteristics characteristics = new Characteristics();

			characteristics.setName(name);
			characteristics.setRace(race);
			characteristics.setAlignment(alignment);
			characteristics.setReligion(religion);
			characteristics.setSize(size);
			characteristics.setAge(age);
			characteristics.setGender(gender);
			characteristics.setHeight(height);
			characteristics.setWeight(weight);
			characteristics.setEye(eye);
			characteristics.setHair(hair);
			characteristics.setSkin(skin);
			characteristics.setVision(vision);
			
			return characteristics;
		}
		
	}
}
