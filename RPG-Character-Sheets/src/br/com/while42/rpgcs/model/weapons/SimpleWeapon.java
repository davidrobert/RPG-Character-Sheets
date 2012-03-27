package br.com.while42.rpgcs.model.weapons;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import br.com.while42.rpgcs.model.HitDice;
import br.com.while42.rpgcs.model.HitDiceType;

public enum SimpleWeapon implements BasicWeapon {
	GAUNTLET       ( 2, new HitDice(HitDiceType.d2), new HitDice(HitDiceType.d3 ), 2,  0,  0.5, TypeWeapon.BLUDGEONING),
	UNARMED_STRIKE ( 0, new HitDice(HitDiceType.d2), new HitDice(HitDiceType.d3 ), 2,  0,    0, TypeWeapon.BLUDGEONING),
	
	DAGGER         ( 2, new HitDice(HitDiceType.d3), new HitDice(HitDiceType.d4 ), 2,  3,  0.5, TypeWeapon.PIERCING, TypeWeapon.SLASHING),
	DAGGER_PUNCHING( 2, new HitDice(HitDiceType.d3), new HitDice(HitDiceType.d4 ), 3,  0,  0.5, TypeWeapon.PIERCING),
	GAUNTLET_SPIKED( 5, new HitDice(HitDiceType.d3), new HitDice(HitDiceType.d4 ), 2,  0,  0.5, TypeWeapon.PIERCING),
	MACE_LIGHT     ( 5, new HitDice(HitDiceType.d4), new HitDice(HitDiceType.d6 ), 2,  0,    2, TypeWeapon.BLUDGEONING),
	SICKLE         ( 6, new HitDice(HitDiceType.d4), new HitDice(HitDiceType.d6 ), 2,  0,    1, TypeWeapon.SLASHING),
	
	CLUB           ( 0, new HitDice(HitDiceType.d4), new HitDice(HitDiceType.d6 ), 2,  3,  1.5, TypeWeapon.BLUDGEONING),
	MACE_HEAVY     (12, new HitDice(HitDiceType.d6), new HitDice(HitDiceType.d8 ), 2,  0,    4, TypeWeapon.BLUDGEONING),
	MORNINGSTAR    ( 8, new HitDice(HitDiceType.d6), new HitDice(HitDiceType.d8 ), 2,  0,    3, TypeWeapon.BLUDGEONING, TypeWeapon.PIERCING),
	SHORTSPEAR     ( 1, new HitDice(HitDiceType.d4), new HitDice(HitDiceType.d6 ), 2,  6,  1.5, TypeWeapon.PIERCING),
	
	LONGSPEAR      ( 5, new HitDice(HitDiceType.d6), new HitDice(HitDiceType.d8 ), 3,  0,  4.5, TypeWeapon.PIERCING),
	QUARTESTAFF    ( 0, new HitDice(HitDiceType.d4), new HitDice(HitDiceType.d6 ), 2,  0,    2, TypeWeapon.BLUDGEONING),
	SPEAR          ( 2, new HitDice(HitDiceType.d6), new HitDice(HitDiceType.d8 ), 3,  6,    3, TypeWeapon.PIERCING),
	
	CROSSBOW_HEAVY (50, new HitDice(HitDiceType.d8), new HitDice(HitDiceType.d10), 2, 36,    4, TypeWeapon.PIERCING),
	CROSSBOW_LIGHT (35, new HitDice(HitDiceType.d6), new HitDice(HitDiceType.d8 ), 2, 24,    2, TypeWeapon.PIERCING),
	DART           ( 5, new HitDice(HitDiceType.d3), new HitDice(HitDiceType.d4 ), 2,  6, 0.25, TypeWeapon.PIERCING),
	JAVELIN        ( 1, new HitDice(HitDiceType.d4), new HitDice(HitDiceType.d6 ), 2,  9,    1, TypeWeapon.PIERCING),
	SLING          ( 0, new HitDice(HitDiceType.d3), new HitDice(HitDiceType.d4 ), 2, 15,    0, TypeWeapon.BLUDGEONING);

	private int cost = 0;
	private HitDice damageSmall;
	private HitDice damageMedium;
	private int critical = 0;
	private int rangeIncrement = 0;
	private double weight = 0;
	private Set<TypeWeapon> types = new HashSet<TypeWeapon>();

	private SimpleWeapon(HitDice damageSmall, HitDice damageMedium, int critical, int rangeIncrement, double weight, TypeWeapon ... types) {
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
	
	private SimpleWeapon(int costGp, HitDice damageSmall, HitDice damageMedium, int critical, int rangeIncrement, double weight, TypeWeapon ... types) {
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
