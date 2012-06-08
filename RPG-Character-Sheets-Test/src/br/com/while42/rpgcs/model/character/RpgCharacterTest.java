package br.com.while42.rpgcs.model.character;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import android.test.AndroidTestCase;
import android.util.Log;
import br.com.while42.rpgcs.model.character.attributes.TypeEyeColor;
import br.com.while42.rpgcs.model.character.attributes.TypeGender;
import br.com.while42.rpgcs.model.character.attributes.TypeHairColor;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgAlignment;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgRace;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgReligion;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgSize;
import br.com.while42.rpgcs.model.character.attributes.TypeSkinColor;
import br.com.while42.rpgcs.model.classes.AbstractRpgClass;
import br.com.while42.rpgcs.model.classes.Barbarian;
import br.com.while42.rpgcs.model.classes.Monk;
import br.com.while42.rpgcs.model.classes.Sorcerer;
import br.com.while42.rpgcs.model.classes.bonuses.ExperienceAndLevel;

public class RpgCharacterTest extends AndroidTestCase {

	public static List<RpgCharacter> getList() {
		List<RpgCharacter> rpgCharacterSheets = new ArrayList<RpgCharacter>();

		{
			RpgCharacter rc = new RpgCharacter();

			rc.setName("Blob");
			Attributes attr = rc.getAttributes();

			attr.setRace(TypeRpgRace.HUMAN);
			attr.setAlignment(TypeRpgAlignment.NEUTRAL_EVIL);
			attr.setReligion(TypeRpgReligion.NONE);

			attr.setSize(TypeRpgSize.MEDIUM);
			attr.setAge(40);
			attr.setGender(TypeGender.MEN);
			attr.setHeight(200);
			attr.setWeight(120);
			attr.setEye(TypeEyeColor.Brown);
			attr.setHair(TypeHairColor.BLACK);
			attr.setSkin(TypeSkinColor.PALE);

			AbstractRpgClass barbarian = new Barbarian();
			barbarian.setClassLevel(1);
			rc.getRpgClasses().add(barbarian);

			rpgCharacterSheets.add(rc);
		}

		{
			RpgCharacter rc = new RpgCharacter();

			rc.setName("Deltorei");
			Attributes attr = rc.getAttributes();

			attr.setRace(TypeRpgRace.HUMAN);
			attr.setAlignment(TypeRpgAlignment.TRUE_NEUTRAL);
			attr.setReligion(TypeRpgReligion.NONE);

			attr.setSize(TypeRpgSize.MEDIUM);
			attr.setAge(40);
			attr.setGender(TypeGender.MEN);
			attr.setHeight(200);
			attr.setWeight(120);
			attr.setEye(TypeEyeColor.Brown);
			attr.setHair(TypeHairColor.BLACK);
			attr.setSkin(TypeSkinColor.PALE);

			AbstractRpgClass monk = new Monk();
			monk.setClassLevel(20);
			rc.getRpgClasses().add(monk);

			rpgCharacterSheets.add(rc);
		}

		{
			RpgCharacter rc = new RpgCharacter();

			rc.setName("Galadriel");
			Attributes attr = rc.getAttributes();

			attr.setRace(TypeRpgRace.ELF);
			attr.setAlignment(TypeRpgAlignment.TRUE_NEUTRAL);
			attr.setReligion(TypeRpgReligion.OTHER);

			attr.setSize(TypeRpgSize.MEDIUM);
			attr.setAge(40);
			attr.setGender(TypeGender.WOMAN);
			attr.setHeight(200);
			attr.setWeight(120);
			attr.setEye(TypeEyeColor.Deep_Blue);
			attr.setHair(TypeHairColor.WHITE);
			attr.setSkin(TypeSkinColor.WHITE);

			AbstractRpgClass sorcerer = new Sorcerer();
			sorcerer.setClassLevel(ExperienceAndLevel.MAX_LEVEL);
			rc.getRpgClasses().add(sorcerer);

			rpgCharacterSheets.add(rc);
		}
		return rpgCharacterSheets;
	}

	public void testIsPersistent() {
		assertFalse(new RpgCharacter().isPersistent());
	}

	public void testSerialize() {
		RpgCharacter rpgcs1 = getList().get(0);
		
		byte[] serializeObject = serializeObject(rpgcs1);
		Object deserializeObject = deserializeObject(serializeObject);
		RpgCharacter rpgcs2 = (RpgCharacter) deserializeObject;

		assertEquals(rpgcs1, rpgcs2);
	}
	
	public static byte[] serializeObject(Object o) { 
	    ByteArrayOutputStream bos = new ByteArrayOutputStream(); 
	 
	    try { 
	      ObjectOutput out = new ObjectOutputStream(bos); 
	      out.writeObject(o); 
	      out.close(); 
	 
	      // Get the bytes of the serialized object 
	      byte[] buf = bos.toByteArray(); 
	 
	      return buf; 
	    } catch(IOException ioe) { 
	      Log.e("serializeObject", "error", ioe); 
	 
	      return null; 
	    } 
	  } 

	public static Object deserializeObject(byte[] b) { 
	    try { 
	      ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(b)); 
	      Object object = in.readObject(); 
	      in.close(); 
	 
	      return object; 
	    } catch(ClassNotFoundException cnfe) { 
	      Log.e("deserializeObject", "class not found error", cnfe); 
	 
	      return null; 
	    } catch(IOException ioe) { 
	      Log.e("deserializeObject", "io error", ioe); 
	 
	      return null; 
	    } 
	  } 
	
}
