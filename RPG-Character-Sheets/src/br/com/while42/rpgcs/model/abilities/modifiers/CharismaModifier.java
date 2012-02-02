package br.com.while42.rpgcs.model.abilities.modifiers;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CharismaModifier {

	public static final int MIN_CHARISMA = 1;
	public static final int MAX_CHARISMA = 33;
	
	private static final int START_MODIFIER = -5;
	
	private final static Map<Integer, Integer> charismaModifier;
	static {
		int ability = MIN_CHARISMA;
		int modifier = START_MODIFIER;
		
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();		
		
		m.put(ability++, modifier++); // 1, -5
		m.put(ability++, modifier);   // 2, -4
		m.put(ability++, modifier++); // 3, -4
		
		for (; ability <= MAX_CHARISMA; ability += 2, modifier++) {
			m.put(ability, modifier);
			m.put(ability+1, modifier);
		}		
		
		charismaModifier = Collections.unmodifiableMap(m);		
	}
	
	public int get(int charisma) {
		if (charisma < MIN_CHARISMA || charisma > MAX_CHARISMA) {
			throw new IllegalArgumentException();
		}
		
		return charismaModifier.get(charisma);
	}
}
