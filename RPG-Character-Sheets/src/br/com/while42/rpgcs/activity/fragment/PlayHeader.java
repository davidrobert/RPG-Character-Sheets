package br.com.while42.rpgcs.activity.fragment;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.character.Attributes;
import br.com.while42.rpgcs.model.character.RpgCharacter;
import br.com.while42.rpgcs.model.character.attributes.TypeGender;
import br.com.while42.rpgcs.model.classes.AbstractRpgClass;

public class PlayHeader extends Fragment {

	private RpgCharacter rpgCharacter;

	public PlayHeader() {
	}
	
	public PlayHeader(RpgCharacter rpgCharacter) {
		this.rpgCharacter = rpgCharacter;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		View layout = inflater.inflate(R.layout.fragment_play_header, container, false);

		if (rpgCharacter == null)
			return layout;
		
		TextView tvName = (TextView) layout.findViewById(R.id_frag_play_header.textview_name);
		ImageView ivGender = (ImageView) layout.findViewById(R.id_frag_play_header.imageview_gender);
		TextView tvRace = (TextView) layout.findViewById(R.id_frag_play_header.textview_race);
		TextView tvAlignment = (TextView) layout.findViewById(R.id_frag_play_header.textview_alignment);
		TextView tvClassesLevel = (TextView) layout.findViewById(R.id_frag_play_header.textview_classes_level);
		TextView tvExperience = (TextView) layout.findViewById(R.id_frag_play_header.textview_experience);
		
		tvName.setText(rpgCharacter.getName());

		Attributes attr = rpgCharacter.getAttributes();

		TypeGender gender = attr.getGender();
		if (TypeGender.MEN.equals(gender)) {
			ivGender.setBackgroundResource(R.drawable.gender_m20);
		} else if (TypeGender.WOMAN.equals(gender)) {
			ivGender.setBackgroundResource(R.drawable.gender_f20);
		}

		tvRace.setText(getString(attr.getRace().getCodeName()));

		tvAlignment.setText(getString(attr.getAlignment().getCodeName()));

		StringBuilder sbClassLevel = new StringBuilder();
		for (AbstractRpgClass clazz : rpgCharacter.getRpgClasses().getAll()) {
			if (sbClassLevel.length() > 0) {
				sbClassLevel.append(" / ");
			}
			sbClassLevel.append(getString(clazz.getCodeName()));
			sbClassLevel.append(" (");
			sbClassLevel.append(clazz.getClassLevel().toString());
			sbClassLevel.append(")");
		}

		tvClassesLevel.setText(sbClassLevel.toString());

		tvExperience.setText(rpgCharacter.getRpgClasses().getExperience().toString());

		return layout;
	}
}
