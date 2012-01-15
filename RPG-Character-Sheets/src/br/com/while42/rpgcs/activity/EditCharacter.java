package br.com.while42.rpgcs.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.RpgCharacter;
import br.com.while42.rpgcs.model.attributes.TypeCode;
import br.com.while42.rpgcs.model.attributes.TypeEyeColor;
import br.com.while42.rpgcs.model.attributes.TypeGender;
import br.com.while42.rpgcs.model.attributes.TypeHairColor;
import br.com.while42.rpgcs.model.attributes.TypeRpgAlignment;
import br.com.while42.rpgcs.model.attributes.TypeRpgClass;
import br.com.while42.rpgcs.model.attributes.TypeRpgRace;
import br.com.while42.rpgcs.model.attributes.TypeRpgReligion;
import br.com.while42.rpgcs.model.attributes.TypeRpgSize;
import br.com.while42.rpgcs.model.attributes.TypeSkinColor;

public class EditCharacter extends Activity {
	private RpgCharacter rpgCharacter;

	private ImageButton image;
	private EditText name;
	
	private Spinner classe;
	private Spinner race;
	private Spinner alignment;
	private Spinner religion;
	
	private Spinner size;
	private Spinner age;	
	private Spinner gender;
	private Spinner height;
	private Spinner weight;
	private Spinner eye;
	private Spinner hair;
	private Spinner skin;

	private void setOptionsSpinner(Spinner spinner, TypeCode[] types ) {
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

		for (TypeCode g : types) {
			adapter.add(getString(g.getNameCode()));
		}

		spinner.setAdapter(adapter);
	}
	
	@Override
	protected void onResume() {
		super.onResume();

	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.edit_character);

		image = (ImageButton) findViewById(R.id_edit.imagebutton_image);
		name = (EditText) findViewById(R.id_edit.edittext_name);
		
		classe = (Spinner) findViewById(R.id_edit.spinner_class);
		race = (Spinner) findViewById(R.id_edit.spinner_race);
		alignment = (Spinner) findViewById(R.id_edit.spinner_alignment);
		religion = (Spinner) findViewById(R.id_edit.spinner_religion);
		
		size = (Spinner) findViewById(R.id_edit.spinner_size);
		age = (Spinner) findViewById(R.id_edit.spinner_age);
		gender = (Spinner) findViewById(R.id_edit.spinner_gender);
		height = (Spinner) findViewById(R.id_edit.spinner_height);
		weight = (Spinner) findViewById(R.id_edit.spinner_weight);
		eye = (Spinner) findViewById(R.id_edit.spinner_eye);
		hair = (Spinner) findViewById(R.id_edit.spinner_hair);
		skin = (Spinner) findViewById(R.id_edit.spinner_skin);
		
		setOptionsSpinner(classe, TypeRpgClass.values());
		setOptionsSpinner(race, TypeRpgRace.values());
		setOptionsSpinner(alignment, TypeRpgAlignment.values());
		setOptionsSpinner(religion, TypeRpgReligion.values());
		
		setOptionsSpinner(size, TypeRpgSize.values());
		// TODO: age
		setOptionsSpinner(gender, TypeGender.values());
		// TODO: height
		// TODO: weight		
		setOptionsSpinner(eye, TypeEyeColor.values());
		setOptionsSpinner(hair, TypeHairColor.values());
		setOptionsSpinner(skin, TypeSkinColor.values());
				
	}

}
