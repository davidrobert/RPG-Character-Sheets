package br.com.while42.rpgcs.model.attributes;

import br.com.while42.rpgcs.R;

public enum TypeRpgSize implements TypeCode {
	FINE(R.string.size_fine), 
	DIMINUTTIVE(R.string.size_diminutive), 
	TINY(R.string.size_tiny), 
	SMALL(R.string.size_small), 
	MEDIUM(R.string.size_medium), 
	LARGE(R.string.size_large), 
	HUGE(R.string.size_huge), 
	GARGANTUAN(R.string.size_gargantuan), 
	COLOSSAL(R.string.size_gargantuan);
	
	private int nameCode;

	private TypeRpgSize(int nameCode) {
		this.nameCode = nameCode;
	}

	public int getNameCode() {
		return nameCode;
	}
}
