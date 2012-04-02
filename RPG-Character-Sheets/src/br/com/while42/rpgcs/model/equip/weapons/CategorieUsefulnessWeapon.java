package br.com.while42.rpgcs.model.equip.weapons;

import br.com.while42.rpgcs.R;

public enum CategorieUsefulnessWeapon {
	MELEE(R.string.weapon_categorie_usefulness_melle),
	RANGED(R.string.weapon_categorie_usefulness_ranged);
	
	private int nameCode;

	private CategorieUsefulnessWeapon(int nameCode) {
		this.nameCode = nameCode;
	}

	public int getNameCode() {
		return nameCode;
	}	
}
