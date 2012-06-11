package br.com.while42.rpgcs.model.character.attributes;

import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.TypeCode;

public enum TypeRpgAlignment implements TypeCode {
		
	LAWFUL_GOOD(R.string.alignment_lawful_good),
	NEUTRAL_GOOD(R.string.alignment_neutral_good),
	CHAOTIC_GOOD(R.string.alignment_chaotic_good),
	
	LAWFUL_NEUTRAL(R.string.alignment_lawful_neutral),
	TRUE_NEUTRAL(R.string.alignment_true_neutral),
	CHAOTIC_NEUTRAL(R.string.alignment_chaotic_neutral),

	LAWFUL_EVIL(R.string.alignment_lawful_evil),
	NEUTRAL_EVIL(R.string.alignment_neutral_evil),
	CHAOTIC_EVIAL(R.string.alignment_chaotic_evil);
	
	private int nameCode;
	
	private TypeRpgAlignment(int nameCode) {
		this.nameCode = nameCode;
	}
	
	@Override
	public int getCodeName() {
		return nameCode;
	}
}
