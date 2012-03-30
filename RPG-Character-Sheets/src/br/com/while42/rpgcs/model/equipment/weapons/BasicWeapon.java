package br.com.while42.rpgcs.model.equipment.weapons;

import java.util.Set;

import br.com.while42.rpgcs.model.HitDice;
import br.com.while42.rpgcs.model.TypeCode;

public interface BasicWeapon extends TypeCode {
	
	public int getCost();
	public HitDice getDamage();
	public HitDice getDamage(SizeWeapon size);
	public int getCritical();
	public int getRangeIncrement();
	public double getWeight();
	public CategorieWeapon getCategorie();
	public Set<TypeWeapon> getType();
	
}
