package br.com.while42.rpgcs.model.equip.weapons.exotic;

import java.util.List;
import java.util.Set;

import br.com.while42.rpgcs.model.HitDice;
import br.com.while42.rpgcs.model.equip.weapons.BasicWeapon;
import br.com.while42.rpgcs.model.equip.weapons.CategorieEncumbranceWeapon;
import br.com.while42.rpgcs.model.equip.weapons.CategorieUsefulnessWeapon;
import br.com.while42.rpgcs.model.equip.weapons.CategorieWeapon;
import br.com.while42.rpgcs.model.equip.weapons.SizeWeapon;
import br.com.while42.rpgcs.model.equip.weapons.TypeWeapon;
import br.com.while42.rpgcs.model.equip.weapons.Weapon;

public abstract class AbstractExoticWeapon implements Weapon {

	private BasicWeapon base;

	public AbstractExoticWeapon(BasicWeapon base) {
		this.base = base;
	}

	@Override
	public final CategorieWeapon getCategorie() {
		return CategorieWeapon.EXOTIC;
	}
	
	@Override
	public CategorieUsefulnessWeapon getCategorieUsefulness() {
		return null;
	}
	
	@Override
	public CategorieEncumbranceWeapon getCategorieEncumbrance() {
		return null;
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
