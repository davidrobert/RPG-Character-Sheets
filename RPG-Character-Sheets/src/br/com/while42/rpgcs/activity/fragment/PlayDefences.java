package br.com.while42.rpgcs.activity.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.character.Defences;

public class PlayDefences extends Fragment {

	private Defences defences;

	public PlayDefences() {
	}

	public PlayDefences(Defences defences) {
		this.defences = defences;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		View layout = inflater.inflate(R.layout.fragment_play_defences, container, false);

		if (defences == null)
			return layout;

		TextView tvArmorClass = (TextView) layout.findViewById(R.id_frag_play_defences.textview_armor_class);
		tvArmorClass.setText(defences.getArmorClass().toString());

		return layout;
	}
}
