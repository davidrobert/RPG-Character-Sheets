package br.com.while42.rpgcs.model.character;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Notes implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private List<String> list = new ArrayList<String>();
	
	public void add(String note) {
		list.add(note);
	}
	
	public List<String> getAll() {
		return new ArrayList<String>(list); 
	}
	
	public void clear() {
		list.clear();
	}
	
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		for (String note: list) {
			buffer.append(note).append('\n');
		}
		return buffer.toString();
	}
	
	@Override
	public boolean equals(Object notes) {
		if (this == notes)
			return true;

		if (!(notes instanceof Notes))
			return false;

		Notes n = (Notes) notes;

		return list.equals(n.list);
	}
	
	@Override
	public int hashCode() {
		return list.hashCode();
	}
}
