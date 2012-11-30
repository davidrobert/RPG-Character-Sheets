package br.com.while42.rpgcs.adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.TypeCode;
import br.com.while42.rpgcs.model.character.Skill;
import br.com.while42.rpgcs.model.character.SkillOther;
import br.com.while42.rpgcs.model.character.Skills;
import br.com.while42.rpgcs.model.character.attributes.TypeAbilities;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgSkill;
import android.content.Context;
import android.database.DataSetObserver;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.TextView;

public class ListSkillsAdapter implements ListAdapter {

	private static int DEFAULT_VALUE_SKIN = 0;

	private Context context;
	private List<View> views;

	public ListSkillsAdapter(Context context, Skills skills) {
		this.context = context;
		views = new ArrayList<View>();
		load(skills);
	}

	private void load(Skills skills) {

		List<TypeRpgSkill> rpgSkills = new ArrayList<TypeRpgSkill>(Arrays.asList(TypeRpgSkill.values()));

		if (skills != null) {
			// Todas as skill que aparecem na ficha
			for (Skill skill : skills.getAll()) {
				rpgSkills.remove(skill.getType());

				TypeRpgSkill typeSkill = skill.getType();
				Integer modifier = skill.getModifier();

				addSkill(typeSkill, modifier);
			}
		}

		// Todas as demais skill (padrao) que ainda apareceram com valor zero(0)
		for (TypeRpgSkill typeSkill : rpgSkills) {
			addSkill(typeSkill, DEFAULT_VALUE_SKIN);
		}

		if (skills != null) {
			// Todas as skill especiais
			for (SkillOther especialSkill : skills.getAllOthers()) {

				String name = especialSkill.getName();
				TypeAbilities ability = especialSkill.getAbility();
				Integer modifier = especialSkill.getModifier();

				addSkill(name, ability, modifier);
			}
		}
	}

	private void addSkill(TypeRpgSkill typeSkill, Integer modifier) {
		String name = context.getString(typeSkill.getCodeName());
		TypeAbilities ability = typeSkill.getAbility();

		addSkill(name, ability, modifier);
	}

	private void addSkill(String name, TypeCode ability, Integer modifier) {
		Log.d("DEBUG (addSkill - TypeRpgSkill)", name);

		View layout = View.inflate(context, R.layout.part_edit_list_skills, null);

		TextView nameTextView = (TextView) layout.findViewById(R.id_part_edit_skills.textview_name);
		nameTextView.setText(name);

		EditText modifierEditText = (EditText) layout.findViewById(R.id_part_edit_skills.edittext_modifier);
		modifierEditText.setText(modifier.toString());

		if (ability != null) {
			TextView abilityTextView = (TextView) layout.findViewById(R.id_part_edit_skills.textview_ability);
			abilityTextView.setText(context.getString(ability.getCodeName()));
		}

		views.add(layout);
	}

	@Override
	public int getCount() {
		return views.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getItemViewType(int position) {
		return position % 2;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		return views.get(position);
	}

	@Override
	public int getViewTypeCount() {
		return 2;
	}

	@Override
	public boolean hasStableIds() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		return views.isEmpty();
	}

	@Override
	public void registerDataSetObserver(DataSetObserver observer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void unregisterDataSetObserver(DataSetObserver observer) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean areAllItemsEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled(int position) {
		// TODO Auto-generated method stub
		return false;
	}

}
