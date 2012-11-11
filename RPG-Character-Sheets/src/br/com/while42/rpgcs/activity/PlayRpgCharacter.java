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
import br.com.while42.rpgcs.activity.fragment.PlayDefences;
import br.com.while42.rpgcs.activity.fragment.PlayDefencesArmor;
import br.com.while42.rpgcs.activity.fragment.PlayDefencesOther;
import br.com.while42.rpgcs.activity.fragment.PlayCharacteristics;
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

public class PlayRpgCharacter extends SherlockFragmentActivity {

	private RpgCharacter rpgCharacter;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_play_character);

		Log.d("ACTIVITY", "PlayRpgCharacter");

		rpgCharacter = new RpgCharacterIntentUtils().getSerializeRpgCharacter(getIntent());

		Abilities abilities = rpgCharacter.getAbilities();
		Skills skills = rpgCharacter.getSkills();
		Languages languages = rpgCharacter.getLanguages();
		Characteristics attr = rpgCharacter.getAttributes();
		RpgClass rpgClasses = rpgCharacter.getRpgClasses();
		Equipments equipments = rpgCharacter.getEquipments();
		Defences defences = rpgCharacter.getDefences();
		SavingThrows savingThrows = rpgCharacter.getSavingThrows();

		FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
		transaction.replace(R.id_play.fragment_header, new PlayCharacteristics(attr, rpgClasses), PlayCharacteristics.class.getCanonicalName());
		transaction.replace(R.id_play.fragment_abilities, new PlayAbilities(abilities), PlayAbilities.class.getCanonicalName());
		transaction.replace(R.id_play.fragment_defences, new PlayDefences(defences), PlayDefences.class.getCanonicalName());
		transaction.replace(R.id_play.fragment_savingthrows, new PlaySavingThrows(savingThrows), PlaySavingThrows.class.getCanonicalName());
		transaction.replace(R.id_play.fragment_vision_deity, new PlayVisionAndDeity(attr), PlayVisionAndDeity.class.getCanonicalName());
		transaction.replace(R.id_play.fragment_defences_other, new PlayDefencesOther(defences), PlayDefencesOther.class.getCanonicalName());
		transaction.replace(R.id_play.fragment_language, new PlayLanguages(languages), PlayLanguages.class.getCanonicalName());
		transaction.replace(R.id_play.fragment_skills, new PlaySkills(skills), PlaySkills.class.getCanonicalName());
		transaction.replace(R.id_play.fragment_defences_armor, new PlayDefencesArmor(defences), PlayDefencesArmor.class.getCanonicalName());
		transaction.replace(R.id_play.fragment_hitpoints, new PlayHitPoints(defences), PlayHitPoints.class.getCanonicalName());
		transaction.replace(R.id_play.fragment_attacks, new PlayAttacks(equipments), PlayAttacks.class.getCanonicalName());
		transaction.commit();

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

	@Override
	protected void onResume() {
		super.onResume();
		rpgCharacter = new RpgCharacterIntentUtils().getSerializeRpgCharacter(getIntent());
	}

	@Override
	protected void onStart() {
		super.onStart();
		ActionBar actionBar = getSupportActionBar();
		if (actionBar.getTabCount() > 0) {
			actionBar.selectTab(actionBar.getTabAt(0));
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getSupportMenuInflater().inflate(R.menu.play_options, menu);
		ActionBar actionBar = getSupportActionBar();

		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

		BuilderTabs builder = new BuilderTabs(actionBar);

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
		Intent intentForEdit = new Intent(PlayRpgCharacter.this, EditRpgCharacter.class);
		new RpgCharacterIntentUtils().putSerializeRpgCharacter(intentForEdit, rpgCharacter);
		itemEdit.setIntent(intentForEdit);
		
		return super.onCreateOptionsMenu(menu);
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

}
