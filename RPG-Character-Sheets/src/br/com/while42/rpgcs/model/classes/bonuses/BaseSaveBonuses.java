package br.com.while42.rpgcs.model.classes.bonuses;

public class BaseSaveBonuses {
		public static int MAX_LEVEL = 20;
		public static int MIN_LEVEL = 1;
	
		private static int good[] = {0, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12};
		private static int poor[] = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5,  5,  5,  6,  6,  6};		
	
		public int getGood(int classLevel) {
			if (classLevel < MIN_LEVEL || classLevel > MAX_LEVEL) {
				throw new IllegalArgumentException();
			}
			
			return good[classLevel];
		}
		
		public int getPoor(int classLevel) {
			if (classLevel < MIN_LEVEL || classLevel > MAX_LEVEL) {
				throw new IllegalArgumentException();
			}
			
			return poor[classLevel];
		}
}
