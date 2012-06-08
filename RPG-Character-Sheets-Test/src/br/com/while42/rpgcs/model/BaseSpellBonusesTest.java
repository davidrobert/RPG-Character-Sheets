package br.com.while42.rpgcs.model;

import junit.framework.Assert;
import android.test.AndroidTestCase;
import br.com.while42.rpgcs.model.abilities.modifier.AbilityModifier;
import br.com.while42.rpgcs.model.classes.bonuses.BaseSpellBonuses;
import br.com.while42.rpgcs.model.classes.bonuses.ExperienceAndLevel;

public class BaseSpellBonusesTest extends AndroidTestCase {	

	public void testGetBelowTheMinimumScore() throws Throwable {
		try {
			new BaseSpellBonuses().get(AbilityModifier.MIN_SCORE - 1, BaseSpellBonuses.MIN_SPELL_LEVEL);
		} catch (IllegalArgumentException expected) {
			assertTrue(expected instanceof IllegalArgumentException);
		}
	}
	
	public void testGetBelowTheMinimumSpellLevel() throws Throwable {
		try {
			new BaseSpellBonuses().get(AbilityModifier.MIN_SCORE, BaseSpellBonuses.MIN_SPELL_LEVEL - 1);
		} catch (IllegalArgumentException expected) {
			assertTrue(expected instanceof IllegalArgumentException);
		}
	}
	
	public void testGetAboveTheMaxScore() throws Throwable {
		try {
			new BaseSpellBonuses().get(ExperienceAndLevel.MAX_LEVEL + 1, BaseSpellBonuses.MAX_SPELL_LEVEL);	
		} catch (IllegalArgumentException expected) {
			assertTrue(expected instanceof IllegalArgumentException);
		}
	}
	
	public void testGetBasic() throws Throwable {
		Assert.assertEquals(0, new BaseSpellBonuses().get(AbilityModifier.MIN_SCORE, BaseSpellBonuses.MIN_SPELL_LEVEL));	
		Assert.assertEquals(1, new BaseSpellBonuses().get(12, 1));
	}
	
	public void testGetLevel1() throws Throwable {
		Assert.assertEquals(1, new BaseSpellBonuses().get(12, 1));
		Assert.assertEquals(1, new BaseSpellBonuses().get(13, 1));
		Assert.assertEquals(1, new BaseSpellBonuses().get(14, 1));
		Assert.assertEquals(1, new BaseSpellBonuses().get(15, 1));
		Assert.assertEquals(1, new BaseSpellBonuses().get(16, 1));
		Assert.assertEquals(1, new BaseSpellBonuses().get(17, 1));
		Assert.assertEquals(1, new BaseSpellBonuses().get(18, 1));
		Assert.assertEquals(1, new BaseSpellBonuses().get(19, 1));
		
		Assert.assertEquals(2, new BaseSpellBonuses().get(20, 1));
		Assert.assertEquals(2, new BaseSpellBonuses().get(21, 1));
		Assert.assertEquals(2, new BaseSpellBonuses().get(22, 1));
		Assert.assertEquals(2, new BaseSpellBonuses().get(23, 1));
		Assert.assertEquals(2, new BaseSpellBonuses().get(24, 1));
		Assert.assertEquals(2, new BaseSpellBonuses().get(25, 1));
		Assert.assertEquals(2, new BaseSpellBonuses().get(26, 1));
		Assert.assertEquals(2, new BaseSpellBonuses().get(27, 1));
		
		Assert.assertEquals(3, new BaseSpellBonuses().get(28, 1));
		Assert.assertEquals(3, new BaseSpellBonuses().get(29, 1));
		Assert.assertEquals(3, new BaseSpellBonuses().get(30, 1));
		Assert.assertEquals(3, new BaseSpellBonuses().get(31, 1));
		Assert.assertEquals(3, new BaseSpellBonuses().get(32, 1));
		Assert.assertEquals(3, new BaseSpellBonuses().get(33, 1));
		Assert.assertEquals(3, new BaseSpellBonuses().get(34, 1));
		Assert.assertEquals(3, new BaseSpellBonuses().get(35, 1));
		
		Assert.assertEquals(4, new BaseSpellBonuses().get(36, 1));
		Assert.assertEquals(4, new BaseSpellBonuses().get(37, 1));
		Assert.assertEquals(4, new BaseSpellBonuses().get(38, 1));
		Assert.assertEquals(4, new BaseSpellBonuses().get(39, 1));
		Assert.assertEquals(4, new BaseSpellBonuses().get(40, 1));
		Assert.assertEquals(4, new BaseSpellBonuses().get(41, 1));
		Assert.assertEquals(4, new BaseSpellBonuses().get(42, 1));
		Assert.assertEquals(4, new BaseSpellBonuses().get(43, 1));
		
		Assert.assertEquals(5, new BaseSpellBonuses().get(44, 1));
		Assert.assertEquals(5, new BaseSpellBonuses().get(45, 1));
	}
	
	public void testGetLevel2() throws Throwable {
		Assert.assertEquals(1, new BaseSpellBonuses().get(14, 2));
		Assert.assertEquals(1, new BaseSpellBonuses().get(15, 2));
		Assert.assertEquals(1, new BaseSpellBonuses().get(16, 2));
		Assert.assertEquals(1, new BaseSpellBonuses().get(17, 2));
		Assert.assertEquals(1, new BaseSpellBonuses().get(18, 2));
		Assert.assertEquals(1, new BaseSpellBonuses().get(19, 2));
		Assert.assertEquals(1, new BaseSpellBonuses().get(20, 2));
		Assert.assertEquals(1, new BaseSpellBonuses().get(21, 2));
		
		Assert.assertEquals(2, new BaseSpellBonuses().get(22, 2));
		Assert.assertEquals(2, new BaseSpellBonuses().get(23, 2));
		Assert.assertEquals(2, new BaseSpellBonuses().get(24, 2));
		Assert.assertEquals(2, new BaseSpellBonuses().get(25, 2));
		Assert.assertEquals(2, new BaseSpellBonuses().get(26, 2));
		Assert.assertEquals(2, new BaseSpellBonuses().get(27, 2));
		Assert.assertEquals(2, new BaseSpellBonuses().get(28, 2));
		Assert.assertEquals(2, new BaseSpellBonuses().get(29, 2));
		
		Assert.assertEquals(3, new BaseSpellBonuses().get(30, 2));
		Assert.assertEquals(3, new BaseSpellBonuses().get(31, 2));
		Assert.assertEquals(3, new BaseSpellBonuses().get(32, 2));
		Assert.assertEquals(3, new BaseSpellBonuses().get(33, 2));
		Assert.assertEquals(3, new BaseSpellBonuses().get(34, 2));
		Assert.assertEquals(3, new BaseSpellBonuses().get(35, 2));
		Assert.assertEquals(3, new BaseSpellBonuses().get(36, 2));
		Assert.assertEquals(3, new BaseSpellBonuses().get(37, 2));
		
		Assert.assertEquals(4, new BaseSpellBonuses().get(38, 2));
		Assert.assertEquals(4, new BaseSpellBonuses().get(39, 2));
		Assert.assertEquals(4, new BaseSpellBonuses().get(40, 2));
		Assert.assertEquals(4, new BaseSpellBonuses().get(41, 2));
		Assert.assertEquals(4, new BaseSpellBonuses().get(42, 2));
		Assert.assertEquals(4, new BaseSpellBonuses().get(43, 2));
		Assert.assertEquals(4, new BaseSpellBonuses().get(44, 2));
		Assert.assertEquals(4, new BaseSpellBonuses().get(45, 2));
	}
	
	public void testGetLevel9() throws Throwable {
		Assert.assertEquals(1, new BaseSpellBonuses().get(28, 9));
		Assert.assertEquals(1, new BaseSpellBonuses().get(29, 9));
		Assert.assertEquals(1, new BaseSpellBonuses().get(30, 9));
		Assert.assertEquals(1, new BaseSpellBonuses().get(31, 9));
		Assert.assertEquals(1, new BaseSpellBonuses().get(32, 9));
		Assert.assertEquals(1, new BaseSpellBonuses().get(33, 9));
		Assert.assertEquals(1, new BaseSpellBonuses().get(34, 9));
		Assert.assertEquals(1, new BaseSpellBonuses().get(35, 9));
		
		Assert.assertEquals(2, new BaseSpellBonuses().get(36, 9));
		Assert.assertEquals(2, new BaseSpellBonuses().get(37, 9));
		Assert.assertEquals(2, new BaseSpellBonuses().get(38, 9));
		Assert.assertEquals(2, new BaseSpellBonuses().get(39, 9));
		Assert.assertEquals(2, new BaseSpellBonuses().get(40, 9));
		Assert.assertEquals(2, new BaseSpellBonuses().get(41, 9));
		Assert.assertEquals(2, new BaseSpellBonuses().get(42, 9));
		Assert.assertEquals(2, new BaseSpellBonuses().get(43, 9));
		
		Assert.assertEquals(3, new BaseSpellBonuses().get(44, 9));
		Assert.assertEquals(3, new BaseSpellBonuses().get(45, 9));
	}
}
