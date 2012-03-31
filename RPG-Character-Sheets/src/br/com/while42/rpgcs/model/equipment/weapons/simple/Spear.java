package br.com.while42.rpgcs.model.equipment.weapons.simple;

import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.HitDice;
import br.com.while42.rpgcs.model.HitDiceType;
import br.com.while42.rpgcs.model.equipment.weapons.BasicWeapon;
import br.com.while42.rpgcs.model.equipment.weapons.SizeWeapon;
import br.com.while42.rpgcs.model.equipment.weapons.TypeWeapon;

public class Spear extends AbstractSimpleWeapon {
	
	private static BasicWeapon base;

	static {
		base = new BasicWeapon(R.string.weapon_simple_spear);
		base.setCost(2);
		base.setCritical(3);
		base.setRangeIncrement(6);
		base.setWeight(3);
		
		base.addDamage(SizeWeapon.SMALL, new HitDice(HitDiceType.d6));
		base.addDamage(SizeWeapon.MEDIUM, new HitDice(HitDiceType.d8));
		
		base.addType(TypeWeapon.PIERCING);
	}
	
	public Spear() {
		super(base);
	}
}
