package br.com.while42.rpgcs.model.character;

import java.io.Serializable;

public class Defences implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer armorClass = 0;
	private Integer hitPoints = 0;
	private Integer currentHitPoints = 0;
	private Integer touch = 0;
	private Integer flatFooted = 0;
	private Integer spellResistance = 0;
	private Integer initiative = 0;
	
	public Defences() {
		
	}
	
	public Defences(Integer armorClass, Integer hitPoints, Integer touch, Integer flatFooted, Integer spellResistance,
			Integer initiative) {
		this.armorClass = armorClass;
		this.hitPoints = hitPoints;
		this.currentHitPoints = hitPoints;
		this.touch = touch;
		this.flatFooted = flatFooted;
		this.spellResistance = spellResistance;
		this.initiative = initiative;
	}

	public Integer getArmorClass() {
		return armorClass;
	}

	public void setArmorClass(Integer armorClass) {
		this.armorClass = armorClass;
	}

	public Integer getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(Integer hitPoints) {
		this.hitPoints = hitPoints;
	}

	public Integer getCurrentHitPoints() {
		return currentHitPoints;
	}

	public void setCurrentHitPoints(Integer currentHitPoints) {
		this.currentHitPoints = currentHitPoints;
	}

	public Integer getTouch() {
		return touch;
	}

	public void setTouch(Integer touch) {
		this.touch = touch;
	}

	public Integer getFlatFooted() {
		return flatFooted;
	}

	public void setFlatFooted(Integer flatFooted) {
		this.flatFooted = flatFooted;
	}

	public Integer getSpellResistance() {
		return spellResistance;
	}

	public void setSpellResistance(Integer spellResistance) {
		this.spellResistance = spellResistance;
	}

	public Integer getInitiative() {
		return initiative;
	}

	public void setInitiative(Integer initiative) {
		this.initiative = initiative;
	}
	

}
