package br.com.while42.rpgcs.model.classes.bonuses;

public class BaseAttackBonuses {

	private static int good[][]    = {{ 0,  0,  0,  0}, 
		                              { 1,  0,  0,  0}, 
		                              { 2,  0,  0,  0}, 
		                              { 3,  0,  0,  0}, 
		                              { 4,  0,  0,  0}, 
		                              { 5,  0,  0,  0}, 
		                              { 6,  1,  0,  0}, 
		                              { 7,  2,  0,  0}, 
		                              { 8,  3,  0,  0}, 
		                              { 9,  4,  0,  0}, 
		                              {10,  5,  0,  0}, 
		                              {11,  6,  1,  0}, 
		                              {12,  7,  2,  0}, 
		                              {13,  8,  3,  0}, 
		                              {14,  9,  4,  0}, 
		                              {15, 10,  5,  0}, 
		                              {16, 11,  6,  1},
		                              {17, 12,  7,  2}, 
		                              {18, 13,  8,  3}, 
		                              {19, 14,  9,  4}, 
		                              {20, 15, 10,  5}};
	
	private static int average[][] = {{ 0,  0,  0,  0}, 
		                              { 0,  0,  0,  0}, 
		                              { 1,  0,  0,  0}, 
		                              { 2,  0,  0,  0}, 
		                              { 3,  0,  0,  0}, 
		                              { 3,  0,  0,  0}, 
		                              { 4,  0,  0,  0}, 
		                              { 5,  0,  0,  0}, 
		                              { 6,  1,  0,  0}, 
		                              { 6,  1,  0,  0},  
		                              { 7,  2,  0,  0},  
		                              { 8,  3,  0,  0},  
		                              { 9,  4,  0,  0},  
		                              { 9,  4,  0,  0}, 
		                              {10,  5,  0,  0}, 
		                              {11,  6,  1,  0}, 
		                              {12,  7,  2,  0}, 
		                              {12,  7,  2,  0}, 
		                              {13,  8,  3,  0}, 
		                              {14,  9,  4,  0}, 
		                              {15, 10,  5,  0}};
	
	private static int poor[][]    = {{ 0,  0,  0,  0}, 
                                      { 0,  0,  0,  0}, 
                                      { 1,  0,  0,  0}, 
                                      { 1,  0,  0,  0},
                                      { 2,  0,  0,  0}, 
                                      { 2,  0,  0,  0}, 
                                      { 3,  0,  0,  0}, 
                                      { 3,  0,  0,  0}, 
                                      { 4,  0,  0,  0}, 
                                      { 4,  0,  0,  0},  
                                      { 5,  0,  0,  0},  
                                      { 5,  0,  0,  0},  
                                      { 6,  1,  0,  0},  
                                      { 6,  1,  0,  0},  
                                      { 7,  2,  0,  0},  
                                      { 7,  2,  0,  0},  
                                      { 8,  3,  0,  0},  
                                      { 8,  3,  0,  0},  
                                      { 9,  4,  0,  0},  
                                      { 9,  4,  0,  0}, 
                                      {10,  5,  0,  0}};		

	public int getGood(int classLevel) {
		return getGood(classLevel, 1);
	}
	
	
	public int getGood(int classLevel, int attack) {
		if (classLevel < ExperienceAndLevel.MIN_LEVEL || classLevel > ExperienceAndLevel.MAX_LEVEL) {
			throw new IllegalArgumentException();
		}
		
		return good[classLevel][attack - 1];
	}
	
	public int getAverage(int classLevel) {
		return getAverage(classLevel, 1);
	}
	
	public int getAverage(int classLevel, int attack) {
		if (classLevel < ExperienceAndLevel.MIN_LEVEL || classLevel > ExperienceAndLevel.MAX_LEVEL) {
			throw new IllegalArgumentException();
		}
		
		return average[classLevel][attack - 1];
	}
	
	public int getPoor(int classLevel) {
		return getPoor(classLevel, 1);
	}
	
	public int getPoor(int classLevel, int attack) {
		if (classLevel < ExperienceAndLevel.MIN_LEVEL || classLevel > ExperienceAndLevel.MAX_LEVEL) {
			throw new IllegalArgumentException();
		}
		
		return poor[classLevel][attack - 1];
	}
}
