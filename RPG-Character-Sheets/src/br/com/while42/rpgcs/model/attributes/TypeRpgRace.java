package br.com.while42.rpgcs.model.attributes;

import br.com.while42.rpgcs.R;

public enum TypeRpgRace {
	HUMAN(R.string.race_human),
	ELF(R.string.race_elf),
	DWARF(R.string.race_dwarf),
	HALFLING(R.string.race_halfling), 
	HALF_ELF(R.string.race_half_elf),
	HALF_ORC(R.string.race_half_orc), 
	GNOME(R.string.race_gnome);
	
	private int nameCode;
	
	private TypeRpgRace(int nameCode) {
		this.nameCode = nameCode;
	}
	
	public int getNameCode() {
		return nameCode;
	}
}
