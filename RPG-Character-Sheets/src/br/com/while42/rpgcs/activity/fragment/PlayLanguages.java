package br.com.while42.rpgcs.activity.fragment;

import java.util.Arrays;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.character.Languages;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgLanguage;

public class PlayLanguages extends Fragment {

	private Languages languages;

	public PlayLanguages() {
	}

	public PlayLanguages(Languages languages) {
		this.languages = languages;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		View layout = inflater.inflate(R.layout.fragment_play_languages, container, false);

		if (languages == null)
			return layout;

		ListView lvLanguages = (ListView) layout.findViewById(R.id_frag_play_language.listview_languages);
		
		String[] lgs = new String[languages.getAll().size() + languages.getAllEspecial().size()];
		int i = 0;
		for (TypeRpgLanguage type : languages.getAll()) {
			lgs[i++] = getString(type.getCodeName());
		}

		for (String name : languages.getAllEspecial()) {
			lgs[i++] = name;
		}

		Arrays.sort(lgs);

		ArrayAdapter<String> adapterLanguages = new ArrayAdapter<String>(getActivity(), R.layout.list_languages,
				android.R.id.text1, lgs);

		lvLanguages.setAdapter(adapterLanguages);

		return layout;
	}
}
