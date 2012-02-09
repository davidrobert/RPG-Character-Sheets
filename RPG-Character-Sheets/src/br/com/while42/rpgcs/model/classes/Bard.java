package br.com.while42.rpgcs.model.classes;

import br.com.while42.rpgcs.model.HitDiceType;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgClass;
import br.com.while42.rpgcs.model.classes.bonuses.BaseAttackBonuses;
import br.com.while42.rpgcs.model.classes.bonuses.BaseSaveBonuses;

public class Bard extends AbstractClass implements SpellsPerDay {
	
	@Override
	public HitDiceType getHitDice() {		
		return HitDiceType.d6;
	}
	
	@Override
	public TypeRpgClass getClassType() {
		return TypeRpgClass.BARD;
	}

	@Override
	public int getBaseAttackBonus() {
		return new BaseAttackBonuses().getAverage(classLevel);
	}

	@Override
	public int getFortSave() {
		return new BaseSaveBonuses().getPoor(classLevel);
	}

	@Override
	public int getRefSave() {
		return new BaseSaveBonuses().getGood(classLevel);
	}

	@Override
	public int getWillSave() {
		return new BaseSaveBonuses().getGood(classLevel);
	}

	@Override
	public int capacitySpellsPerDay(int spellLevel) {
		// TODO Auto-generated method stub
		return 0;
	}
}
