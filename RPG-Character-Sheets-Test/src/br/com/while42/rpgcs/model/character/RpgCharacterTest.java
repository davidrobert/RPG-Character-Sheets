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
			BuilderAttributes builder = new BuilderAttributes();
			Attributes attributes = builder.setRace(TypeRpgRace.HUMAN)
	                .setAlignment(TypeRpgAlignment.TRUE_NEUTRAL)
	                .setReligion(TypeRpgReligion.NONE)
	                .setSize(TypeRpgSize.MEDIUM)
	                .setAge(30)
	                .setGender(TypeGender.MEN)
	                .setHeight(169)
	                .setWeight(83)
	                .setEye(TypeEyeColor.Brown)
	                .setHair(TypeHairColor.BROWN)
	                .setSkin(TypeSkinColor.BROWN)
	                .toAttributes();
			
			RpgCharacter rc = new RpgCharacter("Snarf", attributes);
			
			Attaks aks = rc.getAttaks();			
			aks.add(new Dart(), SizeWeapon.MEDIUM);;

			rpgCharacterSheets.add(rc);
		}

		{
			BuilderAttributes builder = new BuilderAttributes();
			Attributes attributes = builder.setRace(TypeRpgRace.HUMAN)
	                .setAlignment(TypeRpgAlignment.TRUE_NEUTRAL)
	                .setReligion(TypeRpgReligion.NONE)
	                .setSize(TypeRpgSize.MEDIUM)
	                .setAge(30)
	                .setGender(TypeGender.MEN)
	                .setHeight(169)
	                .setWeight(83)
	                .setEye(TypeEyeColor.Brown)
	                .setHair(TypeHairColor.BROWN)
	                .setSkin(TypeSkinColor.BROWN)
	                .toAttributes();
			
			RpgCharacter rc = new RpgCharacter("Blob", attributes);

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
			BuilderAttributes builder = new BuilderAttributes();
			Attributes attributes = builder.setRace(TypeRpgRace.HUMAN)
	                .setAlignment(TypeRpgAlignment.TRUE_NEUTRAL)
	                .setReligion(TypeRpgReligion.NONE)
	                .setSize(TypeRpgSize.MEDIUM)
	                .setAge(30)
	                .setGender(TypeGender.MEN)
	                .setHeight(169)
	                .setWeight(83)
	                .setEye(TypeEyeColor.Brown)
	                .setHair(TypeHairColor.BROWN)
	                .setSkin(TypeSkinColor.BROWN)
	                .toAttributes();
			
			RpgCharacter rc = new RpgCharacter("Deltorei", attributes);
			
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
			BuilderAttributes builder = new BuilderAttributes();
			Attributes attributes = builder.setRace(TypeRpgRace.ELF)
	                .setAlignment(TypeRpgAlignment.TRUE_NEUTRAL)
	                .setReligion(TypeRpgReligion.OTHER)
	                .setSize(TypeRpgSize.MEDIUM)
	                .setAge(30)
	                .setGender(TypeGender.WOMAN)
	                .setHeight(169)
	                .setWeight(83)
	                .setEye(TypeEyeColor.Deep_Blue)
	                .setHair(TypeHairColor.WHITE)
	                .setSkin(TypeSkinColor.WHITE)
	                .toAttributes();
			
			RpgCharacter rc = new RpgCharacter("Galadriel", attributes);

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
		
		BuilderAttributes builder = new BuilderAttributes();
		Attributes attributes = builder.setRace(TypeRpgRace.HUMAN)
                .setAlignment(TypeRpgAlignment.TRUE_NEUTRAL)
                .setReligion(TypeRpgReligion.NONE)
                .setSize(TypeRpgSize.MEDIUM)
                .setAge(30)
                .setGender(TypeGender.MEN)
                .setHeight(169)
                .setWeight(83)
                .setEye(TypeEyeColor.Brown)
                .setHair(TypeHairColor.BROWN)
                .setSkin(TypeSkinColor.BROWN)
                .toAttributes();
		
		RpgCharacter rc = new RpgCharacter("Stark", attributes);
		
		assertFalse(rc.isPersistent());
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
