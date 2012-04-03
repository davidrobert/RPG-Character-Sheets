package br.com.while42.rpgcs.model.equip.armor;

import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.TypeCode;

public enum CategorieArmor implements TypeCode {
	LIGHT(R.string.armor_categorie_light),
	MEDIUM(R.string.armor_categorie_medium),
	HEAVY(R.string.armor_categorie_heavy),
	SHIELD(R.string.armor_categorie_shield),
	EXTRA(R.string.armor_categorie_extra);

	private int codeName;

	private CategorieArmor(int codeName) {
		this.codeName = codeName;
	}

	@Override
	public int getCodeName() {
		return codeName;
	}
}
