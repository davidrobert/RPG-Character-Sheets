package br.com.while42.rpgcs.model.equip.weapons.exotic.twohandedmelee;

import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.HitDice;
import br.com.while42.rpgcs.model.HitDiceType;
import br.com.while42.rpgcs.model.equip.weapons.BasicWeapon;
import br.com.while42.rpgcs.model.equip.weapons.SizeWeapon;
import br.com.while42.rpgcs.model.equip.weapons.TypeWeapon;
import br.com.while42.rpgcs.model.equip.weapons.exotic.AbstractExoticWeapon;

public class FlailSpiked extends AbstractExoticWeapon {

	private static BasicWeapon base;

	static {
		base = new BasicWeapon(R.string.weapon_exotic_flail_spiked);
		base.setCost(2);
		base.setCritical(2);
		base.setRangeIncrement(0);
		base.setWeight(1);

		base.addDamage(SizeWeapon.SMALL, new HitDice(HitDiceType.d4));
		base.addDamage(SizeWeapon.MEDIUM, new HitDice(HitDiceType.d6));

		base.addType(TypeWeapon.SLASHING);
	}

	public FlailSpiked() {
		super(base);
	}
}
