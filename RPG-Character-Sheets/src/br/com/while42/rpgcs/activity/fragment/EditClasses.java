package br.com.while42.rpgcs.activity.fragment;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TableRow;
import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.activity.support.ViewTools;
import br.com.while42.rpgcs.model.character.RpgClass;
import br.com.while42.rpgcs.model.classes.AbstractRpgClass;
import br.com.while42.rpgcs.model.classes.CharacterClass;
import br.com.while42.rpgcs.model.classes.bonuses.ExperienceAndLevel;
import br.com.while42.rpgcs.reflection.ClassByReflection;

public class EditClasses extends Fragment {

	private RpgClass rpgClasses;
	private Context context;

	private TableLayout classesTableLayout;
	private List<TableRow> rows = new ArrayList<TableRow>();
	private List<CharacterClass> listClasses;
	
	private static int POS_VIEW_CLASS = 0;
	private static int POS_VIEW_LEVEL = 1;

	public EditClasses() {
	}

	public EditClasses(RpgClass rpgClasses) {
		this.rpgClasses = rpgClasses;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		View layout = inflater.inflate(R.layout.fragment_edit_classes, container, false);
		context = layout.getContext();

		classesTableLayout = (TableLayout) layout.findViewById(R.id_frag_edit_classes.tablelayout_class);

		loadClasses();

		return layout;
	}

	public void loadClasses() {

		listClasses = ClassByReflection.getAll(context, AbstractRpgClass.class);
		rows.clear();

		if (rpgClasses != null) {
			for (AbstractRpgClass rpgClass : rpgClasses.getAll()) {
				addTableRow(rpgClass);
			}
		}

		// addTableRow();
	}

	public RpgClass saveClasses() {
		rpgClasses.removeAllRpgClass();

		ViewTools tools = new ViewTools(context);

		for (TableRow row : rows) {
			Spinner classSpinner = (Spinner) row.getChildAt(POS_VIEW_CLASS);
			EditText levelEditText = (EditText) row.getChildAt(POS_VIEW_LEVEL);

			AbstractRpgClass clazz = (AbstractRpgClass) tools.getSelected(classSpinner);
			Integer level = Integer.valueOf(levelEditText.getText().toString());

			if (level >= ExperienceAndLevel.MIN_LEVEL) {
				clazz.setClassLevel(level);
				rpgClasses.add(clazz);
			}
		}

		return rpgClasses;
	}

	private void addTableRow() {
		addTableRow(null);
	}

	private void addTableRow(AbstractRpgClass rpgClass) {
		Spinner classSpinner = new Spinner(context);
		EditText levelEditText = new EditText(context);

		ViewTools tool = new ViewTools(context);

		if (rpgClass != null) {
			tool.setOptionsSpinner(classSpinner, listClasses, rpgClass);
			levelEditText.setText(rpgClass.getClassLevel().toString());
		} else {
			tool.setOptionsSpinner(classSpinner, listClasses);
			levelEditText.setText(Integer.toString(ExperienceAndLevel.EMPTY_LEVEL));
		}

		TableRow row = new TableRow(context);
		row.addView(classSpinner, POS_VIEW_CLASS);
		row.addView(levelEditText, POS_VIEW_LEVEL);

		classesTableLayout.addView(row);
		rows.add(row);
	}

}
