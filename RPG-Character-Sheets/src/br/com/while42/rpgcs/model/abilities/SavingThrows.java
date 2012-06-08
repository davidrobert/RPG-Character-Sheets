package br.com.while42.rpgcs.model.abilities;

public class SavingThrows {
	private Integer fortitude = 0;
	private Integer reflex = 0;
	private Integer throwsWill= 0;
	
	public SavingThrows() {
		
	}
	
	public SavingThrows(Integer fortitude, Integer reflex, Integer throwsWill) {
		this.fortitude = fortitude;
		this.reflex = reflex;
		this.throwsWill = throwsWill;
	}

	public Integer getFortitude() {
		return fortitude;
	}

	public void setFortitude(Integer fortitude) {
		this.fortitude = fortitude;
	}

	public Integer getReflex() {
		return reflex;
	}

	public void setReflex(Integer reflex) {
		this.reflex = reflex;
	}

	public Integer getThrowsWill() {
		return throwsWill;
	}

	public void setThrowsWill(Integer throwsWill) {
		this.throwsWill = throwsWill;
	}	
}
