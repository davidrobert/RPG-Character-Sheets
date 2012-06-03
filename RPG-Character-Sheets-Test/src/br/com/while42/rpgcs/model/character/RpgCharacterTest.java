package br.com.while42.rpgcs.model.character;

import java.util.ArrayList;
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
import br.com.while42.rpgcs.model.classes.Sorcerer;
import br.com.while42.rpgcs.model.classes.bonuses.ExperienceAndLevel;

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
			monk.setClassLevel(20);
			rc.addRpgClass(monk);
			
			rpgCharacterSheets.add(rc);
		}
		
		{
			RpgCharacter rc = new RpgCharacter();

			rc.setName("Galadriel");
			rc.setRace(TypeRpgRace.ELF);
			rc.setAlignment(TypeRpgAlignment.TRUE_NEUTRAL);
			rc.setReligion(TypeRpgReligion.OTHER);

			rc.setSize(TypeRpgSize.MEDIUM);
			rc.setAge(40);
			rc.setGender(TypeGender.WOMAN);
			rc.setHeight(200); // TODO: Method name
			rc.setWeight(120); // TODO: Method name
			rc.setEye(TypeEyeColor.Deep_Blue);
			rc.setHair(TypeHairColor.WHITE);
			rc.setSkin(TypeSkinColor.WHITE);

			AbstractRpgClass sorcerer = new Sorcerer();
			sorcerer.setClassLevel(ExperienceAndLevel.MAX_LEVEL);
			rc.addRpgClass(sorcerer);
			
			rpgCharacterSheets.add(rc);
		}
	}

	public static RpgCharacter getInstance() {
		return rpgCharacterSheets.get(0);
	}
	
	public static List<RpgCharacter> getList() {
		return new ArrayList<RpgCharacter>(rpgCharacterSheets);
	}

}
