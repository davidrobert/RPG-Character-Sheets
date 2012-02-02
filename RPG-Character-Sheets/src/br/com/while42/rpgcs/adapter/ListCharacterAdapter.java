package br.com.while42.rpgcs.adapter;

import java.util.List;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.character.RpgCharacter;

public class ListCharacterAdapter extends BaseAdapter {
	private Context context;
	private List<RpgCharacter> rpgCharacters; 

	public ListCharacterAdapter(Context context, List<RpgCharacter> students) {
		this.context = context;
		this.rpgCharacters = students;
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
		ImageView image = new ImageView(context);

		Bitmap bm;
		if (rpgCharacters.get(position).getImage() != null) {					
			bm = BitmapFactory.decodeFile(rpgCharacters.get(position).getImage());
		} else {					
			bm = BitmapFactory.decodeResource(context.getResources(), R.drawable.noimage);
		}

		bm = Bitmap.createScaledBitmap(bm, 170, 170, true);		
		image.setImageBitmap(bm);
		return image;
	}

}
