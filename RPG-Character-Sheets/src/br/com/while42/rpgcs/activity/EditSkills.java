package br.com.while42.rpgcs.activity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.TypeCode;
import br.com.while42.rpgcs.model.character.Skill;
import br.com.while42.rpgcs.model.character.SkillOther;
import br.com.while42.rpgcs.model.character.Skills;
import br.com.while42.rpgcs.model.character.attributes.TypeAbilities;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgSkill;

public class EditSkills extends Fragment {

	private Skills skills;
	private ListView skillsListView;
	private Context context;
	//private ViewGroup container;

	private static int DEFAULT_VALUE_SKIN = 0;

	public EditSkills() {
	}

	public EditSkills(Skills skills) {
		this.skills = skills;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View layout = inflater.inflate(R.layout.fragment_edit_skills, container, false);
		context = layout.getContext();
		//this.container = container;

		if (skills == null)
			return layout;

		skillsListView = (ListView) layout.findViewById(R.id_frag_edit_skills.listview_skills);

		loadSkills();

		return layout;
	}

	private void loadSkills() {

		if (skills == null)
			return;

		List<TypeRpgSkill> rpgSkills = new ArrayList<TypeRpgSkill>(Arrays.asList(TypeRpgSkill.values()));

		// Todas as skill que aparecem na ficha
		for (Skill skill : skills.getAll()) {
			rpgSkills.remove(skill.getType());

			TypeRpgSkill typeSkill = skill.getType();
			Integer modifier = skill.getModifier();

			addSkill(typeSkill, modifier);
		}

		// Todas as demais skill (padrao) que ainda apareceram com valor zero
		// (0)
		for (TypeRpgSkill typeSkill : rpgSkills) {
			addSkill(typeSkill, DEFAULT_VALUE_SKIN);
		}

		// Todas as skill especiais
		for (SkillOther especialSkill : skills.getAllOthers()) {

			String name = especialSkill.getName();
			TypeAbilities ability = especialSkill.getAbility();
			Integer modifier = especialSkill.getModifier();

			addSkill(name, ability, modifier);
		}
	}

	private void addSkill(TypeRpgSkill typeSkill, Integer modifier) {
		String name = getString(typeSkill.getCodeName());
		TypeAbilities ability = typeSkill.getAbility();

		addSkill(name, ability, modifier);
	}

	private void addSkill(String name, TypeCode ability, Integer modifier) {
		View layout = View.inflate(skillsListView.getContext(), R.layout.part_edit_list_skills, null);

		TextView nameTextView = (TextView) layout.findViewById(R.id_part_edit_skills.textview_name);
		nameTextView.setText(name);

		EditText modifierEditText = (EditText) layout.findViewById(R.id_part_edit_skills.edittext_modifier);
		modifierEditText.setText(modifier.toString());

		if (ability != null) {
			TextView abilityTextView = (TextView) layout.findViewById(R.id_part_edit_skills.textview_ability);
			abilityTextView.setText(getString(ability.getCodeName()));
		}

		skillsListView.addFooterView(layout);
	}

	public Skills saveSkills() {

		if (skills == null) {
			skills = new Skills();
		}
		
		// TODO: Falta implementar...

		return skills;
	}

}
