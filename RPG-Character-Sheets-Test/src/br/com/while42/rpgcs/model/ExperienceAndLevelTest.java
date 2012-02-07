package br.com.while42.rpgcs.model;

import junit.framework.Assert;
import android.test.AndroidTestCase;
import br.com.while42.rpgcs.model.classes.bonuses.ExperienceAndLevel;

public class ExperienceAndLevelTest extends AndroidTestCase {

	public void testGetExperienceBasic() throws Throwable {
		for (int level = ExperienceAndLevel.MIN_LEVEL; level <= ExperienceAndLevel.MAX_LEVEL; level++) {
			Assert.assertNotNull(new ExperienceAndLevel().getExperience(level));
		}
	}

	public void testGetExperienceBelowTheMinimumLevel() throws Throwable {
		try {
			new ExperienceAndLevel().getExperience(ExperienceAndLevel.MIN_LEVEL - 1);
		} catch (IllegalArgumentException expected) {
			assertTrue(expected instanceof IllegalArgumentException);
		}
	}

	public void testGetExperienceAboveTheMaxLevel() throws Throwable {
		try {
			new ExperienceAndLevel().getExperience(ExperienceAndLevel.MAX_LEVEL + 1);
		} catch (IllegalArgumentException expected) {
			assertTrue(expected instanceof IllegalArgumentException);
		}
	}

	public void testGetExperience() throws Throwable {
		Assert.assertEquals(     0, new ExperienceAndLevel().getExperience(1));
		Assert.assertEquals(  1000, new ExperienceAndLevel().getExperience(2));
		Assert.assertEquals(  3000, new ExperienceAndLevel().getExperience(3));
		Assert.assertEquals(  6000, new ExperienceAndLevel().getExperience(4));
		Assert.assertEquals( 10000, new ExperienceAndLevel().getExperience(5));
		Assert.assertEquals( 15000, new ExperienceAndLevel().getExperience(6));
		Assert.assertEquals( 21000, new ExperienceAndLevel().getExperience(7));
		Assert.assertEquals( 28000, new ExperienceAndLevel().getExperience(8));
		Assert.assertEquals( 36000, new ExperienceAndLevel().getExperience(9));
		Assert.assertEquals( 45000, new ExperienceAndLevel().getExperience(10));
		Assert.assertEquals( 55000, new ExperienceAndLevel().getExperience(11));
		Assert.assertEquals( 66000, new ExperienceAndLevel().getExperience(12));
		Assert.assertEquals( 78000, new ExperienceAndLevel().getExperience(13));
		Assert.assertEquals( 91000, new ExperienceAndLevel().getExperience(14));
		Assert.assertEquals(105000, new ExperienceAndLevel().getExperience(15));
		Assert.assertEquals(120000, new ExperienceAndLevel().getExperience(16));
		Assert.assertEquals(136000, new ExperienceAndLevel().getExperience(17));
		Assert.assertEquals(153000, new ExperienceAndLevel().getExperience(18));
		Assert.assertEquals(171000, new ExperienceAndLevel().getExperience(19));
		Assert.assertEquals(190000, new ExperienceAndLevel().getExperience(20));
	}

}
