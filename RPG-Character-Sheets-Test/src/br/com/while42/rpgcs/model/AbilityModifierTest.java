package br.com.while42.rpgcs.model;

import junit.framework.Assert;
import android.test.AndroidTestCase;
import br.com.while42.rpgcs.model.abilities.modifier.AbilityModifier;

public class AbilityModifierTest extends AndroidTestCase {
	
	public void testGetNegative() throws Throwable {
		try {
			new AbilityModifier().get(-1);
		} catch (IllegalArgumentException expected) {
			assertTrue(expected instanceof IllegalArgumentException);
		}
	}

	public void testGetZero() throws Throwable {
		try {
			new AbilityModifier().get(0);
		} catch (IllegalArgumentException expected) {
			assertTrue(expected instanceof IllegalArgumentException);
		}
	}
	
	public void testGetBelowTheMinimum() throws Throwable {
		try {
			new AbilityModifier().get(AbilityModifier.MIN_SCORE - 1);
		} catch (IllegalArgumentException expected) {
			assertTrue(expected instanceof IllegalArgumentException);
		}
	}
	
	public void testGetBelowTheMaximum() throws Throwable {
		try {
			new AbilityModifier().get(AbilityModifier.MAX_SCORE + 1);
		} catch (IllegalArgumentException expected) {
			assertTrue(expected instanceof IllegalArgumentException);
		}
	}
	
	public void testGetBasic() throws Throwable {
		Assert.assertEquals(0, new AbilityModifier().get(10));	
	}
	
	public void testGetRange() throws Throwable {
		Assert.assertEquals(-5, new AbilityModifier().get(1));
		Assert.assertEquals(-4, new AbilityModifier().get(2));
		Assert.assertEquals(-4, new AbilityModifier().get(3));
		Assert.assertEquals(-3, new AbilityModifier().get(4));
		Assert.assertEquals(-3, new AbilityModifier().get(5));
		Assert.assertEquals(-2, new AbilityModifier().get(6));
		Assert.assertEquals(-2, new AbilityModifier().get(7));
		Assert.assertEquals(-1, new AbilityModifier().get(8));
		Assert.assertEquals(-1, new AbilityModifier().get(9));
		Assert.assertEquals(0, new AbilityModifier().get(10));
		Assert.assertEquals(0, new AbilityModifier().get(11));
		Assert.assertEquals(1, new AbilityModifier().get(12));
		Assert.assertEquals(1, new AbilityModifier().get(13));
		Assert.assertEquals(2, new AbilityModifier().get(14));
		Assert.assertEquals(2, new AbilityModifier().get(15));
		Assert.assertEquals(3, new AbilityModifier().get(16));
		Assert.assertEquals(3, new AbilityModifier().get(17));
		Assert.assertEquals(4, new AbilityModifier().get(18));
		Assert.assertEquals(4, new AbilityModifier().get(19));
		Assert.assertEquals(5, new AbilityModifier().get(20));
		Assert.assertEquals(5, new AbilityModifier().get(21));
		Assert.assertEquals(6, new AbilityModifier().get(22));
		Assert.assertEquals(6, new AbilityModifier().get(23));
		Assert.assertEquals(7, new AbilityModifier().get(24));
		Assert.assertEquals(7, new AbilityModifier().get(25));
		Assert.assertEquals(8, new AbilityModifier().get(26));
		Assert.assertEquals(8, new AbilityModifier().get(27));
		Assert.assertEquals(9, new AbilityModifier().get(28));
		Assert.assertEquals(9, new AbilityModifier().get(29));
		Assert.assertEquals(10, new AbilityModifier().get(30));
		Assert.assertEquals(10, new AbilityModifier().get(31));
		Assert.assertEquals(11, new AbilityModifier().get(32));
		Assert.assertEquals(11, new AbilityModifier().get(33));
		Assert.assertEquals(12, new AbilityModifier().get(34));
		Assert.assertEquals(12, new AbilityModifier().get(35));
		Assert.assertEquals(13, new AbilityModifier().get(36));
		Assert.assertEquals(13, new AbilityModifier().get(37));
		Assert.assertEquals(14, new AbilityModifier().get(38));
		Assert.assertEquals(14, new AbilityModifier().get(39));
		Assert.assertEquals(15, new AbilityModifier().get(40));
		Assert.assertEquals(15, new AbilityModifier().get(41));
		Assert.assertEquals(16, new AbilityModifier().get(42));
		Assert.assertEquals(16, new AbilityModifier().get(43));
		Assert.assertEquals(17, new AbilityModifier().get(44));
		Assert.assertEquals(17, new AbilityModifier().get(45));
		Assert.assertEquals(18, new AbilityModifier().get(46));
		Assert.assertEquals(18, new AbilityModifier().get(47));				
	}
}
