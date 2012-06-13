package br.com.while42.rpgcs.model.equip.weapons;

import java.util.List;
import java.util.Set;

import br.com.while42.rpgcs.model.HitDice;

public abstract class AbstractWeapon implements Weapon {
	private static final long serialVersionUID = 1L;

	private BasicWeapon base;

	public AbstractWeapon(BasicWeapon base) {
		this.base = base;
	}

	@Override
	public int getCodeName() {
		return base.getCodeName();
	}

	@Override
	public Integer getCost() {
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
	public Integer getCritical() {
		return base.getCritical();
	}

	@Override
	public Integer getRangeIncrement() {
		return base.getRangeIncrement();
	}

	@Override
	public Double getWeight() {
		return base.getWeight();
	}

	@Override
	public Set<TypeWeapon> getType() {
		return base.getType();
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;

		if (!(o instanceof AbstractWeapon))
			return false;

		AbstractWeapon aw = (AbstractWeapon) o;
		return base.equals(aw.base);
	}
	
	@Override
	public int hashCode() {		
		return base.hashCode();
	}
}
