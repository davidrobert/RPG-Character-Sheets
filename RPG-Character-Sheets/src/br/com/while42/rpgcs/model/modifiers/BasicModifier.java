package br.com.while42.rpgcs.model.modifiers;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class BasicModifier {
	
	public Map<Integer, Integer> get(int minAbility, int maxAbility, int startModifier, int limitSingleModifier) {
		int ability;
		int modifier;
		
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();		
		
		// Single
		for (ability = minAbility, modifier = startModifier; ability <= limitSingleModifier; ability++, modifier++) {
			m.put(ability, modifier);
		}		
		
		// Double
		for (; ability <= maxAbility; ability += 2, modifier++) {
			m.put(ability, modifier);
			m.put(ability+1, modifier);
		}		
		
		return Collections.unmodifiableMap(m);
	}
}
