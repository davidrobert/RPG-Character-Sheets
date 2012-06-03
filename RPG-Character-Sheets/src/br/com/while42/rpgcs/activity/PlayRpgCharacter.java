package br.com.while42.rpgcs.activity;

import android.app.Activity;
import android.os.Bundle;
import br.com.while42.rpgcs.R;

public class PlayRpgCharacter extends Activity {

	@Override
	protected void onResume() {
		super.onResume();
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.play_character);
	}

}
