package br.com.while42.rpgcs.model.equip.weapons.munition;

import br.com.while42.rpgcs.model.character.TypeMunition;


public class EspecialMunition extends CommonMunition {
	private static final long serialVersionUID = 1L;
	
	private String description;
	
	public EspecialMunition(String name, Integer amount) {
		super(TypeMunition.ESPECIAL, amount);
		this.description = name;
	}

	public String getDescription() {
		return description;
	}
}
