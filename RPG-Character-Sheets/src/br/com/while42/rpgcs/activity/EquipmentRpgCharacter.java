package br.com.while42.rpgcs.activity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.comparator.MapComparator;
import br.com.while42.rpgcs.model.HitDice;
import br.com.while42.rpgcs.model.character.RpgCharacter;
import br.com.while42.rpgcs.model.equip.Equipments;
import br.com.while42.rpgcs.model.equip.weapons.Weapon;
import br.com.while42.rpgcs.model.equip.weapons.especial.EspecialWeapon;

import com.actionbarsherlock.app.SherlockActivity;

public class EquipmentRpgCharacter extends SherlockActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_equipment_character);

		Bundle bn = new Bundle();
		bn = getIntent().getExtras();
		RpgCharacter rpgCharacter = (RpgCharacter) bn.getSerializable(RpgCharacter.class.getName());

		Log.d("EQUIPMENT - ID: ", rpgCharacter.getId().toString());

		ArrayList<HashMap<String, Object>> strWeapons = new ArrayList<HashMap<String, Object>>();

		Equipments equipments = rpgCharacter.getEquipments();
		for (Weapon weapon : equipments.getWeapons()) {
			HashMap<String, Object> map = new HashMap<String, Object>();

			Log.d("Weapon", getWeaponName(weapon));

			int categorieCodeName = weapon.getCategorie().getCodeName();
			int udefulnessCodeName = weapon.getCategorieUsefulness().getCodeName();
			// TODO: Encumbrance eh NULL para RANGED Weapons
			// int encumbranceCodeName = weapon.getCategorieEncumbrance().getCodeName();

			// map.put("type", R.string.equipment_label_type_weapon);
			map.put("image", weapon.getCodeImage());
			map.put("name", getWeaponName(weapon));
			map.put("categorie", getString(categorieCodeName));
			map.put("critical", weapon.getCritical().toString());
			map.put("range", weapon.getRangeIncrement().toString());
			map.put("cost", weapon.getCost().toString());
			map.put("weight", weapon.getWeight().toString());
			map.put("categorie_usefulness", getString(udefulnessCodeName));
			// map.put("categorie_encumbrance", getString(encumbranceCodeName));

			StringBuffer buffer = new StringBuffer();
			for (HitDice dice : weapon.getDamage()) {
				if (buffer.length() > 0) {
					buffer.append(" / ");
				}
				buffer.append(dice);
			}

			map.put("damage", "(" + buffer.toString() + ")");

			strWeapons.add(map);
		}

		ListView lvEquipments = (ListView) findViewById(R.id_equipment.listview_equipments);

		Comparator<Map<String, Object>> mapComparator = new MapComparator().builderComparatorWithCast("name");
		Collections.sort(strWeapons, mapComparator);

		SimpleAdapter adapterEquipments = new SimpleAdapter(this, strWeapons, R.layout.part_play_list_weapons, new String[] { "image",
				"name", "categorie", "critical", "range", "cost", "weight", "categorie_usefulness", "categorie_encumbrance",
				"damage" }, new int[] { R.id.image, R.id.name, R.id.categorie, R.id.critical, R.id.range, R.id.cost, R.id.weight,
				R.id.categorie_usefulness, R.id.categorie_encumbrance, R.id.damage });

		lvEquipments.setAdapter(adapterEquipments);

		// -----------------

		/*
		 * ListView lvEquipments = (ListView)
		 * findViewById(R.id_equipment.listview_equipments);
		 * 
		 * ArrayList<HashMap<String, String>> equips = new
		 * ArrayList<HashMap<String, String>>();
		 * 
		 * listWeapons = ClassByReflection.getAll(this, AbstractWeapon.class);
		 * 
		 * for (AbstractWeapon weapon : listWeapons) { HashMap<String, String>
		 * map = new HashMap<String, String>();
		 * 
		 * map.put("name", getString(weapon.getCodeName()));
		 * 
		 * if (getString(weapon.getCodeName()).isEmpty()) {
		 * 
		 * }
		 * 
		 * StringBuffer buffer = new StringBuffer(); for (HitDice dice :
		 * weapon.getDamage()) { if (buffer.length() > 0) {
		 * buffer.append(" / "); } buffer.append(dice); }
		 * 
		 * map.put("damage", "(" + buffer.toString() + ")"); map.put("range",
		 * weapon.getRangeIncrement().toString());
		 * 
		 * equips.add(map); }
		 * 
		 * 
		 * Comparator<Map<String, String>> mapComparator = new
		 * MapComparator().builderComparator("name"); Collections.sort(equips,
		 * mapComparator);
		 * 
		 * SimpleAdapter adapterEquipments = new SimpleAdapter(this, equips,
		 * R.layout.list_equipments, new String[] { "name", "damage", "range" },
		 * new int[] { R.id.name, R.id.damage, R.id.range });
		 * 
		 * lvEquipments.setAdapter(adapterEquipments);
		 */
	}

	private String getWeaponName(Weapon weapon) {

		if (weapon instanceof EspecialWeapon) {
			return ((EspecialWeapon) weapon).getName();
		}

		int weaponCodeName = weapon.getCodeName();
		if (weaponCodeName == 0) {
			return "";
		}

		return getString(weaponCodeName);
	}

}
