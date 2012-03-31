package br.com.while42.rpgcs.model.equipment.weapons.simple;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.HitDice;
import br.com.while42.rpgcs.model.HitDiceType;
import br.com.while42.rpgcs.model.equipment.weapons.SizeWeapon;
import br.com.while42.rpgcs.model.equipment.weapons.TypeWeapon;

public class Dart extends AbstractSimpleWeapon {

	private static final int nameCode = R.string.weapon_simple_dart;
	private static final int cost = 5;
	private static final Map<SizeWeapon, List<HitDice>> damage = new HashMap<SizeWeapon, List<HitDice>>();	
	private static final int critical = 2;
	private static final int rangeIncrement = 6;
	private static final double weight = 0.25;
	private static final Set<TypeWeapon> types = new HashSet<TypeWeapon>();
	
	static {
		List<HitDice> small = Arrays.asList(new HitDice(HitDiceType.d3));
		List<HitDice> medium = Arrays.asList(new HitDice(HitDiceType.d4));
		
		damage.put(SizeWeapon.SMALL, small);
		damage.put(SizeWeapon.MEDIUM, medium);
		
		types.add(TypeWeapon.PIERCING);
	}
	
	
	@Override
	public int getCodeName() {
		return nameCode;
	}
	
	@Override
	public int getCost() {
		return cost;
	}

	@Override
	public List<HitDice> getDamage() {
		return getDamage(SizeWeapon.MEDIUM);
	}

	@Override
	public List<HitDice> getDamage(SizeWeapon size) {
		return damage.get(size);
	}

	@Override
	public int getCritical() {
		return critical;
	}

	@Override
	public int getRangeIncrement() {
		return rangeIncrement;
	}

	@Override
	public double getWeight() {
		return weight;
	}

	@Override
	public Set<TypeWeapon> getType() {
		return Collections.unmodifiableSet(types);
	}

}
