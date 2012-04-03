package br.com.while42.rpgcs.model.equip.weapons.martial.ranged;

import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.HitDice;
import br.com.while42.rpgcs.model.HitDiceType;
import br.com.while42.rpgcs.model.equip.weapons.BasicWeapon;
import br.com.while42.rpgcs.model.equip.weapons.SizeWeapon;
import br.com.while42.rpgcs.model.equip.weapons.TypeWeapon;

public class LongbowComposite extends AbstractMartialRangedWeapon {
	
	private static BasicWeapon base;

	static {
		base = new BasicWeapon(R.string.weapon_martial_longbow_composite);
		base.setCost(100);
		base.setCritical(3);
		base.setRangeIncrement(33);
		base.setWeight(1.5);
		
		base.addDamage(SizeWeapon.SMALL, new HitDice(HitDiceType.d6));
		base.addDamage(SizeWeapon.MEDIUM, new HitDice(HitDiceType.d8));
		
		base.addType(TypeWeapon.PIERCING);
	}
	
	public LongbowComposite() {
		super(base);
	}
}
