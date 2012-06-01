package br.com.while42.rpgcs.model.character;

import android.test.AndroidTestCase;
import br.com.while42.rpgcs.model.character.attributes.TypeEyeColor;
import br.com.while42.rpgcs.model.character.attributes.TypeGender;
import br.com.while42.rpgcs.model.character.attributes.TypeHairColor;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgAlignment;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgRace;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgReligion;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgSize;
import br.com.while42.rpgcs.model.character.attributes.TypeSkinColor;
import br.com.while42.rpgcs.model.classes.AbstractRpgClass;
import br.com.while42.rpgcs.model.classes.Barbarian;

public class RpgCharacterTest extends AndroidTestCase {
	
	public static RpgCharacter createInstanceCharacter() {
		RpgCharacter rpgCharacter = new RpgCharacter();
		
		AbstractRpgClass barbarian = new Barbarian();
		barbarian.setClassLevel(1);
		
		rpgCharacter.setName("Blob");
		rpgCharacter.setRace(TypeRpgRace.HUMAN);
		rpgCharacter.setAlignment(TypeRpgAlignment.NEUTRAL_EVIL);
		rpgCharacter.setReligion(TypeRpgReligion.NONE);
		
		rpgCharacter.setSize(TypeRpgSize.MEDIUM);
		rpgCharacter.setAge(40);
		rpgCharacter.setGender(TypeGender.MEN);
		rpgCharacter.setHeight(200); // TODO: Method name 
		rpgCharacter.setWeight(120); // TODO: Method name 
		rpgCharacter.setEye(TypeEyeColor.Brown);
		rpgCharacter.setHair(TypeHairColor.BLACK);
		rpgCharacter.setSkin(TypeSkinColor.PALE);
		
		rpgCharacter.addRpgClass(barbarian);
		
		return rpgCharacter;
	}
	
	

}
