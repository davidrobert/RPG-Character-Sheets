package br.com.while42.rpgcs.model.equip.armor;

import android.test.AndroidTestCase;
import br.com.while42.rpgcs.model.equip.armor.especial.BuilderEspecialArmor;
import br.com.while42.rpgcs.model.equip.armor.especial.EspecialArmor;

public class EspecialArmorTest extends AndroidTestCase {
	
	public void testBuilder() throws Throwable {		
		BuilderEspecialArmor builder = new BuilderEspecialArmor();
		
		EspecialArmor armor = builder.setName("Armadura Especial")
			   .setCost(10000)
			   .setArmorBonus(10)
			   .setMaximumDexBonus(11)
			   .setArmorCheckPenalty(12)
			   .setArcaneSpellFailureChance(13)
			   .setSpeed(14)
			   .setWeight(15.0)
			   .toEspecialArmor();
			   
		assertEquals("Armadura Especial", armor.getName());
		assertEquals(10000, armor.getCost().intValue());
		assertEquals(10, armor.getArmorBonus().intValue());
		assertEquals(11, armor.getMaximumDexBonus().intValue());
		assertEquals(12, armor.getArmorCheckPenalty().intValue());
		assertEquals(13, armor.getArcaneSpellFailureChance().intValue());
		assertEquals(14, armor.getSpeed().intValue());
		assertEquals(15.0, armor.getWeight().doubleValue());
		
	}
	
	
}
