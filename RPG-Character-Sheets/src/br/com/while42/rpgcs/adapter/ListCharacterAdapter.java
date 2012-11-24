package br.com.while42.rpgcs.adapter;

import java.util.List;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.character.Characteristics;
import br.com.while42.rpgcs.model.character.RpgCharacter;
import br.com.while42.rpgcs.model.character.RpgClass;
import br.com.while42.rpgcs.model.classes.AbstractRpgClass;

public class ListCharacterAdapter extends BaseAdapter {
	private Context context;
	private List<RpgCharacter> rpgCharacters;

	public ListCharacterAdapter(Context context, List<RpgCharacter> rpgCharacters) {
		this.context = context;
		this.rpgCharacters = rpgCharacters;
	}
	
	public void setList(List<RpgCharacter> rpgCharacters) {
		this.rpgCharacters = rpgCharacters;
	}

	@Override
	public int getCount() {
		return rpgCharacters.size();
	}

	@Override
	public Object getItem(int position) {
		return rpgCharacters.get(position);
	}

	@Override
	public long getItemId(int position) {
		return rpgCharacters.get(position).getId();
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		View row = View.inflate(context, R.layout.list_characters, null);

		RpgCharacter character = rpgCharacters.get(position);

		Log.d("DEBUG", "ListCharacterAdapter - getView - RpgCharacter [id]: " + character.getId());

		TextView name = (TextView) row.findViewById(R.id.textview_name);
		TextView race = (TextView) row.findViewById(R.id.textview_race);
		TextView alignment = (TextView) row.findViewById(R.id.textview_alignment);
		TextView experience = (TextView) row.findViewById(R.id.textview_experience);
		TextView classes = (TextView) row.findViewById(R.id.textview_classes);

		Characteristics characteristics = character.getCharacteristics();

		if (characteristics != null) {
			name.setText(characteristics.getName());
			race.setText(context.getString(characteristics.getRace().getCodeName()));
			alignment.setText(context.getString(characteristics.getAlignment().getCodeName()));
		}

		RpgClass rpgClasses = character.getRpgClasses();
		
		if (rpgClasses != null) {
			experience.setText(rpgClasses.getExperience().toString());

			StringBuilder sbClassLevel = new StringBuilder();
			for (AbstractRpgClass clazz : rpgClasses.getAll()) {
				if (sbClassLevel.length() > 0) {
					sbClassLevel.append(" / ");
				}
				sbClassLevel.append(context.getString(clazz.getCodeName()));
				sbClassLevel.append(" (");
				sbClassLevel.append(clazz.getClassLevel().toString());
				sbClassLevel.append(")");
			}

			classes.setText(sbClassLevel.toString());
		}

		return row;
	}

}
