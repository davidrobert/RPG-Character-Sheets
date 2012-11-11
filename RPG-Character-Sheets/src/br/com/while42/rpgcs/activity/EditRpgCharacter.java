package br.com.while42.rpgcs.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.activity.fragment.EditCharacteristics;
import br.com.while42.rpgcs.activity.fragment.EditClasses;
import br.com.while42.rpgcs.model.character.RpgCharacter;
import br.com.while42.rpgcs.model.character.RpgClass;

import com.actionbarsherlock.app.SherlockFragmentActivity;

public class EditRpgCharacter extends SherlockFragmentActivity {

	private RpgCharacter rpgCharacter;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_edit_character);

		Log.d("ACTIVITY", "EditRpgCharacter");
		
		rpgCharacter = new RpgCharacterIntentUtils().getSerializeRpgCharacter(getIntent());
		if (rpgCharacter == null)
			rpgCharacter = new RpgCharacter();
		
		RpgClass rpgClasses = rpgCharacter.getRpgClasses();
		
		FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
		transaction.replace(R.id_edit.fragment_characteristics, new EditCharacteristics(rpgCharacter), EditCharacteristics.class.getCanonicalName());
		transaction.replace(R.id_edit.fragment_classes, new EditClasses(rpgClasses), EditClasses.class.getCanonicalName());
		transaction.commit();
	}

	@Override
	protected void onResume() {
		super.onResume();
		rpgCharacter = new RpgCharacterIntentUtils().getSerializeRpgCharacter(getIntent());
	}
	
}
