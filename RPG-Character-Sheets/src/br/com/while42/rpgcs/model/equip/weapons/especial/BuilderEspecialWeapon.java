package br.com.while42.rpgcs.model.equip.weapons.especial;

import br.com.while42.rpgcs.model.equip.weapons.BasicWeapon;
import br.com.while42.rpgcs.model.equip.weapons.CategorieEncumbranceWeapon;
import br.com.while42.rpgcs.model.equip.weapons.CategorieUsefulnessWeapon;
import br.com.while42.rpgcs.model.equip.weapons.SizeWeapon;
import br.com.while42.rpgcs.model.equip.weapons.TypeWeapon;

public class BuilderEspecialWeapon {

	private String name;
	private int cost;
	private int critical;
	private int range;
	private double weight;
	private SizeWeapon size;
	private TypeWeapon type;
	private CategorieEncumbranceWeapon categorieEncunbrance;
	private CategorieUsefulnessWeapon categorieUsefulness;
	
	public BuilderEspecialWeaponWithName setName(String name) {
		return new BuilderEspecialWeaponWithName(name);
	}

	public class BuilderEspecialWeaponWithName {
		public BuilderEspecialWeaponWithName(String n) {
			name = n;
		}
		public BuilderEspecialWeaponWithNameCost setCost(int cost) {
			return new BuilderEspecialWeaponWithNameCost(cost);
		}
	}

	public class BuilderEspecialWeaponWithNameCost {
		public BuilderEspecialWeaponWithNameCost(int c) {
			cost = c;
		}
		public BuilderEspecialWeaponWithNameCostCritical setCritical(int critical) {
			return new BuilderEspecialWeaponWithNameCostCritical(critical);
		}
	}
	
	public class BuilderEspecialWeaponWithNameCostCritical {
		public BuilderEspecialWeaponWithNameCostCritical(int c) {
			critical = c;
		}
		public BuilderEspecialWeaponWithNameCostCriticalRange setRangeIncrement(int range) {
			return new BuilderEspecialWeaponWithNameCostCriticalRange(range);
		}
	}
	
	public class BuilderEspecialWeaponWithNameCostCriticalRange {
		public BuilderEspecialWeaponWithNameCostCriticalRange(int r) {
			range = r;
		}
		public BuilderEspecialWeaponWithNameCostCriticalRangeWeight setWeight(double weight) {
			return new BuilderEspecialWeaponWithNameCostCriticalRangeWeight(weight);
		}
	}
	
	public class BuilderEspecialWeaponWithNameCostCriticalRangeWeight {
		public BuilderEspecialWeaponWithNameCostCriticalRangeWeight(double w) {
			weight = w;
		}
		public BuilderEspecialWeaponWithNameCostCriticalRangeWeightSize setSize(SizeWeapon size) {
			return new BuilderEspecialWeaponWithNameCostCriticalRangeWeightSize(size);
		}
	}
	
	public class BuilderEspecialWeaponWithNameCostCriticalRangeWeightSize {
		public BuilderEspecialWeaponWithNameCostCriticalRangeWeightSize(SizeWeapon s) {
			size = s;
		}
		public BuilderEspecialWeaponWithNameCostCriticalRangeWeightSizeType setType(TypeWeapon type) {
			return new BuilderEspecialWeaponWithNameCostCriticalRangeWeightSizeType(type);
		}
	}
	
	public class BuilderEspecialWeaponWithNameCostCriticalRangeWeightSizeType {
		public BuilderEspecialWeaponWithNameCostCriticalRangeWeightSizeType(TypeWeapon t) {
			type = t;
		}
		public BuilderEspecialWeaponWithNameCostCriticalRangeWeightSizeTypeEncumbrance setCategorieEncumbrance(CategorieEncumbranceWeapon categorieEncunbrance) {
			return new BuilderEspecialWeaponWithNameCostCriticalRangeWeightSizeTypeEncumbrance(categorieEncunbrance);
		}
	}
	
	public class BuilderEspecialWeaponWithNameCostCriticalRangeWeightSizeTypeEncumbrance {
		public BuilderEspecialWeaponWithNameCostCriticalRangeWeightSizeTypeEncumbrance(CategorieEncumbranceWeapon c) {
			categorieEncunbrance = c;
		}
		
		public BuilderEspecialWeaponWithNameCostCriticalRangeWeightSizeTypeEncumbranceUsefulness setCategorieUsefulness(CategorieUsefulnessWeapon categorieUsefulness) {
			return new BuilderEspecialWeaponWithNameCostCriticalRangeWeightSizeTypeEncumbranceUsefulness(categorieUsefulness);
		}
	}
	
	public class BuilderEspecialWeaponWithNameCostCriticalRangeWeightSizeTypeEncumbranceUsefulness {
		public BuilderEspecialWeaponWithNameCostCriticalRangeWeightSizeTypeEncumbranceUsefulness(CategorieUsefulnessWeapon c) {
			categorieUsefulness = c;
		}

		public EspecialWeapon toEspecialWeapon() {

			BasicWeapon base = new BasicWeapon(0);
			
			base.setCost(cost);
			base.setCritical(critical);
			base.setRangeIncrement(range);
			base.setWeight(weight);
			//base.addDamage(size, damage);
			base.addType(type);
			base.setCategorieEncumbrance(categorieEncunbrance);
			base.setCategorieUsefulness(categorieUsefulness);
			
			EspecialWeapon especialWeapon = new EspecialWeapon(name, base);
			
			return especialWeapon;
		}
	}
}


