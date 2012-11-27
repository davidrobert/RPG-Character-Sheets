package br.com.while42.rpgcs.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.activity.fragment.EditAbilities;
import br.com.while42.rpgcs.activity.fragment.EditCharacteristics;
import br.com.while42.rpgcs.activity.fragment.EditClasses;
import br.com.while42.rpgcs.model.character.Abilities;
import br.com.while42.rpgcs.model.character.Characteristics;
import br.com.while42.rpgcs.model.character.RpgCharacter;
import br.com.while42.rpgcs.model.character.RpgClass;
import br.com.while42.rpgcs.model.character.Skills;
import br.com.while42.rpgcs.persist.DataManager;

import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.view.MenuItem.OnMenuItemClickListener;

public class EditRpgCharacter extends SherlockFragmentActivity {

	private RpgCharacter rpgCharacter;

	private EditCharacteristics editCharacteristics;
	private EditClasses editClasses;
	private EditAbilities editAbilities;

	private EditSkills editSkills;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_edit_character);

		Log.d("ACTIVITY", "EditRpgCharacter");

		rpgCharacter = new RpgCharacterIntentUtils().getSerializeRpgCharacter(getIntent());
		createFragments();
	}

	@Override
	protected void onResume() {
		super.onResume();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getSupportMenuInflater().inflate(R.menu.edit_options, menu);
		// ActionBar actionBar = getSupportActionBar();

		MenuItem itemSave = menu.findItem(R.id_menu_edit.save);
		itemSave.setOnMenuItemClickListener(new OnMenuItemClickListener() {

			@Override
			public boolean onMenuItemClick(MenuItem item) {
				save();

				Intent intent = EditRpgCharacter.this.getIntent();
				new RpgCharacterIntentUtils().putSerializeRpgCharacter(intent, rpgCharacter);

				setResult(RESULT_OK, intent);
				finish();
				return false;
			}

		});

		return super.onCreateOptionsMenu(menu);
	}

	private void createFragments() {

		if (rpgCharacter != null) {
			// Edit character sheet
			editCharacteristics = new EditCharacteristics(rpgCharacter.getCharacteristics());
			editClasses = new EditClasses(rpgCharacter.getRpgClasses());
			editAbilities = new EditAbilities(rpgCharacter.getAbilities());
			editSkills = new EditSkills(rpgCharacter.getSkills());
		} else {
			// New character sheet
			editCharacteristics = new EditCharacteristics();
			editClasses = new EditClasses();
			editAbilities = new EditAbilities();
			editSkills = new EditSkills();
		}

		FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
		transaction.replace(R.id_edit.fragment_characteristics, editCharacteristics, EditCharacteristics.class.getCanonicalName());
		transaction.replace(R.id_edit.fragment_classes, editClasses, EditClasses.class.getCanonicalName());
		transaction.replace(R.id_edit.fragment_abilities, editAbilities, EditAbilities.class.getCanonicalName());
		transaction.replace(R.id_edit.fragment_skills, editSkills, EditSkills.class.getCanonicalName());
		transaction.commit();
	}

	private void save() {
		// TODO: Seria interessante q todos os fragments tivessem uma mesma
		// interface e que aqui so iterasse em uma list chamando o mesmo metodo
		// de todos os fragments.

		Characteristics characteristics = editCharacteristics.saveCharacteristics();
		RpgClass rpgClasses = editClasses.saveClasses();
		Abilities abilities = editAbilities.saveAbilities();
		Skills skills = editSkills.saveSkills();

		if (rpgCharacter == null) {
			rpgCharacter = new RpgCharacter(characteristics);
		}

		rpgCharacter.setCharacteristics(characteristics);
		rpgCharacter.setRpgClasses(rpgClasses);
		rpgCharacter.setAbilities(abilities);
		rpgCharacter.setSkills(skills);

		// Persist in database
		DataManager dataManager = new DataManager(this);
		Long id = dataManager.saveRpgCharacter(rpgCharacter);
		Log.d("DEBUG", "Saved Id: " + id);

	}
}
