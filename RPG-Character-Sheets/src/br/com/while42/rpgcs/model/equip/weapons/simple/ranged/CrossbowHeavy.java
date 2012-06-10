package br.com.while42.rpgcs.model.equip.weapons.simple.ranged;

import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.HitDice;
import br.com.while42.rpgcs.model.HitDiceType;
import br.com.while42.rpgcs.model.equip.weapons.BasicWeapon;
import br.com.while42.rpgcs.model.equip.weapons.SizeWeapon;
import br.com.while42.rpgcs.model.equip.weapons.TypeWeapon;

public class CrossbowHeavy extends AbstractSimpleRangedWeapon {
	private static final long serialVersionUID = 1L;

	private static BasicWeapon base;
	
	static {		
		base = new BasicWeapon(R.string.weapon_simple_crossbow_heavy);
		base.setCost(50);
		base.setCritical(2);
		base.setRangeIncrement(36);
		base.setWeight(4);
		
		base.addDamage(SizeWeapon.SMALL, new HitDice(HitDiceType.d8));
		base.addDamage(SizeWeapon.MEDIUM, new HitDice(HitDiceType.d10));
		
		base.addType(TypeWeapon.PIERCING);
	}
	
	public CrossbowHeavy() {	
		super(base);
	}
}
