package br.com.while42.rpgcs.model.weapons;


public abstract class AbstractSimpleWeapon implements BasicWeapon {
	@Override
	public final CategorieWeapon getCategorie() {
		return CategorieWeapon.SIMPLE;
	}
}
