package br.com.while42.rpgcs.model;

import br.com.while42.rpgcs.R;
import android.content.Context;

public enum TypeRPGLanguage {

	ABYSSAL(R.string.language_abyssal),
	AQUAN(R.string.language_aquan), 	
	AURAN(R.string.language_auran), 	
	CELESTIAL(R.string.language_celestial), 	
	COMMON(R.string.language_common), 	
	DRACONIC(R.string.language_draconic), 	
	DRUIDIC(R.string.language_druidic), 	
	DWARVEN(R.string.language_dwarven), 	
	ELVEN(R.string.language_elven), 	
	GNOME(R.string.language_gnome), 	
	GOBLIN(R.string.language_goblin), 	
	GIANT(R.string.language_giant), 	
	GNOLL(R.string.language_gnoll), 	
	HALFLING(R.string.language_halfling), 	
	IGNAN(R.string.language_ignan), 	
	INFERNAL(R.string.language_infernal), 	
	ORC(R.string.language_orc), 	
	SYLVAN(R.string.language_sylvan), 	
	TERRAN(R.string.language_terran); 			

	private int code;

	private TypeRPGLanguage(int code) {
		this.code = code;
	}

	public String toString(Context ctx) {
		return ctx.getString(code);
	}
}
