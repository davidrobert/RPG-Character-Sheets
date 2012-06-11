package br.com.while42.rpgcs.model;

import java.util.Locale;

import android.content.Context;
import android.content.res.Resources;
import android.test.AndroidTestCase;
import android.util.DisplayMetrics;
import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.character.attributes.TypeEyeColor;

public class TypeCodeTest extends AndroidTestCase {

	private Context getContextByLocale(String locale) {		
		Context context = getContext();
		
		Resources res = context.getResources();

	    DisplayMetrics dm = res.getDisplayMetrics();
	    android.content.res.Configuration conf = res.getConfiguration();
	    conf.locale = new Locale(locale.toLowerCase());
	    res.updateConfiguration(conf, dm);
	    
	    return context;
	}
	
	public void testGetEnglishCodeNameOnInstaceOfTypeCode() {
		TypeCode tc = TypeEyeColor.Emerald_Green;
		TypeEyeColor tec = TypeEyeColor.Emerald_Green;

		Context context = getContextByLocale("en");

		assertEquals(context.getString(R.string.eye_color_emerald_green), context.getString(tec.getCodeName()));
		assertEquals(context.getString(R.string.eye_color_emerald_green), context.getString(tc.getCodeName()));
		
		assertEquals("Emerald Green", context.getString(tec.getCodeName()));
		assertEquals("Emerald Green", context.getString(tc.getCodeName()));
	}

	public void testGetPortugueseCodeNameOnInstaceOfTypeCode() {
		TypeCode tc = TypeEyeColor.Emerald_Green;
		TypeEyeColor tec = TypeEyeColor.Emerald_Green;

		Context context = getContextByLocale("pt");
		
		assertEquals(context.getString(R.string.eye_color_emerald_green), context.getString(tec.getCodeName()));
		assertEquals(context.getString(R.string.eye_color_emerald_green), context.getString(tc.getCodeName()));

		assertEquals("Verde Esmeralda", context.getString(tec.getCodeName()));
		assertEquals("Verde Esmeralda", context.getString(tc.getCodeName()));
	}
}
