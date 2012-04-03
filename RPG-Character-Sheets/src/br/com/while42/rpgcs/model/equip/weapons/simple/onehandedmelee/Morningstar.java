package br.com.while42.rpgcs.model.equip.weapons.simple.onehandedmelee;

import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.HitDice;
import br.com.while42.rpgcs.model.HitDiceType;
import br.com.while42.rpgcs.model.equip.weapons.BasicWeapon;
import br.com.while42.rpgcs.model.equip.weapons.SizeWeapon;
import br.com.while42.rpgcs.model.equip.weapons.TypeWeapon;

public class Morningstar extends AbstractSimpleOneHandedMeleeWeapon {
	
	private static BasicWeapon base;

	static {
		base = new BasicWeapon(R.string.weapon_simple_morningstar);
		base.setCost(8);
		base.setCritical(2);
		base.setRangeIncrement(0);
		base.setWeight(3);
		
		base.addDamage(SizeWeapon.SMALL, new HitDice(HitDiceType.d6));
		base.addDamage(SizeWeapon.MEDIUM, new HitDice(HitDiceType.d8));
		
		base.addType(TypeWeapon.BLUDGEONING);
		base.addType(TypeWeapon.PIERCING);
	}
	
	public Morningstar() {
		super(base);
	}
}
