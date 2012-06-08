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

	public static List<RpgCharacter> getList() {
		List<RpgCharacter> rpgCharacterSheets = new ArrayList<RpgCharacter>();

		{
			RpgCharacter rc = new RpgCharacter();

			rc.setName("Blob");
			Attributes attr = rc.getAttributes();
			
			attr.setRace(TypeRpgRace.HUMAN);
			attr.setAlignment(TypeRpgAlignment.NEUTRAL_EVIL);
			attr.setReligion(TypeRpgReligion.NONE);

			attr.setSize(TypeRpgSize.MEDIUM);
			attr.setAge(40);
			attr.setGender(TypeGender.MEN);
			attr.setHeight(200);
			attr.setWeight(120); 
			attr.setEye(TypeEyeColor.Brown);
			attr.setHair(TypeHairColor.BLACK);
			attr.setSkin(TypeSkinColor.PALE);

			AbstractRpgClass barbarian = new Barbarian();
			barbarian.setClassLevel(1);
			rc.getRpgClasses().add(barbarian);

			rpgCharacterSheets.add(rc);
		}

		{
			RpgCharacter rc = new RpgCharacter();

			rc.setName("Deltorei");
			Attributes attr = rc.getAttributes();
			
			attr.setRace(TypeRpgRace.HUMAN);
			attr.setAlignment(TypeRpgAlignment.TRUE_NEUTRAL);
			attr.setReligion(TypeRpgReligion.NONE);

			attr.setSize(TypeRpgSize.MEDIUM);
			attr.setAge(40);
			attr.setGender(TypeGender.MEN);
			attr.setHeight(200); 
			attr.setWeight(120);
			attr.setEye(TypeEyeColor.Brown);
			attr.setHair(TypeHairColor.BLACK);
			attr.setSkin(TypeSkinColor.PALE);

			AbstractRpgClass monk = new Monk();
			monk.setClassLevel(20);
			rc.getRpgClasses().add(monk);

			rpgCharacterSheets.add(rc);
		}

		{
			RpgCharacter rc = new RpgCharacter();

			rc.setName("Galadriel");
			Attributes attr = rc.getAttributes();
			
			attr.setRace(TypeRpgRace.ELF);
			attr.setAlignment(TypeRpgAlignment.TRUE_NEUTRAL);
			attr.setReligion(TypeRpgReligion.OTHER);

			attr.setSize(TypeRpgSize.MEDIUM);
			attr.setAge(40);
			attr.setGender(TypeGender.WOMAN);
			attr.setHeight(200); 
			attr.setWeight(120); 
			attr.setEye(TypeEyeColor.Deep_Blue);
			attr.setHair(TypeHairColor.WHITE);
			attr.setSkin(TypeSkinColor.WHITE);

			AbstractRpgClass sorcerer = new Sorcerer();
			sorcerer.setClassLevel(ExperienceAndLevel.MAX_LEVEL);
			rc.getRpgClasses().add(sorcerer);

			rpgCharacterSheets.add(rc);
		}
		return rpgCharacterSheets;
	}

	public void testIsPersistent() {
		assertFalse(new RpgCharacter().isPersistent());
	}
}
