package br.com.while42.rpgcs.model.classes.bonuses;

import br.com.while42.rpgcs.model.abilities.modifiers.AbilityModifier;

public class BaseSpellBonuses {
	public static final int MIN_SPELL_LEVEL = 0;
	public static final int MAX_SPELL_LEVEL = 9;

	private static int BONUS_SPELL[][] = new int[AbilityModifier.MAX_SCORE + 1][MAX_SPELL_LEVEL + 1];

	static {		
		for (int level = MIN_SPELL_LEVEL; level <= 9; level++) {			
			int startScore = 10 + level * 2;
			for (int score = 0; score < startScore; score++) {
				BONUS_SPELL[score][level] = 0;
			}
			
			if (level == 0) {
				continue;
			}
			
			int bonus = 1;
			for (int score = startScore; score <= AbilityModifier.MAX_SCORE - 8; score += 8, bonus++) {
				for (int i = 0; i < 8; i++) {
					BONUS_SPELL[score + i][level] = bonus;
				}
			}
		} 
	}

	public int get(int score, int spellLevel) {
		if (score < AbilityModifier.MIN_SCORE || score > AbilityModifier.MAX_SCORE) {
			throw new IllegalArgumentException("Invalid score");
		}
			
		if (spellLevel < MIN_SPELL_LEVEL || spellLevel > MAX_SPELL_LEVEL) {
			throw new IllegalArgumentException("Invalid spell level");
		}
		
		return BONUS_SPELL[score][spellLevel];
	}
}
