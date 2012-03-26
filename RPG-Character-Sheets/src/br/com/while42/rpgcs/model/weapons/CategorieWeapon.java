package br.com.while42.rpgcs.model.weapons;

import br.com.while42.rpgcs.R;

public enum CategorieWeapon {
	SIMPLE(R.string.weapon_type_bludgeoning),
	MARTIAL(R.string.weapon_type_bludgeoning),
	EXOTIC(R.string.weapon_type_bludgeoning),
	MELEE(R.string.weapon_type_bludgeoning),
	RANGED(R.string.weapon_type_bludgeoning);
	
	private int nameCode;

	private CategorieWeapon(int nameCode) {
		this.nameCode = nameCode;
	}

	public int getNameCode() {
		return nameCode;
	}	
}
