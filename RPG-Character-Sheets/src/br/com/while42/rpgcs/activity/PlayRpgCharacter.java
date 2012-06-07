package br.com.while42.rpgcs.activity;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.abilities.Abilities;
import br.com.while42.rpgcs.model.abilities.Defences;
import br.com.while42.rpgcs.model.character.RpgCharacter;
import br.com.while42.rpgcs.persist.DataManager;

public class PlayRpgCharacter extends Activity {

	@Override
	protected void onResume() {
		super.onResume();
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.play_character);
		
		Long id = getIntent().getLongExtra("id", 0L);
		
		DataManager manager = new DataManager(getApplicationContext());
		
		Log.d("ID: ", id.toString());
		
		RpgCharacter rpgCharacter = manager.retrieveRpgCharacter(id);
		
		TextView tvName = (TextView) findViewById(R.id_play.textview_name);
		TextView tvGenderRaceClass = (TextView) findViewById(R.id_play.textview_gender_race_class);
		TextView tvAlignment = (TextView) findViewById(R.id_play.textview_alignment);
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
		TextView tvWill = (TextView) findViewById(R.id_play.textview_will);
					
		tvName.setText(rpgCharacter.getName());
		
		StringBuilder sbGenderRaceClass = new StringBuilder();
		sbGenderRaceClass.append(getString(rpgCharacter.getGender().getCodeName())).append(" ");
		sbGenderRaceClass.append(getString(rpgCharacter.getRace().getCodeName())).append(" ");
		
		if (!rpgCharacter.getRpgClasses().isEmpty()) {
			sbGenderRaceClass.append(getString(rpgCharacter.getRpgClasses().get(0).getCodeName()));
		}
		
		tvGenderRaceClass.setText(sbGenderRaceClass.toString());
		
		tvAlignment.setText(getString(rpgCharacter.getAlignment().getCodeName()));
		tvExperience.setText(rpgCharacter.getExperience().toString());
		
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
		
		tvFortitude.setText("19");
		tvReflex.setText("23");
		tvWill.setText("25");
		
		
	}

}
