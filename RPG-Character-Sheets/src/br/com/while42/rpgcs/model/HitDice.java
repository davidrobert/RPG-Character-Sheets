package br.com.while42.rpgcs.model;

import java.io.Serializable;

public class HitDice implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer count;
	private HitDiceType dice;
	private Integer modifier;
	private Integer multiplier;
	
	public HitDice(HitDiceType dice) {
		this.count = 1;
		this.dice = dice;
		this.modifier = 0;
		this.multiplier = 1;
	}
	
	public HitDice(Integer count, HitDiceType dice) {
		this.count = count;
		this.dice = dice;
		this.modifier = 0;
		this.multiplier = 1;
	}
	
	public HitDice(Integer count, HitDiceType dice, Integer modifier) {
		this.count = count;
		this.dice = dice;
		this.modifier = modifier;
		this.multiplier = 1;
	}
	
	public HitDice(Integer count, HitDiceType dice, Integer modifier, Integer multiplier) {
		this.count = count;
		this.dice = dice;
		this.modifier = modifier;
		this.multiplier = multiplier;
	}
	
	public Integer getCount() {
		return count;
	}

	public HitDiceType getDice() {
		return dice;
	}

	public Integer getModifier() {
		return modifier;
	}
	
	public Integer getMultiplier() {
		return multiplier;
	}
	
	public Integer getMaxValue() {
		return ((count * dice.getValue()) + modifier) * multiplier;
	}
	
	public Integer getMinValue() {
		return ((count * 1) + modifier) * multiplier;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof HitDice)) return false;
		
		HitDice h = (HitDice) o;
		if (count.equals(h.count) && dice.equals(h.dice) && modifier.equals(h.modifier) && multiplier.equals(h.multiplier))
			return true;
		
		return false;
	}

	@Override
	public String toString() {
		StringBuilder b = new StringBuilder();
		
		b.append(count.toString());
		b.append(dice);
		
		if (modifier < 0) {
			b.append(modifier.toString());
		} else if (modifier > 0) {
			b.append("+").append(modifier.toString());
		}
		
		if (multiplier != 1) {
			b.append(" x ").append(multiplier.toString());
		}
		
		return b.toString();
	}
}
