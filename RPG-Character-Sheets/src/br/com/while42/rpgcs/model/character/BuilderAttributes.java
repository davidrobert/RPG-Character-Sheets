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

public class BuilderAttributes {

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
	
	public BuilderAttributesWithName setName(String name) {
		return new BuilderAttributesWithName(name);
	}
	
	public class BuilderAttributesWithName {
		private BuilderAttributesWithName(String n) {
			name = n;
		}
		public BuilderAttributesWithRace setRace(TypeRpgRace race) {
			return new BuilderAttributesWithRace(race);
		}
	}
	
	public class BuilderAttributesWithRace {
		private BuilderAttributesWithRace(TypeRpgRace r) {
			race = r;
		}
		public BuilderAttributesWithAlignment setAlignment(TypeRpgAlignment alignment) {
			return new BuilderAttributesWithAlignment(alignment);
		}
	}
	
	public class BuilderAttributesWithAlignment {
		private BuilderAttributesWithAlignment(TypeRpgAlignment a) {
			alignment = a;
		}
		public BuilderAttributesWithReligion setReligion(TypeRpgReligion religion) {
			return new BuilderAttributesWithReligion(religion);
		}
	}
	
	public class BuilderAttributesWithReligion {
		private BuilderAttributesWithReligion(TypeRpgReligion r) {
			religion = r;
		}
		public BuilderAttributesWithSize setSize(TypeRpgSize size) {
			return new BuilderAttributesWithSize(size);
		}
	}
	
	public class BuilderAttributesWithSize {
		private BuilderAttributesWithSize(TypeRpgSize s) {
			size = s;
		}
		public BuilderAttributesWithAge setAge(Integer age) {
			return new BuilderAttributesWithAge(age);
		}
	}
	
	public class BuilderAttributesWithAge {
		private BuilderAttributesWithAge(Integer a) {
			age = a;
		}
		public BuilderAttributesWithGender setGender(TypeGender gender) {
			return new BuilderAttributesWithGender(gender);
		}
	}
	
	public class BuilderAttributesWithGender {
		private BuilderAttributesWithGender(TypeGender g) {
			gender = g;
		}
		public BuilderAttributesWithHeight setHeight(Integer height) {
			return new BuilderAttributesWithHeight(height);
		}
	}
	
	public class BuilderAttributesWithHeight {
		private BuilderAttributesWithHeight(Integer h) {
			height = h;
		}
		public BuilderAttributesWithWeight setWeight(Integer weight) {
			return new BuilderAttributesWithWeight(weight);
		}
	}
	
	public class BuilderAttributesWithWeight {
		private BuilderAttributesWithWeight(Integer w) {
			weight = w;
		}
		public BuilderAttributesWithEye setEye(TypeEyeColor color) {
			return new BuilderAttributesWithEye(color);
		}
	}
	
	public class BuilderAttributesWithEye {
		private BuilderAttributesWithEye(TypeEyeColor color) {
			eye = color;
		}
		public BuilderAttributesWithHair setHair(TypeHairColor color) {
			return new BuilderAttributesWithHair(color);
		}
	}
	
	public class BuilderAttributesWithHair {
		private BuilderAttributesWithHair(TypeHairColor color) {
			hair = color;
		}
		public BuilderAttributesWithSkin setSkin(TypeSkinColor color) {
			return new BuilderAttributesWithSkin(color);
		}
	}
	
	public class BuilderAttributesWithSkin {
		private BuilderAttributesWithSkin(TypeSkinColor color) {
			skin = color;
		}
		public BuilderAttributesWithVision setVision(TypeVision vision) {
			return new BuilderAttributesWithVision(vision);
		}
	}
	
	public class BuilderAttributesWithVision {
		private BuilderAttributesWithVision(TypeVision v) {
			vision = v;
		}

		public Attributes toAttributes() {
			Attributes attr = new Attributes();

			attr.setName(name);
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
			attr.setVision(vision);
			
			return attr;
		}
		
	}
}
