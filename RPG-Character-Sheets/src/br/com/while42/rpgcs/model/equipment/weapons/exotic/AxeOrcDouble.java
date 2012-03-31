package br.com.while42.rpgcs.model.equipment.weapons.exotic;

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

public class AxeOrcDouble extends AbstractExoticWeapon {

	private static final int nameCode = R.string.weapon_exotic_axe_orc_double;
	private static final int cost = 60;
	private static final Map<SizeWeapon, List<HitDice>> damage = new HashMap<SizeWeapon, List<HitDice>>();	
	private static final int critical = 3;
	private static final int rangeIncrement = 0;
	private static final double weight = 12.5;
	private static final Set<TypeWeapon> types = new HashSet<TypeWeapon>();
	
	static {
		List<HitDice> small = Arrays.asList(new HitDice(HitDiceType.d6));
		List<HitDice> medium = Arrays.asList(new HitDice(HitDiceType.d8));
		
		damage.put(SizeWeapon.SMALL, small);
		damage.put(SizeWeapon.MEDIUM, medium);
		
		types.add(TypeWeapon.SLASHING);
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
