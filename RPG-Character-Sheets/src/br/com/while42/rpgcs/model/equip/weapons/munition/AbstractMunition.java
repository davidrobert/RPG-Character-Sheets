package br.com.while42.rpgcs.model.equip.weapons.munition;



public abstract class AbstractMunition implements Munition {
	private static final long serialVersionUID = 1L;

	private Integer amount;

	public AbstractMunition(Integer amount) {
		this.amount = amount;
	}
	
	@Override
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
	@Override
	public Integer getAmount() {
		return amount;
	}
}
