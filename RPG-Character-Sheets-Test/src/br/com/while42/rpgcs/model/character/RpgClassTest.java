package br.com.while42.rpgcs.model.character;

import android.test.AndroidTestCase;
import br.com.while42.rpgcs.model.classes.Barbarian;
import br.com.while42.rpgcs.model.classes.Monk;

public class RpgClassTest extends AndroidTestCase {

	public void testEqualsBasic() {
		RpgClass rc1 = new RpgClass();
		rc1.setExperience(1000L);
		
		RpgClass rc2 = new RpgClass();
		rc2.setExperience(1000L);
		
		assertEquals(rc1, rc2);
	}
	
	public void testEqualsWithSameClass() {
		Barbarian barbarian = new Barbarian();
		barbarian.setClassLevel(1);
		
		RpgClass rcA = new RpgClass();
		rcA.setExperience(1000L);
		rcA.add(barbarian);
		
		RpgClass rcB = new RpgClass();
		rcB.setExperience(1000L);
		rcB.add(barbarian);
		
		assertEquals(rcA, rcB);
	}
		
	public void testEqualsWithDiferentClass() {
		Barbarian barbarian1 = new Barbarian();
		barbarian1.setClassLevel(1);
		
		Barbarian barbarian2 = new Barbarian();
		barbarian2.setClassLevel(1);
		
		RpgClass rc1 = new RpgClass();
		rc1.setExperience(1000L);
		rc1.add(barbarian1);
		
		RpgClass rc2 = new RpgClass();
		rc2.setExperience(1000L);
		rc2.add(barbarian2);
		
		assertEquals(rc1, rc2);
	}
	
	public void testEquals() {
		
		RpgClass rc3 = new RpgClass();
		rc3.setExperience(1000L);
		rc3.add(new Barbarian());
		rc3.add(new Monk());
		
		RpgClass rc4 = new RpgClass();
		rc4.setExperience(1000L);
		rc4.add(new Monk());
		
		assertFalse(rc3.equals(rc4));
	}
}
