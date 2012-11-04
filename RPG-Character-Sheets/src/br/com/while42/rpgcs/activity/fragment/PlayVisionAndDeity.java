package br.com.while42.rpgcs.activity.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.character.Attributes;

public class PlayVisionAndDeity extends Fragment {

	private Attributes attr;

	public PlayVisionAndDeity() {
	}

	public PlayVisionAndDeity(Attributes attr) {
		this.attr = attr;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		View layout = inflater.inflate(R.layout.fragment_play_vision_deity, container, false);

		if (attr == null)
			return layout;

		TextView tvReligion = (TextView) layout.findViewById(R.id_frag_play_vision.textview_religion);
		TextView tvVision = (TextView) layout.findViewById(R.id_frag_play_vision.textview_vision);
		
		String religion = getString(attr.getReligion().getCodeName());
		tvReligion.setText(religion);

		String vision = getString(attr.getVision().getCodeName());
		tvVision.setText(vision);

		return layout;
	}
}
