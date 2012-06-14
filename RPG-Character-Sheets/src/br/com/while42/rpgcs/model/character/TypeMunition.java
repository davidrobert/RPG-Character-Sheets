package br.com.while42.rpgcs.model.character;

import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.TypeCode;

public enum TypeMunition implements TypeCode{
	BOLT(R.string.weapon_munition_bolt),
	BULLETS(R.string.weapon_munition_bullets),
	ARROWS(R.string.weapon_munition_arrows),
	BOLTS_OF_CROSSBOW_OF_HAND(R.string.weapon_munition_bolts_of_crossbow_of_hand),
	BOLTS_OF_REPEATING(R.string.weapon_munition_bolts_of_repeating),
	SHURIKEN(R.string.weapon_munition_shuriken),
	ESPECIAL(R.string.weapon_munition_especial);

	private int nameCode = 0;
	
	private TypeMunition(int nameCode) {
		this.nameCode = nameCode;
	}
	
	@Override
	public int getCodeName() {
		return nameCode;
	}

}
