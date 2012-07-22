package br.com.while42.rpgcs.model.equip.weapons.exotic.onehandedmelee;

import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.HitDice;
import br.com.while42.rpgcs.model.HitDiceType;
import br.com.while42.rpgcs.model.equip.weapons.BasicWeapon;
import br.com.while42.rpgcs.model.equip.weapons.SizeWeapon;
import br.com.while42.rpgcs.model.equip.weapons.TypeWeapon;

public class SwordBastard extends AbstractExoticOneHandedMeleeWeapon {
	private static final long serialVersionUID = 1L;

	private static BasicWeapon base;

	static {
		base = new BasicWeapon(R.string.weapon_exotic_sword_bastard, R.drawable.weapon_axe);
		base.setCost(2L);
		base.setCritical(2);
		base.setRangeIncrement(0);
		base.setWeight(1d);

		base.addDamage(SizeWeapon.SMALL, new HitDice(HitDiceType.d4));
		base.addDamage(SizeWeapon.MEDIUM, new HitDice(HitDiceType.d6));

		base.addType(TypeWeapon.SLASHING);
	}

	public SwordBastard() {
		super(base);
	}
}
