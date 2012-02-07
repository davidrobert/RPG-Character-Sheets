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

}
