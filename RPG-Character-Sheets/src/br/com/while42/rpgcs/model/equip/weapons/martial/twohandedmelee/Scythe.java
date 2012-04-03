package br.com.while42.rpgcs.model.equip.weapons.martial.twohandedmelee;

import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.HitDice;
import br.com.while42.rpgcs.model.HitDiceType;
import br.com.while42.rpgcs.model.equip.weapons.BasicWeapon;
import br.com.while42.rpgcs.model.equip.weapons.SizeWeapon;
import br.com.while42.rpgcs.model.equip.weapons.TypeWeapon;

public class Scythe extends AbstractMartialTwoHandedMeleeWeapon {
	
	private static BasicWeapon base;

	static {
		base = new BasicWeapon(R.string.weapon_martial_scythe);
		base.setCost(18);
		base.setCritical(4);
		base.setRangeIncrement(0);
		base.setWeight(5);
		
		base.addDamage(SizeWeapon.SMALL, new HitDice(1, HitDiceType.d6));
		base.addDamage(SizeWeapon.MEDIUM, new HitDice(2, HitDiceType.d4));
		
		base.addType(TypeWeapon.PIERCING);
		base.addType(TypeWeapon.SLASHING);
	}
	
	public Scythe() {
		super(base);
	}
}
