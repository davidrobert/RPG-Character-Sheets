package br.com.while42.rpgcs.model.classes;

import br.com.while42.rpgcs.model.HitDice;
import br.com.while42.rpgcs.model.HitDiceType;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgSize;

public class AbstractClass {
	
	public HitDice getUnarmedDamage(int level, TypeRpgSize size) {
		return new HitDice(HitDiceType.d4);
	}
}
