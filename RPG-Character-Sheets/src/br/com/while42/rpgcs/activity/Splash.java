package br.com.while42.rpgcs.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.classes.AbstractRpgClass;
import br.com.while42.rpgcs.model.equip.weapons.AbstractWeapon;
import br.com.while42.rpgcs.reflection.ClassByReflection;

public class Splash extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_splash);

		Log.d("ACTIVITY", "Splash");		
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