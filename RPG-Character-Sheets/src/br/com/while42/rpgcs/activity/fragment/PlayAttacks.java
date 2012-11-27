package br.com.while42.rpgcs.activity.fragment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.comparator.MapComparator;
import br.com.while42.rpgcs.model.HitDice;
import br.com.while42.rpgcs.model.equip.Equipments;
import br.com.while42.rpgcs.model.equip.weapons.TypeWeapon;
import br.com.while42.rpgcs.model.equip.weapons.Weapon;
import br.com.while42.rpgcs.model.equip.weapons.especial.EspecialWeapon;

public class PlayAttacks extends Fragment {

	private Equipments equipments;

	public PlayAttacks() {
	}

	public PlayAttacks(Equipments equipments) {
		this.equipments = equipments;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		View layout = inflater.inflate(R.layout.fragment_play_attacks, container, false);

		if (equipments == null)
			return layout;

		ListView lvAttacks = (ListView) layout.findViewById(R.id_frag_play_attacks.listview_attacks);

		ArrayList<HashMap<String, Object>> attks = new ArrayList<HashMap<String, Object>>();
		for (Weapon weapon : equipments.getWeapons()) {

			if (!weapon.isEquiped())
				continue;

			HashMap<String, Object> map = new HashMap<String, Object>();

			map.put("image", weapon.getCodeImage());

			String attackName = "";
			if (weapon.getClass().equals(EspecialWeapon.class)) {
				attackName = ((EspecialWeapon) weapon).getName();
			} else {
				attackName = getString(weapon.getCodeName());
			}
			map.put("attack", attackName);
			map.put("bonus", "0"); // TODO: Falta Implementar

			StringBuffer sbDamage = new StringBuffer();
			for (HitDice dice : weapon.getDamage()) {
				if (sbDamage.length() > 0) {
					sbDamage.append(" / ");
				}
				sbDamage.append(dice.toString());
			}

			map.put("damage", sbDamage.toString());
			map.put("critical", "0"); // TODO: Falta Implementar
			map.put("range", weapon.getRangeIncrement().toString());

			StringBuffer sbType = new StringBuffer();
			for (TypeWeapon type : weapon.getType()) {
				if (sbType.length() > 0) {
					sbType.append(" / ");
				}
				sbType.append(getString(type.getNameCode()));
			}

			map.put("type", sbType.toString());

			String notes = weapon.getDescription();
			map.put("notes", notes);

			attks.add(map);
		}

		Comparator<Map<String, Object>> mapComparator = new MapComparator().builderComparatorWithCast("attack");
		Collections.sort(attks, mapComparator);

		SimpleAdapter adapterAttacks = new SimpleAdapter(getActivity(), attks, R.layout.part_play_list_attacks, new String[] { "image", "attack", "bonus",
				"damage", "critical", "range", "type", "notes" }, new int[] { R.id.image, R.id.attack, R.id.bonus, R.id.damage, R.id.critical,
				R.id.range, R.id.type, R.id.notes });

		lvAttacks.setAdapter(adapterAttacks);

		return layout;
	}
}
