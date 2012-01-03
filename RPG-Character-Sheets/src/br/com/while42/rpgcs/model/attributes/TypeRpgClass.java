package br.com.while42.rpgcs.model.attributes;

import android.content.Context;
import br.com.while42.rpgcs.R;

public enum TypeRpgClass {
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

	private int code;

	private TypeRpgClass(int code) {
		this.code = code;
	}

	public String toString(Context ctx) {
		return ctx.getString(code);
	}
}
