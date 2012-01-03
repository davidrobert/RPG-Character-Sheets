package br.com.while42.rpgcs.model.modifiers;

import java.util.Map;

public class IntelligenceModifier {

	public static final int MIN_INTELLIGENCE = 1;
	public static final int MAX_INTELLIGENCE = 33;
	
	private static final int START_MODIFIER = -5;
	private static final int LIMIT_SINGLE_MODIFIER = 3;
	
	private final static Map<Integer, Integer> intelligenceModifier;
	static {
		intelligenceModifier = new BasicModifier().get(MIN_INTELLIGENCE, MAX_INTELLIGENCE, START_MODIFIER, LIMIT_SINGLE_MODIFIER);	
	}
	
	public int get(int intelligence) {
		if (intelligence < MIN_INTELLIGENCE || intelligence > MAX_INTELLIGENCE) {
			throw new IllegalArgumentException();
		}
		
		return intelligenceModifier.get(intelligence);
	}
}
