package br.com.while42.rpgcs.model.classes;

import br.com.while42.rpgcs.model.HitDiceType;

public class Monk extends Classe {
	@Override
	public HitDiceType getHitDice() {		
		return HitDiceType.d8;
	}
}
