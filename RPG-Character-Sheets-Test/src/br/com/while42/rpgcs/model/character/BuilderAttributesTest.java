package br.com.while42.rpgcs.model.character;

import br.com.while42.rpgcs.model.character.attributes.TypeEyeColor;
import br.com.while42.rpgcs.model.character.attributes.TypeGender;
import br.com.while42.rpgcs.model.character.attributes.TypeHairColor;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgAlignment;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgRace;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgReligion;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgSize;
import br.com.while42.rpgcs.model.character.attributes.TypeSkinColor;
import br.com.while42.rpgcs.model.character.attributes.TypeVision;
import android.test.AndroidTestCase;

public class BuilderAttributesTest extends AndroidTestCase {

	public void testBuilder() throws Throwable {
		BuilderAttributes builder = new BuilderAttributes();
		Attributes attributes = builder.setRace(TypeRpgRace.HUMAN)
				                       .setAlignment(TypeRpgAlignment.TRUE_NEUTRAL)
				                       .setReligion(TypeRpgReligion.NONE)
				                       .setSize(TypeRpgSize.MEDIUM)
				                       .setAge(30)
				                       .setGender(TypeGender.MEN)
				                       .setHeight(169)
				                       .setWeight(83)
				                       .setEye(TypeEyeColor.Brown)
				                       .setHair(TypeHairColor.BROWN)
				                       .setSkin(TypeSkinColor.BROWN)
				                       .setVision(TypeVision.NORMAL)
				                       .toAttributes();
		
		assertEquals(TypeRpgRace.HUMAN, attributes.getRace());
		assertEquals(TypeRpgAlignment.TRUE_NEUTRAL, attributes.getAlignment());
		assertEquals(TypeRpgReligion.NONE, attributes.getReligion());
		assertEquals(TypeRpgSize.MEDIUM, attributes.getSize());
		assertEquals(30, attributes.getAge().intValue());
		assertEquals(TypeGender.MEN, attributes.getGender());
		assertEquals(169, attributes.getHeight().intValue());
		assertEquals(83, attributes.getWeight().intValue());
		assertEquals(TypeEyeColor.Brown, attributes.getEye());
		assertEquals(TypeHairColor.BROWN, attributes.getHair());
		assertEquals(TypeSkinColor.BROWN, attributes.getSkin());
	}
}
