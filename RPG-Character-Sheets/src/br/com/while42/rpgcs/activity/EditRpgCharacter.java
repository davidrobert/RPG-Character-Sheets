package br.com.while42.rpgcs.activity;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
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
import br.com.while42.rpgcs.model.character.attributes.Attributes;
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
import br.com.while42.rpgcs.model.classes.ManagerRpgClasses;
import br.com.while42.rpgcs.persist.DataManager;

public class EditRpgCharacter extends Activity {

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
		listClasses = new ManagerRpgClasses().getAll(this, "br.com.while42.rpgcs", AbstractRpgClass.class);

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
				Attributes attr = cs.getAttributes();
				
				// Name
				cs.setName(name.getText().toString());				
				
				// Class
				e = (Element) classe.getSelectedItem();
				cs.addRpgClass((AbstractRpgClass) e.getType());

				// Race
				e = (Element) race.getSelectedItem();
				attr.setRace((TypeRpgRace) e.getType());
				
				// Alignment
				e = (Element) alignment.getSelectedItem();
				attr.setAlignment((TypeRpgAlignment) e.getType());
				
				// Religion
				e = (Element) religion.getSelectedItem();
				attr.setReligion((TypeRpgReligion) e.getType());
				
				// Size
				e = (Element) size.getSelectedItem();
				attr.setSize((TypeRpgSize) e.getType());

				// Age
				if (!age.getText().toString().isEmpty()) {
					attr.setAge(Integer.parseInt(age.getText().toString()));
				}
				
				// Gender
				e = (Element) gender.getSelectedItem();
				attr.setGender((TypeGender) e.getType());

				// Height
				if (!height.getText().toString().isEmpty()) {
					attr.setHeight(Integer.parseInt(height.getText().toString()));
				}
				
				// Weight
				if (!weight.getText().toString().isEmpty()) {
					attr.setWeight(Integer.parseInt(weight.getText().toString()));
				}
				
				// Eye
				e = (Element) eye.getSelectedItem();
				attr.setEye((TypeEyeColor) e.getType());
				
				// Hair
				e = (Element) hair.getSelectedItem();
				attr.setHair((TypeHairColor) e.getType());
				
				// Skin
				e = (Element) skin.getSelectedItem();
				attr.setSkin((TypeSkinColor) e.getType());
				
				// DEBUG
				Log.e(">> class     >>", cs.getRpgClasses().toString());
				Log.e(">> race      >>", attr.getRace().toString());
				Log.e(">> alignment >>", attr.getAlignment().toString());
				Log.e(">> religion  >>", attr.getReligion().toString());

				Log.e(">> size      >>", attr.getSize().toString());
				Log.e(">> age       >>", attr.getAge().toString());
				Log.e(">> gender    >>", attr.getGender().toString());
				Log.e(">> height    >>", attr.getHeight().toString());
				Log.e(">> weight    >>", attr.getWeight().toString());
				Log.e(">> eye       >>", attr.getEye().toString());
				Log.e(">> hair      >>", attr.getHair().toString());
				Log.e(">> skin      >>", attr.getSkin().toString());
				
				dataManager.saveRpgCharacter(cs);
				
				Intent play = new Intent(EditRpgCharacter.this, PlayRpgCharacter.class);	
				play.putExtra("id", cs.getId());
				startActivity(play);
			}
		});

	}

}
