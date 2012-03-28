package br.com.while42.rpgcs.model;

import junit.framework.Assert;
import android.test.AndroidTestCase;
import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.weapons.simple.Club;
import br.com.while42.rpgcs.model.weapons.simple.CrossbowHeavy;
import br.com.while42.rpgcs.model.weapons.simple.CrossbowLight;
import br.com.while42.rpgcs.model.weapons.simple.Dagger;
import br.com.while42.rpgcs.model.weapons.simple.DaggerPunching;
import br.com.while42.rpgcs.model.weapons.simple.Dart;
import br.com.while42.rpgcs.model.weapons.simple.Gauntlet;
import br.com.while42.rpgcs.model.weapons.simple.GauntletSpiked;
import br.com.while42.rpgcs.model.weapons.simple.Javelin;
import br.com.while42.rpgcs.model.weapons.simple.Longspear;
import br.com.while42.rpgcs.model.weapons.simple.MaceHeavy;
import br.com.while42.rpgcs.model.weapons.simple.MaceLight;
import br.com.while42.rpgcs.model.weapons.simple.Morningstar;
import br.com.while42.rpgcs.model.weapons.simple.Quartestaff;
import br.com.while42.rpgcs.model.weapons.simple.Shortspear;
import br.com.while42.rpgcs.model.weapons.simple.Sickle;
import br.com.while42.rpgcs.model.weapons.simple.Sling;
import br.com.while42.rpgcs.model.weapons.simple.Spear;
import br.com.while42.rpgcs.model.weapons.simple.UnarmedStrike;

public class SimpleWeaponTest extends AndroidTestCase {
		
	/* 
	public enum SimpleWeapon implements BasicWeapon {
		GAUNTLET       (, 2, new HitDice(HitDiceType.d2), new HitDice(HitDiceType.d3 ), 2,  0,  0.5, TypeWeapon.BLUDGEONING),
		UNARMED_STRIKE (, 0, new HitDice(HitDiceType.d2), new HitDice(HitDiceType.d3 ), 2,  0,    0, TypeWeapon.BLUDGEONING),
		
		DAGGER         (, 2, new HitDice(HitDiceType.d3), new HitDice(HitDiceType.d4 ), 2,  3,  0.5, TypeWeapon.PIERCING, TypeWeapon.SLASHING),
		DAGGER_PUNCHING(, 2, new HitDice(HitDiceType.d3), new HitDice(HitDiceType.d4 ), 3,  0,  0.5, TypeWeapon.PIERCING),
		GAUNTLET_SPIKED(, 5, new HitDice(HitDiceType.d3), new HitDice(HitDiceType.d4 ), 2,  0,  0.5, TypeWeapon.PIERCING),
		MACE_LIGHT     (, 5, new HitDice(HitDiceType.d4), new HitDice(HitDiceType.d6 ), 2,  0,    2, TypeWeapon.BLUDGEONING),
		SICKLE         (, 6, new HitDice(HitDiceType.d4), new HitDice(HitDiceType.d6 ), 2,  0,    1, TypeWeapon.SLASHING),
		
		CLUB           (, 0, new HitDice(HitDiceType.d4), new HitDice(HitDiceType.d6 ), 2,  3,  1.5, TypeWeapon.BLUDGEONING),
		MACE_HEAVY     (,12, new HitDice(HitDiceType.d6), new HitDice(HitDiceType.d8 ), 2,  0,    4, TypeWeapon.BLUDGEONING),
		MORNINGSTAR    (, 8, new HitDice(HitDiceType.d6), new HitDice(HitDiceType.d8 ), 2,  0,    3, TypeWeapon.BLUDGEONING, TypeWeapon.PIERCING),
		SHORTSPEAR     (, 1, new HitDice(HitDiceType.d4), new HitDice(HitDiceType.d6 ), 2,  6,  1.5, TypeWeapon.PIERCING),
		
		LONGSPEAR      (, 5, new HitDice(HitDiceType.d6), new HitDice(HitDiceType.d8 ), 3,  0,  4.5, TypeWeapon.PIERCING),
		QUARTESTAFF    (, 0, new HitDice(HitDiceType.d4), new HitDice(HitDiceType.d6 ), 2,  0,    2, TypeWeapon.BLUDGEONING),
		SPEAR          (, 2, new HitDice(HitDiceType.d6), new HitDice(HitDiceType.d8 ), 3,  6,    3, TypeWeapon.PIERCING),
		
		CROSSBOW_HEAVY (,50, new HitDice(HitDiceType.d8), new HitDice(HitDiceType.d10), 2, 36,    4, TypeWeapon.PIERCING),
		CROSSBOW_LIGHT (,35, new HitDice(HitDiceType.d6), new HitDice(HitDiceType.d8 ), 2, 24,    2, TypeWeapon.PIERCING),
		DART           (, 5, new HitDice(HitDiceType.d3), new HitDice(HitDiceType.d4 ), 2,  6, 0.25, TypeWeapon.PIERCING),
		JAVELIN        (, 1, new HitDice(HitDiceType.d4), new HitDice(HitDiceType.d6 ), 2,  9,    1, TypeWeapon.PIERCING),
		SLING          (, 0, new HitDice(HitDiceType.d3), new HitDice(HitDiceType.d4 ), 2, 15,    0, TypeWeapon.BLUDGEONING);
	}

	*/
	
	public void testCodeName() throws Throwable {		
		Assert.assertEquals(R.string.weapon_simple_gauntlet,        new Gauntlet().getCodeName());
		Assert.assertEquals(R.string.weapon_simple_unarmed_strike,  new UnarmedStrike().getCodeName());
		
		Assert.assertEquals(R.string.weapon_simple_dagger,          new Dagger().getCodeName());
		Assert.assertEquals(R.string.weapon_simple_dagger_punching, new DaggerPunching().getCodeName());
		Assert.assertEquals(R.string.weapon_simple_gauntlet_spiked, new GauntletSpiked().getCodeName());
		Assert.assertEquals(R.string.weapon_simple_mace_light,      new MaceLight().getCodeName());
		Assert.assertEquals(R.string.weapon_simple_sickle,          new Sickle().getCodeName());
		
		Assert.assertEquals(R.string.weapon_simple_club,            new Club().getCodeName());
		Assert.assertEquals(R.string.weapon_simple_mace_heavy,      new MaceHeavy().getCodeName());
		Assert.assertEquals(R.string.weapon_simple_morningstar,     new Morningstar().getCodeName());
		Assert.assertEquals(R.string.weapon_simple_shortspear,      new Shortspear().getCodeName());
		
		Assert.assertEquals(R.string.weapon_simple_longspear,       new Longspear().getCodeName());
		Assert.assertEquals(R.string.weapon_simple_quartestaff,     new Quartestaff().getCodeName());
		Assert.assertEquals(R.string.weapon_simple_spear,           new Spear().getCodeName());
		
		Assert.assertEquals(R.string.weapon_simple_crossbow_heavy,  new CrossbowHeavy().getCodeName());
		Assert.assertEquals(R.string.weapon_simple_crossbow_light,  new CrossbowLight().getCodeName());
		Assert.assertEquals(R.string.weapon_simple_dart,            new Dart().getCodeName());
		Assert.assertEquals(R.string.weapon_simple_javelin,         new Javelin().getCodeName());
		Assert.assertEquals(R.string.weapon_simple_sling,           new Sling().getCodeName());
	}
	
	public void testCost() throws Throwable {		
		Assert.assertEquals( 2, new Gauntlet().getCost());
		Assert.assertEquals( 0, new UnarmedStrike().getCost());
		
		Assert.assertEquals( 2, new Dagger().getCost());
		Assert.assertEquals( 2, new DaggerPunching().getCost());
		Assert.assertEquals( 5, new GauntletSpiked().getCost());
		Assert.assertEquals( 5, new MaceLight().getCost());
		Assert.assertEquals( 6, new Sickle().getCost());
		
		Assert.assertEquals( 0, new Club().getCost());
		Assert.assertEquals(12, new MaceHeavy().getCost());
		Assert.assertEquals( 8, new Morningstar().getCost());
		Assert.assertEquals( 1, new Shortspear().getCost());
		
		Assert.assertEquals( 5, new Longspear().getCost());
		Assert.assertEquals( 0, new Quartestaff().getCost());
		Assert.assertEquals( 2, new Spear().getCost());
		
		Assert.assertEquals(50, new CrossbowHeavy().getCost());
		Assert.assertEquals(35, new CrossbowLight().getCost());
		Assert.assertEquals( 5, new Dart().getCost());
		Assert.assertEquals( 1, new Javelin().getCost());
		Assert.assertEquals( 0, new Sling().getCost());
	}
	
}
