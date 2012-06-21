package br.com.while42.rpgcs.model.character.attributes;

import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.TypeCode;

public enum TypeVision implements TypeCode {
	
	NORMAL(R.string.vision_normal),
	LOW_LIGHT(R.string.vision_low_light),
	DARKVISION(R.string.vision_darkvision),
	TREMORSENSE(R.string.vision_tremorsense),
	INFRAVISION(R.string.vision_infravision),
	ULTRAVISION(R.string.vision_ultravision);
	
	private int nameCode;

	private TypeVision(int nameCode) {
		this.nameCode = nameCode;
	}

	@Override
	public int getCodeName() {
		return nameCode;
	}
}
