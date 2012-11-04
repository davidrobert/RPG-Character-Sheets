package br.com.while42.rpgcs.activity.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.character.Defences;

public class PlayDefencesArmor extends Fragment {

	private Defences defences;

	public PlayDefencesArmor() {
	}

	public PlayDefencesArmor(Defences defences) {
		this.defences = defences;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		View layout = inflater.inflate(R.layout.fragment_play_defences_armor, container, false);

		if (defences == null)
			return layout;

		TextView tvTouch = (TextView) layout.findViewById(R.id_frag_play_defences_armor.textview_touch);
		TextView tvFlatFoted = (TextView) layout.findViewById(R.id_frag_play_defences_armor.textview_flat_footed);

		// TODO: Falta implementar
		tvTouch.setText("+10");
		tvFlatFoted.setText("+2");

		return layout;
	}
}
