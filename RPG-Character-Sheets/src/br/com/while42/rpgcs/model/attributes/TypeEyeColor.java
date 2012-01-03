package br.com.while42.rpgcs.model.attributes;

import br.com.while42.rpgcs.R;
import android.content.Context;

public enum TypeEyeColor {
	Yellow(R.string.eye_color_yellow),
	Amber(R.string.eye_color_amber),
	Brown(R.string.eye_color_brown),
	Hazel(R.string.eye_color_hazel),
	Green(R.string.eye_color_green),
	Blue(R.string.eye_color_blue),
	Gray(R.string.eye_color_gray),
	Aqua(R.string.eye_color_aqua),
	Red(R.string.eye_color_red),
	Purple(R.string.eye_color_purple),
	Pale_Brown(R.string.eye_color_pale_brown),
	Pale_Blue(R.string.eye_color_pale_blue),
	Pale_Green(R.string.eye_color_pale_green),
	Pale_Gray(R.string.eye_color_pale_gray),
	Deep_Blue(R.string.eye_color_deep_blue),
	Violet_Red(R.string.eye_color_violet_red),
	Orange(R.string.eye_color_orange),
	Spring_Green(R.string.eye_color_spring_green),
	Sea_Green(R.string.eye_color_sea_green),
	Emerald_Green(R.string.eye_color_emerald_green);
	
	private int code;

	private TypeEyeColor(int code) {
		this.code = code;
	}

	public String toString(Context ctx) {
		return ctx.getString(code);
	}

}
