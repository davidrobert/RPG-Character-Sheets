package br.com.while42.rpgcs.model.equip.armor;

public class BasicArmor implements Armor {
	private static final long serialVersionUID = 1L;
	
	private final int codeName;
	private Long cost = 0L;
	private Integer armorBonus = 0;
	private Integer maximumDexBonus = 0;
	private Integer armorCheckPenalty = 0;
	private Integer arcaneSpellFailureChance = 0;
	private Integer speed = 0;
	private Double weight = 0.0;
	private String description = "";
	private Boolean equiped = false;

	public BasicArmor(int codeName) {
		this.codeName = codeName;
	}
	
	@Override
	public int getCodeName() {
		return codeName;
	}
	
	public void setCost(Long cost) {
		this.cost = cost;
	}

	@Override
	public Long getCost() {
		return cost;
	}
	
	public void setArmorBonus(Integer armorBonus) {
		this.armorBonus = armorBonus;
	}
	
	@Override
	public Integer getArmorBonus() {
		return armorBonus;
	}

	public void setMaximumDexBonus(int maximumDexBonus) {
		this.maximumDexBonus = maximumDexBonus;
	}

	@Override
	public Integer getMaximumDexBonus() {
		return maximumDexBonus;
	}
	
	public void setArmorCheckPenalty(Integer armorCheckPenalty) {
		this.armorCheckPenalty = armorCheckPenalty;
	}

	@Override
	public Integer getArmorCheckPenalty() {
		return armorCheckPenalty;
	}
	
	public void setArcaneSpellFailureChance(int arcaneSpellFailureChance) {
		this.arcaneSpellFailureChance = arcaneSpellFailureChance;
	}

	@Override
	public Integer getArcaneSpellFailureChance() {
		return arcaneSpellFailureChance;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	@Override
	public Integer getSpeed() {
		return speed;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	@Override
	public Double getWeight() {
		return weight;
	}

	@Override
	public CategorieArmor getType() {
		return null;
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

			if (!(o instanceof BasicArmor))
				return false;

			BasicArmor ba = (BasicArmor) o;
			
		return codeName == ba.codeName &&
				cost.equals(ba.cost) &&
				armorBonus.equals(ba.armorBonus) &&
				maximumDexBonus.equals(ba.maximumDexBonus) &&
				armorCheckPenalty.equals(armorCheckPenalty) &&
				arcaneSpellFailureChance.equals(arcaneSpellFailureChance) &&
				speed.equals(speed) &&
				weight.equals(weight);
	}

	@Override
	public int hashCode() {
		return codeName + cost.intValue() + armorBonus.intValue() + maximumDexBonus.intValue() + armorCheckPenalty.intValue() + 
				arcaneSpellFailureChance.intValue() + speed.intValue() + weight.intValue();
	}
}
