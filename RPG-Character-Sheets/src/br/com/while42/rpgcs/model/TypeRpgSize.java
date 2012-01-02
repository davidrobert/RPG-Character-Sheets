package br.com.while42.rpgcs.model;

import br.com.while42.rpgcs.R;
import android.content.Context;

public enum TypeRpgSize {
	FINE(R.string.size_fine), 
	DIMINUTTIVE(R.string.size_diminutive), 
	TINY(R.string.size_tiny), 
	SMALL(R.string.size_small), 
	MEDIUM(R.string.size_medium), 
	LARGE(R.string.size_large), 
	HUGE(R.string.size_huge), 
	GARGANTUAN(R.string.size_gargantuan), 
	COLOSSAL(R.string.size_gargantuan);
	
	private int code;

	private TypeRpgSize(int code) {
		this.code = code;
	}

	public String toString(Context ctx) {
		return ctx.getString(code);
	}
}
