package br.com.while42.rpgcs.model.weapons;

import br.com.while42.rpgcs.R;

public enum TypeWeapon {
	BLUDGEONING(R.string.weapon_type_bludgeoning), // concuss‹o
	PIERCING(R.string.weapon_type_piercing), // perfurante
	SLASHING(R.string.weapon_type_slashing); // cortante
	
	private int nameCode;

	private TypeWeapon(int nameCode) {
		this.nameCode = nameCode;
	}

	public int getNameCode() {
		return nameCode;
	}
}
