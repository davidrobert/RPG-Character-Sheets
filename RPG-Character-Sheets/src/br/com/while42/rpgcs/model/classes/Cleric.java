package br.com.while42.rpgcs.model.classes;

import java.util.Set;

import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.HitDice;
import br.com.while42.rpgcs.model.HitDiceType;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgAlignment;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgReligion;
import br.com.while42.rpgcs.model.classes.bonuses.BaseAttackBonuses;
import br.com.while42.rpgcs.model.classes.bonuses.BaseSaveBonuses;

public class Cleric extends AbstractRpgClass implements SpellsPerDay {
	private static final long serialVersionUID = 1L;
	
	@Override
	public HitDiceType getHitDice() {		
		return HitDiceType.d8;
	}
	
	@Override
	public int getCodeName() {
		return R.string.class_cleric;
	}

	@Override
	public int getBaseAttackBonus() {
		return new BaseAttackBonuses().getAverage(classLevel);
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
		return new BaseSaveBonuses().getGood(classLevel);
	}

	@Override
	public int capacitySpellsPerDay(int spellLevel) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public Set<TypeRpgReligion> getReligions(TypeRpgAlignment alignment) {		
		return TypeRpgReligion.getByAlignment(alignment);
	}
	
	@Override
	public HitDice getStartingGold() {
		return new HitDice(5, HitDiceType.d4, 0, 10);
	}
}
