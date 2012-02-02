package br.com.while42.rpgcs.model.classes;

import br.com.while42.rpgcs.model.HitDiceType;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgClass;

public class Rogue extends Classe {
	@Override
	public HitDiceType getHitDice() {		
		return HitDiceType.d6;
	}
	
	@Override
	public TypeRpgClass getClassType() {
		return TypeRpgClass.ROGUE;
	}
}
