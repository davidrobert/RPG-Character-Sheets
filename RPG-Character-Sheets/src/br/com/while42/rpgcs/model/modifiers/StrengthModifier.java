package br.com.while42.rpgcs.model.modifiers;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StrengthModifier {

	public static final int MIN_STRENTH = 1;
	public static final int MAX_STRENTH = 47;
	
	private final static Map<Integer, Integer> strengthModifier;
	static {
		int strenth = MIN_STRENTH;
		int modifier = -5;
		
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		m.put(strenth, modifier);
		
		for (strenth = 2; strenth <= MAX_STRENTH; strenth += 2) {
			m.put(strenth, ++modifier);
			m.put(strenth+1, modifier);
		}		
		
		strengthModifier = Collections.unmodifiableMap(m);
	}
	
	public int get(int strenth) {
		if (strenth < MIN_STRENTH || strenth > MAX_STRENTH)
			throw new IllegalArgumentException();
		return strengthModifier.get(strenth);
	}
}
