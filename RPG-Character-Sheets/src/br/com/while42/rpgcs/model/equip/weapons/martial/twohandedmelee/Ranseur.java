package br.com.while42.rpgcs.model.equip.weapons.martial.twohandedmelee;

import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.HitDice;
import br.com.while42.rpgcs.model.HitDiceType;
import br.com.while42.rpgcs.model.equip.weapons.BasicWeapon;
import br.com.while42.rpgcs.model.equip.weapons.SizeWeapon;
import br.com.while42.rpgcs.model.equip.weapons.TypeWeapon;

public class Ranseur extends AbstractMartialTwoHandedMeleeWeapon {
	private static final long serialVersionUID = 1L;
	
	private static BasicWeapon base;

	static {
		base = new BasicWeapon(R.string.weapon_martial_ranseur);
		base.setCost(10L);
		base.setCritical(3);
		base.setRangeIncrement(0);
		base.setWeight(6d);
		
		base.addDamage(SizeWeapon.SMALL, new HitDice(1, HitDiceType.d6));
		base.addDamage(SizeWeapon.MEDIUM, new HitDice(2, HitDiceType.d4));
		
		base.addType(TypeWeapon.PIERCING);
	}
	
	public Ranseur() {
		super(base);
	}
}
