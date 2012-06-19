package br.com.while42.rpgcs.activity;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.character.Abilities;
import br.com.while42.rpgcs.model.character.Attaks;
import br.com.while42.rpgcs.model.character.Attributes;
import br.com.while42.rpgcs.model.character.BuilderAttributes;
import br.com.while42.rpgcs.model.character.Defences;
import br.com.while42.rpgcs.model.character.Languages;
import br.com.while42.rpgcs.model.character.Money;
import br.com.while42.rpgcs.model.character.RpgCharacter;
import br.com.while42.rpgcs.model.character.SavingThrows;
import br.com.while42.rpgcs.model.character.attributes.TypeEyeColor;
import br.com.while42.rpgcs.model.character.attributes.TypeGender;
import br.com.while42.rpgcs.model.character.attributes.TypeHairColor;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgAlignment;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgLanguage;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgRace;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgReligion;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgSize;
import br.com.while42.rpgcs.model.character.attributes.TypeSkinColor;
import br.com.while42.rpgcs.model.classes.AbstractRpgClass;
import br.com.while42.rpgcs.model.classes.Barbarian;
import br.com.while42.rpgcs.model.classes.Sorcerer;
import br.com.while42.rpgcs.model.classes.bonuses.ExperienceAndLevel;
import br.com.while42.rpgcs.model.equip.weapons.SizeWeapon;
import br.com.while42.rpgcs.model.equip.weapons.simple.ranged.CrossbowLight;
import br.com.while42.rpgcs.model.equip.weapons.simple.ranged.Dart;

public class PlayRpgCharacterTest extends Activity {

	private RpgCharacter createRpgCharacterSheet() {
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
		
		rc.setId(100L);

		AbstractRpgClass barbarian = new Barbarian();
		barbarian.setClassLevel(1);
		rc.getRpgClasses().add(barbarian);
		
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
		money.setCopperPiece(10L);
		money.setGoldPiece(100L);
		money.setPlatinumPiece(1000L);
		money.setSilverPiece(10000L);
		
		Attaks aks = rc.getAttaks();
		aks.add(new Dart(), SizeWeapon.MEDIUM);
		aks.add(new CrossbowLight(), SizeWeapon.MEDIUM);
		
		Languages languages = rc.getLanguages();
		languages.add(TypeRpgLanguage.ELVEN);
		languages.add(TypeRpgLanguage.ORC);
		languages.add(TypeRpgLanguage.GOBLIN);
		languages.add(TypeRpgLanguage.COMMON);
		languages.add(TypeRpgLanguage.DRACONIC);
		languages.add(TypeRpgLanguage.GIANT);
		languages.add(TypeRpgLanguage.HALFLING);
		
		rc.getRpgClasses().setExperience(35000L);
		
		return rc;
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.play_character);

        RpgCharacter rpgCharacter = createRpgCharacterSheet();
		
		TextView tvName = (TextView) findViewById(R.id_play.textview_name);
		TextView tvGenderRaceClass = (TextView) findViewById(R.id_play.textview_gender_race_class);
		TextView tvAlignment = (TextView) findViewById(R.id_play.textview_alignment);
		TextView tvLevel = (TextView) findViewById(R.id_play.textview_level);
		TextView tvExperience = (TextView) findViewById(R.id_play.textview_experience);
		
		TextView tvStrength = (TextView) findViewById(R.id_play.textview_strength);
		TextView tvStrengthModifier = (TextView) findViewById(R.id_play.textview_strength_modifier);
		TextView tvConstitution = (TextView) findViewById(R.id_play.textview_constitution);
		TextView tvConstitutionModifier = (TextView) findViewById(R.id_play.textview_constitution_modifier);
		TextView tvWisdom = (TextView) findViewById(R.id_play.textview_wisdom);
		TextView tvWisdomModifier = (TextView) findViewById(R.id_play.textview_wisdom_modifier);
		TextView tvCharisma = (TextView) findViewById(R.id_play.textview_charisma);
		TextView tvCharismaModifier = (TextView) findViewById(R.id_play.textview_charisma_modifier);
		TextView tvDexterity = (TextView) findViewById(R.id_play.textview_dexterity);
		TextView tvDexterityModifier = (TextView) findViewById(R.id_play.textview_dexterity_modifier);
		TextView tvIntelligence = (TextView) findViewById(R.id_play.textview_intelligence);
		TextView tvIntelligenceModifier = (TextView) findViewById(R.id_play.textview_intelligence_modifier);
		
		TextView tvArmorClass = (TextView) findViewById(R.id_play.textview_armor_class);
		
		TextView tvFortitude = (TextView) findViewById(R.id_play.textview_fortitude);
		TextView tvReflex = (TextView) findViewById(R.id_play.textview_reflex);
		TextView tvThrowsWill = (TextView) findViewById(R.id_play.textview_will);
		
		ListView lvLanguages = (ListView) findViewById(R.id_play.listview_languages);
					
		TextView tvReligion = (TextView) findViewById(R.id_play.textview_religion);
		
		// ---
		
		tvName.setText(rpgCharacter.getName());
		
		Attributes attr = rpgCharacter.getAttributes();
		
		StringBuilder sbGenderRaceClass = new StringBuilder();
		sbGenderRaceClass.append(getString(attr.getGender().getCodeName())).append(" ");
		sbGenderRaceClass.append(getString(attr.getRace().getCodeName())).append(" ");
		
		if (!rpgCharacter.getRpgClasses().getAll().isEmpty()) {
			sbGenderRaceClass.append(getString(rpgCharacter.getRpgClasses().getAll().get(0).getCodeName()));
		}
		
		tvGenderRaceClass.setText(sbGenderRaceClass.toString());
		
		tvAlignment.setText(getString(attr.getAlignment().getCodeName()));
		tvLevel.setText("0"); // TODO: Falta implementar
		tvExperience.setText(rpgCharacter.getRpgClasses().getExperience().toString());
		
		NumberFormat fmt = new DecimalFormat("+#;-#");
		
		Abilities abilities = rpgCharacter.getAbilities();
		
		String strength = abilities.getStrength().toString();
		String strengthMod = fmt.format(abilities.getStrengthModifier());
		String constitution = abilities.getConstitution().toString();
		String constitutionMod = fmt.format(abilities.getConstitutionModifier());
		String wisdom = abilities.getWisdom().toString();
		String wisdomMod = fmt.format(abilities.getWisdomModifier());
		String charisma = abilities.getCharisma().toString();
		String charismaMod = fmt.format(abilities.getCharismaModifier());
		String dexterity = abilities.getDexterity().toString();
		String dexterityMod = fmt.format(abilities.getDexterityModifier());
		String intelligence = abilities.getIntelligence().toString();
		String intelligenceMod = fmt.format(abilities.getIntelligenceModifier());
		
		tvStrength.setText(strength);
		tvStrengthModifier.setText(strengthMod);
		
		tvConstitution.setText(constitution);
		tvConstitutionModifier.setText(constitutionMod);
		
		tvWisdom.setText(wisdom);
		tvWisdomModifier.setText(wisdomMod);
		
		tvCharisma.setText(charisma);
		tvCharismaModifier.setText(charismaMod);
		
		tvDexterity.setText(dexterity);
		tvDexterityModifier.setText(dexterityMod);
		
		tvIntelligence.setText(intelligence);
		tvIntelligenceModifier.setText(intelligenceMod);
		
		Defences defences = rpgCharacter.getDefences();
		
		tvArmorClass.setText(defences.getArmorClass().toString());
		
		SavingThrows savingThrows = rpgCharacter.getSavingThrows();
		
		tvFortitude.setText(savingThrows.getFortitude().toString());
		tvReflex.setText(savingThrows.getReflex().toString());
		tvThrowsWill.setText(savingThrows.getThrowsWill().toString());
		
		String[] lgs = new String[rpgCharacter.getLanguages().getAll().size()];
		int i = 0;
		for (TypeRpgLanguage type: rpgCharacter.getLanguages().getAll()) {
			lgs[i++] = getString(type.getCodeName());
		}
		
		Arrays.sort(lgs);
		
		ArrayAdapter<String> adapterLanguages = new ArrayAdapter<String>(this,
				R.layout.list_languages, android.R.id.text1, lgs);
		
		lvLanguages.setAdapter(adapterLanguages);
		
		String religion = getString(attr.getReligion().getCodeName());
		tvReligion.setText(religion);
	}

}
