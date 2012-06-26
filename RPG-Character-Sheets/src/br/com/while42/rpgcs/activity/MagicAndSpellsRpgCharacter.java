package br.com.while42.rpgcs.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.character.RpgCharacter;

public class MagicAndSpellsRpgCharacter extends Activity {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_magic_spells_character);

		Bundle bn = new Bundle();
        bn = getIntent().getExtras();
        RpgCharacter rpgCharacter = (RpgCharacter) bn.getSerializable(RpgCharacter.class.getName());
        
        Log.d("MAGIC - ID: ", rpgCharacter.getId().toString());
	}	
}
