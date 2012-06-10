package br.com.while42.rpgcs.model.equip.weapons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import br.com.while42.rpgcs.model.HitDice;

public class BasicWeapon implements Weapon {
	
	private final int codeName;
	
	private SizeWeapon size;
	
	private int cost = 0;
	private Map<SizeWeapon, List<HitDice>> damage = new HashMap<SizeWeapon, List<HitDice>>();
	private int critical = 0;
	private int rangeIncrement = 0;
	private double weight = 0.0;
	private Set<TypeWeapon> types = new HashSet<TypeWeapon>();
	private CategorieWeapon categorie = null;
	private CategorieUsefulnessWeapon categorieUsefulness = null;
	private CategorieEncumbranceWeapon categorieEncumbrance = null;

	public BasicWeapon(int codeName) {
		this.codeName = codeName;
		this.size = SizeWeapon.MEDIUM;
	}

	public BasicWeapon(int codeName, SizeWeapon size) {
		this.codeName = codeName;
		this.size = size;
	}
	
	@Override
	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public SizeWeapon getSize() {
		return size;
	}
	
	@Override
	public List<HitDice> getDamage() {
		return getDamage(size);
	}

	@Override
	public List<HitDice> getDamage(SizeWeapon size) {
		return Collections.unmodifiableList(damage.get(size));
	}
	
	public void addDamage(SizeWeapon size, HitDice hitDice) {
		if (!damage.containsKey(size)) {
			damage.put(size, new ArrayList<HitDice>());
		}
		damage.get(size).add(hitDice);
	}
	
	public void clearDamage() {
		damage.clear();
	}

	@Override
	public int getCritical() {
		return critical;
	}

	public void setCritical(int critical) {
		this.critical = critical;
	}

	@Override
	public int getRangeIncrement() {
		return rangeIncrement;
	}

	public void setRangeIncrement(int rangeIncrement) {
		this.rangeIncrement = rangeIncrement;
	}

	@Override
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public Set<TypeWeapon> getType() {
		return Collections.unmodifiableSet(types);
	}

	public void addType(TypeWeapon type) {
		types.add(type);
	}
	
	public void clearTypes() {
		types.clear();
	}

	@Override
	public int getCodeName() {
		return codeName;
	}
	
	public void setCategorie(CategorieWeapon categorie) {
		this.categorie = categorie;
	}

	@Override
	public CategorieWeapon getCategorie() {
		return categorie;
	}

	public void setCategorieUsefulness(CategorieUsefulnessWeapon categorieUsefulness) {
		this.categorieUsefulness = categorieUsefulness;
	}
	
	@Override
	public CategorieUsefulnessWeapon getCategorieUsefulness() {
		return categorieUsefulness;
	}

	public void setCategorieEncumbrance(
			CategorieEncumbranceWeapon categorieEncumbrance) {
		this.categorieEncumbrance = categorieEncumbrance;
	}
	
	@Override
	public CategorieEncumbranceWeapon getCategorieEncumbrance() {
		return categorieEncumbrance;
	}

}
