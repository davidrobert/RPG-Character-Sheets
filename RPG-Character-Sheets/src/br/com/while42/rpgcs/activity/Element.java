package br.com.while42.rpgcs.activity;

import br.com.while42.rpgcs.model.TypeCode;

public class Element {
	private String text;
	private TypeCode type;

	public Element(TypeCode type, String text) {
		this.type = type;
		this.text = text;
	}

	public TypeCode getType() {
		return type;
	}

	public String getText() {
		return text;
	}

	@Override
	public String toString() {
		return text;
	}
}
