package br.com.while42.rpgcs.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.adapter.ListSkillsAdapter;
import br.com.while42.rpgcs.model.character.Skills;

public class EditSkills extends Fragment {

	private Skills skills;
	private ListView skillsListView;
	// private ViewGroup container;

	public EditSkills() {
	}

	public EditSkills(Skills skills) {
		this.skills = skills;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View layout = inflater.inflate(R.layout.fragment_edit_skills, container, false);

		skillsListView = (ListView) layout.findViewById(R.id_frag_edit_skills.listview_skills);		
		skillsListView.setAdapter(new ListSkillsAdapter(getActivity(), skills));

		return layout;
	}

	public Skills saveSkills() {

		if (skills == null) {
			skills = new Skills();
		}

		// TODO: Falta implementar...

		return skills;
	}

}
