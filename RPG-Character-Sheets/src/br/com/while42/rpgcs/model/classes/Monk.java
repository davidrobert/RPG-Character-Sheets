package br.com.while42.rpgcs.model.classes;

import br.com.while42.rpgcs.model.HitDice;
import br.com.while42.rpgcs.model.HitDiceType;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgClass;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgSize;
import br.com.while42.rpgcs.model.classes.bonuses.BaseAttackBonuses;
import br.com.while42.rpgcs.model.classes.bonuses.BaseSaveBonuses;
import br.com.while42.rpgcs.model.classes.bonuses.ExperienceAndLevel;

public class Monk extends AbstractClass implements CharacterClass {
	
	private static HitDice unarmedDamageSizeSmall[] = new HitDice[ExperienceAndLevel.MAX_LEVEL + 1];
	private static HitDice unarmedDamageSizeLarge[] = new HitDice[ExperienceAndLevel.MAX_LEVEL + 1];
	
	static {
		for (int level = 1; level <= 3; level++) {
			unarmedDamageSizeSmall[level] = new HitDice(1, HitDiceType.d4);
			unarmedDamageSizeLarge[level] = new HitDice(1, HitDiceType.d8);
		}
		
		for (int level = 4; level <= 7; level++) {
			unarmedDamageSizeSmall[level] = new HitDice(1, HitDiceType.d6);
			unarmedDamageSizeLarge[level] = new HitDice(2, HitDiceType.d6);
		}
		
		for (int level = 8; level <= 11; level++) {
			unarmedDamageSizeSmall[level] = new HitDice(1, HitDiceType.d8);
			unarmedDamageSizeLarge[level] = new HitDice(2, HitDiceType.d8);
		}
		
		for (int level = 12; level <= 15; level++) {
			unarmedDamageSizeSmall[level] = new HitDice(1, HitDiceType.d10);
			unarmedDamageSizeLarge[level] = new HitDice(3, HitDiceType.d6);
		}
		
		for (int level = 16; level <= 19; level++) {
			unarmedDamageSizeSmall[level] = new HitDice(2, HitDiceType.d6);
			unarmedDamageSizeLarge[level] = new HitDice(3, HitDiceType.d8);
		}
		
		// TODO: Falta tratar corretamente casos acima do level 20
		for (int level = 20; level <= ExperienceAndLevel.MAX_LEVEL; level++) {
			unarmedDamageSizeSmall[level] = new HitDice(2, HitDiceType.d8);
			unarmedDamageSizeLarge[level] = new HitDice(4, HitDiceType.d8);
		}
	}
	
	@Override
	public HitDiceType getHitDice() {		
		return HitDiceType.d8;
	}
	
	@Override
	public TypeRpgClass getClassType() {
		return TypeRpgClass.MONK;
	}

	@Override
	public int getBaseAttackBonus(int classLevel) {
		return new BaseAttackBonuses().getAverage(classLevel);
	}

	@Override
	public int getFortSave(int classLevel) {
		return new BaseSaveBonuses().getGood(classLevel);
	}

	@Override
	public int getRefSave(int classLevel) {
		return new BaseSaveBonuses().getGood(classLevel);
	}

	@Override
	public int getWillSave(int classLevel) {
		return new BaseSaveBonuses().getGood(classLevel);
	}
	
	@Override
	public HitDice getUnarmedDamage(int classLevel, TypeRpgSize size) {
		if (classLevel < ExperienceAndLevel.MIN_LEVEL || classLevel > ExperienceAndLevel.MAX_LEVEL) {
			throw new IllegalArgumentException("Illegal class level");
		}
		
		if (size == TypeRpgSize.SMALL) {
			return unarmedDamageSizeSmall[classLevel];
		}
		
		return unarmedDamageSizeLarge[classLevel];
	}
}
