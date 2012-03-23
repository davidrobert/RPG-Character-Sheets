package br.com.while42.rpgcs.model;

public enum HitDiceType {
	d1(1),
	d2(2),
	d3(3),
	d4(4),
	d6(6),
	d8(8),
	d10(10),
	d12(12),
	d20(20),
	d100(100);
	
	private int value;
	
	private HitDiceType(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}
