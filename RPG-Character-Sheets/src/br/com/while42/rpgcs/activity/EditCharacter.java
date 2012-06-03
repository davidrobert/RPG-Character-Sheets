package br.com.while42.rpgcs.activity;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.TypeCode;
import br.com.while42.rpgcs.model.character.RpgCharacter;
import br.com.while42.rpgcs.model.character.attributes.TypeEyeColor;
import br.com.while42.rpgcs.model.character.attributes.TypeGender;
import br.com.while42.rpgcs.model.character.attributes.TypeHairColor;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgAlignment;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgRace;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgReligion;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgSize;
import br.com.while42.rpgcs.model.character.attributes.TypeSkinColor;
import br.com.while42.rpgcs.model.classes.AbstractRpgClass;
import br.com.while42.rpgcs.model.classes.CharacterClass;
import br.com.while42.rpgcs.model.classes.Classes;
import br.com.while42.rpgcs.persist.DataManager;

public class EditCharacter extends Activity {

	DataManager dataManager;

	
	private EditText name;

	private Spinner classe;
	private Spinner race;
	private Spinner alignment;
	private Spinner religion;

	private Spinner size;
	private EditText age;
	private Spinner gender;
	private EditText height;
	private EditText weight;
	private Spinner eye;
	private Spinner hair;
	private Spinner skin;

	private Button save;
	
	private List<CharacterClass> listClasses;
	
	private void setOptionsSpinner(Spinner spinner, List<CharacterClass> listClasses) {

		List<Element> items = new ArrayList<Element>();
		for (CharacterClass g : listClasses) {
			items.add(new Element(g, getString(g.getCodeName())));
		}

		ArrayAdapter<Element> adapter = new ArrayAdapter<Element>(this, android.R.layout.simple_spinner_dropdown_item, items);

		spinner.setAdapter(adapter);
	}	
	
	private void setOptionsSpinner(Spinner spinner, TypeCode[] types) {

		List<Element> items = new ArrayList<Element>();
		for (TypeCode g : types) {
			items.add(new Element(g, getString(g.getCodeName())));
		}

		ArrayAdapter<Element> adapter = new ArrayAdapter<Element>(this, android.R.layout.simple_spinner_dropdown_item, items);

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
		
		dataManager = new DataManager(getApplicationContext());
		listClasses = new Classes().getAll(this, "br.com.while42.rpgcs", AbstractRpgClass.class);

		name = (EditText) findViewById(R.id_edit.edittext_name);

		classe = (Spinner) findViewById(R.id_edit.spinner_class);
		race = (Spinner) findViewById(R.id_edit.spinner_race);
		alignment = (Spinner) findViewById(R.id_edit.spinner_alignment);
		religion = (Spinner) findViewById(R.id_edit.spinner_religion);

		size = (Spinner) findViewById(R.id_edit.spinner_size);
		age = (EditText) findViewById(R.id_edit.edittext_age);
		gender = (Spinner) findViewById(R.id_edit.spinner_gender);
		height = (EditText) findViewById(R.id_edit.edittext_height);
		weight = (EditText) findViewById(R.id_edit.edittext_weight);
		eye = (Spinner) findViewById(R.id_edit.spinner_eye);
		hair = (Spinner) findViewById(R.id_edit.spinner_hair);
		skin = (Spinner) findViewById(R.id_edit.spinner_skin);

		save = (Button) findViewById(R.id_edit.button_save);

		//setOptionsSpinner(classe, codes);
		setOptionsSpinner(classe, listClasses);
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

		save.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Element e;
				
				RpgCharacter cs = new RpgCharacter();
				
				// Name
				cs.setName(name.getText().toString());				
				
				// Class
				cs.clearRpgClass(); // TODO: Only first edit...
				e = (Element) classe.getSelectedItem();
				//TODO: character.addClasse(e.getType()); 

				// Race
				e = (Element) race.getSelectedItem();
				cs.setRace((TypeRpgRace) e.getType());
				
				// Alignment
				e = (Element) alignment.getSelectedItem();
				cs.setAlignment((TypeRpgAlignment) e.getType());
				
				// Religion
				e = (Element) religion.getSelectedItem();
				cs.setReligion((TypeRpgReligion) e.getType());
				
				// Size
				e = (Element) size.getSelectedItem();
				cs.setSize((TypeRpgSize) e.getType());

				// Age
				cs.setAge(Integer.parseInt(age.getText().toString()));
				// TODO: Age
				
				// Gender
				e = (Element) gender.getSelectedItem();
				cs.setGender((TypeGender) e.getType());

				// Height
				cs.setHeight(Integer.parseInt(height.getText().toString()));			
				
				// Weight
				cs.setWeight(Integer.parseInt(weight.getText().toString()));
				
				// Eye
				e = (Element) eye.getSelectedItem();
				cs.setEye((TypeEyeColor) e.getType());
				
				// Hair
				e = (Element) hair.getSelectedItem();
				cs.setHair((TypeHairColor) e.getType());
				
				// Skin
				e = (Element) skin.getSelectedItem();
				cs.setSkin((TypeSkinColor) e.getType());
				
				// DEBUG
				Log.e(">> class     >>", cs.getRpgClasses().toString());
				Log.e(">> race      >>", cs.getRace().toString());
				Log.e(">> alignment >>", cs.getAlignment().toString());
				Log.e(">> religion  >>", cs.getReligion().toString());

				Log.e(">> size      >>", cs.getSize().toString());
				Log.e(">> age       >>", cs.getAge().toString());
				Log.e(">> gender    >>", cs.getGender().toString());
				Log.e(">> height    >>", cs.getHeight().toString());
				Log.e(">> weight    >>", cs.getWeight().toString());
				Log.e(">> eye       >>", cs.getEye().toString());
				Log.e(">> hair      >>", cs.getHair().toString());
				Log.e(">> skin      >>", cs.getSkin().toString());
				
				dataManager.saveRpgCharacter(cs);
			}
		});

	}

}
