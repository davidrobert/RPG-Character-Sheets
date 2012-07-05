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
	
	public void testToString4() throws Throwable {
		Assert.assertEquals("2d4-1 x 2", new HitDice(2, HitDiceType.d4, -1, 2).toString());
		Assert.assertEquals("1d6+1 x 10", new HitDice(1, HitDiceType.d6, +1, 10).toString());
		Assert.assertEquals("3d8 x 100", new HitDice(3, HitDiceType.d8, 0, 100).toString());
	}
	
	public void testgetMaxValue() throws Throwable {		
		Assert.assertEquals(4, new HitDice(HitDiceType.d4).getMaxValue().intValue());
		Assert.assertEquals(6, new HitDice(HitDiceType.d6).getMaxValue().intValue());
		Assert.assertEquals(8, new HitDice(HitDiceType.d8).getMaxValue().intValue());
		
		Assert.assertEquals(2 * 4, new HitDice(2, HitDiceType.d4).getMaxValue().intValue());
		Assert.assertEquals(1 * 6, new HitDice(1, HitDiceType.d6).getMaxValue().intValue());
		Assert.assertEquals(3 * 8, new HitDice(3, HitDiceType.d8).getMaxValue().intValue());
		
		Assert.assertEquals(2 * 4 - 1, new HitDice(2, HitDiceType.d4, -1).getMaxValue().intValue());
		Assert.assertEquals(1 * 6 + 1, new HitDice(1, HitDiceType.d6, +1).getMaxValue().intValue());
		Assert.assertEquals(3 * 8 + 0, new HitDice(3, HitDiceType.d8, 0).getMaxValue().intValue());
	}
	
	public void testgetMaxValue2() throws Throwable {				
		Assert.assertEquals(2 * 4 * 2, new HitDice(2, HitDiceType.d4, 0, 2).getMaxValue().intValue());
		Assert.assertEquals(1 * 6 * 3, new HitDice(1, HitDiceType.d6, 0, 3).getMaxValue().intValue());
		Assert.assertEquals(3 * 8 * 4, new HitDice(3, HitDiceType.d8, 0, 4).getMaxValue().intValue());
		
		Assert.assertEquals((2 * 4 - 1) * 2, new HitDice(2, HitDiceType.d4, -1, 2).getMaxValue().intValue());
		Assert.assertEquals((1 * 6 + 1) * 3, new HitDice(1, HitDiceType.d6, +1, 3).getMaxValue().intValue());
		Assert.assertEquals((3 * 8 + 0) * 4, new HitDice(3, HitDiceType.d8, 0, 4).getMaxValue().intValue());
	}

	public void testgetMinValue() throws Throwable {		
		Assert.assertEquals(1, new HitDice(HitDiceType.d4).getMinValue().intValue());
		Assert.assertEquals(1, new HitDice(HitDiceType.d6).getMinValue().intValue());
		Assert.assertEquals(1, new HitDice(HitDiceType.d8).getMinValue().intValue());
		
		Assert.assertEquals(2 * 1, new HitDice(2, HitDiceType.d4).getMinValue().intValue());
		Assert.assertEquals(1 * 1, new HitDice(1, HitDiceType.d6).getMinValue().intValue());
		Assert.assertEquals(3 * 1, new HitDice(3, HitDiceType.d8).getMinValue().intValue());
		
		Assert.assertEquals(2 * 1 - 1, new HitDice(2, HitDiceType.d4, -1).getMinValue().intValue());
		Assert.assertEquals(1 * 1 + 1, new HitDice(1, HitDiceType.d6, +1).getMinValue().intValue());
		Assert.assertEquals(3 * 1 + 0, new HitDice(3, HitDiceType.d8, 0).getMinValue().intValue());
	}	
	
	public void testgetMinValue2() throws Throwable {		
		Assert.assertEquals(2 * 1 * 2, new HitDice(2, HitDiceType.d4, 0, 2).getMinValue().intValue());
		Assert.assertEquals(1 * 1 * 3, new HitDice(1, HitDiceType.d6, 0, 3).getMinValue().intValue());
		Assert.assertEquals(3 * 1 * 4, new HitDice(3, HitDiceType.d8, 0, 4).getMinValue().intValue());
		
		Assert.assertEquals((2 * 1 - 1) * 2, new HitDice(2, HitDiceType.d4, -1, 2).getMinValue().intValue());
		Assert.assertEquals((1 * 1 + 1) * 3, new HitDice(1, HitDiceType.d6, +1, 3).getMinValue().intValue());
		Assert.assertEquals((3 * 1 + 0) * 4, new HitDice(3, HitDiceType.d8, 0, 4).getMinValue().intValue());
	}
	
}
