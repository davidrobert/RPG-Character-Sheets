package br.com.while42.rpgcs.model.weapons;

import br.com.while42.rpgcs.R;

public enum CategorieWeapon {
	SIMPLE(R.string.type_weapon_bludgeoning),
	MARTIAL(R.string.type_weapon_bludgeoning),
	EXOTIC(R.string.type_weapon_bludgeoning),
	MELEE(R.string.type_weapon_bludgeoning),
	RANGED(R.string.type_weapon_bludgeoning);
	
	private int nameCode;

	private CategorieWeapon(int nameCode) {
		this.nameCode = nameCode;
	}

	public int getNameCode() {
		return nameCode;
	}	
}
