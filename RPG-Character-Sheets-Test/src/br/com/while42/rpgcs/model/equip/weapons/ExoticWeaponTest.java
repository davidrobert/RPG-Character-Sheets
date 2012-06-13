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
import br.com.while42.rpgcs.model.equip.weapons.exotic.lightmelee.Kama;
import br.com.while42.rpgcs.model.equip.weapons.exotic.lightmelee.Nunchaku;
import br.com.while42.rpgcs.model.equip.weapons.exotic.lightmelee.Sai;
import br.com.while42.rpgcs.model.equip.weapons.exotic.lightmelee.Siangham;

public class ExoticWeaponTest extends AndroidTestCase {
	
	public void testGetCodeName() throws Throwable {		
		Assert.assertEquals(R.string.weapon_exotic_kama,     new Kama().getCodeName());
		Assert.assertEquals(R.string.weapon_exotic_nunchaku, new Nunchaku().getCodeName());
		Assert.assertEquals(R.string.weapon_exotic_sai,      new Sai().getCodeName());
		Assert.assertEquals(R.string.weapon_exotic_siangham, new Siangham().getCodeName());
	}
	
	public void testGetCost() throws Throwable {		
		Assert.assertEquals( 2, new Kama().getCost().intValue());
		Assert.assertEquals( 2, new Nunchaku().getCost().intValue());
		Assert.assertEquals( 1, new Sai().getCost().intValue());
		Assert.assertEquals( 3, new Siangham().getCost().intValue());
		
	}
	
	public void testGetDamageSmall() throws Throwable {
		Assert.assertEquals(new HitDice(HitDiceType.d4 ), new Kama().getDamage(SizeWeapon.SMALL).get(0));
		Assert.assertEquals(new HitDice(HitDiceType.d4 ), new Nunchaku().getDamage(SizeWeapon.SMALL).get(0));
		Assert.assertEquals(new HitDice(HitDiceType.d3 ), new Sai().getDamage(SizeWeapon.SMALL).get(0));
		Assert.assertEquals(new HitDice(HitDiceType.d4 ), new Siangham().getDamage(SizeWeapon.SMALL).get(0));
		
	}
	
	public void testGetDamage() throws Throwable {
		Assert.assertEquals(new HitDice(HitDiceType.d6 ), new Kama().getDamage().get(0));
		Assert.assertEquals(new HitDice(HitDiceType.d6 ), new Nunchaku().getDamage().get(0));
		Assert.assertEquals(new HitDice(HitDiceType.d4 ), new Sai().getDamage().get(0));
		Assert.assertEquals(new HitDice(HitDiceType.d6 ), new Siangham().getDamage().get(0));
		
		
	}
	
	public void testGetCritical() throws Throwable {		
		Assert.assertEquals( 2, new Kama().getCritical().intValue());
		Assert.assertEquals( 2, new Nunchaku().getCritical().intValue());
		Assert.assertEquals( 2, new Sai().getCritical().intValue());
		Assert.assertEquals( 2, new Siangham().getCritical().intValue());
		
	}
	
	public void testGetRangeIncrement() throws Throwable {		
		Assert.assertEquals( 0, new Kama().getRangeIncrement().intValue());
		Assert.assertEquals( 0, new Nunchaku().getRangeIncrement().intValue());
		Assert.assertEquals( 10, new Sai().getRangeIncrement().intValue());
		Assert.assertEquals( 0, new Siangham().getRangeIncrement().intValue());
		
	}
	
	public void testGetWeight() throws Throwable {		
		Assert.assertEquals( 1.0, new Kama().getWeight());
		Assert.assertEquals( 1.0, new Nunchaku().getWeight());
		Assert.assertEquals( 0.5, new Sai().getWeight());
		Assert.assertEquals( 0.5, new Siangham().getWeight());
		
	}
	
	public void testGetType() throws Throwable {	
		Assert.assertEquals(   1, new Kama().getType().size());
		Assert.assertEquals(true, new Kama().getType().contains(TypeWeapon.SLASHING));
		
		Assert.assertEquals(   1, new Nunchaku().getType().size());
		Assert.assertEquals(true, new Nunchaku().getType().contains(TypeWeapon.BLUDGEONING));
		
		Assert.assertEquals(   1, new Sai().getType().size());
		Assert.assertEquals(true, new Sai().getType().contains(TypeWeapon.BLUDGEONING));
		
		Assert.assertEquals(   1, new Siangham().getType().size());
		Assert.assertEquals(true, new Siangham().getType().contains(TypeWeapon.PIERCING));
	}
	
	public void testGetCategorie() throws Throwable {		
		Assert.assertEquals( CategorieWeapon.EXOTIC, new Kama().getCategorie());
		Assert.assertEquals( CategorieWeapon.EXOTIC, new Nunchaku().getCategorie());
		Assert.assertEquals( CategorieWeapon.EXOTIC, new Sai().getCategorie());
		Assert.assertEquals( CategorieWeapon.EXOTIC, new Siangham().getCategorie());
		
	}
	
	public void testGetCategorieUsefulness() throws Throwable {		
		Assert.assertEquals( CategorieUsefulnessWeapon.MELEE, new Kama().getCategorieUsefulness());
		Assert.assertEquals( CategorieUsefulnessWeapon.MELEE, new Nunchaku().getCategorieUsefulness());
		Assert.assertEquals( CategorieUsefulnessWeapon.MELEE, new Sai().getCategorieUsefulness());
		Assert.assertEquals( CategorieUsefulnessWeapon.MELEE, new Siangham().getCategorieUsefulness());
		
	}
	
	public void testGetCategorieEncumbrance() throws Throwable {		
		Assert.assertEquals( CategorieEncumbranceWeapon.LIGHT, new Kama().getCategorieEncumbrance());
		Assert.assertEquals( CategorieEncumbranceWeapon.LIGHT, new Nunchaku().getCategorieEncumbrance());
		Assert.assertEquals( CategorieEncumbranceWeapon.LIGHT, new Sai().getCategorieEncumbrance());
		Assert.assertEquals( CategorieEncumbranceWeapon.LIGHT, new Siangham().getCategorieEncumbrance());
		
	}
}
