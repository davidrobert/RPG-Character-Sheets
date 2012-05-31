package br.com.while42.rpgcs.model.classes;

import java.util.Collections;
import java.util.List;

import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.HitDice;
import br.com.while42.rpgcs.model.HitDiceType;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgAlignment;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgReligion;
import br.com.while42.rpgcs.model.classes.bonuses.BaseAttackBonuses;
import br.com.while42.rpgcs.model.classes.bonuses.BaseSaveBonuses;

public class Bard extends AbstractClass implements SpellsPerDay {
	
	private static final TypeRpgReligion religions[] = { TypeRpgReligion.PELOR, TypeRpgReligion.FHARLANGHN, TypeRpgReligion.OLIDAMMARA };
	
	@Override
	public HitDiceType getHitDice() {		
		return HitDiceType.d6;
	}
	
	@Override
	public int getCodeName() {
		return R.string.class_bard;
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
	
	@Override
	public List<TypeRpgReligion> getReligions(TypeRpgAlignment alignment) {		
		return Collections.unmodifiableList(getReligions(religions, alignment));
	}
	
	@Override
	public HitDice getStartingGold() {
		return new HitDice(4, HitDiceType.d4, 0, 10);
	}
}
