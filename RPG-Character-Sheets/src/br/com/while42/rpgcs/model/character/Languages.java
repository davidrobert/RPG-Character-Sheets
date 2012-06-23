package br.com.while42.rpgcs.model.character;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import br.com.while42.rpgcs.model.character.attributes.TypeRpgLanguage;

public class Languages implements Serializable {
	private static final long serialVersionUID = 1L;

	private Set<TypeRpgLanguage> langs = new HashSet<TypeRpgLanguage>();
	private Set<String> especials = new HashSet<String>();
	
	public void add(TypeRpgLanguage language) {
		langs.add(language);
	}
	
	public void remove(TypeRpgLanguage language) {
		langs.remove(language);
	}
	
	public Set<TypeRpgLanguage> getAll() {
		return new HashSet<TypeRpgLanguage>(langs);
	}
	
	public void add(String especialLanguage) {
		especials.add(especialLanguage);
	}
	
	public void remove(String especialLanguage) {
		especials.remove(especialLanguage);
	}
	
	public Set<String> getAllEspecial() {
		return new HashSet<String>(especials);
	}
	
	public void clear() {
		langs.clear();
		especials.clear();
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;

		if (!(o instanceof Languages))
			return false;

		Languages lgs = (Languages) o;
		
		return langs.equals(lgs.langs) && especials.equals(lgs.especials);
	}
	
	@Override
	public int hashCode() {
		return langs.hashCode() + especials.hashCode();
	}
}
