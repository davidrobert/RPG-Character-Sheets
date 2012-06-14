package br.com.while42.rpgcs.model.equip.weapons.munition;

import java.io.Serializable;

public interface Munition extends Serializable {
	public void setAmount(Integer amount);
	public Integer getAmount();
}
