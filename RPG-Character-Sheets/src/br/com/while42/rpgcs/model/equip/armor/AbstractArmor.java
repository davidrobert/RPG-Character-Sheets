package br.com.while42.rpgcs.model.equip.armor;

public abstract class AbstractArmor implements Armor {
	
	private BasicArmor armor;

	public AbstractArmor(BasicArmor armor) {
		this.armor = armor;
	}
	
	@Override
	public int getCodeName() {
		return armor.getCodeName();
	}

	@Override
	public Integer getCost() {
		return armor.getCost();
	}

	@Override
	public int getArmorBonus() {
		return armor.getArmorBonus();
	}

	@Override
	public int getMaximumDexBonus() {
		return armor.getMaximumDexBonus();
	}

	@Override
	public int getArmorCheckPenalty() {
		return armor.getArmorCheckPenalty();
	}

	@Override
	public int getArcaneSpellFailureChance() {
		return armor.getArcaneSpellFailureChance();
	}

	@Override
	public int getSpeed() {
		return armor.getSpeed();
	}

	@Override
	public Double getWeight() {
		return armor.getWeight();
	}
}
