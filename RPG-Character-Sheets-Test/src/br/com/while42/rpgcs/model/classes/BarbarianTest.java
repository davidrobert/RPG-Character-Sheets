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
	
	public void testEquals() {
		Barbarian barbarian1 = new Barbarian();
		barbarian1.setClassLevel(1);
		
		Barbarian barbarian2 = new Barbarian();
		barbarian2.setClassLevel(1);
		
		assertEquals(barbarian1, barbarian2);
		
		Barbarian barbarian3 = new Barbarian();
		barbarian3.setClassLevel(5);
		
		assertFalse(barbarian1.equals(barbarian3));
		assertFalse(barbarian2.equals(barbarian3));
		
		Wizard wizard = new Wizard();
		wizard.setClassLevel(1);
		
		assertFalse(barbarian1.equals(wizard));
		assertFalse(barbarian2.equals(wizard));
		assertFalse(barbarian3.equals(wizard));
		
		Barbarian barbarian4 = new Barbarian();
		Wizard wizard2 = new Wizard();
		
		assertFalse(barbarian4.equals(wizard2));
	}
}
