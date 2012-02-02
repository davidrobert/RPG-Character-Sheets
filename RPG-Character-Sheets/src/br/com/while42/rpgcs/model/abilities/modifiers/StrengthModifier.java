package br.com.while42.rpgcs.model.abilities.modifiers;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StrengthModifier {

	public static final int MIN_STRENTH = 1;
	public static final int MAX_STRENTH = 47;
	
	private static final int START_MODIFIER = -5;
	
	private final static Map<Integer, Integer> strengthModifier;
	static {
		int ability = MIN_STRENTH;
		int modifier = START_MODIFIER;
		
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();		
		
		m.put(ability++, modifier++); // 1, -5
		m.put(ability++, modifier);   // 2, -4
		m.put(ability++, modifier++); // 3, -4
		
		for (; ability <= MAX_STRENTH; ability += 2, modifier++) {
			m.put(ability, modifier);
			m.put(ability+1, modifier);
		}		
		
		strengthModifier = Collections.unmodifiableMap(m);
	}
	
	public int get(int strenth) {
		if (strenth < MIN_STRENTH || strenth > MAX_STRENTH) {
			throw new IllegalArgumentException();
		}
		return strengthModifier.get(strenth);
	}
}
