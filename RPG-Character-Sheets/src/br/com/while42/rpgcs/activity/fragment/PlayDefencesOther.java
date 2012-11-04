package br.com.while42.rpgcs.activity.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.character.Defences;

public class PlayDefencesOther extends Fragment {

	private Defences defences;

	public PlayDefencesOther() {
	}

	public PlayDefencesOther(Defences defences) {
		this.defences = defences;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		View layout = inflater.inflate(R.layout.fragment_play_defences_other, container, false);

		if (defences == null)
			return layout;

		TextView tvInitiative = (TextView) layout.findViewById(R.id_play.textview_initiative);
		TextView tvSpeed = (TextView) layout.findViewById(R.id_play.textview_speed);
		TextView tvGrapple = (TextView) layout.findViewById(R.id_play.textview_grapple);
		TextView tvSpellResistence = (TextView) layout.findViewById(R.id_play.textview_spell_resistence);

		// TODO: Falta implementar
		tvInitiative.setText("+1");
		tvSpeed.setText("+2");
		tvGrapple.setText("+3");
		tvSpellResistence.setText("+4");

		return layout;
	}
}
