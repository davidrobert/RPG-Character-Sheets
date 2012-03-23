package br.com.while42.rpgcs.model.weapons;

import java.util.Set;

import br.com.while42.rpgcs.model.HitDice;

public interface Weapon {
	
	public int getCost();
	public HitDice getDamageSmall();
	public HitDice getDamageMedium();
	public int getCritical();
	public int getRangeIncrement();
	public float getWeight();
	public Set<TypeWeapon> getType();
	
}
