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
import br.com.while42.rpgcs.model.equip.weapons.SizeWeapon;
import br.com.while42.rpgcs.model.equip.weapons.simple.ranged.CrossbowLight;
import br.com.while42.rpgcs.model.equip.weapons.simple.ranged.Dart;

public class RpgCharacterTest extends AndroidTestCase {

	public static List<RpgCharacter> getList() {
		List<RpgCharacter> rpgCharacterSheets = new ArrayList<RpgCharacter>();
		
		{
			RpgCharacter rc = new RpgCharacter();
			
			Attaks aks = rc.getAttaks();			
			aks.add(new Dart(), SizeWeapon.MEDIUM);;

			rpgCharacterSheets.add(rc);
		}

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
			
			Abilities ab = rc.getAbilities();
			ab.setStrength(18);
			ab.setDexterity(17);
			ab.setIntelligence(16);
			ab.setWisdom(15);
			ab.setCharisma(14);
			ab.setCharisma(13);
			
			Defences df = rc.getDefences();
			df.setArmorClass(10);
			df.setCurrentHitPoints(11);
			df.setFlatFooted(12);
			df.setHitPoints(13);
			df.setInitiative(14);
			df.setSpellResistance(15);
			df.setTouch(16);
			
			SavingThrows st = rc.getSavingThrows();
			st.setFortitude(10);
			st.setReflex(11);
			st.setThrowsWill(12);
			
			Money money = rc.getMoney();
			money.setCopperPiece(10L);
			money.setGoldPiece(100L);
			money.setPlatinumPiece(1000L);
			money.setSilverPiece(10000L);
			
			Attaks aks = rc.getAttaks();
			aks.add(new Dart(), SizeWeapon.MEDIUM);
			aks.add(new CrossbowLight(), SizeWeapon.MEDIUM);

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
			
			Abilities ab = rc.getAbilities();
			ab.setStrength(18);
			ab.setDexterity(17);
			ab.setIntelligence(16);
			ab.setWisdom(15);
			ab.setCharisma(14);
			ab.setCharisma(13);
			
			Defences df = rc.getDefences();
			df.setArmorClass(10);
			df.setCurrentHitPoints(11);
			df.setFlatFooted(12);
			df.setHitPoints(13);
			df.setInitiative(14);
			df.setSpellResistance(15);
			df.setTouch(16);
			
			SavingThrows st = rc.getSavingThrows();
			st.setFortitude(10);
			st.setReflex(11);
			st.setThrowsWill(12);
			
			Money money = rc.getMoney();
			money.setCopperPiece(11L);
			money.setGoldPiece(101L);
			money.setPlatinumPiece(1001L);
			money.setSilverPiece(10001L);
			
			Attaks aks = rc.getAttaks();
			aks.add(new Dart(), SizeWeapon.MEDIUM);
			aks.add(new CrossbowLight(), SizeWeapon.MEDIUM);

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
			
			Abilities ab = rc.getAbilities();
			ab.setStrength(18);
			ab.setDexterity(17);
			ab.setIntelligence(16);
			ab.setWisdom(15);
			ab.setCharisma(14);
			ab.setCharisma(13);
			
			Defences df = rc.getDefences();
			df.setArmorClass(10);
			df.setCurrentHitPoints(11);
			df.setFlatFooted(12);
			df.setHitPoints(13);
			df.setInitiative(14);
			df.setSpellResistance(15);
			df.setTouch(16);
			
			SavingThrows st = rc.getSavingThrows();
			st.setFortitude(10);
			st.setReflex(11);
			st.setThrowsWill(12);
			
			Money money = rc.getMoney();
			money.setCopperPiece(20L);
			money.setGoldPiece(200L);
			money.setPlatinumPiece(2000L);
			money.setSilverPiece(20000L);
			
			Attaks aks = rc.getAttaks();
			aks.add(new Dart(), SizeWeapon.MEDIUM);
			aks.add(new CrossbowLight(), SizeWeapon.MEDIUM);

			rpgCharacterSheets.add(rc);
		}
		return rpgCharacterSheets;
	}

	public void testIsPersistent() {
		assertFalse(new RpgCharacter().isPersistent());
	}

	public void testBasicSerialize() {
		RpgCharacter rpgcs1 = getList().get(0);
		
		byte[] serializeObject = RpgCharacter.serialize(rpgcs1);
		RpgCharacter rpgcs2 = RpgCharacter.deserialize(serializeObject);

		assertEquals(rpgcs1, rpgcs2);
	}
	
	public void testSerialize() {
		for (RpgCharacter rc: getList()) {
			byte[] serializeObject = RpgCharacter.serialize(rc);
			RpgCharacter rc2 = RpgCharacter.deserialize(serializeObject);

			assertEquals(rc, rc2);
		}
	}
	
}
