package br.com.while42.rpgcs.activity.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.character.Characteristics;
import br.com.while42.rpgcs.model.character.RpgClass;
import br.com.while42.rpgcs.model.character.attributes.TypeGender;
import br.com.while42.rpgcs.model.classes.AbstractRpgClass;

public class PlayCharacteristics extends Fragment {

	private Characteristics characteristics;
	private RpgClass classes;

	private TextView nameTextView;
	private ImageView genderImageView;
	private TextView raceTextView;
	private TextView alignmentTextView;
	private TextView classesLevelTextView;
	private TextView experienceTextView;

	public PlayCharacteristics() {
	}

	public PlayCharacteristics(Characteristics characteristics, RpgClass classes) {
		this.characteristics = characteristics;
		this.classes = classes;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		View layout = inflater.inflate(R.layout.fragment_play_characteristics, container, false);

		nameTextView = (TextView) layout.findViewById(R.id_frag_play_characteristics.textview_name);
		genderImageView = (ImageView) layout.findViewById(R.id_frag_play_characteristics.imageview_gender);
		raceTextView = (TextView) layout.findViewById(R.id_frag_play_characteristics.textview_race);
		alignmentTextView = (TextView) layout.findViewById(R.id_frag_play_characteristics.textview_alignment);
		classesLevelTextView = (TextView) layout.findViewById(R.id_frag_play_characteristics.textview_classes_level);
		experienceTextView = (TextView) layout.findViewById(R.id_frag_play_characteristics.textview_experience);

		loadCharacteristics();
		loadRpgClasses();

		return layout;
	}

	private void loadCharacteristics() {
		if (characteristics == null)
			return;

		nameTextView.setText(characteristics.getName());

		TypeGender gender = characteristics.getGender();
		if (TypeGender.MEN.equals(gender)) {
			genderImageView.setBackgroundResource(R.drawable.gender_m20);
		} else if (TypeGender.WOMAN.equals(gender)) {
			genderImageView.setBackgroundResource(R.drawable.gender_f20);
		}

		raceTextView.setText(getString(characteristics.getRace().getCodeName()));

		alignmentTextView.setText(getString(characteristics.getAlignment().getCodeName()));
	}

	private void loadRpgClasses() {
		if (classes == null)
			return;

		StringBuilder sbClassLevel = new StringBuilder();
		for (AbstractRpgClass clazz : classes.getAll()) {
			if (sbClassLevel.length() > 0) {
				sbClassLevel.append(" / ");
			}
			sbClassLevel.append(getString(clazz.getCodeName()));
			sbClassLevel.append(" (");
			sbClassLevel.append(clazz.getClassLevel().toString());
			sbClassLevel.append(")");
		}

		classesLevelTextView.setText(sbClassLevel.toString());

		experienceTextView.setText(classes.getExperience().toString());
	}

}
