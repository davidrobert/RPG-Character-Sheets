package br.com.while42.rpgcs.activity.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.character.Abilities;

public class EditAbilities extends Fragment {

	private Abilities abilities;

	private EditText strengthEditText;
	private EditText dexterityEditText;
	private EditText constitutionEditText;
	private EditText intelligenceEditText;
	private EditText wisdomEditText;
	private EditText charismaEditText;

	public EditAbilities() {
	}

	public EditAbilities(Abilities abilities) {
		this.abilities = abilities;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		View layout = inflater.inflate(R.layout.fragment_edit_abilities, container, false);

		strengthEditText = (EditText) layout.findViewById(R.id_frag_edit_abilities.edittext_strength);
		dexterityEditText = (EditText) layout.findViewById(R.id_frag_edit_abilities.edittext_dexterity);
		constitutionEditText = (EditText) layout.findViewById(R.id_frag_edit_abilities.edittext_constitution);
		intelligenceEditText = (EditText) layout.findViewById(R.id_frag_edit_abilities.edittext_intelligence);
		wisdomEditText = (EditText) layout.findViewById(R.id_frag_edit_abilities.edittext_wisdom);
		charismaEditText = (EditText) layout.findViewById(R.id_frag_edit_abilities.edittext_charisma);

		loadAbilities();

		return layout;
	}

	private void loadAbilities() {

		if (abilities == null) {
			return;
		}

		strengthEditText.setText(abilities.getStrength().toString());
		dexterityEditText.setText(abilities.getDexterity().toString());
		constitutionEditText.setText(abilities.getConstitution().toString());
		intelligenceEditText.setText(abilities.getIntelligence().toString());
		wisdomEditText.setText(abilities.getWisdom().toString());
		charismaEditText.setText(abilities.getCharisma().toString());

	}

	public Abilities saveAbilities() {

		// TODO: Deveria ser um construtor com copia
		if (abilities == null) {
			abilities = new Abilities();
		}

		abilities.setStrength(Integer.valueOf(strengthEditText.getText().toString()));
		abilities.setDexterity(Integer.valueOf(dexterityEditText.getText().toString()));
		abilities.setConstitution(Integer.valueOf(constitutionEditText.getText().toString()));
		abilities.setIntelligence(Integer.valueOf(intelligenceEditText.getText().toString()));
		abilities.setWisdom(Integer.valueOf(wisdomEditText.getText().toString()));
		abilities.setCharisma(Integer.valueOf(charismaEditText.getText().toString()));

		return abilities;
	}

}
