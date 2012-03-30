package br.com.while42.rpgcs.model.equipment.weapons;

import br.com.while42.rpgcs.R;

public enum CategorieWeapon {
	SIMPLE(R.string.weapon_categorie_simple),
	MARTIAL(R.string.weapon_categorie_martial),
	EXOTIC(R.string.weapon_categorie_exotic),
	MELEE(R.string.weapon_categorie_melle),
	RANGED(R.string.weapon_categorie_ranged);
	
	private int nameCode;

	private CategorieWeapon(int nameCode) {
		this.nameCode = nameCode;
	}

	public int getNameCode() {
		return nameCode;
	}	
}
