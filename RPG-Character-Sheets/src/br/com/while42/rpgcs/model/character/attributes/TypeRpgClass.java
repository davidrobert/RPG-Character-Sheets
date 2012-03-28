package br.com.while42.rpgcs.model.character.attributes;

import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.TypeCode;

public enum TypeRpgClass implements TypeCode {
	NONE(R.string.class_none),
	BARBARIAN(R.string.class_barbarian), 
	BARD(R.string.class_bard),
	CLERIC(R.string.class_cleric),
	DRUID(R.string.class_druid),
	FIGHTER(R.string.class_fighter),
	MONK(R.string.class_monk),
	PALADIN(R.string.class_paladin),
	RANGER(R.string.class_ranger),
	ROGUE(R.string.class_rogue),
	SORCERER(R.string.class_sorcerer),
	WIZARD(R.string.class_wizard);

	private int nameCode;

	private TypeRpgClass(int nameCode) {
		this.nameCode = nameCode;
	}

	public int getCodeName() {
		return nameCode;
	}
}
