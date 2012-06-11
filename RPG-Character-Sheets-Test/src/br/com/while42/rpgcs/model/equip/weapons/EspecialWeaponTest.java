package br.com.while42.rpgcs.model.equip.weapons;

import android.test.AndroidTestCase;
import br.com.while42.rpgcs.model.equip.weapons.especial.BuilderEspecialWeapon;
import br.com.while42.rpgcs.model.equip.weapons.especial.EspecialWeapon;

public class EspecialWeaponTest extends AndroidTestCase {
	
	public void testBuilder() throws Throwable {		
		BuilderEspecialWeapon builder = new BuilderEspecialWeapon();
		EspecialWeapon especial = builder.setName("Arma Especial")
		                                 .setCost(10000)
		                                 .setCritical(2)
		                                 .setRangeIncrement(0)
		                                 .setWeight(0.25)
		                                 .setSize(SizeWeapon.MEDIUM)
		                                 .setType(TypeWeapon.PIERCING)
		                                 .setCategorieEncumbrance(CategorieEncumbranceWeapon.TWO_HANDED)
		                                 .setCategorieUsefulness(CategorieUsefulnessWeapon.MELEE)
		                                 .toEspecialWeapon();
		
		assertEquals("Arma Especial", especial.getName());
		       
	}
	
	
}
