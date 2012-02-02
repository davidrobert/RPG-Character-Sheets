package br.com.while42.rpgcs.model;

import junit.framework.Assert;
import android.test.AndroidTestCase;
import br.com.while42.rpgcs.model.bonuses.BaseSaveBonuses;

public class BaseSaveBonusesTest extends AndroidTestCase {
		
	public void testGetGoodNegative() throws Throwable {
		try {
			new BaseSaveBonuses().getGood(-1);
		} catch (IllegalArgumentException expected) {
			assertTrue(expected instanceof IllegalArgumentException);
		}
	}
	
	public void testGetPoorNegative() throws Throwable {
		try {
			new BaseSaveBonuses().getPoor(-1);
		} catch (IllegalArgumentException expected) {
			assertTrue(expected instanceof IllegalArgumentException);
		}
	}

	public void testGetGoodZero() throws Throwable {
		try {
			new BaseSaveBonuses().getGood(0);
		} catch (IllegalArgumentException expected) {
			assertTrue(expected instanceof IllegalArgumentException);
		}
	}
	
	public void testGetPoorZero() throws Throwable {
		try {
			new BaseSaveBonuses().getPoor(0);
		} catch (IllegalArgumentException expected) {
			assertTrue(expected instanceof IllegalArgumentException);
		}
	}

	public void testGetGoodBelowTheMinimum() throws Throwable {
		try {
			new BaseSaveBonuses().getGood(BaseSaveBonuses.MIN_LEVEL - 1);
		} catch (IllegalArgumentException expected) {
			assertTrue(expected instanceof IllegalArgumentException);
		}
	}
	
	public void testGetPoorBelowTheMinimum() throws Throwable {
		try {
			new BaseSaveBonuses().getPoor(BaseSaveBonuses.MIN_LEVEL - 1);
		} catch (IllegalArgumentException expected) {
			assertTrue(expected instanceof IllegalArgumentException);
		}
	}
	
	public void testGetGoodAboveTheMax() throws Throwable {
		try {
			new BaseSaveBonuses().getGood(BaseSaveBonuses.MAX_LEVEL + 1);	
		} catch (IllegalArgumentException expected) {
			assertTrue(expected instanceof IllegalArgumentException);
		}
	}
	
	public void testGetPoorAboveTheMax() throws Throwable {
		try {
			new BaseSaveBonuses().getPoor(BaseSaveBonuses.MAX_LEVEL + 1);	
		} catch (IllegalArgumentException expected) {
			assertTrue(expected instanceof IllegalArgumentException);
		}
	}
	
	public void testGetGoodBasic() throws Throwable {
		Assert.assertEquals(2, new BaseSaveBonuses().getGood(1));	
	}
	
	public void testGetPoorBasic() throws Throwable {
		Assert.assertEquals(0, new BaseSaveBonuses().getPoor(1));	
	}
	
	public void testGood() throws Throwable {
		Assert.assertEquals(+2, new BaseSaveBonuses().getGood(1));
		Assert.assertEquals(+3, new BaseSaveBonuses().getGood(2));
		Assert.assertEquals(+3, new BaseSaveBonuses().getGood(3));
		Assert.assertEquals(+4, new BaseSaveBonuses().getGood(4));
		Assert.assertEquals(+4, new BaseSaveBonuses().getGood(5));
		Assert.assertEquals(+5, new BaseSaveBonuses().getGood(6));
		Assert.assertEquals(+5, new BaseSaveBonuses().getGood(7));
		Assert.assertEquals(+6, new BaseSaveBonuses().getGood(8));
		Assert.assertEquals(+6, new BaseSaveBonuses().getGood(9));
		Assert.assertEquals(+7, new BaseSaveBonuses().getGood(10));
		Assert.assertEquals(+7, new BaseSaveBonuses().getGood(11));
		Assert.assertEquals(+8, new BaseSaveBonuses().getGood(12));
		Assert.assertEquals(+8, new BaseSaveBonuses().getGood(13));
		Assert.assertEquals(+9, new BaseSaveBonuses().getGood(14));
		Assert.assertEquals(+9, new BaseSaveBonuses().getGood(15));
		Assert.assertEquals(+10, new BaseSaveBonuses().getGood(16));
		Assert.assertEquals(+10, new BaseSaveBonuses().getGood(17));
		Assert.assertEquals(+11, new BaseSaveBonuses().getGood(18));
		Assert.assertEquals(+11, new BaseSaveBonuses().getGood(19));
		Assert.assertEquals(+12, new BaseSaveBonuses().getGood(20));
	}
	
	public void testPoor() throws Throwable {
		Assert.assertEquals(+0, new BaseSaveBonuses().getPoor(1));
		Assert.assertEquals(+0, new BaseSaveBonuses().getPoor(2));
		Assert.assertEquals(+1, new BaseSaveBonuses().getPoor(3));
		Assert.assertEquals(+1, new BaseSaveBonuses().getPoor(4));
		Assert.assertEquals(+1, new BaseSaveBonuses().getPoor(5));
		Assert.assertEquals(+2, new BaseSaveBonuses().getPoor(6));
		Assert.assertEquals(+2, new BaseSaveBonuses().getPoor(7));
		Assert.assertEquals(+2, new BaseSaveBonuses().getPoor(8));
		Assert.assertEquals(+3, new BaseSaveBonuses().getPoor(9));
		Assert.assertEquals(+3, new BaseSaveBonuses().getPoor(10));
		Assert.assertEquals(+3, new BaseSaveBonuses().getPoor(11));
		Assert.assertEquals(+4, new BaseSaveBonuses().getPoor(12));
		Assert.assertEquals(+4, new BaseSaveBonuses().getPoor(13));
		Assert.assertEquals(+4, new BaseSaveBonuses().getPoor(14));
		Assert.assertEquals(+5, new BaseSaveBonuses().getPoor(15));
		Assert.assertEquals(+5, new BaseSaveBonuses().getPoor(16));
		Assert.assertEquals(+5, new BaseSaveBonuses().getPoor(17));
		Assert.assertEquals(+6, new BaseSaveBonuses().getPoor(18));
		Assert.assertEquals(+6, new BaseSaveBonuses().getPoor(19));
		Assert.assertEquals(+6, new BaseSaveBonuses().getPoor(20));
	}
}
