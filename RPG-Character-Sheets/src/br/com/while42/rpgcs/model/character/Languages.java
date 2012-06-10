package br.com.while42.rpgcs.model.character;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import br.com.while42.rpgcs.model.character.attributes.TypeRpgLanguage;

public class Languages implements Serializable {
	private static final long serialVersionUID = 1L;

	private Set<TypeRpgLanguage> langs = new HashSet<TypeRpgLanguage>();
	
	public void add(TypeRpgLanguage language) {
		langs.add(language);
	}
	
	public void remove(TypeRpgLanguage language) {
		langs.remove(language);
	}
	
	public Set<TypeRpgLanguage> getAll() {
		return langs;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;

		if (!(o instanceof Languages))
			return false;

		Languages lgs = (Languages) o;
		
		return langs.equals(lgs.langs);
	}
	
	@Override
	public int hashCode() {
		return langs.hashCode();
	}
}
