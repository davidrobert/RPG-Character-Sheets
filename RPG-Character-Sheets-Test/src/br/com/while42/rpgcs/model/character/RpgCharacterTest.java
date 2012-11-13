package br.com.while42.rpgcs.model.character;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import android.test.AndroidTestCase;
import br.com.while42.rpgcs.model.character.attributes.TypeEyeColor;
import br.com.while42.rpgcs.model.character.attributes.TypeGender;
import br.com.while42.rpgcs.model.character.attributes.TypeHairColor;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgAlignment;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgLanguage;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgRace;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgReligion;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgSize;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgSkill;
import br.com.while42.rpgcs.model.character.attributes.TypeSkinColor;
import br.com.while42.rpgcs.model.character.attributes.TypeVision;
import br.com.while42.rpgcs.model.classes.AbstractRpgClass;
import br.com.while42.rpgcs.model.classes.Barbarian;
import br.com.while42.rpgcs.model.classes.Monk;
import br.com.while42.rpgcs.model.classes.Sorcerer;
import br.com.while42.rpgcs.model.classes.bonuses.ExperienceAndLevel;
import br.com.while42.rpgcs.model.equip.Equipments;
import br.com.while42.rpgcs.model.equip.weapons.SizeWeapon;
import br.com.while42.rpgcs.model.equip.weapons.simple.ranged.CrossbowLight;
import br.com.while42.rpgcs.model.equip.weapons.simple.ranged.Dart;

public class RpgCharacterTest extends AndroidTestCase {

	public static List<RpgCharacter> getList() {
		List<RpgCharacter> rpgCharacterSheets = new ArrayList<RpgCharacter>();
		
		{
			BuilderCharacteristics builder = new BuilderCharacteristics();
			Characteristics characteristics = builder.setName("Snarf")
					.setRace(TypeRpgRace.HUMAN)
	                .setAlignment(TypeRpgAlignment.TRUE_NEUTRAL)
	                .setReligion(TypeRpgReligion.NONE)
	                .setSize(TypeRpgSize.MEDIUM)
	                .setAge(30)
	                .setGender(TypeGender.MEN)
	                .setHeight(169)
	                .setWeight(83)
	                .setEye(TypeEyeColor.BROWN)
	                .setHair(TypeHairColor.BROWN)
	                .setSkin(TypeSkinColor.BROWN)
	                .setVision(TypeVision.NORMAL)
	                .toCharacteristics();
			
			RpgCharacter rc = new RpgCharacter(characteristics);
			
			Equipments equip = rc.getEquipments();			
			equip.addWeapon(new Dart(), SizeWeapon.MEDIUM);;

			rpgCharacterSheets.add(rc);
		}

		{
			BuilderCharacteristics builder = new BuilderCharacteristics();
			Characteristics characteristics = builder.setName("Blob")
					.setRace(TypeRpgRace.HUMAN)
	                .setAlignment(TypeRpgAlignment.TRUE_NEUTRAL)
	                .setReligion(TypeRpgReligion.NONE)
	                .setSize(TypeRpgSize.MEDIUM)
	                .setAge(30)
	                .setGender(TypeGender.MEN)
	                .setHeight(169)
	                .setWeight(83)
	                .setEye(TypeEyeColor.BROWN)
	                .setHair(TypeHairColor.BROWN)
	                .setSkin(TypeSkinColor.BROWN)
	                .setVision(TypeVision.NORMAL)
	                .toCharacteristics();
			
			RpgCharacter rc = new RpgCharacter(characteristics);

			AbstractRpgClass barbarian = new Barbarian();
			barbarian.setClassLevel(1);
			rc.getRpgClasses().add(barbarian);
			
			Abilities ab = rc.getAbilities();
			ab.setStrength(18);
			ab.setDexterity(17);
			ab.setIntelligence(16);
			ab.setWisdom(15);
			ab.setCharisma(14);
			ab.setConstitution(13);
			
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
			
			Equipments equip = rc.getEquipments();
			equip.addWeapon(new Dart(), SizeWeapon.MEDIUM);
			equip.addWeapon(new CrossbowLight(), SizeWeapon.MEDIUM);

			Languages languages = rc.getLanguages();
			
			languages.add(TypeRpgLanguage.ABYSSAL);
			languages.add(TypeRpgLanguage.AQUAN);
			languages.add(TypeRpgLanguage.AURAN);
			languages.add(TypeRpgLanguage.CELESTIAL);
			
			rpgCharacterSheets.add(rc);
		}

		{
			BuilderCharacteristics builder = new BuilderCharacteristics();
			Characteristics characteristics = builder.setName("Deltorei")
					.setRace(TypeRpgRace.HUMAN)
	                .setAlignment(TypeRpgAlignment.TRUE_NEUTRAL)
	                .setReligion(TypeRpgReligion.NONE)
	                .setSize(TypeRpgSize.MEDIUM)
	                .setAge(30)
	                .setGender(TypeGender.MEN)
	                .setHeight(169)
	                .setWeight(83)
	                .setEye(TypeEyeColor.BROWN)
	                .setHair(TypeHairColor.BROWN)
	                .setSkin(TypeSkinColor.BROWN)
	                .setVision(TypeVision.NORMAL)
	                .toCharacteristics();
			
			RpgCharacter rc = new RpgCharacter(characteristics);
			
			AbstractRpgClass monk = new Monk();
			monk.setClassLevel(20);
			rc.getRpgClasses().add(monk);
			
			Abilities ab = rc.getAbilities();
			ab.setStrength(18);
			ab.setDexterity(17);
			ab.setIntelligence(16);
			ab.setWisdom(15);
			ab.setCharisma(14);
			ab.setConstitution(13);
			
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
			
			Equipments equip = rc.getEquipments();
			equip.addWeapon(new Dart(), SizeWeapon.MEDIUM);
			equip.addWeapon(new CrossbowLight(), SizeWeapon.MEDIUM);

			Languages languages = rc.getLanguages();
			
			languages.add(TypeRpgLanguage.CELESTIAL);
			languages.add(TypeRpgLanguage.COMMON);
			languages.add(TypeRpgLanguage.DRACONIC);
			languages.add(TypeRpgLanguage.DRUIDIC);
			
			Skills skills = rc.getSkills();
			skills.add(new Skill(TypeRpgSkill.APPRAISE, 1));
			skills.add(new Skill(TypeRpgSkill.BALANCE, 2));
			skills.add(new Skill(TypeRpgSkill.BLUFF, 3));
			skills.add(new Skill(TypeRpgSkill.CLIMB, 1));
			skills.add(new Skill(TypeRpgSkill.CONCENTRATION, 5));
			skills.add(new Skill(TypeRpgSkill.CRAFT, 4));
			skills.add(new Skill(TypeRpgSkill.DECIPHER_SCRIPT, 3));
			skills.add(new Skill(TypeRpgSkill.DIPLOMACY, 2));
			skills.add(new Skill(TypeRpgSkill.DISABLE_DEVICE, 2));
			skills.add(new Skill(TypeRpgSkill.DISGUISE, 1));
			skills.add(new Skill(TypeRpgSkill.ESCAPE_ARTIST, 1));
			skills.add(new Skill(TypeRpgSkill.FORGERY, 5));
			skills.add(new Skill(TypeRpgSkill.GATHER_INFORMATION, 5));
			skills.add(new Skill(TypeRpgSkill.HANDLE_ANIMAL, 10));
			skills.add(new Skill(TypeRpgSkill.HEAL, -1));
			
			rpgCharacterSheets.add(rc);
		}

		{
			BuilderCharacteristics builder = new BuilderCharacteristics();
			Characteristics characteristics = builder.setName("Galadriel")
					.setRace(TypeRpgRace.ELF)
	                .setAlignment(TypeRpgAlignment.TRUE_NEUTRAL)
	                .setReligion(TypeRpgReligion.OTHER)
	                .setSize(TypeRpgSize.MEDIUM)
	                .setAge(30)
	                .setGender(TypeGender.WOMAN)
	                .setHeight(169)
	                .setWeight(83)
	                .setEye(TypeEyeColor.DEEP_BLUE)
	                .setHair(TypeHairColor.WHITE)
	                .setSkin(TypeSkinColor.WHITE)
	                .setVision(TypeVision.NORMAL)
	                .toCharacteristics();
			
			RpgCharacter rc = new RpgCharacter(characteristics);

			AbstractRpgClass sorcerer = new Sorcerer();
			sorcerer.setClassLevel(ExperienceAndLevel.MAX_LEVEL);
			rc.getRpgClasses().add(sorcerer);
			
			Abilities ab = rc.getAbilities();
			ab.setStrength(18);
			ab.setDexterity(17);
			ab.setIntelligence(16);
			ab.setWisdom(15);
			ab.setCharisma(14);
			ab.setConstitution(13);
			
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
			
			Equipments equip = rc.getEquipments();
			equip.addWeapon(new Dart(), SizeWeapon.MEDIUM);
			equip.addWeapon(new CrossbowLight(), SizeWeapon.MEDIUM);

			Languages languages = rc.getLanguages();
			
			languages.add(TypeRpgLanguage.ELVEN);
			languages.add(TypeRpgLanguage.ORC);
			languages.add(TypeRpgLanguage.GOBLIN);
			languages.add(TypeRpgLanguage.COMMON);
			languages.add(TypeRpgLanguage.DRACONIC);
			languages.add(TypeRpgLanguage.GIANT);
			languages.add(TypeRpgLanguage.HALFLING);
			
			Skills skills = rc.getSkills();
			skills.add(new Skill(TypeRpgSkill.APPRAISE, 1));
			skills.add(new Skill(TypeRpgSkill.BALANCE, 2));
			skills.add(new Skill(TypeRpgSkill.BLUFF, 3));
			skills.add(new Skill(TypeRpgSkill.CLIMB, 1));
			skills.add(new Skill(TypeRpgSkill.CONCENTRATION, 5));
			skills.add(new Skill(TypeRpgSkill.CRAFT, 4));
			skills.add(new Skill(TypeRpgSkill.DECIPHER_SCRIPT, 3));
			skills.add(new Skill(TypeRpgSkill.DIPLOMACY, 2));
			skills.add(new Skill(TypeRpgSkill.DISABLE_DEVICE, 2));
			skills.add(new Skill(TypeRpgSkill.DISGUISE, 1));
			skills.add(new Skill(TypeRpgSkill.ESCAPE_ARTIST, 1));
			skills.add(new Skill(TypeRpgSkill.FORGERY, 5));
			skills.add(new Skill(TypeRpgSkill.GATHER_INFORMATION, 5));
			skills.add(new Skill(TypeRpgSkill.HANDLE_ANIMAL, 10));
			skills.add(new Skill(TypeRpgSkill.HEAL, -1));
			
			rpgCharacterSheets.add(rc);
		}
		return rpgCharacterSheets;
	}

	public void testIsPersistent() {
		
		BuilderCharacteristics builder = new BuilderCharacteristics();
		Characteristics characteristics = builder.setName("Stark")
				.setRace(TypeRpgRace.HUMAN)
                .setAlignment(TypeRpgAlignment.TRUE_NEUTRAL)
                .setReligion(TypeRpgReligion.NONE)
                .setSize(TypeRpgSize.MEDIUM)
                .setAge(30)
                .setGender(TypeGender.MEN)
                .setHeight(169)
                .setWeight(83)
                .setEye(TypeEyeColor.BROWN)
                .setHair(TypeHairColor.BROWN)
                .setSkin(TypeSkinColor.BROWN)
                .setVision(TypeVision.NORMAL)
                .toCharacteristics();
		
		RpgCharacter rc = new RpgCharacter(characteristics);
		
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
	
	public void testAbilitiesDefault() {
		RpgCharacter rc = getList().get(0);
		
		Abilities ab = rc.getAbilities();
		
		assertEquals(0, ab.getStrength().intValue());
		assertEquals(0, ab.getConstitution().intValue());
		assertEquals(0, ab.getWisdom().intValue());
		assertEquals(0, ab.getCharisma().intValue());
		assertEquals(0, ab.getDexterity().intValue());
		assertEquals(0, ab.getIntelligence().intValue());
	}
	
	public void testAbilities() {
		RpgCharacter rc = getList().get(1);
		
		Abilities ab = rc.getAbilities();
		
		assertEquals(18, ab.getStrength().intValue());
		assertEquals(13, ab.getConstitution().intValue());
		assertEquals(15, ab.getWisdom().intValue());
		assertEquals(14, ab.getCharisma().intValue());
		assertEquals(17, ab.getDexterity().intValue());
		assertEquals(16, ab.getIntelligence().intValue());
	}
	
	public void testLanguages() {		
		for (RpgCharacter rc: getList()) {
			Languages languages = rc.getLanguages();
			
			languages.clear();
			
			languages.add(TypeRpgLanguage.CELESTIAL);
			languages.add(TypeRpgLanguage.COMMON);
			languages.add(TypeRpgLanguage.ORC);
			languages.add(TypeRpgLanguage.INFERNAL);
	
			Set<TypeRpgLanguage> langs = rc.getLanguages().getAll();
			
			assertTrue(langs.contains(TypeRpgLanguage.CELESTIAL));
			assertTrue(langs.contains(TypeRpgLanguage.COMMON));
			assertTrue(langs.contains(TypeRpgLanguage.ORC));
			assertTrue(langs.contains(TypeRpgLanguage.INFERNAL));
			
			assertEquals(4, langs.size());
		}
	}
	
}
