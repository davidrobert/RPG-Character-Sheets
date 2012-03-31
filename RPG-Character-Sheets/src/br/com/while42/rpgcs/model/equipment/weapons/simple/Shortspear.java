package br.com.while42.rpgcs.model.equipment.weapons.simple;

import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.HitDice;
import br.com.while42.rpgcs.model.HitDiceType;
import br.com.while42.rpgcs.model.equipment.weapons.BasicWeapon;
import br.com.while42.rpgcs.model.equipment.weapons.SizeWeapon;
import br.com.while42.rpgcs.model.equipment.weapons.TypeWeapon;

public class Shortspear extends AbstractSimpleWeapon {

	private static BasicWeapon base;

	static {
		base = new BasicWeapon(R.string.weapon_simple_shortspear);
		base.setCost(1);
		base.setCritical(2);
		base.setRangeIncrement(6);
		base.setWeight(1.5);
		
		base.addDamage(SizeWeapon.SMALL, new HitDice(HitDiceType.d4));
		base.addDamage(SizeWeapon.MEDIUM, new HitDice(HitDiceType.d6));
		
		base.addType(TypeWeapon.PIERCING);
	}
	
	public Shortspear() {
		super(base);
	}
}
