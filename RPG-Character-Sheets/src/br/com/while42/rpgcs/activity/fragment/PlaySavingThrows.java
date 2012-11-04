package br.com.while42.rpgcs.activity.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.character.Defences;
import br.com.while42.rpgcs.model.character.SavingThrows;

public class PlaySavingThrows extends Fragment {

	private Defences defences;
	private SavingThrows savingThrows;

	public PlaySavingThrows() {
	}

	public PlaySavingThrows(Defences defences, SavingThrows savingThrows) {
		this.defences = defences;
		this.savingThrows = savingThrows;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		View layout = inflater.inflate(R.layout.fragment_play_savingthrows, container, false);

		if (defences != null) {
			TextView tvArmorClass = (TextView) layout.findViewById(R.id_frag_play_defences.textview_armor_class);
			tvArmorClass.setText(defences.getArmorClass().toString());
		}

		if (savingThrows != null) {
			TextView tvFortitude = (TextView) layout.findViewById(R.id_frag_play_defences.textview_fortitude);
			TextView tvReflex = (TextView) layout.findViewById(R.id_frag_play_defences.textview_reflex);
			TextView tvThrowsWill = (TextView) layout.findViewById(R.id_frag_play_defences.textview_will);

			tvFortitude.setText(savingThrows.getFortitude().toString());
			tvReflex.setText(savingThrows.getReflex().toString());
			tvThrowsWill.setText(savingThrows.getThrowsWill().toString());
		}

		return layout;
	}
}
