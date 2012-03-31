package br.com.while42.rpgcs.model.equipment.weapons.simple;

import java.util.List;
import java.util.Set;

import br.com.while42.rpgcs.model.HitDice;
import br.com.while42.rpgcs.model.equipment.weapons.BasicWeapon;
import br.com.while42.rpgcs.model.equipment.weapons.SizeWeapon;
import br.com.while42.rpgcs.model.equipment.weapons.TypeWeapon;
import br.com.while42.rpgcs.model.equipment.weapons.Weapon;
import br.com.while42.rpgcs.model.equipment.weapons.CategorieWeapon;


public abstract class AbstractSimpleWeapon implements Weapon {
	
	private BasicWeapon base;
	
	public AbstractSimpleWeapon(BasicWeapon base) {
		this.base = base;
	}
	
	@Override
	public final CategorieWeapon getCategorie() {
		return CategorieWeapon.SIMPLE;
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
