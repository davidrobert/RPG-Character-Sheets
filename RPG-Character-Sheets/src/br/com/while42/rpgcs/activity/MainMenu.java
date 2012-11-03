package br.com.while42.rpgcs.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import br.com.while42.rpgcs.R;

import com.actionbarsherlock.app.SherlockActivity;

public class MainMenu extends SherlockActivity {
	
	private Button newCharacter;
	private Button loadCharacter;
	private Button exit;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_menu);
		
		newCharacter = (Button) findViewById(R.id_menu.button_newcharacter);
		loadCharacter = (Button) findViewById(R.id_menu.button_loadcharacter);
		exit = (Button) findViewById(R.id_menu.button_exit);
		
		newCharacter.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent edit = new Intent(MainMenu.this, EditRpgCharacter.class);
				startActivity(edit);
			}
		});
		
		loadCharacter.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO: Falta implementar
			}
		});
		
		exit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
	}
}
