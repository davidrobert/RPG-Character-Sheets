package br.com.while42.rpgcs.model.equip.weapons;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import android.test.AndroidTestCase;
import br.com.while42.rpgcs.model.HitDice;
import br.com.while42.rpgcs.model.HitDiceType;
import br.com.while42.rpgcs.model.equip.weapons.especial.BuilderEspecialWeapon;
import br.com.while42.rpgcs.model.equip.weapons.especial.EspecialWeapon;

public class EspecialWeaponTest extends AndroidTestCase {
	
	public void testBuilder() throws Throwable {		
		BuilderEspecialWeapon builder = new BuilderEspecialWeapon();
		EspecialWeapon especial = builder.setName("Arma Especial")
		                                 .setCost(10000L)
		                                 .setCritical(2)
		                                 .setRangeIncrement(0)
		                                 .setWeight(0.25)
		                                 .setSize(SizeWeapon.MEDIUM)
		                                 .setType(TypeWeapon.PIERCING)
		                                 .setDamage(new HitDice(2, HitDiceType.d6, +2))
		                                 .setCategorieEncumbrance(CategorieEncumbranceWeapon.TWO_HANDED)
		                                 .setCategorieUsefulness(CategorieUsefulnessWeapon.MELEE)
		                                 .toEspecialWeapon();
		
		Set<TypeWeapon> types = new HashSet<TypeWeapon>();
		types.add(TypeWeapon.PIERCING);
		
		List<HitDice> damages = new ArrayList<HitDice>();
		damages.add(new HitDice(2, HitDiceType.d6, +2));
		
		assertEquals("Arma Especial", especial.getName());
		assertEquals(10000L, especial.getCost().longValue());
		assertEquals(2, especial.getCritical().intValue());
		assertEquals(0, especial.getRangeIncrement().intValue());
		assertEquals(0.25, especial.getWeight());
		assertEquals(SizeWeapon.MEDIUM, especial.getSize());
		assertEquals(types, especial.getType());
		assertEquals(damages, especial.getDamage());
		assertEquals(CategorieEncumbranceWeapon.TWO_HANDED, especial.getCategorieEncumbrance());
		assertEquals(CategorieUsefulnessWeapon.MELEE, especial.getCategorieUsefulness());
		    
	}
	
	
}
