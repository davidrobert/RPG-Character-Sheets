package br.com.while42.rpgcs.model;

import android.content.Context;
import br.com.while42.rpgcs.R;

public enum RpgRace {
	HUMAN(R.string.human),
	ELF(R.string.elf),
	DWARF(R.string.dwarf),
	HALFLING(R.string.halfling), 
	HALF_ELF(R.string.half_elf),
	HALF_ORC(R.string.half_orc), 
	GNOME(R.string.gnome);
	
	private int code;
	
	private RpgRace(int code) {
		this.code = code;
	}
	
	public String toString(Context ctx) {
		return ctx.getString(code);
	}
}
