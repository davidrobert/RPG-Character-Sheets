package br.com.while42.rpgcs.model.bonuses;

public class BaseAttackBonuses {
	public static int MAX_LEVEL = 20;
	public static int MIN_LEVEL = 1;

	private static int good[]    = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
	private static int average[] = {0, 0, 1, 2, 3, 3, 4, 5, 6, 6,  7,  8,  9,  9, 10, 11, 12, 12, 13, 14, 15};
	private static int poor[]    = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4,  5,  5,  6,  6,  7,  7,  8,  8,  9,  9, 10};		

	public int getGood(int classLevel) {
		if (classLevel < MIN_LEVEL || classLevel > MAX_LEVEL) {
			throw new IllegalArgumentException();
		}
		
		return good[classLevel];
	}
	
	public int getAverage(int classLevel) {
		if (classLevel < MIN_LEVEL || classLevel > MAX_LEVEL) {
			throw new IllegalArgumentException();
		}
		
		return average[classLevel];
	}
	
	public int getPoor(int classLevel) {
		if (classLevel < MIN_LEVEL || classLevel > MAX_LEVEL) {
			throw new IllegalArgumentException();
		}
		
		return poor[classLevel];
	}
}
