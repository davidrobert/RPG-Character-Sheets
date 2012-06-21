package br.com.while42.rpgcs.model.character;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import br.com.while42.rpgcs.model.abilities.modifier.AbilityModifier;
import br.com.while42.rpgcs.model.character.attributes.TypeAbilities;

public class Abilities implements Serializable {
	private static final long serialVersionUID = 1L;

	private final Map<TypeAbilities, Integer> abilities = new HashMap<TypeAbilities, Integer>();
	private AbilityModifier modifier = new AbilityModifier();

	public Abilities() {
		for (TypeAbilities abilitie: TypeAbilities.values()) {
			abilities.put(abilitie, 0);
		}
	}

	public Abilities(Integer strength, Integer constitution, Integer wisdom,
			Integer charisma, Integer dexterity, Integer intelligence) {
		
		for (TypeAbilities abilitie: TypeAbilities.values()) {
			abilities.put(abilitie, 0);
		}
		
		abilities.put(TypeAbilities.STRENGTH, strength);
		abilities.put(TypeAbilities.CONSTITUTION, constitution);
		abilities.put(TypeAbilities.WISDOM, wisdom);
		abilities.put(TypeAbilities.CHARISMA, charisma);
		abilities.put(TypeAbilities.DEXTERITY, dexterity);
		abilities.put(TypeAbilities.INTELLIGENCE, intelligence);
	}

	private void setAbility(TypeAbilities type, Integer value) {
		abilities.put(type, value);
	}
	
	private Integer getAbility(TypeAbilities type) {
		return abilities.get(type);
	}
	
	private Integer getModifier(TypeAbilities type) {
		return modifier.get(getAbility(type));
	}
	
	public Integer getStrength() {
		return getAbility(TypeAbilities.STRENGTH);
	}

	public Integer getStrengthModifier() {
		return getModifier(TypeAbilities.STRENGTH);
	}

	public void setStrength(Integer strength) {
		setAbility(TypeAbilities.STRENGTH, strength);
	}

	public Integer getConstitution() {
		return getAbility(TypeAbilities.CONSTITUTION);
	}

	public Integer getConstitutionModifier() {
		return getModifier(TypeAbilities.CONSTITUTION);
	}

	public void setConstitution(Integer constitution) {
		setAbility(TypeAbilities.CONSTITUTION, constitution);
	}

	public Integer getWisdom() {
		return getAbility(TypeAbilities.WISDOM);
	}

	public Integer getWisdomModifier() {
		return getModifier(TypeAbilities.WISDOM);
	}

	public void setWisdom(Integer wisdom) {
		setAbility(TypeAbilities.WISDOM, wisdom);
	}

	public Integer getCharisma() {
		return getAbility(TypeAbilities.CHARISMA);
	}

	public Integer getCharismaModifier() {
		return getModifier(TypeAbilities.CHARISMA);
	}

	public void setCharisma(Integer charisma) {
		setAbility(TypeAbilities.CHARISMA, charisma);
	}

	public Integer getDexterity() {
		return getAbility(TypeAbilities.DEXTERITY);
	}

	public Integer getDexterityModifier() {
		return getModifier(TypeAbilities.DEXTERITY);
	}

	public void setDexterity(Integer dexterity) {
		setAbility(TypeAbilities.DEXTERITY, dexterity);
	}

	public Integer getIntelligence() {
		return getAbility(TypeAbilities.INTELLIGENCE);
	}

	public Integer getIntelligenceModifier() {
		return getModifier(TypeAbilities.INTELLIGENCE);
	}

	public void setIntelligence(Integer intelligence) {
		setAbility(TypeAbilities.INTELLIGENCE, intelligence);
	}

	@Override
	public boolean equals(Object o) {

		if (this == o)
			return true;

		if (!(o instanceof Abilities))
			return false;

		Abilities a = (Abilities) o;

		return getAbility(TypeAbilities.STRENGTH).equals(a.getAbility(TypeAbilities.STRENGTH)) &&
				getAbility(TypeAbilities.CONSTITUTION).equals(a.getAbility(TypeAbilities.CONSTITUTION)) &&
				getAbility(TypeAbilities.WISDOM).equals(a.getAbility(TypeAbilities.WISDOM)) && 
				getAbility(TypeAbilities.CHARISMA).equals(a.getAbility(TypeAbilities.CHARISMA)) &&
				getAbility(TypeAbilities.DEXTERITY).equals(a.getAbility(TypeAbilities.DEXTERITY)) &&
				getAbility(TypeAbilities.INTELLIGENCE).equals(a.getAbility(TypeAbilities.INTELLIGENCE));
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("");
		
		sb.append(" strength: ").append(getAbility(TypeAbilities.STRENGTH));
		sb.append(" constitution: ").append(getAbility(TypeAbilities.CONSTITUTION));
		sb.append(" wisdom: ").append(getAbility(TypeAbilities.WISDOM));
		sb.append(" charisma: ").append(getAbility(TypeAbilities.CHARISMA));
		sb.append(" dexterity: ").append(getAbility(TypeAbilities.DEXTERITY));
		sb.append(" intelligence: ").append(getAbility(TypeAbilities.INTELLIGENCE));
		
		return sb.toString();
	}
}
