package br.com.while42.rpgcs.model.character.attributes;

import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.TypeCode;

public enum TypeEyeColor implements TypeCode {
	YELLOW(R.string.eye_color_yellow),
	AMBER(R.string.eye_color_amber),
	BROWN(R.string.eye_color_brown),
	HAZEL(R.string.eye_color_hazel),
	GREEN(R.string.eye_color_green),
	BLUE(R.string.eye_color_blue),
	GRAY(R.string.eye_color_gray),
	AQUA(R.string.eye_color_aqua),
	RED(R.string.eye_color_red),
	PURPLE(R.string.eye_color_purple),
	PALE_BROWN(R.string.eye_color_pale_brown),
	PALE_BLUE(R.string.eye_color_pale_blue),
	PALE_GREEN(R.string.eye_color_pale_green),
	PALE_GRAY(R.string.eye_color_pale_gray),
	DEEP_BLUE(R.string.eye_color_deep_blue),
	VIOLET_RED(R.string.eye_color_violet_red),
	ORANGE(R.string.eye_color_orange),
	SPRING_GREEN(R.string.eye_color_spring_green),
	SEA_GREEN(R.string.eye_color_sea_green),
	EMERALD_GREEN(R.string.eye_color_emerald_green);
	
	private int nameCode;

	private TypeEyeColor(int nameCode) {
		this.nameCode = nameCode;
	}

	@Override
	public int getCodeName() {
		return nameCode;
	}

}
