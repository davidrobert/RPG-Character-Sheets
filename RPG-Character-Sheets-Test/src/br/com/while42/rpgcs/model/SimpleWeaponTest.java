package br.com.while42.rpgcs.model;

import junit.framework.Assert;
import android.test.AndroidTestCase;
import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.weapons.SizeWeapon;
import br.com.while42.rpgcs.model.weapons.TypeWeapon;
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
	
	public void testGetCodeName() throws Throwable {		
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
	
	public void testGetCost() throws Throwable {		
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
	
	public void testGetDamageSmall() throws Throwable {
		Assert.assertEquals(new HitDice(HitDiceType.d2 ), new Gauntlet().getDamage(SizeWeapon.SMALL));
		Assert.assertEquals(new HitDice(HitDiceType.d2 ), new UnarmedStrike().getDamage(SizeWeapon.SMALL));
		
		Assert.assertEquals(new HitDice(HitDiceType.d3 ), new Dagger().getDamage(SizeWeapon.SMALL));
		Assert.assertEquals(new HitDice(HitDiceType.d3 ), new DaggerPunching().getDamage(SizeWeapon.SMALL));
		Assert.assertEquals(new HitDice(HitDiceType.d3 ), new GauntletSpiked().getDamage(SizeWeapon.SMALL));
		Assert.assertEquals(new HitDice(HitDiceType.d4 ), new MaceLight().getDamage(SizeWeapon.SMALL));
		Assert.assertEquals(new HitDice(HitDiceType.d4 ), new Sickle().getDamage(SizeWeapon.SMALL));
		
		Assert.assertEquals(new HitDice(HitDiceType.d4 ), new Club().getDamage(SizeWeapon.SMALL));
		Assert.assertEquals(new HitDice(HitDiceType.d6 ), new MaceHeavy().getDamage(SizeWeapon.SMALL));
		Assert.assertEquals(new HitDice(HitDiceType.d6 ), new Morningstar().getDamage(SizeWeapon.SMALL));
		Assert.assertEquals(new HitDice(HitDiceType.d4 ), new Shortspear().getDamage(SizeWeapon.SMALL));
		
		Assert.assertEquals(new HitDice(HitDiceType.d6 ), new Longspear().getDamage(SizeWeapon.SMALL));
		Assert.assertEquals(new HitDice(HitDiceType.d4 ), new Quartestaff().getDamage(SizeWeapon.SMALL));
		Assert.assertEquals(new HitDice(HitDiceType.d6 ), new Spear().getDamage(SizeWeapon.SMALL));
		
		Assert.assertEquals(new HitDice(HitDiceType.d8 ), new CrossbowHeavy().getDamage(SizeWeapon.SMALL));
		Assert.assertEquals(new HitDice(HitDiceType.d6 ), new CrossbowLight().getDamage(SizeWeapon.SMALL));
		Assert.assertEquals(new HitDice(HitDiceType.d3 ), new Dart().getDamage(SizeWeapon.SMALL));
		Assert.assertEquals(new HitDice(HitDiceType.d4 ), new Javelin().getDamage(SizeWeapon.SMALL));
		Assert.assertEquals(new HitDice(HitDiceType.d3 ), new Sling().getDamage(SizeWeapon.SMALL));
	}
	
	public void testGetDamage() throws Throwable {
		Assert.assertEquals(new HitDice(HitDiceType.d3 ), new Gauntlet().getDamage());
		Assert.assertEquals(new HitDice(HitDiceType.d3 ), new UnarmedStrike().getDamage());
		
		Assert.assertEquals(new HitDice(HitDiceType.d4 ), new Dagger().getDamage());
		Assert.assertEquals(new HitDice(HitDiceType.d4 ), new DaggerPunching().getDamage());
		Assert.assertEquals(new HitDice(HitDiceType.d4 ), new GauntletSpiked().getDamage());
		Assert.assertEquals(new HitDice(HitDiceType.d6 ), new MaceLight().getDamage());
		Assert.assertEquals(new HitDice(HitDiceType.d6 ), new Sickle().getDamage());
		
		Assert.assertEquals(new HitDice(HitDiceType.d6 ), new Club().getDamage());
		Assert.assertEquals(new HitDice(HitDiceType.d8 ), new MaceHeavy().getDamage());
		Assert.assertEquals(new HitDice(HitDiceType.d8 ), new Morningstar().getDamage());
		Assert.assertEquals(new HitDice(HitDiceType.d6 ), new Shortspear().getDamage());
		
		Assert.assertEquals(new HitDice(HitDiceType.d8 ), new Longspear().getDamage());
		Assert.assertEquals(new HitDice(HitDiceType.d6 ), new Quartestaff().getDamage());
		Assert.assertEquals(new HitDice(HitDiceType.d8 ), new Spear().getDamage());
		
		Assert.assertEquals(new HitDice(HitDiceType.d10), new CrossbowHeavy().getDamage());
		Assert.assertEquals(new HitDice(HitDiceType.d8 ), new CrossbowLight().getDamage());
		Assert.assertEquals(new HitDice(HitDiceType.d4 ), new Dart().getDamage());
		Assert.assertEquals(new HitDice(HitDiceType.d6 ), new Javelin().getDamage());
		Assert.assertEquals(new HitDice(HitDiceType.d4 ), new Sling().getDamage());
	}
	
	public void testGetCritical() throws Throwable {		
		Assert.assertEquals( 2, new Gauntlet().getCritical());
		Assert.assertEquals( 2, new UnarmedStrike().getCritical());
		
		Assert.assertEquals( 2, new Dagger().getCritical());
		Assert.assertEquals( 3, new DaggerPunching().getCritical());
		Assert.assertEquals( 2, new GauntletSpiked().getCritical());
		Assert.assertEquals( 2, new MaceLight().getCritical());
		Assert.assertEquals( 2, new Sickle().getCritical());
		
		Assert.assertEquals( 2, new Club().getCritical());
		Assert.assertEquals( 2, new MaceHeavy().getCritical());
		Assert.assertEquals( 2, new Morningstar().getCritical());
		Assert.assertEquals( 2, new Shortspear().getCritical());
		
		Assert.assertEquals( 3, new Longspear().getCritical());
		Assert.assertEquals( 2, new Quartestaff().getCritical());
		Assert.assertEquals( 3, new Spear().getCritical());
		
		Assert.assertEquals( 2, new CrossbowHeavy().getCritical());
		Assert.assertEquals( 2, new CrossbowLight().getCritical());
		Assert.assertEquals( 2, new Dart().getCritical());
		Assert.assertEquals( 2, new Javelin().getCritical());
		Assert.assertEquals( 2, new Sling().getCritical());
	}
	
	public void testGetRangeIncrement() throws Throwable {		
		Assert.assertEquals( 0, new Gauntlet().getRangeIncrement());
		Assert.assertEquals( 0, new UnarmedStrike().getRangeIncrement());
		
		Assert.assertEquals( 3, new Dagger().getRangeIncrement());
		Assert.assertEquals( 0, new DaggerPunching().getRangeIncrement());
		Assert.assertEquals( 0, new GauntletSpiked().getRangeIncrement());
		Assert.assertEquals( 0, new MaceLight().getRangeIncrement());
		Assert.assertEquals( 0, new Sickle().getRangeIncrement());
		
		Assert.assertEquals( 3, new Club().getRangeIncrement());
		Assert.assertEquals( 0, new MaceHeavy().getRangeIncrement());
		Assert.assertEquals( 0, new Morningstar().getRangeIncrement());
		Assert.assertEquals( 6, new Shortspear().getRangeIncrement());
		
		Assert.assertEquals( 0, new Longspear().getRangeIncrement());
		Assert.assertEquals( 0, new Quartestaff().getRangeIncrement());
		Assert.assertEquals( 6, new Spear().getRangeIncrement());
		
		Assert.assertEquals(36, new CrossbowHeavy().getRangeIncrement());
		Assert.assertEquals(24, new CrossbowLight().getRangeIncrement());
		Assert.assertEquals( 6, new Dart().getRangeIncrement());
		Assert.assertEquals( 9, new Javelin().getRangeIncrement());
		Assert.assertEquals(15, new Sling().getRangeIncrement());
	}
	
	public void testGetWeight() throws Throwable {		
		Assert.assertEquals( 0.5, new Gauntlet().getWeight());
		Assert.assertEquals( 0.0, new UnarmedStrike().getWeight());
		
		Assert.assertEquals( 0.5, new Dagger().getWeight());
		Assert.assertEquals( 0.5, new DaggerPunching().getWeight());
		Assert.assertEquals( 0.5, new GauntletSpiked().getWeight());
		Assert.assertEquals( 2.0, new MaceLight().getWeight());
		Assert.assertEquals( 1.0, new Sickle().getWeight());
		
		Assert.assertEquals( 1.5, new Club().getWeight());
		Assert.assertEquals( 4.0, new MaceHeavy().getWeight());
		Assert.assertEquals( 3.0, new Morningstar().getWeight());
		Assert.assertEquals( 1.5, new Shortspear().getWeight());
		
		Assert.assertEquals( 4.5, new Longspear().getWeight());
		Assert.assertEquals( 2.0, new Quartestaff().getWeight());
		Assert.assertEquals( 3.0, new Spear().getWeight());
		
		Assert.assertEquals( 4.0, new CrossbowHeavy().getWeight());
		Assert.assertEquals( 2.0, new CrossbowLight().getWeight());
		Assert.assertEquals(0.25, new Dart().getWeight());
		Assert.assertEquals( 1.0, new Javelin().getWeight());
		Assert.assertEquals( 0.0, new Sling().getWeight());
	}
	
	public void testGetType() throws Throwable {	
		Assert.assertEquals(   1, new Gauntlet().getType().size());
		Assert.assertEquals(true, new Gauntlet().getType().contains(TypeWeapon.BLUDGEONING));
		
		Assert.assertEquals(   1, new UnarmedStrike().getType().size());
		Assert.assertEquals(true, new UnarmedStrike().getType().contains(TypeWeapon.BLUDGEONING));

		// ---
		
		Assert.assertEquals(   2, new Dagger().getType().size());
		Assert.assertEquals(true, new Dagger().getType().contains(TypeWeapon.PIERCING));
		Assert.assertEquals(true, new Dagger().getType().contains(TypeWeapon.SLASHING));
		
		Assert.assertEquals(   1, new DaggerPunching().getType().size());
		Assert.assertEquals(true, new DaggerPunching().getType().contains(TypeWeapon.PIERCING));
		
		Assert.assertEquals(   1, new GauntletSpiked().getType().size());
		Assert.assertEquals(true, new GauntletSpiked().getType().contains(TypeWeapon.PIERCING));
		
		Assert.assertEquals(   1, new MaceLight().getType().size());
		Assert.assertEquals(true, new MaceLight().getType().contains(TypeWeapon.BLUDGEONING));
		
		Assert.assertEquals(   1, new Sickle().getType().size());
		Assert.assertEquals(true, new Sickle().getType().contains(TypeWeapon.SLASHING));
		
		// ---
		
		Assert.assertEquals(   1, new Club().getType().size());
		Assert.assertEquals(true, new Club().getType().contains(TypeWeapon.BLUDGEONING));
		
		Assert.assertEquals(   1, new MaceHeavy().getType().size());
		Assert.assertEquals(true, new MaceHeavy().getType().contains(TypeWeapon.BLUDGEONING));
		
		Assert.assertEquals(   2, new Morningstar().getType().size());
		Assert.assertEquals(true, new Morningstar().getType().contains(TypeWeapon.BLUDGEONING));
		Assert.assertEquals(true, new Morningstar().getType().contains(TypeWeapon.PIERCING));
		
		Assert.assertEquals(   1, new Shortspear().getType().size());
		Assert.assertEquals(true, new Shortspear().getType().contains(TypeWeapon.PIERCING));
		
		// ---
		
		Assert.assertEquals(   1, new Longspear().getType().size());
		Assert.assertEquals(true, new Longspear().getType().contains(TypeWeapon.PIERCING));
		
		Assert.assertEquals(   1, new Quartestaff().getType().size());
		Assert.assertEquals(true, new Quartestaff().getType().contains(TypeWeapon.BLUDGEONING));
		
		Assert.assertEquals(   1, new Spear().getType().size());
		Assert.assertEquals(true, new Spear().getType().contains(TypeWeapon.PIERCING));
		
		Assert.assertEquals(   1, new CrossbowHeavy().getType().size());
		Assert.assertEquals(true, new CrossbowHeavy().getType().contains(TypeWeapon.PIERCING));
		
		Assert.assertEquals(   1, new CrossbowLight().getType().size());
		Assert.assertEquals(true, new CrossbowLight().getType().contains(TypeWeapon.PIERCING));
		
		Assert.assertEquals(   1, new Dart().getType().size());
		Assert.assertEquals(true, new Dart().getType().contains(TypeWeapon.PIERCING));
		
		Assert.assertEquals(   1, new Javelin().getType().size());
		Assert.assertEquals(true, new Javelin().getType().contains(TypeWeapon.PIERCING));
		
		Assert.assertEquals(   1, new Sling().getType().size());
		Assert.assertEquals(true, new Sling().getType().contains(TypeWeapon.BLUDGEONING));		
	}
	
}
