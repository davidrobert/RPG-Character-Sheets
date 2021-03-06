package br.com.while42.rpgcs.activity;

import java.util.List;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.activity.support.ExampleRpgCharacter;
import br.com.while42.rpgcs.activity.support.TypeRequestCode;
import br.com.while42.rpgcs.adapter.ListCharacterAdapter;
import br.com.while42.rpgcs.model.character.RpgCharacter;
import br.com.while42.rpgcs.persist.DataManager;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.view.MenuItem.OnMenuItemClickListener;

public class MainMenu extends SherlockActivity {
	
	private ListCharacterAdapter adapter;
	private List<RpgCharacter> characters;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_menu);
		
		DataManager dataManager = new DataManager(this);
		characters = dataManager.retrieveAllRpgCharacters();
		
		// Add example by list is empty TODO: Verify if necessary
		if (characters.isEmpty()) {
			RpgCharacter example = ExampleRpgCharacter.create();
			dataManager.saveRpgCharacter(example);
			characters.add(example);
		}
		
		ListView lvCharacters = (ListView) findViewById(R.id_start.listview_characters);

		Log.d("DEBUG", "new DataManager(this).retrieveAllRpgCharacters().size(): " + dataManager.retrieveAllRpgCharacters().size());
		
		adapter = new ListCharacterAdapter(this, characters);
		
		lvCharacters.setAdapter(adapter);
		lvCharacters.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
				Intent intent = new Intent(MainMenu.this, PlayRpgCharacter.class);
				new RpgCharacterIntentUtils().putSerializeRpgCharacter(intent, (RpgCharacter) adapter.getItem(position));
				startActivity(intent);
			}
		});
	}
	
	@Override
	protected void onResume() {
		super.onResume();

		characters = new DataManager(this).retrieveAllRpgCharacters();
		adapter.setList(characters);
		adapter.notifyDataSetChanged();
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getSupportMenuInflater().inflate(R.menu.main_options, menu);

		MenuItem itemNew = menu.findItem(R.id_main_menu.new_character);
		itemNew.setOnMenuItemClickListener(new OnMenuItemClickListener() {

			@Override
			public boolean onMenuItemClick(MenuItem item) {
				startActivityForResult(new Intent(MainMenu.this, EditRpgCharacter.class), TypeRequestCode.NEW_CHARACTER_REQUEST.getValue());
				return false;
			}

		});

		return super.onCreateOptionsMenu(menu);
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		
		if (requestCode == TypeRequestCode.NEW_CHARACTER_REQUEST.getValue()) {

			if (resultCode != RESULT_OK) {
				// TODO: Falta tratar corretamente este caso
				Log.d("onActivityResult", "resultCode != RESULT_OK (resultCode : " + resultCode + "  requestCode: " + requestCode + ")");
				return;
			}

			RpgCharacter character = new RpgCharacterIntentUtils().getSerializeRpgCharacter(data);
			
			// Caso tenha acabado de adicionar um contato novo, repassa para a activity de Play
			Intent intent = new Intent(MainMenu.this, PlayRpgCharacter.class);
			new RpgCharacterIntentUtils().putSerializeRpgCharacter(intent, character);
			startActivity(intent);
		}
	}
}
