package br.com.while42.rpgcs.model.character;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
import br.com.while42.rpgcs.model.classes.Monk;

public class RpgCharacterTest extends AndroidTestCase {

	private static List<RpgCharacter> rpgCharacterSheets = new ArrayList<RpgCharacter>();

	static {
		{
			RpgCharacter rc = new RpgCharacter();

			rc.setName("Blob");
			rc.setRace(TypeRpgRace.HUMAN);
			rc.setAlignment(TypeRpgAlignment.NEUTRAL_EVIL);
			rc.setReligion(TypeRpgReligion.NONE);

			rc.setSize(TypeRpgSize.MEDIUM);
			rc.setAge(40);
			rc.setGender(TypeGender.MEN);
			rc.setHeight(200); // TODO: Method name
			rc.setWeight(120); // TODO: Method name
			rc.setEye(TypeEyeColor.Brown);
			rc.setHair(TypeHairColor.BLACK);
			rc.setSkin(TypeSkinColor.PALE);

			AbstractRpgClass barbarian = new Barbarian();
			barbarian.setClassLevel(1);
			rc.addRpgClass(barbarian);
			
			rpgCharacterSheets.add(rc);
		}

		{
			RpgCharacter rc = new RpgCharacter();

			rc.setName("Deltorei");
			rc.setRace(TypeRpgRace.HUMAN);
			rc.setAlignment(TypeRpgAlignment.TRUE_NEUTRAL);
			rc.setReligion(TypeRpgReligion.NONE);

			rc.setSize(TypeRpgSize.MEDIUM);
			rc.setAge(40);
			rc.setGender(TypeGender.MEN);
			rc.setHeight(200); // TODO: Method name
			rc.setWeight(120); // TODO: Method name
			rc.setEye(TypeEyeColor.Brown);
			rc.setHair(TypeHairColor.BLACK);
			rc.setSkin(TypeSkinColor.PALE);

			AbstractRpgClass monk = new Monk();
			monk.setClassLevel(35);
			rc.addRpgClass(monk);
			
			rpgCharacterSheets.add(rc);
		}
	}

	public static RpgCharacter getInstance() {
		return rpgCharacterSheets.get(0);
	}
	
	public static List<RpgCharacter> getList() {
		return (List<RpgCharacter>) Collections.unmodifiableCollection(rpgCharacterSheets);
	}

}
