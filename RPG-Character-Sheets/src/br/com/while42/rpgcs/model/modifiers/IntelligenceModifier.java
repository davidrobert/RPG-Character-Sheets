package br.com.while42.rpgcs.model.modifiers;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class IntelligenceModifier {

	public static final int MIN_INTELLIGENCE = 1;
	public static final int MAX_INTELLIGENCE = 33;
	
	private static final int START_MODIFIER = -5;
	
	private final static Map<Integer, Integer> intelligenceModifier;
	static {
		int ability = MIN_INTELLIGENCE;
		int modifier = START_MODIFIER;
		
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();		
		
		m.put(ability++, modifier++); // 1, -5
		m.put(ability++, modifier);   // 2, -4
		m.put(ability++, modifier++); // 3, -4
		
		for (; ability <= MAX_INTELLIGENCE; ability += 2, modifier++) {
			m.put(ability, modifier);
			m.put(ability+1, modifier);
		}		
		
		intelligenceModifier = Collections.unmodifiableMap(m);	
	}
	
	public int get(int intelligence) {
		if (intelligence < MIN_INTELLIGENCE || intelligence > MAX_INTELLIGENCE) {
			throw new IllegalArgumentException();
		}
		
		return intelligenceModifier.get(intelligence);
	}
}
