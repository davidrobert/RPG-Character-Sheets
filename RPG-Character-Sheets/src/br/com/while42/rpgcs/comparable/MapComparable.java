package br.com.while42.rpgcs.comparable;

import java.util.Comparator;
import java.util.Map;

public class MapComparable {

	public Comparator<Map<String, String>> builderComparator(final String name) {
		Comparator<Map<String, String>> mapComparator = new Comparator<Map<String, String>>() {

			@Override
			public int compare(Map<String, String> m1, Map<String, String> m2) {
				return m1.get(name).compareTo(m2.get(name));
			}
		};

		return mapComparator;
	}
}
