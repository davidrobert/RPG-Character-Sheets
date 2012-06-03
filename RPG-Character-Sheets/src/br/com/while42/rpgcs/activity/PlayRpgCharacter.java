package br.com.while42.rpgcs.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.character.RpgCharacter;
import br.com.while42.rpgcs.persist.DataManager;

public class PlayRpgCharacter extends Activity {

	@Override
	protected void onResume() {
		super.onResume();
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.play_character);
		
		Long id = getIntent().getLongExtra("id", 0L);
		
		DataManager manager = new DataManager(getApplicationContext());
		
		Log.i("ID: ", id.toString());
		
		RpgCharacter rpgCharacter = manager.retrieveRpgCharacter(id);
		
		TextView name = (TextView) findViewById(R.id_play.textview_name);
		name.setText(rpgCharacter.getName());
		
	}

}
