package br.com.while42.rpgcs.model.equip.armor.especial;

import br.com.while42.rpgcs.model.equip.armor.BasicArmor;

public class BuilderEspecialArmor {

	private String name;
	private Long cost;
	private Integer armorBonus;
	private Integer maximumDexBonus;
	private Integer armorCheckPenalty;
	private Integer arcaneSpellFailureChance;
	private Integer speed;
	private Double weight;
	
	public BuilderEspecialArmorWithName setName(String name) {
		return new BuilderEspecialArmorWithName(name);
	}
	
	public class BuilderEspecialArmorWithName {
		private BuilderEspecialArmorWithName(String n) {
			name = n;
		}
		public BuilderEspecialArmorWithCost setCost(Long cost) {
			return new BuilderEspecialArmorWithCost(cost);
		}
	}
	
	public class BuilderEspecialArmorWithCost {
		private BuilderEspecialArmorWithCost(Long c) {
			cost = c;
		}
		public BuilderEspecialArmorWithArmorBonus setArmorBonus(Integer armorBonus) {
			return new BuilderEspecialArmorWithArmorBonus(armorBonus);
		}
	}
	
	public class BuilderEspecialArmorWithArmorBonus {
		private BuilderEspecialArmorWithArmorBonus(Integer bonus) {
			armorBonus = bonus;
		}
		public BuilderEspecialArmorWithMaximumDexBonus setMaximumDexBonus(Integer maximumDexBonus) {
			return new BuilderEspecialArmorWithMaximumDexBonus(maximumDexBonus);
		}
	}
	
	public class BuilderEspecialArmorWithMaximumDexBonus {
		private BuilderEspecialArmorWithMaximumDexBonus(Integer bonus) {
			maximumDexBonus = bonus;
		}
		public BuilderEspecialArmorWithArmorCheckPenalty setArmorCheckPenalty(Integer armorCheckPenalty) {
			return new BuilderEspecialArmorWithArmorCheckPenalty(armorCheckPenalty);
		}
	}
	
	public class BuilderEspecialArmorWithArmorCheckPenalty {
		private BuilderEspecialArmorWithArmorCheckPenalty(Integer penalty) {
			armorCheckPenalty = penalty;
		}
		public BuilderEspecialArmorWithArcaneSpellFailureChance setArcaneSpellFailureChance(Integer arcaneSpellFailureChance) {
			return new BuilderEspecialArmorWithArcaneSpellFailureChance(arcaneSpellFailureChance);
		}
	}
	
	public class BuilderEspecialArmorWithArcaneSpellFailureChance {
		private BuilderEspecialArmorWithArcaneSpellFailureChance(Integer chance) {
			arcaneSpellFailureChance = chance;
		}
		public BuilderEspecialArmorWithSpeed setSpeed(Integer speed) {
			return new BuilderEspecialArmorWithSpeed(speed);
		}
	}
	
	public class BuilderEspecialArmorWithSpeed {
		private BuilderEspecialArmorWithSpeed(Integer s) {
			speed = s;
		}
		public BuilderEspecialArmorWithWeight setWeight(Double weight) {
			return new BuilderEspecialArmorWithWeight(weight);
		}
	}
	
	public class BuilderEspecialArmorWithWeight {
		private BuilderEspecialArmorWithWeight(Double w) {
			weight = w;
		}
		
		public EspecialArmor toEspecialArmor() {
			BasicArmor armor = new BasicArmor(0);
			
			armor.setCost(cost);
			armor.setArmorBonus(armorBonus);
			armor.setMaximumDexBonus(maximumDexBonus);
			armor.setArmorCheckPenalty(armorCheckPenalty);			
			armor.setArcaneSpellFailureChance(arcaneSpellFailureChance);
			armor.setSpeed(speed);
			armor.setWeight(weight);
			
			return new EspecialArmor(name, armor);
		}
	}
}
