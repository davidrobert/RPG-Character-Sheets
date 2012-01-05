package br.com.while42.rpgcs.model.attributes;

import br.com.while42.rpgcs.R;

public enum TypeGender {
	MEN(R.string.gender_men),
	WOMAN(R.string.gender_woman);

	private int nameCode;

	private TypeGender(int nameCode) {
		this.nameCode = nameCode;
	}

	public int getNameCode() {
		return nameCode;
	}
}
