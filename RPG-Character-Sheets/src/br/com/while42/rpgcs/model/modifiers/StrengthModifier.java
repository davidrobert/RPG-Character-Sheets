package br.com.while42.rpgcs.model.modifiers;

import java.util.Map;

public class StrengthModifier {

	public static final int MIN_STRENTH = 1;
	public static final int MAX_STRENTH = 47;
	
	private static final int START_MODIFIER = -5;
	private static final int LIMIT_SINGLE_MODIFIER = 1;
	
	private final static Map<Integer, Integer> strengthModifier;
	static {
		strengthModifier = new BasicModifier().get(MIN_STRENTH, MAX_STRENTH, START_MODIFIER, LIMIT_SINGLE_MODIFIER);	
	}
	
	public int get(int strenth) {
		if (strenth < MIN_STRENTH || strenth > MAX_STRENTH) {
			throw new IllegalArgumentException();
		}
		return strengthModifier.get(strenth);
	}
}
