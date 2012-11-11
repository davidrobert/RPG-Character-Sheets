package br.com.while42.rpgcs.activity.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.character.RpgCharacter;

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

		if (rpgCharacter == null)
			return layout;

		EditText etName = (EditText) layout.findViewById(R.id_frag_edit_caract.edittext_name);
		
		etName.setText(rpgCharacter.getName());
		
		return layout;
	}
}
