package br.com.while42.rpgcs.model.equip.weapons.simple.lightmelee;

import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.HitDice;
import br.com.while42.rpgcs.model.HitDiceType;
import br.com.while42.rpgcs.model.equip.weapons.BasicWeapon;
import br.com.while42.rpgcs.model.equip.weapons.SizeWeapon;
import br.com.while42.rpgcs.model.equip.weapons.TypeWeapon;

public class MaceLight extends AbstractSimpleLightMeleeWeapon {
	private static final long serialVersionUID = 1L;

	private static BasicWeapon base;

	static {
		base = new BasicWeapon(R.string.weapon_simple_mace_light);
		base.setCost(5);
		base.setCritical(2);
		base.setRangeIncrement(0);
		base.setWeight(2d);
		
		base.addDamage(SizeWeapon.SMALL, new HitDice(HitDiceType.d4));
		base.addDamage(SizeWeapon.MEDIUM, new HitDice(HitDiceType.d6));
		
		base.addType(TypeWeapon.BLUDGEONING);
	}
	
	public MaceLight() {
		super(base);
	}
}
