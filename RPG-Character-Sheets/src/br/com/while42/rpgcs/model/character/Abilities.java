package br.com.while42.rpgcs.model.character;

import java.io.Serializable;

import br.com.while42.rpgcs.model.abilities.modifier.AbilityModifier;

public class Abilities implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer strength = 0;
	private Integer constitution = 0;
	private Integer wisdom = 0;
	private Integer charisma = 0;
	private Integer dexterity = 0;
	private Integer intelligence = 0;

	private AbilityModifier modifier = new AbilityModifier();

	public Abilities() {

	}

	public Abilities(Integer strength, Integer constitution, Integer wisdom,
			Integer charisma, Integer dexterity, Integer intelligence) {
		this.strength = strength;
		this.constitution = constitution;
		this.wisdom = wisdom;
		this.charisma = charisma;
		this.dexterity = dexterity;
		this.intelligence = intelligence;
	}

	public Integer getStrength() {
		return strength;
	}

	public Integer getStrengthModifier() {
		return modifier.get(strength);
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public Integer getConstitution() {
		return constitution;
	}

	public Integer getConstitutionModifier() {
		return modifier.get(constitution);
	}

	public void setConstitution(int constitution) {
		this.constitution = constitution;
	}

	public Integer getWisdom() {
		return wisdom;
	}

	public Integer getWisdomModifier() {
		return modifier.get(wisdom);
	}

	public void setWisdom(int wisdom) {
		this.wisdom = wisdom;
	}

	public Integer getCharisma() {
		return charisma;
	}

	public Integer getCharismaModifier() {
		return modifier.get(charisma);
	}

	public void setCharisma(int charisma) {
		this.charisma = charisma;
	}

	public Integer getDexterity() {
		return dexterity;
	}

	public Integer getDexterityModifier() {
		return modifier.get(dexterity);
	}

	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}

	public Integer getIntelligence() {
		return intelligence;
	}

	public Integer getIntelligenceModifier() {
		return modifier.get(intelligence);
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	@Override
	public boolean equals(Object o) {

		if (this == o)
			return true;

		if (!(o instanceof Abilities))
			return false;

		Abilities a = (Abilities) o;

		return strength.equals(a.strength) &&
			   constitution.equals(a.constitution) &&
			   wisdom.equals(a.wisdom) && 
			   charisma.equals(a.charisma) &&
			   dexterity.equals(a.dexterity) &&
			   intelligence.equals(a.intelligence);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("");
		
		sb.append(" strength: ").append(strength);
		sb.append(" constitution: ").append(constitution);
		sb.append(" wisdom: ").append(wisdom);
		sb.append(" charisma: ").append(charisma);
		sb.append(" dexterity: ").append(dexterity);
		sb.append(" intelligence: ").append(intelligence);
		
		return sb.toString();
	}
}
