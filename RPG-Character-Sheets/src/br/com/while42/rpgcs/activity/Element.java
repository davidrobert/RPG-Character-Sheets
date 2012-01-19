package br.com.while42.rpgcs.activity;

public class Element {
	private String text;
	private long id;

	public Element(String text, long id) {
		this.text = text;
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getmText() {
		return text;
	}

	public void setmText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return text;
	}
}
