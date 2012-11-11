package br.com.while42.rpgcs.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.activity.fragment.EditCharacteristics;
import br.com.while42.rpgcs.activity.fragment.EditClasses;
import br.com.while42.rpgcs.model.character.RpgCharacter;

import com.actionbarsherlock.app.SherlockFragmentActivity;

public class EditRpgCharacter extends SherlockFragmentActivity {

	private RpgCharacter rpgCharacter;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_edit_character);

		Log.d("ACTIVITY", "EditRpgCharacter");
		
		rpgCharacter = new RpgCharacterIntentUtils().getSerializeRpgCharacter(getIntent());
		
		EditCharacteristics editCharacteristics;
		EditClasses editClasses;
		
		if (rpgCharacter != null) {
			editCharacteristics = new EditCharacteristics(rpgCharacter.getAttributes());
			editClasses = new EditClasses(rpgCharacter.getRpgClasses());
		} else {
			editCharacteristics = new EditCharacteristics();
			editClasses = new EditClasses();
		}

		FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
		transaction.replace(R.id_edit.fragment_characteristics, editCharacteristics, EditCharacteristics.class.getCanonicalName());
		transaction.replace(R.id_edit.fragment_classes, editClasses, EditClasses.class.getCanonicalName());
		transaction.commit();
	}

	@Override
	protected void onResume() {
		super.onResume();
		rpgCharacter = new RpgCharacterIntentUtils().getSerializeRpgCharacter(getIntent());
	}
	
}
