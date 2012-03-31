package br.com.while42.rpgcs.model.equipment.weapons.exotic;

import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.HitDice;
import br.com.while42.rpgcs.model.HitDiceType;
import br.com.while42.rpgcs.model.equipment.weapons.BasicWeapon;
import br.com.while42.rpgcs.model.equipment.weapons.SizeWeapon;
import br.com.while42.rpgcs.model.equipment.weapons.TypeWeapon;

public class AxeOrcDouble extends AbstractExoticWeapon {

	private static BasicWeapon base;

	static {
		base = new BasicWeapon(R.string.weapon_exotic_axe_orc_double);
		base.setCost(60);
		base.setCritical(3);
		base.setRangeIncrement(0);
		base.setWeight(12.5);
		
		base.addDamage(SizeWeapon.SMALL, new HitDice(HitDiceType.d6));
		base.addDamage(SizeWeapon.MEDIUM, new HitDice(HitDiceType.d8));
		
		base.addType(TypeWeapon.SLASHING);
	}
	
	public AxeOrcDouble() {
		super(base);
	}
}
