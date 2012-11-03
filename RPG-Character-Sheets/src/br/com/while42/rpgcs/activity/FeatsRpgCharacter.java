package br.com.while42.rpgcs.activity;

import android.os.Bundle;
import android.util.Log;
import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.character.RpgCharacter;

import com.actionbarsherlock.app.SherlockActivity;

public class FeatsRpgCharacter extends SherlockActivity {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_feats_character);

		Bundle bn = new Bundle();
        bn = getIntent().getExtras();
        RpgCharacter rpgCharacter = (RpgCharacter) bn.getSerializable(RpgCharacter.class.getName());
        
        Log.d("FEATS - ID: ", rpgCharacter.getId().toString());
	}	

}
