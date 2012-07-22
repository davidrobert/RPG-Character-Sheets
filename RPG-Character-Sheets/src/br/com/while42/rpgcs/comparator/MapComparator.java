package br.com.while42.rpgcs.comparator;

import java.util.Comparator;
import java.util.Map;

public class MapComparator {

	public Comparator<Map<String, String>> builderComparator(final String name) {
		Comparator<Map<String, String>> mapComparator = new Comparator<Map<String, String>>() {

			@Override
			public int compare(Map<String, String> m1, Map<String, String> m2) {
				return m1.get(name).compareTo(m2.get(name));
			}
		};

		return mapComparator;
	}
	
	public Comparator<Map<String, Object>> builderComparatorWithCast(final String name) {
		Comparator<Map<String, Object>> mapComparator = new Comparator<Map<String, Object>>() {

			@Override
			public int compare(Map<String, Object> m1, Map<String, Object> m2) {
				return ((String)m1.get(name)).compareTo((String) m2.get(name));
			}
		};

		return mapComparator;
	}
}
