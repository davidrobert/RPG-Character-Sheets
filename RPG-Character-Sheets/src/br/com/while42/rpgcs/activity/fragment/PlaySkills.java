package br.com.while42.rpgcs.activity.fragment;

import java.text.DecimalFormat;
import java.text.NumberFormat;
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
import br.com.while42.rpgcs.model.character.Skill;
import br.com.while42.rpgcs.model.character.SkillOther;
import br.com.while42.rpgcs.model.character.Skills;
import br.com.while42.rpgcs.model.character.attributes.TypeAbilities;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgSkill;

public class PlaySkills extends Fragment {

	private Skills skills;

	public PlaySkills() {
	}

	public PlaySkills(Skills skills) {
		this.skills = skills;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		View layout = inflater.inflate(R.layout.fragment_play_skills, container, false);

		if (skills == null)
			return layout;

		ListView lvSkills = (ListView) layout.findViewById(R.id_frag_play_skills.listview_skills);
		
		NumberFormat fmt = new DecimalFormat("+#;-#");

		ArrayList<HashMap<String, String>> sklls = new ArrayList<HashMap<String, String>>();
		for (Skill skill : skills.getAll()) {
			HashMap<String, String> map = new HashMap<String, String>();
			TypeRpgSkill type = skill.getType();

			map.put("name", getString(type.getCodeName()));
			map.put("modifier", "(" + fmt.format(skill.getModifier()) + ")");

			TypeAbilities ability = type.getAbility();
			int code = (ability != null) ? ability.getCodeName() : R.string.ability_none;
			map.put("ability", getString(code));

			sklls.add(map);
		}

		for (SkillOther especialSkill : skills.getAllOthers()) {
			HashMap<String, String> map = new HashMap<String, String>();

			map.put("name", especialSkill.getName());
			map.put("modifier", "(" + fmt.format(especialSkill.getModifier()) + ")");

			TypeAbilities ability = especialSkill.getAbility();
			int code = (ability != null) ? ability.getCodeName() : R.string.ability_none;
			map.put("ability", getString(code));

			sklls.add(map);
		}

		Comparator<Map<String, String>> mapComparator = new MapComparator().builderComparator("name");
		Collections.sort(sklls, mapComparator);

		SimpleAdapter adapterSkills = new SimpleAdapter(getActivity(), sklls, R.layout.list_skills, 
				new String[] { "name", "modifier", "ability" }, new int[] { R.id.name, R.id.modifier, R.id.ability });

		lvSkills.setAdapter(adapterSkills);

		return layout;
	}
}
