package br.com.while42.rpgcs.model;

import android.content.Context;
import br.com.while42.rpgcs.R;

public enum TypeGender {
	MEN(R.string.gender_men),
	WOMAN(R.string.gender_woman);

	private int code;

	private TypeGender(int code) {
		this.code = code;
	}

	public String toString(Context ctx) {
		return ctx.getString(code);
	}
}
