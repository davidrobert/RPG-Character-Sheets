package br.com.while42.rpgcs.model.abilities.modifiers;

import java.util.Map;

public class ConstitutionModifier {

	public static final int MIN_CONTITUTION = 8;
	public static final int MAX_CONSTITUTION = 35;
	
	private static final int START_MODIFIER = -1;
	private static final int LIMIT_SINGLE_MODIFIER = 0;
	
	private final static Map<Integer, Integer> constitutionModifier;
	static {
		constitutionModifier = new BasicModifier().get(MIN_CONTITUTION, MAX_CONSTITUTION, START_MODIFIER, LIMIT_SINGLE_MODIFIER);	
	}
	
	public int get(int constitution) {
		if (constitution < MIN_CONTITUTION || constitution > MAX_CONSTITUTION) {
			throw new IllegalArgumentException();
		}
		
		return constitutionModifier.get(constitution);
	}
}
