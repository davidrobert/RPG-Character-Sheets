package br.com.while42.rpgcs.model.abilities.modifiers;

import br.com.while42.rpgcs.model.classes.bonuses.ExperienceAndLevel;

public class AbilityModifier {
	
	private static int MODIFIER[] = new int[ExperienceAndLevel.MAX_LEVEL + 1];
	public static int MIN_SCORE = -5;
	
	static {
		int mod = MIN_SCORE;
		for (int score = 0; score <= ExperienceAndLevel.MAX_LEVEL; score += 2) {
			MODIFIER[score + 0] = mod;
			MODIFIER[score + 1] = mod;
		}
	}
	
	public int get(int score) {
		return MODIFIER[score];
	}
}
