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
import br.com.while42.rpgcs.adapter.ListCharacterAdapter;
import br.com.while42.rpgcs.model.character.RpgCharacter;
import br.com.while42.rpgcs.persist.DataManager;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.view.MenuItem.OnMenuItemClickListener;

public class MainMenu extends SherlockActivity {
	
	private ListCharacterAdapter listCharacterAdapter;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_menu);
		
		DataManager dataManager = new DataManager(this);
		List<RpgCharacter> characters = dataManager.retrieveAllRpgCharacters();
		
		// Add example by list is empty TODO: Verify if necessary
		if (characters.isEmpty()) {
			RpgCharacter example = ExampleRpgCharacter.create();
			dataManager.saveRpgCharacter(example);
			characters.add(example);
		}
		
		ListView lvCharacters = (ListView) findViewById(R.id_start.listview_characters);

		Log.d("DEBUG", "new DataManager(this).retrieveAllRpgCharacters().size(): " + dataManager.retrieveAllRpgCharacters().size());
		
		listCharacterAdapter = new ListCharacterAdapter(this, characters);
		
		lvCharacters.setAdapter(listCharacterAdapter);
		lvCharacters.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> adapter, View view, int position, long id) {
				Intent intent = new Intent(MainMenu.this, PlayRpgCharacter.class);
				new RpgCharacterIntentUtils().putSerializeRpgCharacter(intent, (RpgCharacter) listCharacterAdapter.getItem(position));
				startActivity(intent);
			}
		});
	}
	
	@Override
	protected void onResume() {
		super.onResume();

		listCharacterAdapter.notifyDataSetChanged();
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getSupportMenuInflater().inflate(R.menu.main_options, menu);

		MenuItem itemNew = menu.findItem(R.id_main_menu.new_character);
		itemNew.setOnMenuItemClickListener(new OnMenuItemClickListener() {

			@Override
			public boolean onMenuItemClick(MenuItem item) {
				startActivity(new Intent(MainMenu.this, EditRpgCharacter.class));
				return false;
			}

		});

		return super.onCreateOptionsMenu(menu);
	}
}
