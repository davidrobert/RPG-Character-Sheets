package br.com.while42.rpgcs.activity.support;

public enum TypeRequestCode {

	NEW_CHARACTER_REQUEST(1),
	EDIT_CHARACTER_REQUEST(2);
	
	private int code;
	
	private TypeRequestCode(int code) {
		this.code = code;
	}
	
	public int getValue() {
		return code;
	}
}
