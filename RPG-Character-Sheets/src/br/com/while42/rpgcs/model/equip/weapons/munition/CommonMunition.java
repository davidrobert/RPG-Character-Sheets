package br.com.while42.rpgcs.model.equip.weapons.munition;

import br.com.while42.rpgcs.model.character.TypeMunition;

public class CommonMunition extends AbstractMunition {
	private static final long serialVersionUID = 1L;
	
	private TypeMunition type;
	
	public CommonMunition(TypeMunition type, Integer amount) {
		super(amount);
		this.type = type;
	}

	public TypeMunition getType() {
		return type;
	}
}
