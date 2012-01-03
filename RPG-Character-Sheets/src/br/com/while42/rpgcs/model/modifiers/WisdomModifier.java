package br.com.while42.rpgcs.model.modifiers;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class WisdomModifier {

	public static final int MIN_WISDOM = 1;
	public static final int MAX_WISDOM = 33;
	
	private static final int START_MODIFIER = -5;
			
	private final static Map<Integer, Integer> wisdomModifier;
	static {
		int ability = MIN_WISDOM;
		int modifier = START_MODIFIER;
		
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();		
		
		m.put(ability++, modifier++); // 1, -5
		m.put(ability++, modifier);   // 2, -4
		m.put(ability++, modifier++); // 3, -4
		m.put(ability++, modifier);   // 4, -3
		m.put(ability++, modifier);   // 5, -3
		
		for (; ability <= MAX_WISDOM; ability += 2, modifier++) {
			m.put(ability, modifier);
			m.put(ability+1, modifier);
		}		
		
		wisdomModifier = Collections.unmodifiableMap(m);	
	}
	
	public int get(int wisdom) {
		if (wisdom < MIN_WISDOM || wisdom > MAX_WISDOM) {
			throw new IllegalArgumentException();
		}
		
		return wisdomModifier.get(wisdom);
	}
}
