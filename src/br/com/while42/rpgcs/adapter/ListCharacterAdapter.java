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
import br.com.while42.rpgcs.model.Character;

public class ListCharacterAdapter extends BaseAdapter {
	private Context context;
	private List<Character> characters; 

	public ListCharacterAdapter(Context context, List<Character> students) {
		this.context = context;
		this.characters = students;
	}

	@Override
	public int getCount() {
		return characters.size();
	}

	@Override
	public Object getItem(int position) {
		return characters.get(position);
	}

	@Override
	public long getItemId(int position) {
		return characters.get(position).getId();
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ImageView image = new ImageView(context);

		Bitmap bm;
		if (characters.get(position).getImage() != null) {					
			bm = BitmapFactory.decodeFile(characters.get(position).getImage());
		} else {					
			bm = BitmapFactory.decodeResource(context.getResources(), R.drawable.noimage);
		}

		bm = Bitmap.createScaledBitmap(bm, 170, 170, true);		
		image.setImageBitmap(bm);
		return image;
	}

}
