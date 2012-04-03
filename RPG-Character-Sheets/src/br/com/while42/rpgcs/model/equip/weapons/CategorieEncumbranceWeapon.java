package br.com.while42.rpgcs.model.equip.weapons;

import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.TypeCode;

public enum CategorieEncumbranceWeapon implements TypeCode {
	UNARMED(R.string.weapon_categorie_encumbrance_unarmed),
	LIGHT(R.string.weapon_categorie_encumbrance_light),
	ONE_HANDED(R.string.weapon_categorie_encumbrance_one_handed),
	TWO_HANDED(R.string.weapon_categorie_encumbrance_two_handed);
	
	private int codeName;

	private CategorieEncumbranceWeapon(int codeName) {
		this.codeName = codeName;
	}

	@Override
	public int getCodeName() {
		return codeName;
	}
}
