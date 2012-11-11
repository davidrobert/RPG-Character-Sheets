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
import br.com.while42.rpgcs.model.character.attributes.TypeRpgAlignment;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgRace;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgReligion;
import br.com.while42.rpgcs.model.character.attributes.TypeVision;

public class EditCharacteristics extends Fragment {

	private RpgCharacter rpgCharacter;

	public EditCharacteristics() {
	}

	public EditCharacteristics(RpgCharacter rpgCharacter) {
		this.rpgCharacter = rpgCharacter;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		View layout = inflater.inflate(R.layout.fragment_edit_characteristics, container, false);

		EditText etName = (EditText) layout.findViewById(R.id_frag_edit_characteristics.edittext_name);
		Spinner sRace = (Spinner) layout.findViewById(R.id_frag_edit_characteristics.spinner_race);
		Spinner sAlignment = (Spinner) layout.findViewById(R.id_frag_edit_characteristics.spinner_alignment);
		Spinner sGender = (Spinner) layout.findViewById(R.id_frag_edit_characteristics.spinner_gender);
		Spinner sReligion = (Spinner) layout.findViewById(R.id_frag_edit_characteristics.spinner_religion);
		Spinner sVision = (Spinner) layout.findViewById(R.id_frag_edit_characteristics.spinner_vision);
		EditText etAge = (EditText) layout.findViewById(R.id_frag_edit_characteristics.edittext_age);
		EditText etHeight = (EditText) layout.findViewById(R.id_frag_edit_characteristics.edittext_height);
		EditText etWeight = (EditText) layout.findViewById(R.id_frag_edit_characteristics.edittext_weight);

		setOptionsSpinner(sRace, TypeRpgRace.values());
		setOptionsSpinner(sAlignment, TypeRpgAlignment.values());
		setOptionsSpinner(sGender, TypeGender.values());
		setOptionsSpinner(sReligion, TypeRpgReligion.values());
		setOptionsSpinner(sVision, TypeVision.values());

		if (rpgCharacter == null)
			return layout;
		
		Attributes attributes = rpgCharacter.getAttributes();

		etName.setText(rpgCharacter.getName());
		etAge.setText(attributes.getAge().toString());
		etHeight.setText(attributes.getHeight().toString());
		etWeight.setText(attributes.getWeight().toString());
		
		return layout;
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
