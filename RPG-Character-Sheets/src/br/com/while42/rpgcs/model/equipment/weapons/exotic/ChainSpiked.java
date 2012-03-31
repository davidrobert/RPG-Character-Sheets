package br.com.while42.rpgcs.model.equipment.weapons.exotic;

import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.HitDice;
import br.com.while42.rpgcs.model.HitDiceType;
import br.com.while42.rpgcs.model.equipment.weapons.BasicWeapon;
import br.com.while42.rpgcs.model.equipment.weapons.SizeWeapon;
import br.com.while42.rpgcs.model.equipment.weapons.TypeWeapon;

public class ChainSpiked extends AbstractExoticWeapon {

	private static BasicWeapon base;

	static {
		base = new BasicWeapon(R.string.weapon_exotic_chain_spiked);
		base.setCost(25);
		base.setCritical(2);
		base.setRangeIncrement(0);
		base.setWeight(10);
		
		base.addDamage(SizeWeapon.SMALL, new HitDice(HitDiceType.d4));
		base.addDamage(SizeWeapon.MEDIUM, new HitDice(HitDiceType.d6));
		
		base.addType(TypeWeapon.SLASHING);
	}
	
	public ChainSpiked() {
		super(base);
	}
}
