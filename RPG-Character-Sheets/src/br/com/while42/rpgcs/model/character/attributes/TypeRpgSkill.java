package br.com.while42.rpgcs.model.character.attributes;

import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.TypeCode;

public enum TypeRpgSkill implements TypeCode {
	APPRAISE(R.string.skill_appraise, TypeAbilities.INTELLIGENCE),
	BALANCE(R.string.skill_balance, TypeAbilities.DEXTERITY),
	BLUFF(R.string.skill_bluff, TypeAbilities.CHARISMA),
	CLIMB(R.string.skill_climb, TypeAbilities.STRENGTH),
	CONCENTRATION(R.string.skill_concetration, TypeAbilities.CONSTITUTION),
	CRAFT(R.string.skill_craft, TypeAbilities.INTELLIGENCE),
	DECIPHER_SCRIPT(R.string.skill_decide_script, TypeAbilities.INTELLIGENCE),
	DIPLOMACY(R.string.skill_diplomacy, TypeAbilities.CHARISMA),
	DISABLE_DEVICE(R.string.skill_disable_device, TypeAbilities.INTELLIGENCE),
	DISGUISE(R.string.skill_disguise, TypeAbilities.CHARISMA),
	ESCAPE_ARTIST(R.string.skill_escape_artist, TypeAbilities.DEXTERITY),
	FORGERY(R.string.skill_forgery, TypeAbilities.INTELLIGENCE),
	GATHER_INFORMATION(R.string.skill_gather_information, TypeAbilities.CHARISMA),
	HANDLE_ANIMAL(R.string.skill_handle_animal, TypeAbilities.CHARISMA),
	HEAL(R.string.skill_heal, TypeAbilities.WISDOM),
	HIDE(R.string.skill_hide, TypeAbilities.DEXTERITY),
	INTIMIDATE(R.string.skill_intimidate, TypeAbilities.CHARISMA),
	JUMP(R.string.skill_jump, TypeAbilities.STRENGTH),
	KNOWLEDGE_ARCANA(R.string.skill_knowledge_arcana, TypeAbilities.STRENGTH),
	KNOWLEDGE_ARCHITECTURE(R.string.skill_knowledge_architecture, TypeAbilities.INTELLIGENCE),
	KNOWLEDGE_DUNGEONEERING(R.string.skill_knowledge_dungeoneering, TypeAbilities.INTELLIGENCE),
	KNOWLEDGE_GEOGRAPHY(R.string.skill_knowledge_geography, TypeAbilities.INTELLIGENCE),
	KNOWLEDGE_HISTORY(R.string.skill_knowledge_history, TypeAbilities.INTELLIGENCE),
	KNOWLEDGE_LOCAL(R.string.skill_knowledge_local, TypeAbilities.INTELLIGENCE),
	KNOWLEDGE_NATURE(R.string.skill_knowledge_nature, TypeAbilities.INTELLIGENCE),
	KNOWLEDGE_NOBILITY(R.string.skill_knowledge_nobility, TypeAbilities.INTELLIGENCE),
	KNOWLEDGE_RELIGION(R.string.skill_knowledge_religion, TypeAbilities.INTELLIGENCE),
	KNOWLEDGE_PLANES(R.string.skill_knowledge_planes, TypeAbilities.INTELLIGENCE),
	LISTEN(R.string.skill_listen, TypeAbilities.WISDOM),
	MOVE_SILENTLY(R.string.skill_move_silently, TypeAbilities.DEXTERITY),
	OPEN_LOCK(R.string.skill_open_lock, TypeAbilities.DEXTERITY),
	PERFORM(R.string.skill_perform, TypeAbilities.CHARISMA),
	PROFESSION(R.string.skill_profession, TypeAbilities.WISDOM),
	RIDE(R.string.skill_ride, TypeAbilities.DEXTERITY),
	SEARCH(R.string.skill_search, TypeAbilities.INTELLIGENCE),
	SENSE_MOTIVE(R.string.skill_sense_motive, TypeAbilities.WISDOM),
	//SLEIGHT_OF_HAND(R.string.skill_sleight_of_hand, TypeAbilities.DEXTERITY),
	SPEAK_LANGUAGE(R.string.skill_speak_language),
	SPELLCRAFT(R.string.skill_spellcraft, TypeAbilities.INTELLIGENCE),
	SPOT(R.string.skill_spot, TypeAbilities.WISDOM),
	SURVIVAL(R.string.skill_survival, TypeAbilities.WISDOM),
	SWIM(R.string.skill_swim, TypeAbilities.STRENGTH),
	//TUMBLE(R.string.skill_tumble, TypeAbilities.DEXTERITY),
	USE_MAGIC_DEVICE(R.string.skill_use_magic_device, TypeAbilities.CHARISMA),
	USE_ROPE(R.string.skill_use_rope, TypeAbilities.DEXTERITY);

	private int nameCode;
	private TypeAbilities ability;

	private TypeRpgSkill(int nameCode, TypeAbilities ability) {
		this.nameCode = nameCode;
		this.ability = ability;
	}
	
	private TypeRpgSkill(int nameCode) {
		this.nameCode = nameCode;
		this.ability = null;
	}

	public TypeAbilities getAbility() {
		return ability;
	}
	
	@Override
	public int getCodeName() {
		return nameCode;
	}
}
