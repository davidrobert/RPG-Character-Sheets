package br.com.while42.rpgcs.model.equip.weapons;

import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.TypeCode;

public enum CategorieUsefulnessWeapon implements TypeCode {
	MELEE(R.string.weapon_categorie_usefulness_melle),
	RANGED(R.string.weapon_categorie_usefulness_ranged);
	
	private int codeName;

	private CategorieUsefulnessWeapon(int codeName) {
		this.codeName = codeName;
	}

	@Override
	public int getCodeName() {
		return codeName;
	}	
}
