package br.com.while42.rpgcs.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import br.com.while42.rpgcs.model.character.RpgCharacter;

public class RpgCharacterIntentUtils {

	public RpgCharacter getSerializeRpgCharacter(Intent intent) {
		Bundle bundle = new Bundle();
		bundle = intent.getExtras();

		if (bundle == null)
			return null;

		RpgCharacter rpgCharacter = (RpgCharacter) bundle.getSerializable(RpgCharacter.class.getName());

		if (rpgCharacter != null)
			Log.d("GET - RPG CHARACTER - ID: ", rpgCharacter.getId().toString());

		return rpgCharacter;
	}

	public void putSerializeRpgCharacter(Intent intent, RpgCharacter rpgCharacter) {
		Bundle bundle = new Bundle();

		bundle.putSerializable(RpgCharacter.class.getName(), rpgCharacter);

		if (rpgCharacter != null)
			Log.d("PUT - RPG CHARACTER - ID: ", rpgCharacter.getId().toString());

		intent.putExtras(bundle);
	}
}
