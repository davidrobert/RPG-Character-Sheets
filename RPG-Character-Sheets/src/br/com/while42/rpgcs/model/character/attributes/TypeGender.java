package br.com.while42.rpgcs.model.character.attributes;

import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.TypeCode;

public enum TypeGender implements TypeCode {
	MEN(R.string.gender_men),
	WOMAN(R.string.gender_woman),
	UNDEFINED(R.string.gender_undefined);

	private int nameCode;
	
	private TypeGender(int nameCode) {
		this.nameCode = nameCode;
	}

	@Override
	public int getCodeName() {
		return nameCode;
	}
}
