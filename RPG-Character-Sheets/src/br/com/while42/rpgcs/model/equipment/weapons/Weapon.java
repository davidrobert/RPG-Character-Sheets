package br.com.while42.rpgcs.model.equipment.weapons;

import java.util.List;
import java.util.Set;

import br.com.while42.rpgcs.model.HitDice;
import br.com.while42.rpgcs.model.TypeCode;

public interface Weapon extends TypeCode {
	
	public int getCost();
	public List<HitDice> getDamage();
	public List<HitDice> getDamage(SizeWeapon size);
	public int getCritical();
	public int getRangeIncrement();
	public double getWeight();
	public CategorieWeapon getCategorie();
	public Set<TypeWeapon> getType();
	
}
