package br.com.while42.rpgcs.model.races;

public class HalfElf extends AbstractRace implements Age {

	public static final int MIDDLE_AGE = 62; 
	public static final int OLD_AGE = 93;
	public static final int VENERABLE_AGE = 125;
	
	@Override
	public int getMiddleAge() {
		return MIDDLE_AGE;
	}

	@Override
	public int getOldAge() {
		return OLD_AGE;
	}

	@Override
	public int getVenerableAge() {
		return VENERABLE_AGE;
	}


}
