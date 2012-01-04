package br.com.while42.rpgcs.model;

import br.com.while42.rpgcs.model.modifiers.StrengthModifier;
import junit.framework.Assert;
import android.test.AndroidTestCase;

public class StrengthModifierTest extends AndroidTestCase {
	
	public void testGetNegative() throws Throwable {
		try {
			new StrengthModifier().get(-1);
		} catch (IllegalArgumentException expected) {
			assertTrue(expected instanceof IllegalArgumentException);
		}
	}

	public void testGetZero() throws Throwable {
		try {
			new StrengthModifier().get(0);
		} catch (IllegalArgumentException expected) {
			assertTrue(expected instanceof IllegalArgumentException);
		}
	}

	public void testGetBelowTheMinimum() throws Throwable {
		try {
			new StrengthModifier().get(StrengthModifier.MIN_STRENTH - 1);
		} catch (IllegalArgumentException expected) {
			assertTrue(expected instanceof IllegalArgumentException);
		}
	}
	
	public void testGetAboveTheMax() throws Throwable {
		try {
			new StrengthModifier().get(StrengthModifier.MAX_STRENTH + 1);	
		} catch (IllegalArgumentException expected) {
			assertTrue(expected instanceof IllegalArgumentException);
		}
	}
	
	public void testGetBasic() throws Throwable {
		Assert.assertEquals(0, new StrengthModifier().get(10));	
	}
	
	public void testGetRange() throws Throwable {
		Assert.assertEquals(-5, new StrengthModifier().get(1));
		Assert.assertEquals(-4, new StrengthModifier().get(2));
		Assert.assertEquals(-4, new StrengthModifier().get(3));
		Assert.assertEquals(-3, new StrengthModifier().get(4));
		Assert.assertEquals(-3, new StrengthModifier().get(5));
		Assert.assertEquals(-2, new StrengthModifier().get(6));
		Assert.assertEquals(-2, new StrengthModifier().get(7));
		Assert.assertEquals(-1, new StrengthModifier().get(8));
		Assert.assertEquals(-1, new StrengthModifier().get(9));
		Assert.assertEquals(0, new StrengthModifier().get(10));
		Assert.assertEquals(0, new StrengthModifier().get(11));
		Assert.assertEquals(1, new StrengthModifier().get(12));
		Assert.assertEquals(1, new StrengthModifier().get(13));
		Assert.assertEquals(2, new StrengthModifier().get(14));
		Assert.assertEquals(2, new StrengthModifier().get(15));
		Assert.assertEquals(3, new StrengthModifier().get(16));
		Assert.assertEquals(3, new StrengthModifier().get(17));
		Assert.assertEquals(4, new StrengthModifier().get(18));
		Assert.assertEquals(4, new StrengthModifier().get(19));
		Assert.assertEquals(5, new StrengthModifier().get(20));
		Assert.assertEquals(5, new StrengthModifier().get(21));
		Assert.assertEquals(6, new StrengthModifier().get(22));
		Assert.assertEquals(6, new StrengthModifier().get(23));
		Assert.assertEquals(7, new StrengthModifier().get(24));
		Assert.assertEquals(7, new StrengthModifier().get(25));
		Assert.assertEquals(8, new StrengthModifier().get(26));
		Assert.assertEquals(8, new StrengthModifier().get(27));
		Assert.assertEquals(9, new StrengthModifier().get(28));
		Assert.assertEquals(9, new StrengthModifier().get(29));
		Assert.assertEquals(10, new StrengthModifier().get(30));
		Assert.assertEquals(10, new StrengthModifier().get(31));
		Assert.assertEquals(11, new StrengthModifier().get(32));
		Assert.assertEquals(11, new StrengthModifier().get(33));
		Assert.assertEquals(12, new StrengthModifier().get(34));
		Assert.assertEquals(12, new StrengthModifier().get(35));
		Assert.assertEquals(13, new StrengthModifier().get(36));
		Assert.assertEquals(13, new StrengthModifier().get(37));
		Assert.assertEquals(14, new StrengthModifier().get(38));
		Assert.assertEquals(14, new StrengthModifier().get(39));
		Assert.assertEquals(15, new StrengthModifier().get(40));
		Assert.assertEquals(15, new StrengthModifier().get(41));
		Assert.assertEquals(16, new StrengthModifier().get(42));
		Assert.assertEquals(16, new StrengthModifier().get(43));
		Assert.assertEquals(17, new StrengthModifier().get(44));
		Assert.assertEquals(17, new StrengthModifier().get(45));
		Assert.assertEquals(18, new StrengthModifier().get(46));
		Assert.assertEquals(18, new StrengthModifier().get(47));				
	}
}
