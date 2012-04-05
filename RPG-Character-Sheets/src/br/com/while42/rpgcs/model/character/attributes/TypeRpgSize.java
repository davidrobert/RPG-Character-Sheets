package br.com.while42.rpgcs.model.character.attributes;

import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.TypeCode;

public enum TypeRpgSize implements TypeCode {
	FINE       (+8, R.string.size_fine), 
	DIMINUTTIVE(+4, R.string.size_diminutive), 
	TINY       (+2, R.string.size_tiny), 
	SMALL      (+1, R.string.size_small), 
	MEDIUM     (+0, R.string.size_medium), 
	LARGE      (-1, R.string.size_large), 
	HUGE       (-2, R.string.size_huge), 
	GARGANTUAN (-4, R.string.size_gargantuan), 
	COLOSSAL   (-8, R.string.size_gargantuan);
	
	private int sizeModifier;
	private int nameCode;

	private TypeRpgSize(int sizeModifier, int nameCode) {
		this.sizeModifier = sizeModifier;
		this.nameCode = nameCode;
	}

	@Override
	public int getCodeName() {
		return nameCode;
	}
	
	public int getSizeModifier() {
		return sizeModifier;
	}
}
