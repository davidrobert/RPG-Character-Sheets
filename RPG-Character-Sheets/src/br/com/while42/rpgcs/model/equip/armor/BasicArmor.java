package br.com.while42.rpgcs.model.equip.armor;

public class BasicArmor implements Armor {
	
	private final int codeName;
	private int cost = 0;
	private int armorBonus = 0;
	private int maximumDexBonus = 0;
	private int armorCheckPenalty = 0;
	private int arcaneSpellFailureChance = 0;
	private int speed = 0;
	
	private double weight = 0.0;

	public BasicArmor(int codeName) {
		this.codeName = codeName;
	}
	
	@Override
	public int getCodeName() {
		return codeName;
	}
	
	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public Integer getCost() {
		return cost;
	}
	
	public void setArmorBonus(int armorBonus) {
		this.armorBonus = armorBonus;
	}
	
	@Override
	public int getArmorBonus() {
		return armorBonus;
	}

	public void setMaximumDexBonus(int maximumDexBonus) {
		this.maximumDexBonus = maximumDexBonus;
	}

	@Override
	public int getMaximumDexBonus() {
		return maximumDexBonus;
	}
	
	public void setArmorCheckPenalty(int armorCheckPenalty) {
		this.armorCheckPenalty = armorCheckPenalty;
	}

	@Override
	public int getArmorCheckPenalty() {
		return armorCheckPenalty;
	}
	
	public void setArcaneSpellFailureChance(int arcaneSpellFailureChance) {
		this.arcaneSpellFailureChance = arcaneSpellFailureChance;
	}

	@Override
	public int getArcaneSpellFailureChance() {
		return arcaneSpellFailureChance;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	@Override
	public int getSpeed() {
		return speed;
	}

	public void setWeight(double weight) {
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

}
