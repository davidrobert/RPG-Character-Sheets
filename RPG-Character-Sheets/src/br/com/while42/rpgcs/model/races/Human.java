package br.com.while42.rpgcs.model.races;

public class Human extends AbstractRace {
	
	public static final int MIDDLE_AGE = 35; 
	public static final int OLD_AGE = 53;
	public static final int VENERABLE_AGE = 70;

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
