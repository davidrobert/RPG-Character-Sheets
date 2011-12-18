package br.com.while42.rpgcs.model;

import android.content.Context;
import br.com.while42.rpgcs.R;

public enum RpgAlignment {
		
	LAWFUL_GOOD(R.string.lawful_good),
	NEUTRAL_GOOD(R.string.neutral_good),
	CHAOTIC_GOOD(R.string.chaotic_good),
	
	LAWFUL_NEUTRAL(R.string.lawful_neutral),
	TRUE_NEUTRAL(R.string.true_neutral),
	CHAOTIC_NEUTRAL(R.string.chaotic_neutral),

	LAWFUL_EVIL(R.string.lawful_evil),
	NEUTRAL_EVIL(R.string.neutral_evil),
	CHAOTIC_EVIAL(R.string.chaotic_evil);
	
	private int code;
	
	private RpgAlignment(int code) {
		this.code = code;
	}
	
	public String toString(Context ctx) {
		return ctx.getString(code);
	}
}
