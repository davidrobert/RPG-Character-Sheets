package br.com.while42.rpgcs.model.equip.weapons.simple.onehandedmelee;

import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.HitDice;
import br.com.while42.rpgcs.model.HitDiceType;
import br.com.while42.rpgcs.model.equip.weapons.BasicWeapon;
import br.com.while42.rpgcs.model.equip.weapons.SizeWeapon;
import br.com.while42.rpgcs.model.equip.weapons.TypeWeapon;

public class Morningstar extends AbstractSimpleOneHandedMeleeWeapon {
	private static final long serialVersionUID = 1L;
	
	private static BasicWeapon base;

	static {
		base = new BasicWeapon(R.string.weapon_simple_morningstar, R.drawable.weapon_axe);
		base.setCost(8L);
		base.setCritical(2);
		base.setRangeIncrement(0);
		base.setWeight(3d);
		
		base.addDamage(SizeWeapon.SMALL, new HitDice(HitDiceType.d6));
		base.addDamage(SizeWeapon.MEDIUM, new HitDice(HitDiceType.d8));
		
		base.addType(TypeWeapon.BLUDGEONING);
		base.addType(TypeWeapon.PIERCING);
	}
	
	public Morningstar() {
		super(base);
	}
}
