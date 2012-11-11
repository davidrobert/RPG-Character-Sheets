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

	public PlayCharacteristics() {
	}
	
	public PlayCharacteristics(Characteristics characteristics, RpgClass classes) {
		this.characteristics = characteristics;
		this.classes = classes;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		View layout = inflater.inflate(R.layout.fragment_play_characteristics, container, false);

		if (characteristics == null || classes == null)
			return layout;
		
		TextView tvName = (TextView) layout.findViewById(R.id_frag_play_characteristics.textview_name);
		ImageView ivGender = (ImageView) layout.findViewById(R.id_frag_play_characteristics.imageview_gender);
		TextView tvRace = (TextView) layout.findViewById(R.id_frag_play_characteristics.textview_race);
		TextView tvAlignment = (TextView) layout.findViewById(R.id_frag_play_characteristics.textview_alignment);
		TextView tvClassesLevel = (TextView) layout.findViewById(R.id_frag_play_characteristics.textview_classes_level);
		TextView tvExperience = (TextView) layout.findViewById(R.id_frag_play_characteristics.textview_experience);
		
		tvName.setText(characteristics.getName());

		TypeGender gender = characteristics.getGender();
		if (TypeGender.MEN.equals(gender)) {
			ivGender.setBackgroundResource(R.drawable.gender_m20);
		} else if (TypeGender.WOMAN.equals(gender)) {
			ivGender.setBackgroundResource(R.drawable.gender_f20);
		}

		tvRace.setText(getString(characteristics.getRace().getCodeName()));

		tvAlignment.setText(getString(characteristics.getAlignment().getCodeName()));

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

		tvClassesLevel.setText(sbClassLevel.toString());

		tvExperience.setText(classes.getExperience().toString());

		return layout;
	}
}
