package br.com.while42.rpgcs.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.activity.fragment.PlayAbilities;
import br.com.while42.rpgcs.activity.fragment.PlayAttacks;
import br.com.while42.rpgcs.activity.fragment.PlayCharacteristics;
import br.com.while42.rpgcs.activity.fragment.PlayDefences;
import br.com.while42.rpgcs.activity.fragment.PlayDefencesArmor;
import br.com.while42.rpgcs.activity.fragment.PlayDefencesOther;
import br.com.while42.rpgcs.activity.fragment.PlayHitPoints;
import br.com.while42.rpgcs.activity.fragment.PlayLanguages;
import br.com.while42.rpgcs.activity.fragment.PlaySavingThrows;
import br.com.while42.rpgcs.activity.fragment.PlaySkills;
import br.com.while42.rpgcs.activity.fragment.PlayVisionAndDeity;
import br.com.while42.rpgcs.model.character.Abilities;
import br.com.while42.rpgcs.model.character.Characteristics;
import br.com.while42.rpgcs.model.character.Defences;
import br.com.while42.rpgcs.model.character.Languages;
import br.com.while42.rpgcs.model.character.RpgCharacter;
import br.com.while42.rpgcs.model.character.RpgClass;
import br.com.while42.rpgcs.model.character.SavingThrows;
import br.com.while42.rpgcs.model.character.Skills;
import br.com.while42.rpgcs.model.equip.Equipments;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.ActionBar.Tab;
import com.actionbarsherlock.app.ActionBar.TabListener;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.view.MenuItem.OnMenuItemClickListener;

public class PlayRpgCharacter extends SherlockFragmentActivity {

	private static final int EDIT_CHARACTER_REQUEST = 0;

	private RpgCharacter rpgCharacter;

	private PlayCharacteristics playCharacteristics;
	private PlayAbilities playAbilities;
	private PlayDefences playDefences;
	private PlaySavingThrows playSavingThrows;
	private PlayVisionAndDeity playVisionAndDeity;
	private PlayDefencesOther playDefencesOther;
	private PlayLanguages playLanguages;
	private PlaySkills playSkills;
	private PlayDefencesArmor playDefencesArmor;
	private PlayHitPoints playHitPoints;
	private PlayAttacks playAttacks;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_play_character);

		Log.d("ACTIVITY", "PlayRpgCharacter - onCreate");

		rpgCharacter = new RpgCharacterIntentUtils().getSerializeRpgCharacter(getIntent());
		createFragments();
		createButtons();
	}

	@Override
	protected void onResume() {
		super.onResume();

		Log.d("ACTIVITY", "PlayRpgCharacter - onResume");
		// rpgCharacter = new
		// RpgCharacterIntentUtils().getSerializeRpgCharacter(getIntent());
	}

	@Override
	protected void onStart() {
		super.onStart();
		ActionBar actionBar = getSupportActionBar();
		if (actionBar.getTabCount() > 0) {
			actionBar.selectTab(actionBar.getTabAt(0));
		}

		Log.d("ACTIVITY", "PlayRpgCharacter - onStart");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getSupportMenuInflater().inflate(R.menu.play_options, menu);
		ActionBar actionBar = getSupportActionBar();

		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

		BuilderTabs builder = new BuilderTabs(actionBar);

		// TODO: Falta colocar no strings.xml
		builder.addTab(PlayRpgCharacter.class, "play"); // R.string.play_title_activity);
		builder.addTab(FeatsRpgCharacter.class, R.string.feats_title_activity);
		builder.addTab(EquipmentRpgCharacter.class, R.string.equipment_title_activity);
		builder.addTab(ItemsRpgCharacter.class, R.string.items_title_activity);
		builder.addTab(TreasureRpgCharacter.class, R.string.treasure_title_activity);
		// builder.addTab(MagicAndSpellsRpgCharacter.class,
		// R.string.magic_spells_title_activity);
		// builder.addTab(FamiliarRpgCharacter.class,
		// R.string.familiar_title_activity);
		// builder.addTab(NotesRpgCharacter.class,
		// R.string.notes_title_activity);

		MenuItem itemNew = menu.findItem(R.id_menu_play.new_character);
		Intent intentForNew = new Intent(PlayRpgCharacter.this, EditRpgCharacter.class);
		itemNew.setIntent(intentForNew);

		MenuItem itemEdit = menu.findItem(R.id_menu_play.edit_character);

		// itemEdit.setIntent(intentForEdit);

		itemEdit.setOnMenuItemClickListener(new OnMenuItemClickListener() {

			@Override
			public boolean onMenuItemClick(MenuItem item) {
				Intent intentForEdit = new Intent(PlayRpgCharacter.this, EditRpgCharacter.class);
				new RpgCharacterIntentUtils().putSerializeRpgCharacter(intentForEdit, rpgCharacter);
				startActivityForResult(intentForEdit, EDIT_CHARACTER_REQUEST);
				return false;
			}
		});

		return super.onCreateOptionsMenu(menu);
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {

		if (requestCode == EDIT_CHARACTER_REQUEST) {
			if (resultCode == RESULT_OK) {
				RpgCharacter character = new RpgCharacterIntentUtils().getSerializeRpgCharacter(data);

				if (character != null && !character.equals(rpgCharacter)) {
					Log.d("onActivityResult", "restart activity");

					new RpgCharacterIntentUtils().putSerializeRpgCharacter(getIntent(), character);
					finish();
					startActivity(getIntent());
				}
			}
		}
	}

	private class BuilderTabs {
		private ActionBar actionBar;

		public BuilderTabs(ActionBar actionBar) {
			this.actionBar = actionBar;
		}

		private void addTab(final Class<? extends Activity> classActivity, final int title) {
			Tab tab = actionBar.newTab();
			tab.setText(title);
			setListener(tab, classActivity);
			actionBar.addTab(tab);
		}

		private void addTab(final Class<? extends Activity> classActivity, final String title) {
			Tab tab = actionBar.newTab();
			tab.setText(title);
			setListener(tab, classActivity);
			actionBar.addTab(tab);
		}

		private void setListener(Tab tab, final Class<? extends Activity> classActivity) {
			tab.setTabListener(new TabListener() {

				@Override
				public void onTabSelected(Tab tab, FragmentTransaction ft) {
					if (PlayRpgCharacter.class != classActivity) {
						startActivity(classActivity);
					}
				}

				@Override
				public void onTabUnselected(Tab tab, FragmentTransaction ft) {
				}

				@Override
				public void onTabReselected(Tab tab, FragmentTransaction ft) {

				}
			});
		}
	}

	private void startActivity(Class<? extends Activity> clazz) {
		Intent intent = new Intent(PlayRpgCharacter.this, clazz);

		new RpgCharacterIntentUtils().putSerializeRpgCharacter(intent, rpgCharacter);
		startActivity(intent);
	}

	private void createFragments() {
		// TODO: Sera q aki eh necessario verificar se o rpgCharacter eh null ?!
		// Na activity de Edit esta sendo feita a validacao ...

		Abilities abilities = rpgCharacter.getAbilities();
		Skills skills = rpgCharacter.getSkills();
		Languages languages = rpgCharacter.getLanguages();
		Characteristics attr = rpgCharacter.getCharacteristics();
		RpgClass rpgClasses = rpgCharacter.getRpgClasses();
		Equipments equipments = rpgCharacter.getEquipments();
		Defences defences = rpgCharacter.getDefences();
		SavingThrows savingThrows = rpgCharacter.getSavingThrows();

		playCharacteristics = new PlayCharacteristics(attr, rpgClasses);
		playAbilities = new PlayAbilities(abilities);
		playDefences = new PlayDefences(defences);
		playSavingThrows = new PlaySavingThrows(savingThrows);
		playVisionAndDeity = new PlayVisionAndDeity(attr);
		playDefencesOther = new PlayDefencesOther(defences);
		playLanguages = new PlayLanguages(languages);
		playSkills = new PlaySkills(skills);
		playDefencesArmor = new PlayDefencesArmor(defences);
		playHitPoints = new PlayHitPoints(defences);
		playAttacks = new PlayAttacks(equipments);

		FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
		transaction.replace(R.id_play.fragment_header, playCharacteristics, PlayCharacteristics.class.getCanonicalName());
		transaction.replace(R.id_play.fragment_abilities, playAbilities, PlayAbilities.class.getCanonicalName());
		transaction.replace(R.id_play.fragment_defences, playDefences, PlayDefences.class.getCanonicalName());
		transaction.replace(R.id_play.fragment_savingthrows, playSavingThrows, PlaySavingThrows.class.getCanonicalName());
		transaction.replace(R.id_play.fragment_vision_deity, playVisionAndDeity, PlayVisionAndDeity.class.getCanonicalName());
		transaction.replace(R.id_play.fragment_defences_other, playDefencesOther, PlayDefencesOther.class.getCanonicalName());
		transaction.replace(R.id_play.fragment_language, playLanguages, PlayLanguages.class.getCanonicalName());
		transaction.replace(R.id_play.fragment_skills, playSkills, PlaySkills.class.getCanonicalName());
		transaction.replace(R.id_play.fragment_defences_armor, playDefencesArmor, PlayDefencesArmor.class.getCanonicalName());
		transaction.replace(R.id_play.fragment_hitpoints, playHitPoints, PlayHitPoints.class.getCanonicalName());
		transaction.replace(R.id_play.fragment_attacks, playAttacks, PlayAttacks.class.getCanonicalName());
		transaction.commit();
	}

	private void createButtons() {
		Button bFeats = (Button) findViewById(R.id_play.button_feats);
		Button bEquipment = (Button) findViewById(R.id_play.button_equipment);
		Button bItems = (Button) findViewById(R.id_play.button_items);
		Button bTreasure = (Button) findViewById(R.id_play.button_treasure);
		Button bMagicSpells = (Button) findViewById(R.id_play.button_magic_spells);
		Button bFamiliar = (Button) findViewById(R.id_play.button_familiar);
		Button bNotes = (Button) findViewById(R.id_play.button_notes);

		// ---

		bFeats.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(FeatsRpgCharacter.class);
			}
		});

		bEquipment.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(EquipmentRpgCharacter.class);
			}
		});

		bItems.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(ItemsRpgCharacter.class);
			}
		});

		bTreasure.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(TreasureRpgCharacter.class);
			}
		});

		bMagicSpells.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(MagicAndSpellsRpgCharacter.class);
			}
		});

		bFamiliar.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(FamiliarRpgCharacter.class);
			}
		});

		bNotes.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(NotesRpgCharacter.class);
			}
		});
	}
}
