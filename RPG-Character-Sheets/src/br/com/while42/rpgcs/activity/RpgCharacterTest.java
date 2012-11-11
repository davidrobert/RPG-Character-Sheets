package br.com.while42.rpgcs.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import br.com.while42.rpgcs.model.HitDice;
import br.com.while42.rpgcs.model.HitDiceType;
import br.com.while42.rpgcs.model.character.Abilities;
import br.com.while42.rpgcs.model.character.Attributes;
import br.com.while42.rpgcs.model.character.BuilderAttributes;
import br.com.while42.rpgcs.model.character.Defences;
import br.com.while42.rpgcs.model.character.Languages;
import br.com.while42.rpgcs.model.character.Money;
import br.com.while42.rpgcs.model.character.Notes;
import br.com.while42.rpgcs.model.character.RpgCharacter;
import br.com.while42.rpgcs.model.character.SavingThrows;
import br.com.while42.rpgcs.model.character.Skill;
import br.com.while42.rpgcs.model.character.SkillOther;
import br.com.while42.rpgcs.model.character.Skills;
import br.com.while42.rpgcs.model.character.attributes.TypeAbilities;
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
import br.com.while42.rpgcs.model.classes.Fighter;
import br.com.while42.rpgcs.model.classes.Sorcerer;
import br.com.while42.rpgcs.model.classes.bonuses.ExperienceAndLevel;
import br.com.while42.rpgcs.model.equip.Equipments;
import br.com.while42.rpgcs.model.equip.weapons.CategorieEncumbranceWeapon;
import br.com.while42.rpgcs.model.equip.weapons.CategorieUsefulnessWeapon;
import br.com.while42.rpgcs.model.equip.weapons.CategorieWeapon;
import br.com.while42.rpgcs.model.equip.weapons.SizeWeapon;
import br.com.while42.rpgcs.model.equip.weapons.TypeWeapon;
import br.com.while42.rpgcs.model.equip.weapons.especial.BuilderEspecialWeapon;
import br.com.while42.rpgcs.model.equip.weapons.especial.EspecialWeapon;
import br.com.while42.rpgcs.model.equip.weapons.exotic.ranged.Shuriken;
import br.com.while42.rpgcs.model.equip.weapons.exotic.twohandedmelee.AxeOrcDouble;
import br.com.while42.rpgcs.model.equip.weapons.martial.twohandedmelee.Greataxe;
import br.com.while42.rpgcs.model.equip.weapons.simple.onehandedmelee.Morningstar;
import br.com.while42.rpgcs.model.equip.weapons.simple.ranged.CrossbowLight;
import br.com.while42.rpgcs.model.equip.weapons.simple.ranged.Dart;
import br.com.while42.rpgcs.model.equip.weapons.simple.twohandedmelee.Spear;

import com.actionbarsherlock.app.SherlockActivity;

public class RpgCharacterTest extends SherlockActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		Log.d("ACTIVITY", "RpgCharacterTest");
		
		Intent play = new Intent(RpgCharacterTest.this, PlayRpgCharacter.class);
		
		Bundle b = new Bundle();
		b.putSerializable(RpgCharacter.class.getName(), createRpgCharacterSheet());
		play.putExtras(b);

		startActivity(play);
		finish();
	}

	private RpgCharacter createRpgCharacterSheet() {
		BuilderAttributes builder = new BuilderAttributes();
		Attributes attributes = builder.setName("Blob")
				.setRace(TypeRpgRace.HUMAN)
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
                .setVision(TypeVision.DARKVISION)
                .toAttributes();
		
		RpgCharacter rc = new RpgCharacter(attributes);
		
		rc.setId(100L);

		AbstractRpgClass fighter = new Fighter();
		fighter.setClassLevel(1);
		rc.getRpgClasses().add(fighter);
		
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
		money.setCopperPiece(10L);
		money.setGoldPiece(100L);
		money.setPlatinumPiece(1000L);
		money.setSilverPiece(10000L);
		
		Equipments equip = rc.getEquipments();
		
		
		equip.addWeapon(new Dart(), SizeWeapon.MEDIUM, true);
		equip.addWeapon(new CrossbowLight(), SizeWeapon.MEDIUM);
		equip.addWeapon(new Morningstar(), SizeWeapon.MEDIUM);
		equip.addWeapon(new AxeOrcDouble(), SizeWeapon.MEDIUM);
		equip.addWeapon(new Greataxe(), SizeWeapon.MEDIUM, true);
		equip.addWeapon(new Shuriken(), SizeWeapon.MEDIUM, true);
		equip.addWeapon(new Spear(), SizeWeapon.MEDIUM, true);
		
		BuilderEspecialWeapon buiderWeapon = new BuilderEspecialWeapon();
		EspecialWeapon especialWeapon = buiderWeapon.setName("Alabarda")
		            .setCost(500L)
		            .setCritical(10)
		            .setRangeIncrement(3)
		            .setWeight(10.0)
		            .setSize(SizeWeapon.MEDIUM)
		            .setType(TypeWeapon.SLASHING)
		            .setDamage(new HitDice(2, HitDiceType.d4, +1))
		            .setCategorie(CategorieWeapon.EXOTIC)
		            .setCategorieEncumbrance(CategorieEncumbranceWeapon.TWO_HANDED)
		            .setCategorieUsefulness(CategorieUsefulnessWeapon.RANGED)
		            .toEspecialWeapon();
		
		equip.addWeapon(especialWeapon, true);
		
		Languages languages = rc.getLanguages();
		languages.add(TypeRpgLanguage.ELVEN);
		languages.add(TypeRpgLanguage.ORC);
		languages.add(TypeRpgLanguage.GOBLIN);
		languages.add(TypeRpgLanguage.COMMON);
		languages.add(TypeRpgLanguage.DRACONIC);
		languages.add(TypeRpgLanguage.GIANT);
		languages.add(TypeRpgLanguage.HALFLING);
		
		String especialLanguage = "Idioma Secreto";
		languages.add(especialLanguage);
		
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
		
		skills.add(new SkillOther("Pescaria", 10, TypeAbilities.WISDOM));
		
		rc.getRpgClasses().setExperience(35000L);
		
		Notes notes = rc.getNotes();
		notes.add("Abc Def Ghi Jkl Mno Pqr Stu Vwx Yz");
		notes.add("0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0");
		
		return rc;
	}

}
