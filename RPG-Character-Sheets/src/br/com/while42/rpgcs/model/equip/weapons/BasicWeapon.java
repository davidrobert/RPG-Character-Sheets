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
	private static final long serialVersionUID = 1L;
	
	private final int codeName;
	private final int codeImage; 
	
	private SizeWeapon size;
	
	private Long cost = 0L;
	private Map<SizeWeapon, List<HitDice>> damage = new HashMap<SizeWeapon, List<HitDice>>();
	private Integer critical = 0;
	private Integer rangeIncrement = 0;
	private Double weight = 0.0;
	private Set<TypeWeapon> types = new HashSet<TypeWeapon>();
	private CategorieWeapon categorie = null;
	private CategorieUsefulnessWeapon categorieUsefulness = null;
	private CategorieEncumbranceWeapon categorieEncumbrance = null;
	private String description = "";
	private Boolean equiped = false;

	public BasicWeapon(BasicWeapon basic) {
		codeName = basic.codeName;
		codeImage = basic.codeImage;
		
		size = basic.size;
		
		cost = basic.cost;
		damage = new HashMap<SizeWeapon, List<HitDice>>(basic.damage);
		critical = basic.critical;
		rangeIncrement = basic.rangeIncrement;
		weight = basic.weight;
		types = new HashSet<TypeWeapon>(basic.types);
		categorie = basic.categorie;
		categorieUsefulness = basic.categorieUsefulness;
		categorieEncumbrance = basic.categorieEncumbrance;
		description = basic.description;
		equiped = basic.equiped;
	}
	
	public BasicWeapon(int codeName, int codeImage) {
		this.codeName = codeName;
		this.codeImage = codeImage;
		this.size = SizeWeapon.MEDIUM;
	}
	
	@Override
	public Long getCost() {
		return cost;
	}

	public void setCost(Long cost) {
		this.cost = cost;
	}

	@Override
	public void setSize(SizeWeapon size) {
		this.size = size;
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
	public Integer getCritical() {
		return critical;
	}

	public void setCritical(Integer critical) {
		this.critical = critical;
	}

	@Override
	public Integer getRangeIncrement() {
		return rangeIncrement;
	}

	public void setRangeIncrement(Integer rangeIncrement) {
		this.rangeIncrement = rangeIncrement;
	}

	@Override
	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	@Override
	public Set<TypeWeapon> getType() {
		return Collections.unmodifiableSet(types);
	}

	public void addType(TypeWeapon type) {
		this.types.add(type);
	}
	
	public void addType(Set<TypeWeapon> types) {
		this.types.addAll(types);
	}
	
	public void clearTypes() {
		types.clear();
	}

	@Override
	public int getCodeName() {
		return codeName;
	}
	
	@Override
	public int getCodeImage() {
		return codeImage;
	};
	
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

	public void setCategorieEncumbrance(CategorieEncumbranceWeapon categorieEncumbrance) {
		this.categorieEncumbrance = categorieEncumbrance;
	}
	
	@Override
	public CategorieEncumbranceWeapon getCategorieEncumbrance() {
		return categorieEncumbrance;
	}

	@Override
	public String getDescription() {
		return description;
	}
	
	@Override
	public void setEquiped(Boolean equiped) {
		this.equiped = equiped;
	}
	
	@Override
	public Boolean isEquiped() {
		return equiped;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;

		if (!(o instanceof BasicWeapon))
			return false;

		BasicWeapon bw = (BasicWeapon) o;
		
		return 	codeName == bw.codeName &&
				size.equals(bw.size) &&
				cost.equals(bw.cost) &&
				damage.equals(bw.damage) &&
				critical.equals(bw.critical) &&
				rangeIncrement.equals(bw.rangeIncrement) &&
				weight.equals(bw.weight) &&
				types.equals(bw.types) &&
				((categorie == null && bw.categorie == null) || categorie.equals(bw.categorie)) &&
				((categorieUsefulness == null && bw.categorieUsefulness == null) || categorieUsefulness.equals(bw.categorieUsefulness)) &&
				((categorieEncumbrance == null && bw.categorieEncumbrance == null) || categorieEncumbrance.equals(bw.categorieEncumbrance)) &&
				description.equals(bw.description) &&
				equiped.equals(bw.equiped);
	}
	
	@Override
	public int hashCode() {		
		return codeName + size.hashCode() + cost.intValue() + damage.hashCode() + critical.intValue() + rangeIncrement.intValue() + weight.intValue() + types.hashCode() + description.hashCode() + equiped.hashCode();
	}
}
