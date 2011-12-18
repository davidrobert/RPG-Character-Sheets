package br.com.while42.rpgcs.model;

import br.com.while42.rpgcs.R;
import android.content.Context;

public enum TypeSex {
	MEN(R.string.sex_men),
	WOMAN(R.string.sex_woman);

	private int code;

	private TypeSex(int code) {
		this.code = code;
	}

	public String toString(Context ctx) {
		return ctx.getString(code);
	}
}
