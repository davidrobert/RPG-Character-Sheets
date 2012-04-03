package br.com.while42.rpgcs.model;

import junit.framework.Assert;
import android.test.AndroidTestCase;
import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.equip.weapons.CategorieEncumbranceWeapon;
import br.com.while42.rpgcs.model.equip.weapons.CategorieUsefulnessWeapon;
import br.com.while42.rpgcs.model.equip.weapons.CategorieWeapon;
import br.com.while42.rpgcs.model.equip.weapons.SizeWeapon;
import br.com.while42.rpgcs.model.equip.weapons.TypeWeapon;
import br.com.while42.rpgcs.model.equip.weapons.exotic.lightmelee.Kama;

public class ExoticWeaponTest extends AndroidTestCase {
	
	public void testGetCodeName() throws Throwable {		
		Assert.assertEquals(R.string.weapon_exotic_kama,        new Kama().getCodeName());
		
	}
	
	public void testGetCost() throws Throwable {		
		Assert.assertEquals( 2, new Kama().getCost());
		
	}
	
	public void testGetDamageSmall() throws Throwable {
		Assert.assertEquals(new HitDice(HitDiceType.d4 ), new Kama().getDamage(SizeWeapon.SMALL).get(0));
		
	}
	
	public void testGetDamage() throws Throwable {
		Assert.assertEquals(new HitDice(HitDiceType.d6 ), new Kama().getDamage().get(0));
		
	}
	
	public void testGetCritical() throws Throwable {		
		Assert.assertEquals( 2, new Kama().getCritical());
		
	}
	
	public void testGetRangeIncrement() throws Throwable {		
		Assert.assertEquals( 0, new Kama().getRangeIncrement());
		
	}
	
	public void testGetWeight() throws Throwable {		
		Assert.assertEquals(   1, new Kama().getWeight());
		
	}
	
	public void testGetType() throws Throwable {	
		Assert.assertEquals(   1, new Kama().getType().size());
		Assert.assertEquals(true, new Kama().getType().contains(TypeWeapon.SLASHING));
		
		
	}
	
	public void testGetCategorie() throws Throwable {		
		Assert.assertEquals( CategorieWeapon.EXOTIC, new Kama().getCategorie());
		
	}
	
	public void testGetCategorieUsefulness() throws Throwable {		
		Assert.assertEquals( CategorieUsefulnessWeapon.MELEE, new Kama().getCategorieUsefulness());
		
	}
	
	public void testGetCategorieEncumbrance() throws Throwable {		
		Assert.assertEquals( CategorieEncumbranceWeapon.LIGHT, new Kama().getCategorieEncumbrance());
		
	}
}
