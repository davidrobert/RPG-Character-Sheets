package br.com.while42.rpgcs.model;

import br.com.while42.rpgcs.R;
import android.content.Context;

public enum TypeRpgReligion {
	
	NONE(R.string.religion_none, R.string.religion_none_description, R.string.religion_none_alignment),
	BOCCOB(R.string.religion_boccob, R.string.religion_boccob_description, R.string.religion_boccob_alignment),
	CORELLON_LARENTHIAN(R.string.religion_corellon_larenthian, R.string.religion_corellon_larenthian_description, R.string.religion_corellon_larenthian_alignment),
	EHLONNA(R.string.religion_ehlonna, R.string.religion_ehlonna_description, R.string.religion_ehlonna_alignment),
	ERYTNUL(R.string.religion_erytnul, R.string.religion_erytnul_description, R.string.religion_erytnul_alignment),

	FHARLANGHN(R.string.religion_fharlanghn, R.string.religion_fharlanghn_description, R.string.religion_fharlanghn_alignment),
	GARL_GLITTERGOLD(R.string.religion_garl_glittergold, R.string.religion_garl_glittergold_description, R.string.religion_garl_glittergold_alignment),
	GRUUMSH(R.string.religion_gruumsh, R.string.religion_gruumsh_description, R.string.religion_gruumsh_alignment),
	HEIRONEOUS(R.string.religion_heironeous, R.string.religion_heironeous_description, R.string.religion_heironeous_alignment),
	HEXTOR(R.string.religion_hextor, R.string.religion_hextor_description, R.string.religion_hextor_alignment),
	KORD(R.string.religion_kord, R.string.religion_kord_description, R.string.religion_kord_alignment),

	MORADIN(R.string.religion_moradin, R.string.religion_moradin_description, R.string.religion_moradin_alignment),
	NERULL(R.string.religion_nerull, R.string.religion_nerull_description, R.string.religion_nerull_alignment),
	OBAD_HAI(R.string.religion_obad_hai, R.string.religion_obad_hai_description, R.string.religion_obad_hai_alignment),
	OLIDAMMARA(R.string.religion_olidammara, R.string.religion_olidammara_description, R.string.religion_olidammara_alignment),
	PELOR(R.string.religion_pelor, R.string.religion_pelor_description, R.string.religion_pelor_alignment),
	ST_CUTHBERT(R.string.religion_st_cuthbert, R.string.religion_st_cuthbert_description, R.string.religion_st_cuthbert_alignment),

	VECNA(R.string.religion_vecna, R.string.religion_vecna_description, R.string.religion_vecna_alignment),
	WEE_JAS(R.string.religion_wee_jas, R.string.religion_wee_jas_description, R.string.religion_wee_jas_alignment),
	YONDALLA(R.string.religion_yondalla, R.string.religion_yondalla_description, R.string.religion_yondalla_alignment),
	OTHER(R.string.religion_other, R.string.religion_other_description, R.string.religion_other_alignment);

	private int code;
	private int description;
	private int alignment;
	
	private TypeRpgReligion(int code, int description, int alignment) {
		this.code = code;
		this.description = description;
		this.alignment = alignment;
	}

	public String toString(Context ctx) {
		return ctx.getString(code);
	}
	
	public String getDescription(Context ctx) {
		return ctx.getString(description);
	}
	
	public String getAlignment(Context ctx) {
		return ctx.getString(alignment);
	}
}
