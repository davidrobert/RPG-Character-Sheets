package br.com.while42.rpgcs.activity.support;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import br.com.while42.rpgcs.model.TypeCode;

public class ViewTools {
	private Context context;

	public ViewTools(Context context) {
		this.context = context;
	}

	public void setOptionsSpinner(Spinner spinner, List<? extends TypeCode> types, TypeCode typeSelected) {
		setOptionsSpinner(spinner, types);
		setSelectionOptionsSpinner(spinner, typeSelected);
	}
	
	// TODO: Falta refatorar os dois metodos abaixo
	public void setOptionsSpinner(Spinner spinner, List<? extends TypeCode> types) {
		// setOptionsSpinner(spinner, (TypeCode[]) types.toArray());
		List<Element> items = new ArrayList<Element>();
		for (TypeCode g : types) {
			items.add(new Element(g, context.getString(g.getCodeName())));
		}

		ArrayAdapter<Element> adapter = new ArrayAdapter<Element>(context, android.R.layout.simple_spinner_dropdown_item, items);

		spinner.setAdapter(adapter);
	}

	public void setOptionsSpinner(Spinner spinner, TypeCode[] types) {

		List<Element> items = new ArrayList<Element>();
		for (TypeCode g : types) {
			items.add(new Element(g, context.getString(g.getCodeName())));
		}

		ArrayAdapter<Element> adapter = new ArrayAdapter<Element>(context, android.R.layout.simple_spinner_dropdown_item, items);

		spinner.setAdapter(adapter);
	}

	public void setSelectionOptionsSpinner(Spinner spinner, TypeCode type) {

		SpinnerAdapter adapter = spinner.getAdapter();
		for (int pos = 0; pos < adapter.getCount(); pos++) {
			Element item = (Element) adapter.getItem(pos);
			if (type.equals(item.getType())) {
				spinner.setSelection(pos);
				break;
			}
		}
	}
	
	public TypeCode getSelected(Spinner spinner) {
		Element e = (Element) spinner.getSelectedItem();
		return e.getType();
	}
}
