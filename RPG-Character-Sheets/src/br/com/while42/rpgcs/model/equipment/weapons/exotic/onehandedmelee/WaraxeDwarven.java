package br.com.while42.rpgcs.model.equipment.weapons.exotic.onehandedmelee;

import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.HitDice;
import br.com.while42.rpgcs.model.HitDiceType;
import br.com.while42.rpgcs.model.equipment.weapons.BasicWeapon;
import br.com.while42.rpgcs.model.equipment.weapons.SizeWeapon;
import br.com.while42.rpgcs.model.equipment.weapons.TypeWeapon;
import br.com.while42.rpgcs.model.equipment.weapons.exotic.AbstractExoticWeapon;

public class WaraxeDwarven extends AbstractExoticWeapon {

	private static BasicWeapon base;

	static {
		base = new BasicWeapon(R.string.weapon_exotic_waraxe_dwarven);
		base.setCost(2);
		base.setCritical(2);
		base.setRangeIncrement(0);
		base.setWeight(1);

		base.addDamage(SizeWeapon.SMALL, new HitDice(HitDiceType.d4));
		base.addDamage(SizeWeapon.MEDIUM, new HitDice(HitDiceType.d6));

		base.addType(TypeWeapon.SLASHING);
	}

	public WaraxeDwarven() {
		super(base);
	}
}
