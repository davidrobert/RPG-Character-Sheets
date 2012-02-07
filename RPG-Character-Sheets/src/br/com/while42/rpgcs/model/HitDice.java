package br.com.while42.rpgcs.model;

public class HitDice {
	
	private int count;
	private HitDiceType dice;
	private int modifier;
	
	public HitDice(HitDiceType dice) {
		this.count = 1;
		this.dice = dice;
		this.modifier = 0;
	}
	
	public HitDice(int count, HitDiceType dice) {
		this.count = count;
		this.dice = dice;
		this.modifier = 0;
	}
	
	public HitDice(int count, HitDiceType dice, int modifier) {
		this.count = count;
		this.dice = dice;
		this.modifier = modifier;
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
	
	public int getMaxValue() {
		return (count * dice.getValue()) + modifier;
	}
	
	public int getMinValue() {
		return (count * 1) + modifier;
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
		
		return b.toString();
	}
}
