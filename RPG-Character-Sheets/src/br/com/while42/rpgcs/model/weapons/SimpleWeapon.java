package br.com.while42.rpgcs.model.weapons;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import br.com.while42.rpgcs.model.HitDice;
import br.com.while42.rpgcs.model.HitDiceType;
import br.com.while42.rpgcs.R;

public enum SimpleWeapon implements BasicWeapon {
	GAUNTLET       (R.string.weapon_simple_gauntlet       , 2, new HitDice(HitDiceType.d2), new HitDice(HitDiceType.d3 ), 2,  0,  0.5, TypeWeapon.BLUDGEONING),
	UNARMED_STRIKE (R.string.weapon_simple_unarmed_strike , 0, new HitDice(HitDiceType.d2), new HitDice(HitDiceType.d3 ), 2,  0,    0, TypeWeapon.BLUDGEONING),
	
	DAGGER         (R.string.weapon_simple_dagger         , 2, new HitDice(HitDiceType.d3), new HitDice(HitDiceType.d4 ), 2,  3,  0.5, TypeWeapon.PIERCING, TypeWeapon.SLASHING),
	DAGGER_PUNCHING(R.string.weapon_simple_dagger_punching, 2, new HitDice(HitDiceType.d3), new HitDice(HitDiceType.d4 ), 3,  0,  0.5, TypeWeapon.PIERCING),
	GAUNTLET_SPIKED(R.string.weapon_simple_gauntlet_spiked, 5, new HitDice(HitDiceType.d3), new HitDice(HitDiceType.d4 ), 2,  0,  0.5, TypeWeapon.PIERCING),
	MACE_LIGHT     (R.string.weapon_simple_mace_light     , 5, new HitDice(HitDiceType.d4), new HitDice(HitDiceType.d6 ), 2,  0,    2, TypeWeapon.BLUDGEONING),
	SICKLE         (R.string.weapon_simple_sickle         , 6, new HitDice(HitDiceType.d4), new HitDice(HitDiceType.d6 ), 2,  0,    1, TypeWeapon.SLASHING),
	
	CLUB           (R.string.weapon_simple_club           , 0, new HitDice(HitDiceType.d4), new HitDice(HitDiceType.d6 ), 2,  3,  1.5, TypeWeapon.BLUDGEONING),
	MACE_HEAVY     (R.string.weapon_simple_mace_heavy     ,12, new HitDice(HitDiceType.d6), new HitDice(HitDiceType.d8 ), 2,  0,    4, TypeWeapon.BLUDGEONING),
	MORNINGSTAR    (R.string.weapon_simple_morningstar    , 8, new HitDice(HitDiceType.d6), new HitDice(HitDiceType.d8 ), 2,  0,    3, TypeWeapon.BLUDGEONING, TypeWeapon.PIERCING),
	SHORTSPEAR     (R.string.weapon_simple_shortspear     , 1, new HitDice(HitDiceType.d4), new HitDice(HitDiceType.d6 ), 2,  6,  1.5, TypeWeapon.PIERCING),
	
	LONGSPEAR      (R.string.weapon_simple_longspear      , 5, new HitDice(HitDiceType.d6), new HitDice(HitDiceType.d8 ), 3,  0,  4.5, TypeWeapon.PIERCING),
	QUARTESTAFF    (R.string.weapon_simple_quartestaff    , 0, new HitDice(HitDiceType.d4), new HitDice(HitDiceType.d6 ), 2,  0,    2, TypeWeapon.BLUDGEONING),
	SPEAR          (R.string.weapon_simple_spear          , 2, new HitDice(HitDiceType.d6), new HitDice(HitDiceType.d8 ), 3,  6,    3, TypeWeapon.PIERCING),
	
	CROSSBOW_HEAVY (R.string.weapon_simple_crossbow_heavy ,50, new HitDice(HitDiceType.d8), new HitDice(HitDiceType.d10), 2, 36,    4, TypeWeapon.PIERCING),
	CROSSBOW_LIGHT (R.string.weapon_simple_crossbow_light ,35, new HitDice(HitDiceType.d6), new HitDice(HitDiceType.d8 ), 2, 24,    2, TypeWeapon.PIERCING),
	DART           (R.string.weapon_simple_dart           , 5, new HitDice(HitDiceType.d3), new HitDice(HitDiceType.d4 ), 2,  6, 0.25, TypeWeapon.PIERCING),
	JAVELIN        (R.string.weapon_simple_javelin        , 1, new HitDice(HitDiceType.d4), new HitDice(HitDiceType.d6 ), 2,  9,    1, TypeWeapon.PIERCING),
	SLING          (R.string.weapon_simple_sling          , 0, new HitDice(HitDiceType.d3), new HitDice(HitDiceType.d4 ), 2, 15,    0, TypeWeapon.BLUDGEONING);

	private int nameCode;
	
	private int cost = 0;
	private HitDice damageSmall;
	private HitDice damageMedium;
	private int critical = 0;
	private int rangeIncrement = 0;
	private double weight = 0;
	private Set<TypeWeapon> types = new HashSet<TypeWeapon>();

	private SimpleWeapon(int nameCode, HitDice damageSmall, HitDice damageMedium, int critical, int rangeIncrement, double weight, TypeWeapon ... types) {
		this.nameCode = nameCode;
		this.cost = 0;
		this.damageSmall = damageSmall;
		this.damageMedium = damageMedium;
		this.critical = critical;
		this.rangeIncrement = rangeIncrement;
		this.weight = weight;
		
		for (TypeWeapon type: types) {
			this.types.add(type);	
		}
	}
	
	private SimpleWeapon(int nameCode, int costGp, HitDice damageSmall, HitDice damageMedium, int critical, int rangeIncrement, double weight, TypeWeapon ... types) {
		this.nameCode = nameCode;
		this.cost = costGp;
		this.damageSmall = damageSmall;
		this.damageMedium = damageMedium;
		this.critical = critical;
		this.rangeIncrement = rangeIncrement;
		this.weight = weight;
		
		for (TypeWeapon type: types) {
			this.types.add(type);	
		}
	}
	
	public int getNameCode() {
		return nameCode;
	}

	@Override
	public int getCost() {
		return cost;
	}

	@Override
	public HitDice getDamage() {
		return getDamage(SizeWeapon.MEDIUM);
	}

	@Override
	public HitDice getDamage(SizeWeapon size) throws IllegalArgumentException {
		
		switch (size) {
		case TINY:
			// TODO: Falta implementar...
			break;
			
		case SMALL:	
			return damageSmall;			
		case MEDIUM: 
			return damageMedium;
			
		case LARGE:
			// TODO: Falta implementar...
			break;	
		}
		
		throw new IllegalArgumentException("Invalid size weapon");
	}

	@Override
	public int getCritical() {
		return critical;
	}

	@Override
	public int getRangeIncrement() {
		return rangeIncrement;
	}

	@Override
	public double getWeight() {
		return weight;
	}

	@Override
	public CategorieWeapon getCategorie() {
		return CategorieWeapon.SIMPLE;
	}

	@Override
	public Set<TypeWeapon> getType() {
		return Collections.unmodifiableSet(types);
	}

}
