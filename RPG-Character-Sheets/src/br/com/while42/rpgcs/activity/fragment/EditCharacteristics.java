package br.com.while42.rpgcs.activity.fragment;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.activity.Element;
import br.com.while42.rpgcs.model.TypeCode;
import br.com.while42.rpgcs.model.character.Attributes;
import br.com.while42.rpgcs.model.character.RpgCharacter;
import br.com.while42.rpgcs.model.character.attributes.TypeGender;
import br.com.while42.rpgcs.model.character.attributes.TypeHairColor;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgAlignment;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgRace;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgReligion;
import br.com.while42.rpgcs.model.character.attributes.TypeSkinColor;
import br.com.while42.rpgcs.model.character.attributes.TypeVision;

public class EditCharacteristics extends Fragment {

	private RpgCharacter rpgCharacter;

	private EditText nameEditText;
	private Spinner raceSpinner;
	private Spinner alignmentSpinner;
	private Spinner genderSpinner;
	private Spinner religionSpinner;
	private Spinner visionSpinner;
	private EditText ageEditText;
	private EditText heightEditText;
	private EditText weightEditText;
	private Spinner hairSpinner;
	private Spinner skinSpinner;

	public EditCharacteristics() {
	}

	public EditCharacteristics(RpgCharacter rpgCharacter) {
		this.rpgCharacter = rpgCharacter;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		View layout = inflater.inflate(R.layout.fragment_edit_characteristics, container, false);

		nameEditText = (EditText) layout.findViewById(R.id_frag_edit_characteristics.edittext_name);
		raceSpinner = (Spinner) layout.findViewById(R.id_frag_edit_characteristics.spinner_race);
		alignmentSpinner = (Spinner) layout.findViewById(R.id_frag_edit_characteristics.spinner_alignment);
		genderSpinner = (Spinner) layout.findViewById(R.id_frag_edit_characteristics.spinner_gender);
		religionSpinner = (Spinner) layout.findViewById(R.id_frag_edit_characteristics.spinner_religion);
		visionSpinner = (Spinner) layout.findViewById(R.id_frag_edit_characteristics.spinner_vision);
		ageEditText = (EditText) layout.findViewById(R.id_frag_edit_characteristics.edittext_age);
		heightEditText = (EditText) layout.findViewById(R.id_frag_edit_characteristics.edittext_height);
		weightEditText = (EditText) layout.findViewById(R.id_frag_edit_characteristics.edittext_weight);
		hairSpinner = (Spinner) layout.findViewById(R.id_frag_edit_characteristics.spinner_hair);
		skinSpinner = (Spinner) layout.findViewById(R.id_frag_edit_characteristics.spinner_skin);

		setOptionsSpinner(raceSpinner, TypeRpgRace.values());
		setOptionsSpinner(alignmentSpinner, TypeRpgAlignment.values());
		setOptionsSpinner(genderSpinner, TypeGender.values());
		setOptionsSpinner(religionSpinner, TypeRpgReligion.values());
		setOptionsSpinner(visionSpinner, TypeVision.values());
		setOptionsSpinner(hairSpinner, TypeHairColor.values());
		setOptionsSpinner(skinSpinner, TypeSkinColor.values());

		loadCharacteristics(rpgCharacter);

		return layout;
	}

	private void loadCharacteristics(RpgCharacter rpgCharacter) {
		
		if (rpgCharacter == null)
			return;

		Attributes attributes = rpgCharacter.getAttributes();

		nameEditText.setText(rpgCharacter.getName());
		// TODO: Race
		// TODO: Aligment
		// TODO: Gender
		// TODO: Religion
		// TODO: Vision
		ageEditText.setText(attributes.getAge().toString());
		heightEditText.setText(attributes.getHeight().toString());
		weightEditText.setText(attributes.getWeight().toString());
		// TODO: Hair
		// TODO: Skin
	}

	private void setOptionsSpinner(Spinner spinner, TypeCode[] types) {

		List<Element> items = new ArrayList<Element>();
		for (TypeCode g : types) {
			items.add(new Element(g, getString(g.getCodeName())));
		}

		ArrayAdapter<Element> adapter = new ArrayAdapter<Element>(getActivity(), android.R.layout.simple_spinner_dropdown_item, items);

		spinner.setAdapter(adapter);
	}
}
