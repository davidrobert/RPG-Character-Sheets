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
import br.com.while42.rpgcs.model.character.Abilities;
import br.com.while42.rpgcs.model.character.Attributes;
import br.com.while42.rpgcs.model.character.BuilderAttributes;
import br.com.while42.rpgcs.model.character.RpgCharacter;
import br.com.while42.rpgcs.model.character.attributes.TypeEyeColor;
import br.com.while42.rpgcs.model.character.attributes.TypeGender;
import br.com.while42.rpgcs.model.character.attributes.TypeHairColor;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgAlignment;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgRace;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgReligion;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgSize;
import br.com.while42.rpgcs.model.character.attributes.TypeSkinColor;
import br.com.while42.rpgcs.model.character.attributes.TypeVision;
import br.com.while42.rpgcs.model.classes.AbstractRpgClass;
import br.com.while42.rpgcs.model.classes.CharacterClass;
import br.com.while42.rpgcs.persist.DataManager;
import br.com.while42.rpgcs.reflection.ClassByReflection;

public class EditRpgCharacter extends Activity {

	private DataManager dataManager;
	
	private EditText etName;

	private Spinner sClasse;
	private Spinner sRace;
	private Spinner sAlignment;
	private Spinner sReligion;

	private Spinner sSize;
	private EditText etAge;
	private Spinner sGender;
	private EditText etHeight;
	private EditText etWeight;
	private Spinner sEye;
	private Spinner sHair;
	private Spinner sSkin;

	private EditText etStrength;
	private EditText etConstitution;
	private EditText etWisdom;
	private EditText etCharisma;
	private EditText etDexterity;
	private EditText etIntelligence;
	
	private Button bSave;
	
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
		
		setContentView(R.layout.activity_edit_character);
		
		dataManager = new DataManager(getApplicationContext());
		listClasses = ClassByReflection.getAll(this, AbstractRpgClass.class);

		etName = (EditText) findViewById(R.id_edit.edittext_name);

		sClasse = (Spinner) findViewById(R.id_edit.spinner_class);
		sRace = (Spinner) findViewById(R.id_edit.spinner_race);
		sAlignment = (Spinner) findViewById(R.id_edit.spinner_alignment);
		sReligion = (Spinner) findViewById(R.id_edit.spinner_religion);

		sSize = (Spinner) findViewById(R.id_edit.spinner_size);
		etAge = (EditText) findViewById(R.id_edit.edittext_age);
		sGender = (Spinner) findViewById(R.id_edit.spinner_gender);
		etHeight = (EditText) findViewById(R.id_edit.edittext_height);
		etWeight = (EditText) findViewById(R.id_edit.edittext_weight);
		sEye = (Spinner) findViewById(R.id_edit.spinner_eye);
		sHair = (Spinner) findViewById(R.id_edit.spinner_hair);
		sSkin = (Spinner) findViewById(R.id_edit.spinner_skin);

		etStrength = (EditText) findViewById(R.id_edit.edittext_strength);
		etConstitution = (EditText) findViewById(R.id_edit.edittext_constitution);
		etWisdom = (EditText) findViewById(R.id_edit.edittext_wisdom);
		etCharisma = (EditText) findViewById(R.id_edit.edittext_charisma);
		etDexterity = (EditText) findViewById(R.id_edit.edittext_dexterity);
		etIntelligence = (EditText) findViewById(R.id_edit.edittext_intelligence);
		
		bSave = (Button) findViewById(R.id_edit.button_save);

		//setOptionsSpinner(classe, codes);
		setOptionsSpinner(sClasse, listClasses);
		setOptionsSpinner(sRace, TypeRpgRace.values());
		setOptionsSpinner(sAlignment, TypeRpgAlignment.values());
		setOptionsSpinner(sReligion, TypeRpgReligion.values());

		setOptionsSpinner(sSize, TypeRpgSize.values());
		// TODO: age
		setOptionsSpinner(sGender, TypeGender.values());
		// TODO: height
		// TODO: weight
		setOptionsSpinner(sEye, TypeEyeColor.values());
		setOptionsSpinner(sHair, TypeHairColor.values());
		setOptionsSpinner(sSkin, TypeSkinColor.values());

		bSave.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Element e;
						
				// Name
				String name = etName.getText().toString();				
				
				// Class
				e = (Element) sClasse.getSelectedItem();
				AbstractRpgClass clazz = (AbstractRpgClass) e.getType();
				
				// Race
				e = (Element) sRace.getSelectedItem();
				TypeRpgRace race = (TypeRpgRace) e.getType();
				
				// Alignment
				e = (Element) sAlignment.getSelectedItem();
				TypeRpgAlignment alignment = (TypeRpgAlignment) e.getType();
				
				// Religion
				e = (Element) sReligion.getSelectedItem();
				TypeRpgReligion religion = (TypeRpgReligion) e.getType();
				
				// Size
				e = (Element) sSize.getSelectedItem();
				TypeRpgSize size = (TypeRpgSize) e.getType();

				// Age
				Integer age = Integer.getInteger(etAge.getText().toString(), 0);
				
				// Gender
				e = (Element) sGender.getSelectedItem();
				TypeGender gender = (TypeGender) e.getType();

				// Height
				Integer height = Integer.getInteger(etHeight.getText().toString(), 0);
				
				// Weight
				Integer weight = Integer.getInteger(etWeight.getText().toString(), 0);
				
				// Eye
				e = (Element) sEye.getSelectedItem();
				TypeEyeColor eye = (TypeEyeColor) e.getType();
				
				// Hair
				e = (Element) sHair.getSelectedItem();
				TypeHairColor hair = (TypeHairColor) e.getType();
				
				// Skin
				e = (Element) sSkin.getSelectedItem();
				TypeSkinColor skin = (TypeSkinColor) e.getType();
				
				// Vision
				// TODO: Falta implementar
				TypeVision vision = TypeVision.NORMAL;
				
								
				Abilities ab = new Abilities();
				if (!etStrength.getText().toString().isEmpty()) {
					ab.setStrength(Integer.parseInt(etStrength.getText().toString()));
				}
				if (!etIntelligence.getText().toString().isEmpty()) {
					ab.setIntelligence(Integer.parseInt(etIntelligence.getText().toString()));
				}
				if (!etConstitution.getText().toString().isEmpty()) {
					ab.setConstitution(Integer.parseInt(etConstitution.getText().toString()));
				}
				if (!etDexterity.getText().toString().isEmpty()) {
					ab.setDexterity(Integer.parseInt(etDexterity.getText().toString()));
				}
				if (!etWisdom.getText().toString().isEmpty()) {
					ab.setWisdom(Integer.parseInt(etWisdom.getText().toString()));
				}
				if (!etCharisma.getText().toString().isEmpty()) {
					ab.setCharisma(Integer.parseInt(etCharisma.getText().toString()));
				}
				
				BuilderAttributes builder = new BuilderAttributes();
				Attributes attributes = builder.setRace(race)
											   .setAlignment(alignment)
											   .setReligion(religion)
											   .setSize(size)
											   .setAge(age)
											   .setGender(gender)
											   .setHeight(height)
											   .setWeight(weight)
											   .setEye(eye)
											   .setHair(hair)
											   .setSkin(skin)
											   .setVision(vision)
											   .toAttributes();
				
				RpgCharacter cs = new RpgCharacter(name, attributes);
				cs.getRpgClasses().add(clazz);
				cs.setAbilities(ab);
				
				Log.d("RpgCharacter", cs.toString());
				
				dataManager.saveRpgCharacter(cs);
				
				Intent play = new Intent(EditRpgCharacter.this, PlayRpgCharacter.class);	
				
				Bundle b = new Bundle();
	            b.putSerializable(RpgCharacter.class.getName(), cs);
	            play.putExtras(b);
				
				startActivity(play);
			}
		});

	}

}
