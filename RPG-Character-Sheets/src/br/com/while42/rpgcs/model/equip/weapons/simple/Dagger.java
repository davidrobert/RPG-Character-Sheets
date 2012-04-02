package br.com.while42.rpgcs.model.equip.weapons.simple;

import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.HitDice;
import br.com.while42.rpgcs.model.HitDiceType;
import br.com.while42.rpgcs.model.equip.weapons.BasicWeapon;
import br.com.while42.rpgcs.model.equip.weapons.SizeWeapon;
import br.com.while42.rpgcs.model.equip.weapons.TypeWeapon;

public class Dagger extends AbstractSimpleWeapon {

	private static final BasicWeapon base;

	static {
		base = new BasicWeapon(R.string.weapon_simple_dagger);
		base.setCost(2);
		base.setCritical(2);
		base.setRangeIncrement(3);
		base.setWeight(0.5);

		base.addDamage(SizeWeapon.SMALL, new HitDice(HitDiceType.d3));
		base.addDamage(SizeWeapon.MEDIUM, new HitDice(HitDiceType.d4));

		base.addType(TypeWeapon.PIERCING);
		base.addType(TypeWeapon.SLASHING);
	}

	public Dagger() {
		super(base);
	}
}
