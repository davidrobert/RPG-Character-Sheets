package br.com.while42.rpgcs.model.equip.weapons.exotic.ranged;

import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.HitDice;
import br.com.while42.rpgcs.model.HitDiceType;
import br.com.while42.rpgcs.model.character.TypeMunition;
import br.com.while42.rpgcs.model.equip.weapons.BasicWeapon;
import br.com.while42.rpgcs.model.equip.weapons.SizeWeapon;
import br.com.while42.rpgcs.model.equip.weapons.TypeWeapon;

public class Bolas extends AbstractExoticRangedWeapon {
	private static final long serialVersionUID = 1L;

	private static BasicWeapon base;

	static {
		base = new BasicWeapon(R.string.weapon_exotic_bolas);
		base.setCost(5L);
		base.setCritical(2);
		base.setRangeIncrement(3);
		base.setWeight(1d);
		
		base.addDamage(SizeWeapon.SMALL, new HitDice(HitDiceType.d3));
		base.addDamage(SizeWeapon.MEDIUM, new HitDice(HitDiceType.d4));
		
		base.addType(TypeWeapon.BLUDGEONING);
	}
	
	public Bolas() {
		super(base, TypeMunition.BULLETS);
	}
}
