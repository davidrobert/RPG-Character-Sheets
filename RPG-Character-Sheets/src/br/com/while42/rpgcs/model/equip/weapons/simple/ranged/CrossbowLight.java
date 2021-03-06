package br.com.while42.rpgcs.model.equip.weapons.simple.ranged;

import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.HitDice;
import br.com.while42.rpgcs.model.HitDiceType;
import br.com.while42.rpgcs.model.character.TypeMunition;
import br.com.while42.rpgcs.model.equip.weapons.BasicWeapon;
import br.com.while42.rpgcs.model.equip.weapons.SizeWeapon;
import br.com.while42.rpgcs.model.equip.weapons.TypeWeapon;

public class CrossbowLight extends AbstractSimpleRangedWeapon {
	private static final long serialVersionUID = 1L;

	private static final BasicWeapon base;
	
	static {
		base = new BasicWeapon(R.string.weapon_simple_crossbow_light, R.drawable.weapon_axe);
		base.setCost(35L);
		base.setCritical(2);
		base.setRangeIncrement(24);
		base.setWeight(2d);
		
		base.addDamage(SizeWeapon.SMALL, new HitDice(HitDiceType.d6));
		base.addDamage(SizeWeapon.MEDIUM, new HitDice(HitDiceType.d8));
		
		base.addType(TypeWeapon.PIERCING);
	}
	
	public CrossbowLight() {
		super(base, TypeMunition.BOLTS_OF_CROSSBOW_OF_HAND);
	}
}
