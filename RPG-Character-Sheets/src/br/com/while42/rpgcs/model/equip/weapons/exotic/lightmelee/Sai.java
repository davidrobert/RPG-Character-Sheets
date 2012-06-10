package br.com.while42.rpgcs.model.equip.weapons.exotic.lightmelee;

import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.HitDice;
import br.com.while42.rpgcs.model.HitDiceType;
import br.com.while42.rpgcs.model.equip.weapons.BasicWeapon;
import br.com.while42.rpgcs.model.equip.weapons.SizeWeapon;
import br.com.while42.rpgcs.model.equip.weapons.TypeWeapon;

public class Sai extends AbstractExoticLightMelleWeapon {
	private static final long serialVersionUID = 1L;

	private static BasicWeapon base;

	static {
		base = new BasicWeapon(R.string.weapon_exotic_sai);
		base.setCost(1);
		base.setCritical(2);
		base.setRangeIncrement(10);
		base.setWeight(0.5);

		base.addDamage(SizeWeapon.SMALL, new HitDice(HitDiceType.d3));
		base.addDamage(SizeWeapon.MEDIUM, new HitDice(HitDiceType.d4));

		base.addType(TypeWeapon.BLUDGEONING);
	}

	public Sai() {
		super(base);
	}
}
