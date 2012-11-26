package br.com.while42.rpgcs.model.classes.bonuses;

public class ExperienceAndLevel {
	public static final int EMPTY_LEVEL = 0;
	public static final int MAX_LEVEL = 20;
	public static final int MIN_LEVEL = 1;
	
	private static final int XP[] = {
		0, 
		/* lvl 01 */ 0, 
		/* lvl 02 */ 1000, 
		/* lvl 03 */ 3000, 
		/* lvl 04 */ 6000, 
		/* lvl 05 */ 10000, 
		/* lvl 06 */ 15000, 
		/* lvl 07 */ 21000, 
		/* lvl 08 */ 28000, 
		/* lvl 09 */ 36000, 
		/* lvl 10 */ 45000, 
		/* lvl 11 */ 55000, 
		/* lvl 12 */ 66000, 
		/* lvl 13 */ 78000, 
		/* lvl 14 */ 91000,
		/* lvl 15 */ 105000, 
		/* lvl 16 */ 120000, 
		/* lvl 17 */ 136000,
		/* lvl 18 */ 153000,
		/* lvl 19 */ 171000,
		/* lvl 20 */ 190000
		};
	
	private static final int CLASS_SKILL_MAX_RANK[] = {
		0, 
		/* lvl 01 */ 4, 
		/* lvl 02 */ 5, 
		/* lvl 03 */ 6, 
		/* lvl 04 */ 7, 
		/* lvl 05 */ 8, 
		/* lvl 06 */ 9, 
		/* lvl 07 */ 10, 
		/* lvl 08 */ 11, 
		/* lvl 09 */ 12, 
		/* lvl 10 */ 13, 
		/* lvl 11 */ 14, 
		/* lvl 12 */ 15, 
		/* lvl 13 */ 16, 
		/* lvl 14 */ 17,
		/* lvl 15 */ 18, 
		/* lvl 16 */ 19, 
		/* lvl 17 */ 20,
		/* lvl 18 */ 21,
		/* lvl 19 */ 22,
		/* lvl 20 */ 23
	};

	// TODO: Incomplete
	private static final int CROSS_CLASS_SKILL_MAX_RANK[] = {
		0, 
		/* lvl 01 */ 2, 
		/* lvl 02 */ 2,
		/* lvl 03 */ 3,
		/* lvl 04 */ 3,
		/* lvl 05 */ 4,
		/* lvl 06 */ 4,
		/* lvl 07 */ 5,
		/* lvl 08 */ 5,
		/* lvl 09 */ 6,
		/* lvl 10 */ 6,
		/* lvl 11 */ 7,
		/* lvl 12 */ 7,
		/* lvl 13 */ 8,
		/* lvl 14 */ 8,
		/* lvl 15 */ 9,
		/* lvl 16 */ 9, 
		/* lvl 17 */ 10,
		/* lvl 18 */ 10,
		/* lvl 19 */ 11,
		/* lvl 20 */ 11
	};
	
	public int getExperience(int classLevel) {
		if (classLevel < ExperienceAndLevel.MIN_LEVEL || classLevel > ExperienceAndLevel.MAX_LEVEL) {
			throw new IllegalArgumentException("Invalid class level");
		}
		
		return XP[classLevel];
	}
}
