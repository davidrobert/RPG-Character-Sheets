package br.com.while42.rpgcs.model.character.attributes;

import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.TypeCode;

public enum TypeAbilities implements TypeCode {
	
	STRENGTH(R.string.ability_strength),
	CONSTITUTION(R.string.ability_constitution),
	WISDOM(R.string.ability_wisdom),
	CHARISMA(R.string.ability_charisma),
	DEXTERITY(R.string.ability_dexterity),
	INTELLIGENCE(R.string.ability_intelligence);

	private int codeName;
	
	private TypeAbilities(int codeName) {
		this.codeName = codeName;
	}
	
	@Override
	public int getCodeName() {
		return codeName;
	}
}
