package br.com.while42.rpgcs.model.modifiers;

import java.util.Map;

public class DexterityModifier {

	public static final int MIN_DEXTERITY = 1;
	public static final int MAX_DEXTERITY = 33;
	
	private static final int START_MODIFIER = -5;
	private static final int LIMIT_SINGLE_MODIFIER = 3;
	
	private final static Map<Integer, Integer> dexterityModifier;
	static {
		dexterityModifier = new BasicModifier().get(MIN_DEXTERITY, MAX_DEXTERITY, START_MODIFIER, LIMIT_SINGLE_MODIFIER);	
	}
	
	public int get(int dexterity) {
		if (dexterity < MIN_DEXTERITY || dexterity > MAX_DEXTERITY) {
			throw new IllegalArgumentException();
		}
		
		return dexterityModifier.get(dexterity);
	}
}
