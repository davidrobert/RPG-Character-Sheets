package br.com.while42.rpgcs.model;

import junit.framework.Assert;
import android.test.AndroidTestCase;
import br.com.while42.rpgcs.model.abilities.modifiers.AbilityModifier;
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
	
	public void testGet() throws Throwable {
		

	}
}
