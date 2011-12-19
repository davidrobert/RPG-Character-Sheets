package br.com.while42.rpgcs.model;

import br.com.while42.rpgcs.R;
import android.content.Context;

public enum TypeRpgSkill {
	APPRAISE(R.string.skill_appraise),
	BALANCE(R.string.skill_balance),
	BLUFF(R.string.skill_bluff),
	CLIMB(R.string.skill_climb),
	CONCENTRATION(R.string.skill_concetration),
	CRAFT(R.string.skill_craft),
	DECIPHER_SCRIPT(R.string.skill_decide_script),
	DIPLOMACY(R.string.skill_diplomacy),
	DISABLE_DEVICE(R.string.skill_disable_device),
	DISGUISE(R.string.skill_disguise),
	ESCAPE_ARTIST(R.string.skill_escape_artist),
	FORGERY(R.string.skill_forgery),
	GATHER_INFORMATION(R.string.skill_gather_information),
	HANDLE_ANIMAL(R.string.skill_handle_information),
	HEAL(R.string.skill_heal),
	HIDE(R.string.skill_hide),
	INTIMIDATE(R.string.skill_intimidate),
	JUMP(R.string.skill_jump),
	KNOWLEDGE_ARCANA(R.string.skill_knowledge_arcana),
	KNOWLEDGE_ARCHITECTURE(R.string.skill_knowledge_architecture),
	KNOWLEDGE_DUNGEONEERING(R.string.skill_knowledge_dungeoneering),
	KNOWLEDGE_GEOGRAPHY(R.string.skill_knowledge_geography),
	KNOWLEDGE_HISTORY(R.string.skill_knowledge_history),
	KNOWLEDGE_LOCAL(R.string.skill_knowledge_local),
	KNOWLEDGE_NATURE(R.string.skill_knowledge_nature),
	KNOWLEDGE_NOBILITY(R.string.skill_knowledge_nobility),
	KNOWLEDGE_RELIGION(R.string.skill_knowledge_religion),
	KNOWLEDGE_PLANES(R.string.skill_knowledge_planes),
	LISTEN(R.string.skill_listen),
	MOVE_SILENTLY(R.string.skill_move_silently),
	OPEN_LOCK(R.string.skill_open_lock),
	PERFORM(R.string.skill_perform),
	PROFESSION(R.string.skill_profession),
	RIDE(R.string.skill_ride),
	SEARCH(R.string.skill_search),
	SENSE_MOTIVE(R.string.skill_sense_motive),
	SLEIGHT_OF_HAND(R.string.skill_sleight_of_hand),
	SPEAK_LANGUAGE(R.string.skill_speak_language),
	SPELLCRAFT(R.string.skill_spellcraft),
	SPOT(R.string.skill_spot),
	SURVIVAL(R.string.skill_survival),
	SWIM(R.string.skill_swim),
	TUMBLE(R.string.skill_tumble),
	USE_MAGIC_DEVICE(R.string.skill_use_magic_device),
	USE_ROPE(R.string.skill_use_rope);

	private int code;

	private TypeRpgSkill(int code) {
		this.code = code;
	}

	public String toString(Context ctx) {
		return ctx.getString(code);
	}
}
