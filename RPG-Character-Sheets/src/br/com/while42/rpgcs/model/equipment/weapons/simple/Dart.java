package br.com.while42.rpgcs.model.equipment.weapons.simple;

import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.HitDice;
import br.com.while42.rpgcs.model.HitDiceType;
import br.com.while42.rpgcs.model.equipment.weapons.BasicWeapon;
import br.com.while42.rpgcs.model.equipment.weapons.SizeWeapon;
import br.com.while42.rpgcs.model.equipment.weapons.TypeWeapon;

public class Dart extends AbstractSimpleWeapon {

	private static BasicWeapon base;

	static {
		base = new BasicWeapon(R.string.weapon_simple_dart);
		base.setCost(5);
		base.setCritical(2);
		base.setRangeIncrement(6);
		base.setWeight(0.25);
		
		base.addDamage(SizeWeapon.SMALL, new HitDice(HitDiceType.d3));
		base.addDamage(SizeWeapon.MEDIUM, new HitDice(HitDiceType.d4));
		
		base.addType(TypeWeapon.PIERCING);
	}
	
	public Dart() {
		super(base);
	}
}
