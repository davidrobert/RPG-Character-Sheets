package br.com.while42.rpgcs.model.modifiers;

import java.util.Map;

public class WisdomModifier {

	public static final int MIN_WISDOM = 1;
	public static final int MAX_WISDOM = 33;
	
	private static final int START_MODIFIER = -5;
	private static final int LIMIT_SINGLE_MODIFIER = 5;
			
	private final static Map<Integer, Integer> wisdomModifier;
	static {
		wisdomModifier = new BasicModifier().get(MIN_WISDOM, MAX_WISDOM, START_MODIFIER, LIMIT_SINGLE_MODIFIER);	
	}
	
	public int get(int wisdom) {
		if (wisdom < MIN_WISDOM || wisdom > MAX_WISDOM) {
			throw new IllegalArgumentException();
		}
		
		return wisdomModifier.get(wisdom);
	}
}
