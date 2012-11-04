package br.com.while42.rpgcs.activity.fragment;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.character.Abilities;

public class PlayAbilities extends Fragment {

	private Abilities abilities;

	public PlayAbilities() {
	}
	
	public PlayAbilities(Abilities abilities) {
		this.abilities = abilities;
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		View layout = inflater.inflate(R.layout.fragment_play_abilities, container, false);

		TextView tvStrength = (TextView) layout.findViewById(R.id_frag_play_abilities.textview_strength);
		TextView tvStrengthModifier = (TextView) layout.findViewById(R.id_frag_play_abilities.textview_strength_modifier);
		TextView tvConstitution = (TextView) layout.findViewById(R.id_frag_play_abilities.textview_constitution);
		TextView tvConstitutionModifier = (TextView) layout.findViewById(R.id_frag_play_abilities.textview_constitution_modifier);
		TextView tvWisdom = (TextView) layout.findViewById(R.id_frag_play_abilities.textview_wisdom);
		TextView tvWisdomModifier = (TextView) layout.findViewById(R.id_frag_play_abilities.textview_wisdom_modifier);
		TextView tvCharisma = (TextView) layout.findViewById(R.id_frag_play_abilities.textview_charisma);
		TextView tvCharismaModifier = (TextView) layout.findViewById(R.id_frag_play_abilities.textview_charisma_modifier);
		TextView tvDexterity = (TextView) layout.findViewById(R.id_frag_play_abilities.textview_dexterity);
		TextView tvDexterityModifier = (TextView) layout.findViewById(R.id_frag_play_abilities.textview_dexterity_modifier);
		TextView tvIntelligence = (TextView) layout.findViewById(R.id_frag_play_abilities.textview_intelligence);
		TextView tvIntelligenceModifier = (TextView) layout.findViewById(R.id_frag_play_abilities.textview_intelligence_modifier);
		
		NumberFormat fmt = new DecimalFormat("+#;-#");
		
		if (abilities == null)
			return layout;
		
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
		
		return layout;
	}
}
