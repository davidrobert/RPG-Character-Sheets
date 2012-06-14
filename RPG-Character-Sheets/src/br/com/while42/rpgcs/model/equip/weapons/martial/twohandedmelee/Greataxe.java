package br.com.while42.rpgcs.model.equip.weapons.martial.twohandedmelee;

import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.HitDice;
import br.com.while42.rpgcs.model.HitDiceType;
import br.com.while42.rpgcs.model.equip.weapons.BasicWeapon;
import br.com.while42.rpgcs.model.equip.weapons.SizeWeapon;
import br.com.while42.rpgcs.model.equip.weapons.TypeWeapon;

public class Greataxe extends AbstractMartialTwoHandedMeleeWeapon {
	private static final long serialVersionUID = 1L;
	
	private static BasicWeapon base;

	static {
		base = new BasicWeapon(R.string.weapon_martial_greataxe);
		base.setCost(20L);
		base.setCritical(3);
		base.setRangeIncrement(0);
		base.setWeight(6d);
		
		base.addDamage(SizeWeapon.SMALL, new HitDice(HitDiceType.d10));
		base.addDamage(SizeWeapon.MEDIUM, new HitDice(HitDiceType.d12));
		
		base.addType(TypeWeapon.SLASHING);
	}
	
	public Greataxe() {
		super(base);
	}
}
