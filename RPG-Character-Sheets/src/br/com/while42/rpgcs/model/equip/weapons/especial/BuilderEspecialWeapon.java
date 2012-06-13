package br.com.while42.rpgcs.model.equip.weapons.especial;

import java.util.HashSet;
import java.util.Set;

import br.com.while42.rpgcs.model.HitDice;
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
	private HitDice damage;
	private Set<TypeWeapon> types = new HashSet<TypeWeapon>();;
	private CategorieEncumbranceWeapon categorieEncunbrance;
	private CategorieUsefulnessWeapon categorieUsefulness;
	
	public BuilderEspecialWeaponWithName setName(String name) {
		return new BuilderEspecialWeaponWithName(name);
	}

	public class BuilderEspecialWeaponWithName {
		private BuilderEspecialWeaponWithName(String n) {
			name = n;
		}
		public BuilderEspecialWeaponWithCost setCost(int cost) {
			return new BuilderEspecialWeaponWithCost(cost);
		}
	}

	public class BuilderEspecialWeaponWithCost {
		private BuilderEspecialWeaponWithCost(int c) {
			cost = c;
		}
		public BuilderEspecialWeaponWithCritical setCritical(int critical) {
			return new BuilderEspecialWeaponWithCritical(critical);
		}
	}
	
	public class BuilderEspecialWeaponWithCritical {
		private BuilderEspecialWeaponWithCritical(int c) {
			critical = c;
		}
		public BuilderEspecialWeaponWithRange setRangeIncrement(int range) {
			return new BuilderEspecialWeaponWithRange(range);
		}
	}
	
	public class BuilderEspecialWeaponWithRange {
		private BuilderEspecialWeaponWithRange(int r) {
			range = r;
		}
		public BuilderEspecialWeaponWithWeight setWeight(double weight) {
			return new BuilderEspecialWeaponWithWeight(weight);
		}
	}
	
	public class BuilderEspecialWeaponWithWeight {
		private BuilderEspecialWeaponWithWeight(double w) {
			weight = w;
		}
		public BuilderEspecialWeaponWithSize setSize(SizeWeapon size) {
			return new BuilderEspecialWeaponWithSize(size);
		}
	}
	
	public class BuilderEspecialWeaponWithSize {
		private BuilderEspecialWeaponWithSize(SizeWeapon s) {
			size = s;
		}
		public BuilderEspecialWeaponWithType setType(TypeWeapon type) {
			return new BuilderEspecialWeaponWithType(type);
		}
		public BuilderEspecialWeaponWithType setType(Set<TypeWeapon> types) {
			return new BuilderEspecialWeaponWithType(types);
		}
	}
	
	public class BuilderEspecialWeaponWithType {
		private BuilderEspecialWeaponWithType(TypeWeapon t) {
			types.add(t);
		}
		public BuilderEspecialWeaponWithType(Set<TypeWeapon> ts) {
			types.addAll(ts);
		}
		public BuilderEspecialWeaponWithDamage setDamage(HitDice damage) {
			return new BuilderEspecialWeaponWithDamage(damage);
		}
	}
	
	public class BuilderEspecialWeaponWithDamage {
		private BuilderEspecialWeaponWithDamage(HitDice d) {
			damage = d;
		}
		public BuilderEspecialWeaponWithEncumbrance setCategorieEncumbrance(CategorieEncumbranceWeapon categorieEncunbrance) {
			return new BuilderEspecialWeaponWithEncumbrance(categorieEncunbrance);
		}
	}
	
	public class BuilderEspecialWeaponWithEncumbrance {
		private BuilderEspecialWeaponWithEncumbrance(CategorieEncumbranceWeapon c) {
			categorieEncunbrance = c;
		}
		public BuilderEspecialWeaponWithUsefulness setCategorieUsefulness(CategorieUsefulnessWeapon categorieUsefulness) {
			return new BuilderEspecialWeaponWithUsefulness(categorieUsefulness);
		}
	}
	
	public class BuilderEspecialWeaponWithUsefulness {
		private BuilderEspecialWeaponWithUsefulness(CategorieUsefulnessWeapon c) {
			categorieUsefulness = c;
		}

		public EspecialWeapon toEspecialWeapon() {

			BasicWeapon base = new BasicWeapon(0);
			
			base.setCost(cost);
			base.setCritical(critical);
			base.setRangeIncrement(range);
			base.setWeight(weight);
			base.addDamage(size, damage);
			base.addType(types);
			base.setCategorieEncumbrance(categorieEncunbrance);
			base.setCategorieUsefulness(categorieUsefulness);
			
			EspecialWeapon especialWeapon = new EspecialWeapon(name, base);
			
			return especialWeapon;
		}
	}
}


