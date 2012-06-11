package br.com.while42.rpgcs.model.character.attributes;

import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.TypeCode;

public enum TypeSkinColor implements TypeCode {
	PALE(R.string.skin_color_pale),
	FAIR(R.string.skin_color_fair),
	LIGHT(R.string.skin_color_light),
	LIGHT_TAN(R.string.skin_color_light_tan),
	TAN(R.string.skin_color_tan),
	DARK_TAN(R.string.skin_color_dark_tan),
	BROWN(R.string.skin_color_brown),
	DARK_BROWN(R.string.skin_color_dark_brown),
	BLACK(R.string.skin_color_black),
	GRAY(R.string.skin_color_gray),
	WHITE(R.string.skin_color_white),
	GOLD(R.string.skin_color_gold),
	SILVER(R.string.skin_color_silver),
	BRONZE(R.string.skin_color_bronze),
	RED(R.string.skin_color_red),
	ORANGE(R.string.skin_color_orange),
	YELLOW(R.string.skin_color_yellow),
	GREEN(R.string.skin_color_green),
	BLUE(R.string.skin_color_blue),
	PURPLE(R.string.skin_color_purple),
	PALE_YELLOW(R.string.skin_color_pale_yellow),
	DARK_RED(R.string.skin_color_dark_red),
	RED_ORANGE(R.string.skin_color_red_orange),
	LIGHT_RED(R.string.skin_color_light_red),
	AMBER(R.string.skin_color_amber),
	OLIVE(R.string.skin_color_olive),
	AQUA(R.string.skin_color_aqua),
	PALE_BROWN(R.string.skin_color_pale_brown),
	PALE_BLUE(R.string.skin_color_pale_blue),
	PALE_GREEN(R.string.skin_color_pale_green),
	PALE_GRAY(R.string.skin_color_pale_gray),
	DEEP_BLUE(R.string.skin_color_deep_blue),
	VIOLET_RED(R.string.skin_color_violet_red),
	SPRING_GREEN(R.string.skin_color_spring_green),
	SEA_GREEN(R.string.skin_color_sea_green),
	EMERALD_GREEN(R.string.skin_color_emerald_green);
	
	private int nameCode;

	private TypeSkinColor(int nameCode) {
		this.nameCode = nameCode;
	}

	@Override
	public int getCodeName() {
		return nameCode;
	}
}
