package br.com.while42.rpgcs.activity.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.character.Defences;

public class PlayHitPoints extends Fragment {

	private Defences defences;

	public PlayHitPoints() {
	}

	public PlayHitPoints(Defences defences) {
		this.defences = defences;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		View layout = inflater.inflate(R.layout.fragment_play_hitpoints, container, false);

		if (defences == null)
			return layout;

		TextView tvHitPointsActual = (TextView) layout.findViewById(R.id_frag_play_hitpoints.textview_hitpoints_actual);
		TextView tvHitPointsTotal = (TextView) layout.findViewById(R.id_frag_play_hitpoints.textview_hitpoints_total);

		tvHitPointsActual.setText(defences.getCurrentHitPoints().toString());
		tvHitPointsTotal.setText(defences.getHitPoints().toString());

		return layout;
	}
}
