package br.com.while42.rpgcs.model.weapons;

import br.com.while42.rpgcs.R;

public enum SizeWeapon {
	TINY(R.string.size_tiny),
	SMALL(R.string.size_small),
	MEDIUM(R.string.size_medium),
	LARGE(R.string.size_large);
	
	private int nameCode;

	private SizeWeapon(int nameCode) {
		this.nameCode = nameCode;
	}

	public int getNameCode() {
		return nameCode;
	}
}
