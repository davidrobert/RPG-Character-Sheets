package br.com.while42.rpgcs.model.equip.weapons;

import junit.framework.Assert;
import android.test.AndroidTestCase;
import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.HitDice;
import br.com.while42.rpgcs.model.HitDiceType;
import br.com.while42.rpgcs.model.equip.weapons.CategorieEncumbranceWeapon;
import br.com.while42.rpgcs.model.equip.weapons.CategorieUsefulnessWeapon;
import br.com.while42.rpgcs.model.equip.weapons.CategorieWeapon;
import br.com.while42.rpgcs.model.equip.weapons.SizeWeapon;
import br.com.while42.rpgcs.model.equip.weapons.TypeWeapon;
import br.com.while42.rpgcs.model.equip.weapons.simple.lightmelee.Dagger;
import br.com.while42.rpgcs.model.equip.weapons.simple.lightmelee.DaggerPunching;
import br.com.while42.rpgcs.model.equip.weapons.simple.lightmelee.GauntletSpiked;
import br.com.while42.rpgcs.model.equip.weapons.simple.lightmelee.MaceLight;
import br.com.while42.rpgcs.model.equip.weapons.simple.lightmelee.Sickle;
import br.com.while42.rpgcs.model.equip.weapons.simple.onehandedmelee.Club;
import br.com.while42.rpgcs.model.equip.weapons.simple.onehandedmelee.MaceHeavy;
import br.com.while42.rpgcs.model.equip.weapons.simple.onehandedmelee.Morningstar;
import br.com.while42.rpgcs.model.equip.weapons.simple.onehandedmelee.Shortspear;
import br.com.while42.rpgcs.model.equip.weapons.simple.ranged.CrossbowHeavy;
import br.com.while42.rpgcs.model.equip.weapons.simple.ranged.CrossbowLight;
import br.com.while42.rpgcs.model.equip.weapons.simple.ranged.Dart;
import br.com.while42.rpgcs.model.equip.weapons.simple.ranged.Javelin;
import br.com.while42.rpgcs.model.equip.weapons.simple.ranged.Sling;
import br.com.while42.rpgcs.model.equip.weapons.simple.twohandedmelee.Longspear;
import br.com.while42.rpgcs.model.equip.weapons.simple.twohandedmelee.Quartestaff;
import br.com.while42.rpgcs.model.equip.weapons.simple.twohandedmelee.Spear;
import br.com.while42.rpgcs.model.equip.weapons.simple.unarmed.Gauntlet;
import br.com.while42.rpgcs.model.equip.weapons.simple.unarmed.UnarmedStrike;

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
		Assert.assertEquals( 2L, new Gauntlet().getCost().longValue());
		Assert.assertEquals( 0L, new UnarmedStrike().getCost().longValue());
		
		Assert.assertEquals( 2L, new Dagger().getCost().longValue());
		Assert.assertEquals( 2L, new DaggerPunching().getCost().longValue());
		Assert.assertEquals( 5L, new GauntletSpiked().getCost().longValue());
		Assert.assertEquals( 5L, new MaceLight().getCost().longValue());
		Assert.assertEquals( 6L, new Sickle().getCost().longValue());
		
		Assert.assertEquals( 0L, new Club().getCost().longValue());
		Assert.assertEquals(12L, new MaceHeavy().getCost().longValue());
		Assert.assertEquals( 8L, new Morningstar().getCost().longValue());
		Assert.assertEquals( 1L, new Shortspear().getCost().longValue());
		
		Assert.assertEquals( 5L, new Longspear().getCost().longValue());
		Assert.assertEquals( 0L, new Quartestaff().getCost().longValue());
		Assert.assertEquals( 2L, new Spear().getCost().longValue());
		
		Assert.assertEquals(50L, new CrossbowHeavy().getCost().longValue());
		Assert.assertEquals(35L, new CrossbowLight().getCost().longValue());
		Assert.assertEquals( 5L, new Dart().getCost().longValue());
		Assert.assertEquals( 1L, new Javelin().getCost().longValue());
		Assert.assertEquals( 0L, new Sling().getCost().longValue());
	}
	
	public void testGetDamageSmall() throws Throwable {
		Assert.assertEquals(new HitDice(HitDiceType.d2 ), new Gauntlet().getDamage(SizeWeapon.SMALL).get(0));
		Assert.assertEquals(new HitDice(HitDiceType.d2 ), new UnarmedStrike().getDamage(SizeWeapon.SMALL).get(0));
		
		Assert.assertEquals(new HitDice(HitDiceType.d3 ), new Dagger().getDamage(SizeWeapon.SMALL).get(0));
		Assert.assertEquals(new HitDice(HitDiceType.d3 ), new DaggerPunching().getDamage(SizeWeapon.SMALL).get(0));
		Assert.assertEquals(new HitDice(HitDiceType.d3 ), new GauntletSpiked().getDamage(SizeWeapon.SMALL).get(0));
		Assert.assertEquals(new HitDice(HitDiceType.d4 ), new MaceLight().getDamage(SizeWeapon.SMALL).get(0));
		Assert.assertEquals(new HitDice(HitDiceType.d4 ), new Sickle().getDamage(SizeWeapon.SMALL).get(0));
		
		Assert.assertEquals(new HitDice(HitDiceType.d4 ), new Club().getDamage(SizeWeapon.SMALL).get(0));
		Assert.assertEquals(new HitDice(HitDiceType.d6 ), new MaceHeavy().getDamage(SizeWeapon.SMALL).get(0));
		Assert.assertEquals(new HitDice(HitDiceType.d6 ), new Morningstar().getDamage(SizeWeapon.SMALL).get(0));
		Assert.assertEquals(new HitDice(HitDiceType.d4 ), new Shortspear().getDamage(SizeWeapon.SMALL).get(0));
		
		Assert.assertEquals(new HitDice(HitDiceType.d6 ), new Longspear().getDamage(SizeWeapon.SMALL).get(0));
		Assert.assertEquals(new HitDice(HitDiceType.d4 ), new Quartestaff().getDamage(SizeWeapon.SMALL).get(0));
		Assert.assertEquals(new HitDice(HitDiceType.d4 ), new Quartestaff().getDamage(SizeWeapon.SMALL).get(0));
		Assert.assertEquals(new HitDice(HitDiceType.d6 ), new Spear().getDamage(SizeWeapon.SMALL).get(0));
		
		Assert.assertEquals(new HitDice(HitDiceType.d8 ), new CrossbowHeavy().getDamage(SizeWeapon.SMALL).get(0));
		Assert.assertEquals(new HitDice(HitDiceType.d6 ), new CrossbowLight().getDamage(SizeWeapon.SMALL).get(0));
		Assert.assertEquals(new HitDice(HitDiceType.d3 ), new Dart().getDamage(SizeWeapon.SMALL).get(0));
		Assert.assertEquals(new HitDice(HitDiceType.d4 ), new Javelin().getDamage(SizeWeapon.SMALL).get(0));
		Assert.assertEquals(new HitDice(HitDiceType.d3 ), new Sling().getDamage(SizeWeapon.SMALL).get(0));
	}
	
	public void testGetDamage() throws Throwable {
		Assert.assertEquals(new HitDice(HitDiceType.d3 ), new Gauntlet().getDamage().get(0));
		Assert.assertEquals(new HitDice(HitDiceType.d3 ), new UnarmedStrike().getDamage().get(0));
		
		Assert.assertEquals(new HitDice(HitDiceType.d4 ), new Dagger().getDamage().get(0));
		Assert.assertEquals(new HitDice(HitDiceType.d4 ), new DaggerPunching().getDamage().get(0));
		Assert.assertEquals(new HitDice(HitDiceType.d4 ), new GauntletSpiked().getDamage().get(0));
		Assert.assertEquals(new HitDice(HitDiceType.d6 ), new MaceLight().getDamage().get(0));
		Assert.assertEquals(new HitDice(HitDiceType.d6 ), new Sickle().getDamage().get(0));
		
		Assert.assertEquals(new HitDice(HitDiceType.d6 ), new Club().getDamage().get(0));
		Assert.assertEquals(new HitDice(HitDiceType.d8 ), new MaceHeavy().getDamage().get(0));
		Assert.assertEquals(new HitDice(HitDiceType.d8 ), new Morningstar().getDamage().get(0));
		Assert.assertEquals(new HitDice(HitDiceType.d6 ), new Shortspear().getDamage().get(0));
		
		Assert.assertEquals(new HitDice(HitDiceType.d8 ), new Longspear().getDamage().get(0));
		Assert.assertEquals(new HitDice(HitDiceType.d6 ), new Quartestaff().getDamage().get(0));
		Assert.assertEquals(new HitDice(HitDiceType.d6 ), new Quartestaff().getDamage().get(1));
		Assert.assertEquals(new HitDice(HitDiceType.d8 ), new Spear().getDamage().get(0));
		
		Assert.assertEquals(new HitDice(HitDiceType.d10), new CrossbowHeavy().getDamage().get(0));
		Assert.assertEquals(new HitDice(HitDiceType.d8 ), new CrossbowLight().getDamage().get(0));
		Assert.assertEquals(new HitDice(HitDiceType.d4 ), new Dart().getDamage().get(0));
		Assert.assertEquals(new HitDice(HitDiceType.d6 ), new Javelin().getDamage().get(0));
		Assert.assertEquals(new HitDice(HitDiceType.d4 ), new Sling().getDamage().get(0));
	}
	
	public void testGetCritical() throws Throwable {		
		Assert.assertEquals( 2, new Gauntlet().getCritical().intValue());
		Assert.assertEquals( 2, new UnarmedStrike().getCritical().intValue());
		
		Assert.assertEquals( 2, new Dagger().getCritical().intValue());
		Assert.assertEquals( 3, new DaggerPunching().getCritical().intValue());
		Assert.assertEquals( 2, new GauntletSpiked().getCritical().intValue());
		Assert.assertEquals( 2, new MaceLight().getCritical().intValue());
		Assert.assertEquals( 2, new Sickle().getCritical().intValue());
		
		Assert.assertEquals( 2, new Club().getCritical().intValue());
		Assert.assertEquals( 2, new MaceHeavy().getCritical().intValue());
		Assert.assertEquals( 2, new Morningstar().getCritical().intValue());
		Assert.assertEquals( 2, new Shortspear().getCritical().intValue());
		
		Assert.assertEquals( 3, new Longspear().getCritical().intValue());
		Assert.assertEquals( 2, new Quartestaff().getCritical().intValue());
		Assert.assertEquals( 3, new Spear().getCritical().intValue());
		
		Assert.assertEquals( 2, new CrossbowHeavy().getCritical().intValue());
		Assert.assertEquals( 2, new CrossbowLight().getCritical().intValue());
		Assert.assertEquals( 2, new Dart().getCritical().intValue());
		Assert.assertEquals( 2, new Javelin().getCritical().intValue());
		Assert.assertEquals( 2, new Sling().getCritical().intValue());
	}
	
	public void testGetRangeIncrement() throws Throwable {		
		Assert.assertEquals( 0, new Gauntlet().getRangeIncrement().intValue());
		Assert.assertEquals( 0, new UnarmedStrike().getRangeIncrement().intValue());
		
		Assert.assertEquals( 3, new Dagger().getRangeIncrement().intValue());
		Assert.assertEquals( 0, new DaggerPunching().getRangeIncrement().intValue());
		Assert.assertEquals( 0, new GauntletSpiked().getRangeIncrement().intValue());
		Assert.assertEquals( 0, new MaceLight().getRangeIncrement().intValue());
		Assert.assertEquals( 0, new Sickle().getRangeIncrement().intValue());
		
		Assert.assertEquals( 3, new Club().getRangeIncrement().intValue());
		Assert.assertEquals( 0, new MaceHeavy().getRangeIncrement().intValue());
		Assert.assertEquals( 0, new Morningstar().getRangeIncrement().intValue());
		Assert.assertEquals( 6, new Shortspear().getRangeIncrement().intValue());
		
		Assert.assertEquals( 0, new Longspear().getRangeIncrement().intValue());
		Assert.assertEquals( 0, new Quartestaff().getRangeIncrement().intValue());
		Assert.assertEquals( 6, new Spear().getRangeIncrement().intValue());
		
		Assert.assertEquals(36, new CrossbowHeavy().getRangeIncrement().intValue());
		Assert.assertEquals(24, new CrossbowLight().getRangeIncrement().intValue());
		Assert.assertEquals( 6, new Dart().getRangeIncrement().intValue());
		Assert.assertEquals( 9, new Javelin().getRangeIncrement().intValue());
		Assert.assertEquals(15, new Sling().getRangeIncrement().intValue());
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
	
	public void testGetCategorie() throws Throwable {		
		Assert.assertEquals( CategorieWeapon.SIMPLE, new Gauntlet().getCategorie());
		Assert.assertEquals( CategorieWeapon.SIMPLE, new UnarmedStrike().getCategorie());
		
		Assert.assertEquals( CategorieWeapon.SIMPLE, new Dagger().getCategorie());
		Assert.assertEquals( CategorieWeapon.SIMPLE, new DaggerPunching().getCategorie());
		Assert.assertEquals( CategorieWeapon.SIMPLE, new GauntletSpiked().getCategorie());
		Assert.assertEquals( CategorieWeapon.SIMPLE, new MaceLight().getCategorie());
		Assert.assertEquals( CategorieWeapon.SIMPLE, new Sickle().getCategorie());
		
		Assert.assertEquals( CategorieWeapon.SIMPLE, new Club().getCategorie());
		Assert.assertEquals( CategorieWeapon.SIMPLE, new MaceHeavy().getCategorie());
		Assert.assertEquals( CategorieWeapon.SIMPLE, new Morningstar().getCategorie());
		Assert.assertEquals( CategorieWeapon.SIMPLE, new Shortspear().getCategorie());
		
		Assert.assertEquals( CategorieWeapon.SIMPLE, new Longspear().getCategorie());
		Assert.assertEquals( CategorieWeapon.SIMPLE, new Quartestaff().getCategorie());
		Assert.assertEquals( CategorieWeapon.SIMPLE, new Spear().getCategorie());
		
		Assert.assertEquals( CategorieWeapon.SIMPLE, new CrossbowHeavy().getCategorie());
		Assert.assertEquals( CategorieWeapon.SIMPLE, new CrossbowLight().getCategorie());
		Assert.assertEquals( CategorieWeapon.SIMPLE, new Dart().getCategorie());
		Assert.assertEquals( CategorieWeapon.SIMPLE, new Javelin().getCategorie());
		Assert.assertEquals( CategorieWeapon.SIMPLE, new Sling().getCategorie());
	}
	
	public void testGetCategorieUsefulness() throws Throwable {		
		//Assert.assertEquals( CategorieUsefulnessWeapon.MELEE, new Gauntlet().getCategorieUsefulness());
		//Assert.assertEquals( CategorieUsefulnessWeapon.MELEE, new UnarmedStrike().getCategorieUsefulness());
		
		Assert.assertEquals( CategorieUsefulnessWeapon.MELEE, new Dagger().getCategorieUsefulness());
		Assert.assertEquals( CategorieUsefulnessWeapon.MELEE, new DaggerPunching().getCategorieUsefulness());
		Assert.assertEquals( CategorieUsefulnessWeapon.MELEE, new GauntletSpiked().getCategorieUsefulness());
		Assert.assertEquals( CategorieUsefulnessWeapon.MELEE, new MaceLight().getCategorieUsefulness());
		Assert.assertEquals( CategorieUsefulnessWeapon.MELEE, new Sickle().getCategorieUsefulness());
		
		Assert.assertEquals( CategorieUsefulnessWeapon.MELEE, new Club().getCategorieUsefulness());
		Assert.assertEquals( CategorieUsefulnessWeapon.MELEE, new MaceHeavy().getCategorieUsefulness());
		Assert.assertEquals( CategorieUsefulnessWeapon.MELEE, new Morningstar().getCategorieUsefulness());
		Assert.assertEquals( CategorieUsefulnessWeapon.MELEE, new Shortspear().getCategorieUsefulness());
		
		Assert.assertEquals( CategorieUsefulnessWeapon.MELEE, new Longspear().getCategorieUsefulness());
		Assert.assertEquals( CategorieUsefulnessWeapon.MELEE, new Quartestaff().getCategorieUsefulness());
		Assert.assertEquals( CategorieUsefulnessWeapon.MELEE, new Spear().getCategorieUsefulness());
		
		Assert.assertEquals( CategorieUsefulnessWeapon.RANGED, new CrossbowHeavy().getCategorieUsefulness());
		Assert.assertEquals( CategorieUsefulnessWeapon.RANGED, new CrossbowLight().getCategorieUsefulness());
		Assert.assertEquals( CategorieUsefulnessWeapon.RANGED, new Dart().getCategorieUsefulness());
		Assert.assertEquals( CategorieUsefulnessWeapon.RANGED, new Javelin().getCategorieUsefulness());
		Assert.assertEquals( CategorieUsefulnessWeapon.RANGED, new Sling().getCategorieUsefulness());
	}
	
	public void testGetCategorieEncumbrance() throws Throwable {		
		//Assert.assertEquals( CategorieEncumbranceWeapon.LIGHT, new Gauntlet().getCategorieEncumbrance());
		//Assert.assertEquals( CategorieEncumbranceWeapon.LIGHT, new UnarmedStrike().getCategorieEncumbrance());
		
		Assert.assertEquals( CategorieEncumbranceWeapon.LIGHT, new Dagger().getCategorieEncumbrance());
		Assert.assertEquals( CategorieEncumbranceWeapon.LIGHT, new DaggerPunching().getCategorieEncumbrance());
		Assert.assertEquals( CategorieEncumbranceWeapon.LIGHT, new GauntletSpiked().getCategorieEncumbrance());
		Assert.assertEquals( CategorieEncumbranceWeapon.LIGHT, new MaceLight().getCategorieEncumbrance());
		Assert.assertEquals( CategorieEncumbranceWeapon.LIGHT, new Sickle().getCategorieEncumbrance());
		
		Assert.assertEquals( CategorieEncumbranceWeapon.ONE_HANDED, new Club().getCategorieEncumbrance());
		Assert.assertEquals( CategorieEncumbranceWeapon.ONE_HANDED, new MaceHeavy().getCategorieEncumbrance());
		Assert.assertEquals( CategorieEncumbranceWeapon.ONE_HANDED, new Morningstar().getCategorieEncumbrance());
		Assert.assertEquals( CategorieEncumbranceWeapon.ONE_HANDED, new Shortspear().getCategorieEncumbrance());
		
		Assert.assertEquals( CategorieEncumbranceWeapon.TWO_HANDED, new Longspear().getCategorieEncumbrance());
		Assert.assertEquals( CategorieEncumbranceWeapon.TWO_HANDED, new Quartestaff().getCategorieEncumbrance());
		Assert.assertEquals( CategorieEncumbranceWeapon.TWO_HANDED, new Spear().getCategorieEncumbrance());
		
		//Assert.assertEquals( CategorieEncumbranceWeapon.LIGHT, new CrossbowHeavy().getCategorieEncumbrance());
		//Assert.assertEquals( CategorieEncumbranceWeapon.LIGHT, new CrossbowLight().getCategorieEncumbrance());
		//Assert.assertEquals( CategorieEncumbranceWeapon.LIGHT, new Dart().getCategorieEncumbrance());
		//Assert.assertEquals( CategorieEncumbranceWeapon.LIGHT, new Javelin().getCategorieEncumbrance());
		//Assert.assertEquals( CategorieEncumbranceWeapon.LIGHT, new Sling().getCategorieEncumbrance());
	}
}
