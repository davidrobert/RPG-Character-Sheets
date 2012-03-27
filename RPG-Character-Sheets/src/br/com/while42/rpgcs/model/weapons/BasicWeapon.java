package br.com.while42.rpgcs.model.weapons;

import java.util.Set;

import br.com.while42.rpgcs.model.HitDice;

public interface BasicWeapon {
	
	public int getCost();
	public HitDice getDamage();
	public HitDice getDamage(SizeWeapon size);
	public int getCritical();
	public int getRangeIncrement();
	public double getWeight();
	public CategorieWeapon getCategorie();
	public Set<TypeWeapon> getType();
	
}
