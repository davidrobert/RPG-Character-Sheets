package br.com.while42.rpgcs.model;

import android.content.Context;
import br.com.while42.rpgcs.R;

public enum RpgClass {
	BARBARIAN(R.string.barbarian), 
	BARD(R.string.bard),
	CLERIC(R.string.cleric),
	DRUID(R.string.druid),
	FIGHTER(R.string.fighter),
	MONK(R.string.monk),
	PALADIN(R.string.paladin),
	RANGER(R.string.ranger),
	ROGUE(R.string.rogue),
	SORCERER(R.string.sorcerer),
	WIZARD(R.string.wizard);

	private int code;

	private RpgClass(int code) {
		this.code = code;
	}

	public String toString(Context ctx) {
		return ctx.getString(code);
	}
}
