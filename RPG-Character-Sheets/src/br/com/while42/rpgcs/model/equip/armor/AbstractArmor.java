package br.com.while42.rpgcs.model.equip.armor;


public abstract class AbstractArmor implements Armor {
	private static final long serialVersionUID = 1L;
	
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
	public Integer getArmorBonus() {
		return armor.getArmorBonus();
	}

	@Override
	public Integer getMaximumDexBonus() {
		return armor.getMaximumDexBonus();
	}

	@Override
	public Integer getArmorCheckPenalty() {
		return armor.getArmorCheckPenalty();
	}

	@Override
	public Integer getArcaneSpellFailureChance() {
		return armor.getArcaneSpellFailureChance();
	}

	@Override
	public Integer getSpeed() {
		return armor.getSpeed();
	}

	@Override
	public Double getWeight() {
		return armor.getWeight();
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;

		if (!(o instanceof AbstractArmor))
			return false;

		AbstractArmor aa = (AbstractArmor) o;
		return armor.equals(aa.armor);
	}
	
	@Override
	public int hashCode() {
		return armor.hashCode();
	}
}
