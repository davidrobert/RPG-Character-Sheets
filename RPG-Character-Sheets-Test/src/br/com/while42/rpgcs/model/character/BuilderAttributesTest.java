package br.com.while42.rpgcs.model.character;

import android.test.AndroidTestCase;
import br.com.while42.rpgcs.model.character.attributes.TypeEyeColor;
import br.com.while42.rpgcs.model.character.attributes.TypeGender;
import br.com.while42.rpgcs.model.character.attributes.TypeHairColor;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgAlignment;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgRace;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgReligion;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgSize;
import br.com.while42.rpgcs.model.character.attributes.TypeSkinColor;
import br.com.while42.rpgcs.model.character.attributes.TypeVision;

public class BuilderAttributesTest extends AndroidTestCase {

	public void testBuilder() throws Throwable {
		BuilderCharacteristics builder = new BuilderCharacteristics();
		Characteristics characteristics = builder.setName("Blob")
				                       .setRace(TypeRpgRace.HUMAN)
				                       .setAlignment(TypeRpgAlignment.TRUE_NEUTRAL)
				                       .setReligion(TypeRpgReligion.NONE)
				                       .setSize(TypeRpgSize.MEDIUM)
				                       .setAge(30)
				                       .setGender(TypeGender.MEN)
				                       .setHeight(169)
				                       .setWeight(83)
				                       .setEye(TypeEyeColor.BROWN)
				                       .setHair(TypeHairColor.BROWN)
				                       .setSkin(TypeSkinColor.BROWN)
				                       .setVision(TypeVision.NORMAL)
				                       .toCharacteristics();
		
		assertEquals("Blob", characteristics.getName());
		assertEquals(TypeRpgRace.HUMAN, characteristics.getRace());
		assertEquals(TypeRpgAlignment.TRUE_NEUTRAL, characteristics.getAlignment());
		assertEquals(TypeRpgReligion.NONE, characteristics.getReligion());
		assertEquals(TypeRpgSize.MEDIUM, characteristics.getSize());
		assertEquals(30, characteristics.getAge().intValue());
		assertEquals(TypeGender.MEN, characteristics.getGender());
		assertEquals(169, characteristics.getHeight().intValue());
		assertEquals(83, characteristics.getWeight().intValue());
		assertEquals(TypeEyeColor.BROWN, characteristics.getEye());
		assertEquals(TypeHairColor.BROWN, characteristics.getHair());
		assertEquals(TypeSkinColor.BROWN, characteristics.getSkin());
	}
}
