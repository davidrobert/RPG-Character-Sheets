package br.com.while42.rpgcs.model.classes;

import br.com.while42.rpgcs.model.HitDice;
import br.com.while42.rpgcs.model.HitDiceType;
import junit.framework.Assert;
import android.test.AndroidTestCase;

public class AbstractRpgClassTest extends AndroidTestCase {

	private class ConcreteAbstractClass extends AbstractRpgClass {
		
		public ConcreteAbstractClass() { }
		public ConcreteAbstractClass(int classLevel) {
			super(classLevel);
		}

		public HitDiceType getHitDice() {
			return null;
		}

		public int getBaseAttackBonus() {
			return 0;
		}

		public int getFortSave() {
			return 0;
		}

		public int getRefSave() {
			return 0;
		}

		public int getWillSave() {
			return 0;
		}

		public HitDice getStartingGold() {
			return null;
		}

		public int getCodeName() {
			return 0;
		}
	}
	
	public void testAbstractRpgClass() {
		Assert.assertEquals(1, new ConcreteAbstractClass().getClassLevel());
		Assert.assertEquals(2, new ConcreteAbstractClass(2).getClassLevel());
	}
}
