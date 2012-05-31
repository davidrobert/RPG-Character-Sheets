package br.com.while42.rpgcs.model.classes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.HitDice;
import br.com.while42.rpgcs.model.HitDiceType;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgAlignment;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgReligion;
import br.com.while42.rpgcs.model.classes.bonuses.BaseAttackBonuses;
import br.com.while42.rpgcs.model.classes.bonuses.BaseSaveBonuses;


public class Rogue extends AbstractRpgClass {

	private static final Set<TypeRpgReligion> religions = new HashSet<TypeRpgReligion>(Arrays.asList( 
			TypeRpgReligion.OLIDAMMARA, TypeRpgReligion.NERULL, TypeRpgReligion.VECNA, TypeRpgReligion.ERYTNUL ));
	
	@Override
	public HitDiceType getHitDice() {		
		return HitDiceType.d6;
	}
	
	@Override
	public int getCodeName() {
		return R.string.class_rogue;
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
		return new BaseSaveBonuses().getPoor(classLevel);
	}
	
	@Override
	public Set<TypeRpgReligion> getReligions(TypeRpgAlignment alignment) {		
		return getReligions(religions, alignment);
	}
	
	@Override
	public HitDice getStartingGold() {
		return new HitDice(5, HitDiceType.d4, 0, 10);
	}
}
