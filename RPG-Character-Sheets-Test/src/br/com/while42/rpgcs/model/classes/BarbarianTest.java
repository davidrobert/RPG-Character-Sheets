package br.com.while42.rpgcs.model.classes;

import junit.framework.Assert;
import android.test.AndroidTestCase;
import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.HitDice;
import br.com.while42.rpgcs.model.HitDiceType;

public class BarbarianTest extends AndroidTestCase {

	public void testGetHitDice() {
		Assert.assertEquals(HitDiceType.d12, new Barbarian().getHitDice());
	}
	
	public void testGetCodeName() {
		Assert.assertEquals(R.string.class_barbarian, new Barbarian().getCodeName());
	}
	
	public void testGetStartingGold() {
		Assert.assertEquals(new HitDice(4, HitDiceType.d4, 0, 10), new Barbarian().getStartingGold());
	}
}
