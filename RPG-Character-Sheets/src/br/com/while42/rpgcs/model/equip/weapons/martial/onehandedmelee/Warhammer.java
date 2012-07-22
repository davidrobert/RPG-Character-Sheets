package br.com.while42.rpgcs.model.equip.weapons.martial.onehandedmelee;

import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.HitDice;
import br.com.while42.rpgcs.model.HitDiceType;
import br.com.while42.rpgcs.model.equip.weapons.BasicWeapon;
import br.com.while42.rpgcs.model.equip.weapons.SizeWeapon;
import br.com.while42.rpgcs.model.equip.weapons.TypeWeapon;

public class Warhammer extends AbstractMartialOneHandedMeleeWeapon {
	private static final long serialVersionUID = 1L;
	
	private static BasicWeapon base;

	static {
		base = new BasicWeapon(R.string.weapon_martial_warhammer, R.drawable.weapon_axe);
		base.setCost(12L);
		base.setCritical(3);
		base.setRangeIncrement(0);
		base.setWeight(2.5);
		
		base.addDamage(SizeWeapon.SMALL, new HitDice(HitDiceType.d6));
		base.addDamage(SizeWeapon.MEDIUM, new HitDice(HitDiceType.d8));
		
		base.addType(TypeWeapon.BLUDGEONING);
	}
	
	public Warhammer() {
		super(base);
	}
}
