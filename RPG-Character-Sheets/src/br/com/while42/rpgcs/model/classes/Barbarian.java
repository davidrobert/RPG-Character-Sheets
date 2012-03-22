package br.com.while42.rpgcs.model.classes;

import java.util.List;

import br.com.while42.rpgcs.model.HitDice;
import br.com.while42.rpgcs.model.HitDiceType;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgAlignment;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgClass;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgReligion;
import br.com.while42.rpgcs.model.classes.bonuses.BaseAttackBonuses;
import br.com.while42.rpgcs.model.classes.bonuses.BaseSaveBonuses;

public class Barbarian extends AbstractClass {
	
	private static final TypeRpgClass typeClass = TypeRpgClass.BARBARIAN;
	
	private static final TypeRpgReligion religions[] = { TypeRpgReligion.KORD, TypeRpgReligion.OBAD_HAI, TypeRpgReligion.ERYTNUL };
	
	@Override
	public HitDiceType getHitDice() {		
		return HitDiceType.d12;
	}
	
	@Override
	public TypeRpgClass getClassType() {
		return typeClass;
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
	
	@Override
	public List<TypeRpgReligion> getReligions(TypeRpgAlignment alignment) {		
		return getReligions(religions, alignment);
	}
	
	@Override
	public HitDice getStartingGold() {
		return new HitDice(4, HitDiceType.d4, 0, 10);
	}
}
