package br.com.while42.rpgcs.model;

import junit.framework.Assert;
import android.test.AndroidTestCase;

public class HitDiceTest extends AndroidTestCase {

	public void testToString1() throws Throwable {
		Assert.assertEquals("1d4", new HitDice(HitDiceType.d4).toString());
		Assert.assertEquals("1d6", new HitDice(HitDiceType.d6).toString());
		Assert.assertEquals("1d8", new HitDice(HitDiceType.d8).toString());
	}
	
	public void testToString2() throws Throwable {
		Assert.assertEquals("2d4", new HitDice(2, HitDiceType.d4).toString());
		Assert.assertEquals("1d6", new HitDice(1, HitDiceType.d6).toString());
		Assert.assertEquals("3d8", new HitDice(3, HitDiceType.d8).toString());
	}
	
	public void testToString3() throws Throwable {
		Assert.assertEquals("2d4-1", new HitDice(2, HitDiceType.d4, -1).toString());
		Assert.assertEquals("1d6+1", new HitDice(1, HitDiceType.d6, +1).toString());
		Assert.assertEquals("3d8", new HitDice(3, HitDiceType.d8, 0).toString());
	}
	
	public void testgetMaxValue() throws Throwable {		
		Assert.assertEquals(4, new HitDice(HitDiceType.d4).getMaxValue());
		Assert.assertEquals(6, new HitDice(HitDiceType.d6).getMaxValue());
		Assert.assertEquals(8, new HitDice(HitDiceType.d8).getMaxValue());
		
		Assert.assertEquals(2 * 4, new HitDice(2, HitDiceType.d4).getMaxValue());
		Assert.assertEquals(1 * 6, new HitDice(1, HitDiceType.d6).getMaxValue());
		Assert.assertEquals(3 * 8, new HitDice(3, HitDiceType.d8).getMaxValue());
		
		Assert.assertEquals(2 * 8 - 1, new HitDice(2, HitDiceType.d4, -1).getMaxValue());
		Assert.assertEquals(1 * 6 + 1, new HitDice(1, HitDiceType.d6, +1).getMaxValue());
		Assert.assertEquals(3 * 8 + 0, new HitDice(3, HitDiceType.d8, 0).getMaxValue());
	}

	public void testgetMinValue() throws Throwable {		
		Assert.assertEquals(1, new HitDice(HitDiceType.d4).getMinValue());
		Assert.assertEquals(1, new HitDice(HitDiceType.d6).getMinValue());
		Assert.assertEquals(1, new HitDice(HitDiceType.d8).getMinValue());
		
		Assert.assertEquals(2 * 1, new HitDice(2, HitDiceType.d4).getMinValue());
		Assert.assertEquals(1 * 1, new HitDice(1, HitDiceType.d6).getMinValue());
		Assert.assertEquals(3 * 1, new HitDice(3, HitDiceType.d8).getMinValue());
		
		Assert.assertEquals(2 * 1 - 1, new HitDice(2, HitDiceType.d4, -1).getMinValue());
		Assert.assertEquals(1 * 1 + 1, new HitDice(1, HitDiceType.d6, +1).getMinValue());
		Assert.assertEquals(3 * 1 + 0, new HitDice(3, HitDiceType.d8, 0).getMinValue());
	}	
	
}
