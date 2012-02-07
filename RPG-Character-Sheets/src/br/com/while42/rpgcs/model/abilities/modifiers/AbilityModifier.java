package br.com.while42.rpgcs.model.abilities.modifiers;


public class AbilityModifier {
	
	public static final int MIN_MODIFIER = -5;
	public static final int MIN_SCORE = 0;
	public static final int MAX_SCORE = 100;
	
	private static int MODIFIER[] = new int[MAX_SCORE + 1];
		
	static {
		int mod = MIN_MODIFIER;
		for (int score = 0; score < MAX_SCORE; score += 2, mod++) {
			MODIFIER[score + 0] = mod;
			MODIFIER[score + 1] = mod;
		} 
	}
	
	public int get(int score) {
		if (score < MIN_SCORE || score > MAX_SCORE) {
			throw new IllegalArgumentException("Invalid score");
		}
		
		return MODIFIER[score];
	}
}
