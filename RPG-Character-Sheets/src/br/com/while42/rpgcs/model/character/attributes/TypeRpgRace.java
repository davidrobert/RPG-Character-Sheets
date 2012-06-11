package br.com.while42.rpgcs.model.character.attributes;

import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.TypeCode;
import br.com.while42.rpgcs.model.races.Dwarf;
import br.com.while42.rpgcs.model.races.Elf;
import br.com.while42.rpgcs.model.races.Gnome;
import br.com.while42.rpgcs.model.races.HalfElf;
import br.com.while42.rpgcs.model.races.HalfOrc;
import br.com.while42.rpgcs.model.races.Halfling;
import br.com.while42.rpgcs.model.races.Human;
import br.com.while42.rpgcs.model.races.AbstractRace;

public enum TypeRpgRace implements TypeCode {
	HUMAN(R.string.race_human, new Human()),
	ELF(R.string.race_elf, new Elf()),
	DWARF(R.string.race_dwarf, new Dwarf()),
	HALFLING(R.string.race_halfling, new Halfling()), 
	HALF_ELF(R.string.race_half_elf, new HalfElf()),
	HALF_ORC(R.string.race_half_orc, new HalfOrc()), 
	GNOME(R.string.race_gnome, new Gnome());
	
	private int nameCode;
	private AbstractRace race;
	
	private TypeRpgRace(int nameCode, AbstractRace race) {
		this.nameCode = nameCode;
		this.race = race;
	}
	
	@Override
	public int getCodeName() {
		return nameCode;
	}
	
	public AbstractRace getRace() {
		return race;
	}
}
