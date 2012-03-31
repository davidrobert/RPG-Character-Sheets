package br.com.while42.rpgcs.model.equipment.weapons.martial;

import lombok.Delegate;
import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.HitDice;
import br.com.while42.rpgcs.model.HitDiceType;
import br.com.while42.rpgcs.model.equipment.weapons.BasicWeapon;
import br.com.while42.rpgcs.model.equipment.weapons.SizeWeapon;
import br.com.while42.rpgcs.model.equipment.weapons.TypeWeapon;
import br.com.while42.rpgcs.model.equipment.weapons.Weapon;

public class AxeThrowing  {

	@Delegate(types=Weapon.class)
	private BasicWeapon base;
	
	public AxeThrowing() {
		base = new BasicWeapon(R.string.weapon_martial_axe_throwing);
		base.setCost(8);
		base.setCritical(2);
		base.setRangeIncrement(3);
		base.setWeight(1);
		
		base.addDamage(SizeWeapon.SMALL, new HitDice(HitDiceType.d4));
		base.addDamage(SizeWeapon.MEDIUM, new HitDice(HitDiceType.d6));
		
		base.addType(TypeWeapon.SLASHING);
	}		

}
