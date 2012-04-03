package br.com.while42.rpgcs.model.equip.weapons.simple.lightmelee;

import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.HitDice;
import br.com.while42.rpgcs.model.HitDiceType;
import br.com.while42.rpgcs.model.equip.weapons.BasicWeapon;
import br.com.while42.rpgcs.model.equip.weapons.SizeWeapon;
import br.com.while42.rpgcs.model.equip.weapons.TypeWeapon;

public class DaggerPunching extends AbstractSimpleLightMeleeWeapon {

	private static BasicWeapon base;

	static {
		base = new BasicWeapon(R.string.weapon_simple_dagger_punching);
		base.setCost(2);
		base.setCritical(3);
		base.setRangeIncrement(0);
		base.setWeight(0.5);
		
		base.addDamage(SizeWeapon.SMALL, new HitDice(HitDiceType.d3));
		base.addDamage(SizeWeapon.MEDIUM, new HitDice(HitDiceType.d4));
		
		base.addType(TypeWeapon.PIERCING);
	}
	
	public DaggerPunching() {
		super(base);
	}
}
