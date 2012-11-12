package br.com.while42.rpgcs.activity.fragment;

import android.support.v4.app.Fragment;
import br.com.while42.rpgcs.model.character.RpgClass;

public class EditClasses extends Fragment {

	private RpgClass rpgClasses;

	public EditClasses() {
		// TODO Auto-generated constructor stub
	}

	public EditClasses(RpgClass rpgClasses) {
		this.rpgClasses = rpgClasses;
	}

	public RpgClass saveClasses() {
		// TODO Auto-generated method stub
		return rpgClasses;
	}

}
