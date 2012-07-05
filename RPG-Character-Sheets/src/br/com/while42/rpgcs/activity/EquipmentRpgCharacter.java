package br.com.while42.rpgcs.activity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.comparable.MapComparable;
import br.com.while42.rpgcs.model.HitDice;
import br.com.while42.rpgcs.model.character.RpgCharacter;
import br.com.while42.rpgcs.model.equip.weapons.AbstractWeapon;
import br.com.while42.rpgcs.reflection.ClassByReflection;

public class EquipmentRpgCharacter extends Activity {

	private List<AbstractWeapon> listWeapons;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_equipment_character);

		Bundle bn = new Bundle();
		bn = getIntent().getExtras();
		RpgCharacter rpgCharacter = (RpgCharacter) bn.getSerializable(RpgCharacter.class.getName());

		Log.d("EQUIPMENT - ID: ", rpgCharacter.getId().toString());

		ListView lvEquipments = (ListView) findViewById(R.id_equipment.listview_equipments);

		ArrayList<HashMap<String, String>> equips = new ArrayList<HashMap<String, String>>();

		listWeapons = new ClassByReflection().getAll(this, "br.com.while42.rpgcs", AbstractWeapon.class);

		for (AbstractWeapon weapon : listWeapons) {
			HashMap<String, String> map = new HashMap<String, String>();

			map.put("name", getString(weapon.getCodeName()));
			
			if (getString(weapon.getCodeName()).isEmpty()) {
				
			}

			StringBuffer buffer = new StringBuffer();
			for (HitDice dice : weapon.getDamage()) {
				if (buffer.length() > 0) {
					buffer.append(" / ");
				}
				buffer.append(dice);
			}

			map.put("damage", "(" + buffer.toString() + ")");
			map.put("range", weapon.getRangeIncrement().toString());

			equips.add(map);
		}

		Comparator<Map<String, String>> mapComparator = new MapComparable().builderComparator("name");
		Collections.sort(equips, mapComparator);

		SimpleAdapter adapterEquipments = new SimpleAdapter(this, equips, R.layout.list_equipments, new String[] {
				"name", "damage", "range" }, new int[] { R.id.name, R.id.damage, R.id.range });

		lvEquipments.setAdapter(adapterEquipments);
	}
	
}
