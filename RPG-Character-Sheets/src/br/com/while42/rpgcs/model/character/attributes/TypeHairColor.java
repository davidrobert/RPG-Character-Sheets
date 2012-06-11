package br.com.while42.rpgcs.model.character.attributes;

import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.TypeCode;

public enum TypeHairColor implements TypeCode {
	BLACK(R.string.hair_color_black),
	GRAY(R.string.hair_color_gray),
	PLATINUM(R.string.hair_color_platinum),
	WHITE(R.string.hair_color_white),
	DARK_BLONDE(R.string.hair_color_dark_blonde),
	BLONDE(R.string.hair_color_blonde),
	BLEACH_BLONDE(R.string.hair_color_bleach_blonde),
	DARK_REDHEAD(R.string.hair_color_dark_redhead),
	REDHEAD(R.string.hair_color_redhead),
	LIGHT_REDHEAD(R.string.hair_color_light_redhead),
	BRUNETTE(R.string.hair_color_brunette),
	AUBURN(R.string.hair_color_auburn),
	YELLOW(R.string.hair_color_yellow),
	AMBER(R.string.hair_color_amber),
	BROWN(R.string.hair_color_brown),
	HAZEL(R.string.hair_color_hazel),
	GREEN(R.string.hair_color_green),
	BLUE(R.string.hair_color_blue),
	SILVER(R.string.hair_color_silver),
	AQUA(R.string.hair_color_aqua),
	RED(R.string.hair_color_red),
	PURPLE(R.string.hair_color_purple),
	PALE_BROWN(R.string.hair_color_pale_brown),
	PALE_BLUE(R.string.hair_color_pale_blue),
	PALE_GREEN(R.string.hair_color_pale_green),
	PALE_GRAY(R.string.hair_color_pale_gray),
	DEEP_BLUE(R.string.hair_color_deep_blue),
	VIOLET_RED(R.string.hair_color_violet_red),
	ORANGE(R.string.hair_color_orange),
	SPRING_GREEN(R.string.hair_color_spring_green),
	SEA_GREEN(R.string.hair_color_sea_green),
	EMERALD_GREEN(R.string.hair_color_emerald_green);
	
	private int nameCode;

	private TypeHairColor(int nameCode) {
		this.nameCode = nameCode;
	}

	@Override
	public int getCodeName() {
		return nameCode;
	}
}
