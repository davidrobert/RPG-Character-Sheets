package br.com.while42.rpgcs.activity;

import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.adapter.ListCharacterAdapter;
import br.com.while42.rpgcs.model.RpgCharacter;
import br.com.while42.rpgcs.persist.CharacterDAO;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class EditCharacter extends Activity {
	private RpgCharacter rpgCharacter;
	
	@Override
	protected void onResume() {
		super.onResume();

	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.edit_character);
	}
}
