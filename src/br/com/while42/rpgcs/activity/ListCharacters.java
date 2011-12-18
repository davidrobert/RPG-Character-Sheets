package br.com.while42.rpgcs.activity;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.adapter.ListCharacterAdapter;
import br.com.while42.rpgcs.model.Character;
import br.com.while42.rpgcs.persist.CharacterDAO;

public class ListCharacters extends Activity {

	private List<Character> characters = new ArrayList<Character>();
	private ListCharacterAdapter adapter;
	private ListView listCharacters;
	
	@Override
	protected void onResume() {
		super.onResume();

		CharacterDAO dao = new CharacterDAO(this);
		characters.clear();
		characters.addAll(dao.getList());
		dao.close();

		adapter.notifyDataSetChanged();
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.list_characters);

		listCharacters = (ListView) findViewById(R.id_list_characters.listView_characters);    
		
		adapter = new ListCharacterAdapter(this, characters);
		listCharacters.setAdapter(adapter);
	}
	
}
