package br.com.while42.rpgcs.model.weapons;


public abstract class AbstractSimpleWeapon implements BasicWeapon {
	@Override
	public final CategorieWeapon getCategorie() {
		return CategorieWeapon.SIMPLE;
	}
}

/*
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
}

*/