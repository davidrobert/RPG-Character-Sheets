package br.com.while42.rpgcs.model.modifiers;

import java.util.Map;

public class CharismaModifier {

	public static final int MIN_CHARISMA = 1;
	public static final int MAX_CHARISMA = 33;
	
	private static final int START_MODIFIER = -5;
	private static final int LIMIT_SINGLE_MODIFIER = 3;
	
	private final static Map<Integer, Integer> charismaModifier;
	static {
		charismaModifier = new BasicModifier().get(MIN_CHARISMA, MAX_CHARISMA, START_MODIFIER, LIMIT_SINGLE_MODIFIER);	
	}
	
	public int get(int charisma) {
		if (charisma < MIN_CHARISMA || charisma > MAX_CHARISMA) {
			throw new IllegalArgumentException();
		}
		
		return charismaModifier.get(charisma);
	}
}
