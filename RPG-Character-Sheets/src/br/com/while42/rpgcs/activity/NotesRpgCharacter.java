package br.com.while42.rpgcs.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import br.com.while42.rpgcs.R;
import br.com.while42.rpgcs.model.character.Notes;
import br.com.while42.rpgcs.model.character.RpgCharacter;

public class NotesRpgCharacter extends Activity {
	
	private EditText edNotes;
	private Button btUpdate;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_notes_character);

		Bundle bn = new Bundle();
        bn = getIntent().getExtras();
        final RpgCharacter rpgCharacter = (RpgCharacter) bn.getSerializable(RpgCharacter.class.getName());
        
        Log.d("NOTES - ID: ", rpgCharacter.getId().toString());
        
        rpgCharacter.setId(222L);
        
        edNotes = (EditText) findViewById(R.id_notes.edittext_notes);
        btUpdate = (Button) findViewById(R.id_notes.button_update);
        
        edNotes.clearComposingText();
        
        final Notes notes = rpgCharacter.getNotes();
        for (String n: notes.getAll()) {
        	edNotes.append(n);
        	edNotes.append("\n");
        }
        
        btUpdate.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO: Apesar das notas serem uma lista, neste caso esta sempre salvando tudo em um unico item
				notes.clear();
				notes.add(edNotes.getText().toString());
				
				Intent intent = new Intent(NotesRpgCharacter.this, PlayRpgCharacter.class);
				Bundle b = new Bundle();
				b.putSerializable(RpgCharacter.class.getName(), rpgCharacter);
				intent.putExtras(b);
				
				setResult(Activity.RESULT_OK, intent);
				startActivity(intent);
				finish();
			}
		});
	}	
}
