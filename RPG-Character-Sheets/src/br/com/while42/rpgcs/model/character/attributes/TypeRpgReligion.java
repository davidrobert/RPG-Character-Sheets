package br.com.while42.rpgcs.model.character.attributes;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.TypeCode;

public enum TypeRpgReligion implements TypeCode {
	
	NONE(R.string.religion_none, R.string.religion_none_description, null),
	BOCCOB(R.string.religion_boccob, R.string.religion_boccob_description, TypeRpgAlignment.TRUE_NEUTRAL),
	CORELLON_LARENTHIAN(R.string.religion_corellon_larenthian, R.string.religion_corellon_larenthian_description, TypeRpgAlignment.CHAOTIC_GOOD),
	EHLONNA(R.string.religion_ehlonna, R.string.religion_ehlonna_description, TypeRpgAlignment.NEUTRAL_GOOD),
	ERYTNUL(R.string.religion_erytnul, R.string.religion_erytnul_description, TypeRpgAlignment.CHAOTIC_EVIAL),

	FHARLANGHN(R.string.religion_fharlanghn, R.string.religion_fharlanghn_description, TypeRpgAlignment.TRUE_NEUTRAL),
	GARL_GLITTERGOLD(R.string.religion_garl_glittergold, R.string.religion_garl_glittergold_description, TypeRpgAlignment.NEUTRAL_GOOD),
	GRUUMSH(R.string.religion_gruumsh, R.string.religion_gruumsh_description, TypeRpgAlignment.CHAOTIC_EVIAL),
	HEIRONEOUS(R.string.religion_heironeous, R.string.religion_heironeous_description, TypeRpgAlignment.LAWFUL_GOOD),
	HEXTOR(R.string.religion_hextor, R.string.religion_hextor_description, TypeRpgAlignment.LAWFUL_EVIL),
	KORD(R.string.religion_kord, R.string.religion_kord_description, TypeRpgAlignment.CHAOTIC_GOOD),

	MORADIN(R.string.religion_moradin, R.string.religion_moradin_description, TypeRpgAlignment.LAWFUL_GOOD),
	NERULL(R.string.religion_nerull, R.string.religion_nerull_description, TypeRpgAlignment.CHAOTIC_NEUTRAL),
	OBAD_HAI(R.string.religion_obad_hai, R.string.religion_obad_hai_description, TypeRpgAlignment.TRUE_NEUTRAL),
	OLIDAMMARA(R.string.religion_olidammara, R.string.religion_olidammara_description, TypeRpgAlignment.CHAOTIC_NEUTRAL),
	PELOR(R.string.religion_pelor, R.string.religion_pelor_description, TypeRpgAlignment.NEUTRAL_GOOD),
	ST_CUTHBERT(R.string.religion_st_cuthbert, R.string.religion_st_cuthbert_description, TypeRpgAlignment.LAWFUL_GOOD),

	VECNA(R.string.religion_vecna, R.string.religion_vecna_description, TypeRpgAlignment.CHAOTIC_NEUTRAL),
	WEE_JAS(R.string.religion_wee_jas, R.string.religion_wee_jas_description, TypeRpgAlignment.LAWFUL_NEUTRAL),
	YONDALLA(R.string.religion_yondalla, R.string.religion_yondalla_description, TypeRpgAlignment.LAWFUL_GOOD),
	OTHER(R.string.religion_other, R.string.religion_other_description, null);

	private int nameCode;
	private int description;
	private TypeRpgAlignment alignment = null;
	
	private TypeRpgReligion(int nameCode, int description, TypeRpgAlignment alignment) {
		this.nameCode = nameCode;
		this.description = description;
		this.alignment = alignment;
	}

	@Override
	public int getCodeName() {
		return nameCode;
	}
	
	public int getDescriptionCode() {
		return description;
	}
	
	public TypeRpgAlignment getAlignment() {
		return alignment;
	}
	
	public static Set<TypeRpgReligion> getByAlignment(TypeRpgAlignment alignment) {
		Set<TypeRpgReligion> religions = new HashSet<TypeRpgReligion>();
		
		for (TypeRpgReligion r: TypeRpgReligion.values()) {
			if (r.getAlignment() == alignment) {
				religions.add(r);
			}
		}
		
		return (Set<TypeRpgReligion>) Collections.unmodifiableCollection(religions);
	}
}
