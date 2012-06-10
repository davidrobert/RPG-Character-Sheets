package br.com.while42.rpgcs.model.equip.weapons.simple.unarmed;

import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.HitDice;
import br.com.while42.rpgcs.model.HitDiceType;
import br.com.while42.rpgcs.model.equip.weapons.BasicWeapon;
import br.com.while42.rpgcs.model.equip.weapons.SizeWeapon;
import br.com.while42.rpgcs.model.equip.weapons.TypeWeapon;

public class UnarmedStrike extends AbstractSimpleUnarmedWeapon {
	private static final long serialVersionUID = 1L;
	
	private static BasicWeapon base;

	static {
		base = new BasicWeapon(R.string.weapon_simple_unarmed_strike);
		base.setCost(0);
		base.setCritical(2);
		base.setRangeIncrement(0);
		base.setWeight(0);
		
		base.addDamage(SizeWeapon.SMALL, new HitDice(HitDiceType.d2));
		base.addDamage(SizeWeapon.MEDIUM, new HitDice(HitDiceType.d3));
		
		base.addType(TypeWeapon.BLUDGEONING);
	}
	
	public UnarmedStrike() {
		super(base);
	}
}
