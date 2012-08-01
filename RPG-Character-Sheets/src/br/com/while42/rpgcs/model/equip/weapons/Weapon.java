package br.com.while42.rpgcs.model.equip.weapons;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import br.com.while42.rpgcs.model.HitDice;
import br.com.while42.rpgcs.model.TypeCode;
import br.com.while42.rpgcs.model.equip.Equipment;

public interface Weapon extends Equipment, TypeCode, Serializable {
	
	// TODO: Verificar se nao vale ficar em uma interface esse metodo
	public int getCodeImage();
	
	public void setSize(SizeWeapon size);
	public SizeWeapon getSize();
	public List<HitDice> getDamage();
	public List<HitDice> getDamage(SizeWeapon size);
	public Integer getCritical();
	public Integer getRangeIncrement();
	public CategorieWeapon getCategorie();
	public CategorieUsefulnessWeapon getCategorieUsefulness();
	public CategorieEncumbranceWeapon getCategorieEncumbrance();
	public Set<TypeWeapon> getType();
	
	public String getDescription();
	
	public void setEquiped(Boolean equiped);
	public Boolean isEquiped();
	
}
