package br.com.while42.rpgcs.model;

public class HitDice {
	
	private int count;
	private HitDiceType dice;
	private int modifier;
	private int multiplier;
	
	public HitDice(HitDiceType dice) {
		this.count = 1;
		this.dice = dice;
		this.modifier = 0;
		this.multiplier = 1;
	}
	
	public HitDice(int count, HitDiceType dice) {
		this.count = count;
		this.dice = dice;
		this.modifier = 0;
		this.multiplier = 1;
	}
	
	public HitDice(int count, HitDiceType dice, int modifier) {
		this.count = count;
		this.dice = dice;
		this.modifier = modifier;
		this.multiplier = 1;
	}
	
	public HitDice(int count, HitDiceType dice, int modifier, int multiplier) {
		this.count = count;
		this.dice = dice;
		this.modifier = modifier;
		this.multiplier = multiplier;
	}
	
	public int getCount() {
		return count;
	}

	public HitDiceType getDice() {
		return dice;
	}

	public int getModifier() {
		return modifier;
	}
	
	public int getMultiplier() {
		return multiplier;
	}
	
	public int getMaxValue() {
		return ((count * dice.getValue()) + modifier) * multiplier;
	}
	
	public int getMinValue() {
		return ((count * 1) + modifier) * multiplier;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof HitDice)) return false;
		
		HitDice h = (HitDice) o;
		if (count == h.count && dice == h.dice && modifier == h.modifier && multiplier == h.multiplier)
			return true;
		
		return false;
	}

	@Override
	public String toString() {
		StringBuilder b = new StringBuilder();
		
		b.append(String.valueOf(count));
		b.append(dice);
		
		if (modifier < 0) {
			b.append(String.valueOf(modifier));
		} else if (modifier > 0) {
			b.append("+").append(String.valueOf(modifier));
		}
		
		if (multiplier != 1) {
			b.append(" x ").append(String.valueOf(multiplier));
		}
		
		return b.toString();
	}
}
