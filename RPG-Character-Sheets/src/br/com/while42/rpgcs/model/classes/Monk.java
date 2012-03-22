package br.com.while42.rpgcs.model.classes;

import java.util.List;

import br.com.while42.rpgcs.model.HitDice;
import br.com.while42.rpgcs.model.HitDiceType;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgAlignment;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgClass;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgReligion;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgSize;
import br.com.while42.rpgcs.model.classes.bonuses.BaseAttackBonuses;
import br.com.while42.rpgcs.model.classes.bonuses.BaseSaveBonuses;
import br.com.while42.rpgcs.model.classes.bonuses.ExperienceAndLevel;


public class Monk extends AbstractClass {
	
	private static HitDice unarmedDamageSizeSmall[] = new HitDice[ExperienceAndLevel.MAX_LEVEL + 1];
	private static HitDice unarmedDamageSizeMedium[] = new HitDice[ExperienceAndLevel.MAX_LEVEL + 1];
	private static HitDice unarmedDamageSizeLarge[] = new HitDice[ExperienceAndLevel.MAX_LEVEL + 1];
	
	private static final TypeRpgClass typeClass = TypeRpgClass.MONK;
	
	private static final TypeRpgReligion religions[] = 
		{ TypeRpgReligion.HEIRONEOUS, TypeRpgReligion.ST_CUTHBERT, TypeRpgReligion.HEXTOR };
	
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
		return typeClass;
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
		return new BaseSaveBonuses().getGood(classLevel);
	}

	@Override
	public int getWillSave() {
		return new BaseSaveBonuses().getGood(classLevel);
	}
	
	@Override
	public HitDice getUnarmedDamage(TypeRpgSize size) {
		if (classLevel < ExperienceAndLevel.MIN_LEVEL || classLevel > ExperienceAndLevel.MAX_LEVEL) {
			throw new IllegalArgumentException("Illegal class level");
		}
		
		switch (size) {
		case SMALL:
			return unarmedDamageSizeSmall[classLevel];
		case LARGE:
			return unarmedDamageSizeLarge[classLevel];
		case MEDIUM:
			return unarmedDamageSizeMedium[classLevel];
		default:
			return new HitDice(HitDiceType.d4);
		}
	}
	
	@Override
	public List<TypeRpgReligion> getReligions(TypeRpgAlignment alignment) {		
		return getReligions(religions, alignment);
	}
}
