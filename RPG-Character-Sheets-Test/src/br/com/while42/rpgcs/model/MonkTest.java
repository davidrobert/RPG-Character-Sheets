package br.com.while42.rpgcs.model;

import junit.framework.Assert;
import android.test.AndroidTestCase;
import br.com.while42.rpgcs.model.character.attributes.TypeRpgSize;
import br.com.while42.rpgcs.model.classes.Monk;
import br.com.while42.rpgcs.model.classes.bonuses.ExperienceAndLevel;

public class MonkTest extends AndroidTestCase {
		
	public void testGetUnarmedDamageBasic() throws Throwable {		
		for (int level = ExperienceAndLevel.MIN_LEVEL; level <= ExperienceAndLevel.MAX_LEVEL; level++) {
			Assert.assertNotNull(new Monk().getUnarmedDamage(level, TypeRpgSize.SMALL));
			Assert.assertNotNull(new Monk().getUnarmedDamage(level, TypeRpgSize.LARGE));
		}			
	}
	
}
