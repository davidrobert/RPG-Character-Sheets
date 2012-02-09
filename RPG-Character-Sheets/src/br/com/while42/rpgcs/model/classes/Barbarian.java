package br.com.while42.rpgcs.model.classes;

import br.com.while42.rpgcs.model.HitDiceType;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgClass;
import br.com.while42.rpgcs.model.classes.bonuses.BaseAttackBonuses;
import br.com.while42.rpgcs.model.classes.bonuses.BaseSaveBonuses;

public class Barbarian extends AbstractClass {
	
	@Override
	public HitDiceType getHitDice() {		
		return HitDiceType.d12;
	}
	
	@Override
	public TypeRpgClass getClassType() {
		return TypeRpgClass.BARBARIAN;
	}
	
	@Override
	public int getBaseAttackBonus() {
		return new BaseAttackBonuses().getGood(classLevel);
	}
	
	@Override
	public int getFortSave() {
		return new BaseSaveBonuses().getGood(classLevel);
	}
	
	@Override
	public int getRefSave() {
		return new BaseSaveBonuses().getPoor(classLevel);
	}
	
	@Override
	public int getWillSave() {
		return new BaseSaveBonuses().getPoor(classLevel);
	}
}
