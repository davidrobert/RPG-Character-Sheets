package br.com.while42.rpgcs.model.character;

import br.com.while42.rpgcs.model.character.attributes.TypeEyeColor;
import br.com.while42.rpgcs.model.character.attributes.TypeGender;
import br.com.while42.rpgcs.model.character.attributes.TypeHairColor;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgAlignment;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgRace;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgReligion;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgSize;
import br.com.while42.rpgcs.model.character.attributes.TypeSkinColor;

public class BuilderAttributes {

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
	
	public BuilderAttributesWithRace setRace(TypeRpgRace race) {
		return new BuilderAttributesWithRace(race);
	}

	public class BuilderAttributesWithRace {
		public BuilderAttributesWithRace(TypeRpgRace r) {
			race = r;
		}
		public BuilderAttributesWithAlignment setAlignment(TypeRpgAlignment alignment) {
			return new BuilderAttributesWithAlignment(alignment);
		}
	}
	
	public class BuilderAttributesWithAlignment {
		public BuilderAttributesWithAlignment(TypeRpgAlignment a) {
			alignment = a;
		}
		public BuilderAttributesWithReligion setReligion(TypeRpgReligion religion) {
			return new BuilderAttributesWithReligion(religion);
		}
	}
	
	public class BuilderAttributesWithReligion {
		public BuilderAttributesWithReligion(TypeRpgReligion r) {
			religion = r;
		}
		public BuilderAttributesWithSize setSize(TypeRpgSize size) {
			return new BuilderAttributesWithSize(size);
		}
	}
	
	public class BuilderAttributesWithSize {
		public BuilderAttributesWithSize(TypeRpgSize s) {
			size = s;
		}
		public BuilderAttributesWithAge setAge(Integer age) {
			return new BuilderAttributesWithAge(age);
		}
	}
	
	public class BuilderAttributesWithAge {
		public BuilderAttributesWithAge(Integer a) {
			age = a;
		}
		public BuilderAttributesWithGender setGender(TypeGender gender) {
			return new BuilderAttributesWithGender(gender);
		}
	}
	
	public class BuilderAttributesWithGender {
		public BuilderAttributesWithGender(TypeGender g) {
			gender = g;
		}
		public BuilderAttributesWithHeight setHeight(Integer height) {
			return new BuilderAttributesWithHeight(height);
		}
	}
	
	public class BuilderAttributesWithHeight {
		public BuilderAttributesWithHeight(Integer h) {
			height = h;
		}
		public BuilderAttributesWithWeight setWeight(Integer weight) {
			return new BuilderAttributesWithWeight(weight);
		}
	}
	
	public class BuilderAttributesWithWeight {
		public BuilderAttributesWithWeight(Integer w) {
			weight = w;
		}
		public BuilderAttributesWithEye setEye(TypeEyeColor color) {
			return new BuilderAttributesWithEye(color);
		}
	}
	
	public class BuilderAttributesWithEye {
		public BuilderAttributesWithEye(TypeEyeColor color) {
			eye = color;
		}
		public BuilderAttributesWithHair setHair(TypeHairColor color) {
			return new BuilderAttributesWithHair(color);
		}
	}
	
	public class BuilderAttributesWithHair {
		public BuilderAttributesWithHair(TypeHairColor color) {
			hair = color;
		}
		public BuilderAttributesWithSkin setSkin(TypeSkinColor color) {
			return new BuilderAttributesWithSkin(color);
		}
	}
	
	public class BuilderAttributesWithSkin {
		public BuilderAttributesWithSkin(TypeSkinColor color) {
			skin = color;
		}

		public Attributes toAttributes() {
			Attributes attr = new Attributes();

			attr.setRace(race);
			attr.setAlignment(alignment);
			attr.setReligion(religion);
			attr.setSize(size);
			attr.setAge(age);
			attr.setGender(gender);
			attr.setHeight(height);
			attr.setWeight(weight);
			attr.setEye(eye);
			attr.setHair(hair);
			attr.setSkin(skin);
			
			return attr;
		}
		
	}
}
