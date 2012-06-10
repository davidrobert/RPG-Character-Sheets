package br.com.while42.rpgcs.model.equip.weapons;

import java.util.List;
import java.util.Set;

import br.com.while42.rpgcs.model.HitDice;

public abstract class AbstractWeapon implements Weapon {

	private BasicWeapon base;

	public AbstractWeapon(BasicWeapon base) {
		this.base = base;
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
	public SizeWeapon getSize() {
		return base.getSize();
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
