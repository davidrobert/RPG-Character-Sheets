package br.com.while42.rpgcs.model.equip.weapons;

import br.com.while42.rpgcs.R;

public enum CategorieEncumbranceWeapon {
	UNARMED(R.string.weapon_categorie_encumbrance_unarmed),
	LIGHT(R.string.weapon_categorie_encumbrance_light),
	ONE_HANDED(R.string.weapon_categorie_encumbrance_one_handed),
	TWO_HANDED(R.string.weapon_categorie_encumbrance_two_handed);
	
	private int nameCode;

	private CategorieEncumbranceWeapon(int nameCode) {
		this.nameCode = nameCode;
	}

	public int getNameCode() {
		return nameCode;
	}	
}
