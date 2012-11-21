package br.com.while42.rpgcs.activity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.character.Characteristics;
import br.com.while42.rpgcs.model.character.RpgCharacter;
import br.com.while42.rpgcs.model.character.RpgClass;
import br.com.while42.rpgcs.model.classes.AbstractRpgClass;
import br.com.while42.rpgcs.model.equip.weapons.AbstractWeapon;
import br.com.while42.rpgcs.persist.DataManager;
import br.com.while42.rpgcs.reflection.ClassByReflection;

import com.actionbarsherlock.app.SherlockActivity;

public class Splash extends SherlockActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_start);

		Log.d("ACTIVITY", "Splash");

		List<RpgCharacter> characters = new DataManager(this).retrieveAllRpgCharacters();
		ListView lvCharacters = (ListView) findViewById(R.id_start.listview_characters);

		ArrayList<HashMap<String, Object>> characs = new ArrayList<HashMap<String, Object>>();
		for (RpgCharacter character : characters) {
			HashMap<String, Object> map = new HashMap<String, Object>();

			RpgClass classes = character.getRpgClasses();
			Characteristics characteristics = character.getCharacteristics();

			if (classes == null || characteristics == null) {
				Log.e("ERRO", "Inconsistencia no RpgCharacter (id: " + character.getId() + ")");
				continue;
			}

			Log.d("DEBUG", "RpgCharacter (id: " + character.getId() + ", name: " + characteristics.getName() + ")");

			map.put("name", characteristics.getName());
			map.put("race", getString(characteristics.getRace().getCodeName()));
			map.put("alignment", getString(characteristics.getAlignment().getCodeName()));
			map.put("experience", classes.getExperience().toString());

			StringBuilder sbClassLevel = new StringBuilder();
			for (AbstractRpgClass clazz : classes.getAll()) {
				if (sbClassLevel.length() > 0) {
					sbClassLevel.append(" / ");
				}
				sbClassLevel.append(getString(clazz.getCodeName()));
				sbClassLevel.append(" (");
				sbClassLevel.append(clazz.getClassLevel().toString());
				sbClassLevel.append(")");
			}

			map.put("classes", sbClassLevel.toString());

			characs.add(map);
		}

		SimpleAdapter adapterAttacks = new SimpleAdapter(this, characs, R.layout.list_characters, new String[] { "name", "race", "alignment",
				"experience", "classes" }, new int[] { R.id.name, R.id.race, R.id.alignment, R.id.experience, R.id.classes, R.id.range, R.id.type,
				R.id.notes });

		lvCharacters.setAdapter(adapterAttacks);

	}

	@Override
	protected void onResume() {
		super.onResume();
		new LoadViewTask(this, RpgCharacterTest.class).execute();
	}

	private class LoadViewTask extends AsyncTask<Long, Long, Long> {
		private Class<? extends Activity> activity;
		private Context context;

		public LoadViewTask(Context context, Class<? extends Activity> activity) {
			this.context = context;
			this.activity = activity;
		}

		@Override
		protected Long doInBackground(Long... arg0) {
			long startTime = System.currentTimeMillis();

			ClassByReflection.getAll(Splash.this, AbstractRpgClass.class);
			ClassByReflection.getAll(Splash.this, AbstractWeapon.class);

			return System.currentTimeMillis() - startTime;
		}

		@Override
		protected void onPostExecute(Long result) {
			Log.d("SPLASH", "Time to Load: " + result);

			startActivity(new Intent(context, activity));
			finish();
		}
	}

}