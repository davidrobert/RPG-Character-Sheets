package br.com.while42.rpgcs.model.attributes;

import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.race.Dwarf;
import br.com.while42.rpgcs.model.race.Elf;
import br.com.while42.rpgcs.model.race.Gnome;
import br.com.while42.rpgcs.model.race.HalfElf;
import br.com.while42.rpgcs.model.race.HalfOrc;
import br.com.while42.rpgcs.model.race.Halfling;
import br.com.while42.rpgcs.model.race.Human;
import br.com.while42.rpgcs.model.race.Race;

public enum TypeRpgRace implements TypeCode {
	HUMAN(R.string.race_human, new Human()),
	ELF(R.string.race_elf, new Elf()),
	DWARF(R.string.race_dwarf, new Dwarf()),
	HALFLING(R.string.race_halfling, new Halfling()), 
	HALF_ELF(R.string.race_half_elf, new HalfElf()),
	HALF_ORC(R.string.race_half_orc, new HalfOrc()), 
	GNOME(R.string.race_gnome, new Gnome());
	
	private int nameCode;
	private Race race;
	
	private TypeRpgRace(int nameCode, Race race) {
		this.nameCode = nameCode;
		this.race = race;
	}
	
	public int getNameCode() {
		return nameCode;
	}
	
	public Race getRace() {
		return race;
	}
}
