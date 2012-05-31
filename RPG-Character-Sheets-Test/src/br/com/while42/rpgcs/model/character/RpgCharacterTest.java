package br.com.while42.rpgcs.model.character;

import br.com.while42.rpgcs.model.character.attributes.TypeEyeColor;
import br.com.while42.rpgcs.model.character.attributes.TypeGender;
import br.com.while42.rpgcs.model.character.attributes.TypeHairColor;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgAlignment;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgRace;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgReligion;
import br.com.while42.rpgcs.model.character.attributes.TypeSkinColor;
import br.com.while42.rpgcs.model.classes.AbstractClass;
import br.com.while42.rpgcs.model.classes.Barbarian;
import android.test.AndroidTestCase;

public class RpgCharacterTest extends AndroidTestCase {
	
	public void createInstanceCharacter() {
		RpgCharacter character = new RpgCharacter();
		
		AbstractClass barbarian = new Barbarian();
		barbarian.setClassLevel(1);
		
		character.setName("Blob");
		character.addClass(barbarian);
		character.setAge(40);
		character.setAlignment(TypeRpgAlignment.NEUTRAL_EVIL);
		character.setEye(TypeEyeColor.Brown);
		character.setGender(TypeGender.MEN);
		character.setHair(TypeHairColor.BLACK);
		character.setHeight(200); // TODO: Method name 
		character.setRace(TypeRpgRace.HUMAN);
		character.setReligion(TypeRpgReligion.NONE);
		character.setSkin(TypeSkinColor.PALE);
		character.setWeight(120); // TODO: Method name 
	}
	
	

}
