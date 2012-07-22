package br.com.while42.rpgcs.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Window;
import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.classes.AbstractRpgClass;
import br.com.while42.rpgcs.model.equip.weapons.AbstractWeapon;
import br.com.while42.rpgcs.reflection.ClassByReflection;

public class Splash extends Activity implements Runnable {

	private static long DELAY = 500;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_splash);
		
		Handler handler = new Handler();
		handler.postDelayed(this, DELAY);
		
		//new LoadViewTask().execute();
	}

	public void run() {
		
    	// TODO: Only DEBUG
		startActivity(new Intent(this, RpgCharacterTest.class));
		finish();
	}

	
	
	private long loadClassesByReflection() {
		long startTime = System.currentTimeMillis();
		
		ClassByReflection.getAll(this, AbstractRpgClass.class);
		ClassByReflection.getAll(this, AbstractWeapon.class);
		
		long totalTime = System.currentTimeMillis() - startTime;
		Log.d("SPLASH - Time to Load", Long.toString(totalTime));
		
		return totalTime;
	}
	
	private class LoadViewTask extends AsyncTask<Void, Integer, Void>  
    {
		@Override
		protected Void doInBackground(Void... arg0) {
			loadClassesByReflection();
			
			return null;
		}  
    
    }
	
}