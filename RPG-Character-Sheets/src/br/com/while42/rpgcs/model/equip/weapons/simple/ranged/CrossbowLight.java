package br.com.while42.rpgcs.model.equip.weapons.simple.ranged;

import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.HitDice;
import br.com.while42.rpgcs.model.HitDiceType;
import br.com.while42.rpgcs.model.equip.weapons.BasicWeapon;
import br.com.while42.rpgcs.model.equip.weapons.SizeWeapon;
import br.com.while42.rpgcs.model.equip.weapons.TypeWeapon;

public class CrossbowLight extends AbstractSimpleRangedWeapon {

	private static final BasicWeapon base;
	
	static {
		base = new BasicWeapon(R.string.weapon_simple_crossbow_light);
		base.setCost(35);
		base.setCritical(2);
		base.setRangeIncrement(24);
		base.setWeight(2);
		
		base.addDamage(SizeWeapon.SMALL, new HitDice(HitDiceType.d6));
		base.addDamage(SizeWeapon.MEDIUM, new HitDice(HitDiceType.d8));
		
		base.addType(TypeWeapon.PIERCING);
	}
	
	public CrossbowLight() {
		super(base);
	}
}
