package br.com.while42.rpgcs.activity;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.character.RpgCharacter;
import br.com.while42.rpgcs.model.character.attributes.TypeCode;
import br.com.while42.rpgcs.model.character.attributes.TypeEyeColor;
import br.com.while42.rpgcs.model.character.attributes.TypeGender;
import br.com.while42.rpgcs.model.character.attributes.TypeHairColor;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgAlignment;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgRace;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgReligion;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgSize;
import br.com.while42.rpgcs.model.character.attributes.TypeSkinColor;
import br.com.while42.rpgcs.model.classes.AbstractClass;
import br.com.while42.rpgcs.model.classes.Barbarian;
import br.com.while42.rpgcs.model.classes.Fighter;
import br.com.while42.rpgcs.model.classes.X;

public class EditCharacter extends Activity {

	private static int START_LEVEL = 1;

	private RpgCharacter character = new RpgCharacter();

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

	private Button save;

	private void setOptionsSpinner(Spinner spinner, TypeCode[] types) {

		List<Element> items = new ArrayList<Element>();
		for (TypeCode g : types) {
			items.add(new Element(g, getString(g.getNameCode())));
		}

		ArrayAdapter<Element> adapter = new ArrayAdapter<Element>(this, android.R.layout.simple_spinner_dropdown_item, items);

		spinner.setAdapter(adapter);
	}

	private void setOptionsSpinner(Spinner spinner, List<TypeCode> types) {

		List<Element> items = new ArrayList<Element>();
		for (TypeCode g : types) {
			items.add(new Element(g, getString(g.getNameCode())));
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

		save = (Button) findViewById(R.id_edit.button_save);
		
		List<TypeCode> l = X.getModels(this, "br.com.while42.rpgcs");

		setOptionsSpinner(classe, l);
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
				
				// Name
				character.setName(name.getText().toString());				
				
				// Class
				character.clearClasses(); // TODO: Only first edit...
				e = (Element) classe.getSelectedItem();
				//TODO: character.addClasse(e.getType()); 

				// Race
				e = (Element) race.getSelectedItem();
				character.setRace((TypeRpgRace) e.getType());
				
				// Alignment
				e = (Element) alignment.getSelectedItem();
				character.setAlignment((TypeRpgAlignment) e.getType());
				
				// Religion
				e = (Element) religion.getSelectedItem();
				character.setReligion((TypeRpgReligion) e.getType());
				
				// Size
				e = (Element) size.getSelectedItem();
				character.setSize((TypeRpgSize) e.getType());

				// Age
				e = (Element) age.getSelectedItem();
				// TODO: Age
				
				// Gender
				e = (Element) gender.getSelectedItem();
				character.setGender((TypeGender) e.getType());

				// Height
				e = (Element) height.getSelectedItem();
				// TODO: Height				
				
				// Weight
				e = (Element) weight.getSelectedItem();
				// TODO: Weight
				
				// Eye
				e = (Element) eye.getSelectedItem();
				character.setEye((TypeEyeColor) e.getType());
				
				// Hair
				e = (Element) hair.getSelectedItem();
				character.setHair((TypeHairColor) e.getType());
				
				// Skin
				e = (Element) skin.getSelectedItem();
				character.setSkin((TypeSkinColor) e.getType());
				
				// DEBUG
				Log.e(">> class     >>", character.getClasses().toString());
				Log.e(">> race      >>", character.getRace().toString());
				Log.e(">> alignment >>", character.getAlignment().toString());
				Log.e(">> religion  >>", character.getReligion().toString());

				Log.e(">> size      >>", character.getSize().toString());
				Log.e(">> age       >>", character.getAge().toString());
				Log.e(">> gender    >>", character.getGender().toString());
				Log.e(">> height    >>", character.getHeight().toString());
				Log.e(">> weight    >>", character.getWeight().toString());
				Log.e(">> eye       >>", character.getEye().toString());
				Log.e(">> hair      >>", character.getHair().toString());
				Log.e(">> skin      >>", character.getSkin().toString());
			}
		});

	}

}
