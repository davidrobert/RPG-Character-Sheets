package br.com.while42.rpgcs.model.equipment.weapons.simple;

import java.util.List;
import java.util.Set;

import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.HitDice;
import br.com.while42.rpgcs.model.HitDiceType;
import br.com.while42.rpgcs.model.equipment.weapons.BasicWeapon;
import br.com.while42.rpgcs.model.equipment.weapons.SizeWeapon;
import br.com.while42.rpgcs.model.equipment.weapons.TypeWeapon;

public class Club extends AbstractSimpleWeapon {

	private static final BasicWeapon base;
	
	static {
		base = new BasicWeapon(R.string.weapon_simple_club);
		base.setCost(0);
		base.setCritical(2);
		base.setRangeIncrement(3);
		base.setWeight(1.5);
		
		base.addDamage(SizeWeapon.SMALL, new HitDice(HitDiceType.d4));
		base.addDamage(SizeWeapon.MEDIUM, new HitDice(HitDiceType.d6));
		
		base.addType(TypeWeapon.BLUDGEONING);
	}	
	
	@Override
	public int getCodeName() {
		return base.getCodeName();
	}
	
	@Override
	public int getCost() {
		return base.getCost();
	}

	@Override
	public List<HitDice> getDamage() {
		return base.getDamage(SizeWeapon.MEDIUM);
	}

	@Override
	public List<HitDice> getDamage(SizeWeapon size) {
		return base.getDamage(size);
	}

	@Override
	public int getCritical() {
		return base.getCritical();
	}

	@Override
	public int getRangeIncrement() {
		return base.getRangeIncrement();
	}

	@Override
	public double getWeight() {
		return base.getWeight();
	}

	@Override
	public Set<TypeWeapon> getType() {
		return base.getType();
	}

}
