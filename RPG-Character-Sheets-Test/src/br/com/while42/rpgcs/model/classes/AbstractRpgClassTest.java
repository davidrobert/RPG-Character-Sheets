package br.com.while42.rpgcs.model.classes;

import junit.framework.Assert;
import android.test.AndroidTestCase;
import br.com.while42.rpgcs.model.HitDice;
import br.com.while42.rpgcs.model.HitDiceType;

public class AbstractRpgClassTest extends AndroidTestCase {

	private class ConcreteAbstractClass extends AbstractRpgClass {
		private static final long serialVersionUID = 1L;

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
		Assert.assertEquals(1, new ConcreteAbstractClass().getClassLevel().intValue());
		Assert.assertEquals(2, new ConcreteAbstractClass(2).getClassLevel().intValue());
	}
}
