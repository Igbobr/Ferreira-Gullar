package br.edu.ifgoiano.ferreiraGullar;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import android.widget.Toast;

public class Quiz1Pergunta extends Activity {
	int contador = 0, nota = 0;
	private RadioGroup rg;
	private TextView t;
	private EditText ed;
	private RadioButton rb;
	private Button b1, b2;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_pergunta);

		b1 = (Button) findViewById(R.id.botaoAvancarq1);
		b2 =(Button) findViewById(R.id.botaoVoltarq1);
		ed = (EditText) findViewById(R.id.editTextEnunciadoQuiz1);
		t = (TextView) findViewById(R.id.enunciadoquiz1);
		rg = (RadioGroup) findViewById(R.id.quiz1radio);

		rg.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				rb = (RadioButton) findViewById(checkedId);
				ed.setText(rb.getText().toString());

			}
		});
		
		try {
			t.setText("O pronome reflexivo 'traduzir-se' passa ao leitor");
			((RadioButton) rg.getChildAt(0)).setText(String.valueOf("Ferreira Gullar  traduz a alma do artista."));
			((RadioButton) rg.getChildAt(1)).setText(String.valueOf("Analisar as naturezas opostas dentro de nós."));
			((RadioButton) rg.getChildAt(2))
					.setText(String.valueOf("Traduzir-se a natureza do ser humano e sua cultura."));
			
		} catch (Exception e) {
			Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG).show();
		}
	}

	public void avancar(View arg0) {
		try{
		RadioButton radio = (RadioButton) findViewById(rg.getCheckedRadioButtonId());
		respostaCerta(radio.getText().toString());
		}catch (Exception e) {
			Toast.makeText(this, "Marque uma alternativa", Toast.LENGTH_LONG).show();
			contador--;
		}
		
		contador++;
		
		if(contador == 0){
			try {
				t.setText("O pronome reflexivo 'traduzir-se' passa ao leitor");
				((RadioButton) rg.getChildAt(0)).setText(String.valueOf("Ferreira Gullar  traduz a alma do artista."));
				((RadioButton) rg.getChildAt(1)).setText(String.valueOf("Analisar as naturezas opostas dentro de nós."));
				((RadioButton) rg.getChildAt(2))
						.setText(String.valueOf("Traduzir-se a natureza do ser humano e sua cultura."));
				
			} catch (Exception e) {
				Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG).show();
			}
		}
		if (contador == 1) {
			t.setText("O pronome reflexivo 'traduzir-se' passa ao leitor2");
			((RadioButton) rg.getChildAt(0)).setText(String.valueOf("Ferreira Gullar  traduz a alma do artista."));
			((RadioButton) rg.getChildAt(1)).setText(String.valueOf("Analisar as naturezas opostas dentro de nós."));
			((RadioButton) rg.getChildAt(2))
					.setText(String.valueOf("Traduzir-se a natureza do ser humano e sua cultura."));

		} else if (contador == 2) {
			t.setText("O pronome reflexivo 'traduzir-se' passa ao leitor3");
			((RadioButton) rg.getChildAt(0)).setText(String.valueOf("Ferreira Gullar  traduz a alma do artista."));
			((RadioButton) rg.getChildAt(1)).setText(String.valueOf("Analisar as naturezas opostas dentro de nós."));
			((RadioButton) rg.getChildAt(2))
					.setText(String.valueOf("Traduzir-se a natureza do ser humano e sua cultura."));
		} else if (contador == 3) {
			t.setText("O pronome reflexivo 'traduzir-se' passa ao leitor 4");
			((RadioButton) rg.getChildAt(0)).setText(String.valueOf("Ferreira Gullar  traduz a alma do artista."));
			((RadioButton) rg.getChildAt(1)).setText(String.valueOf("Analisar as naturezas opostas dentro de nós."));
			((RadioButton) rg.getChildAt(2))
					.setText(String.valueOf("Traduzir-se a natureza do ser humano e sua cultura."));

		} else if (contador == 4) {
			t.setText("O pronome reflexivo 'traduzir-se' passa ao leitor 5");
			((RadioButton) rg.getChildAt(0)).setText(String.valueOf("Ferreira Gullar  traduz a alma do artista."));
			((RadioButton) rg.getChildAt(1)).setText(String.valueOf("Analisar as naturezas opostas dentro de nós."));
			((RadioButton) rg.getChildAt(2))
					.setText(String.valueOf("Traduzir-se a natureza do ser humano e sua cultura."));
		} if(contador == 5 ){
			if ((nota == 4)||(nota == 5)){
				b1.setVisibility(arg0.INVISIBLE);
				b2.setVisibility(arg0.INVISIBLE);
				b1.setClickable(false);
				b2.setClickable(false);
				rg.setVisibility(arg0.INVISIBLE);
				ed.setText("Parabéns você passou para o proximo Quiz e desbloqueou o poema 2.");
				t.setText(" ");
			}else{
				rg.setVisibility(arg0.INVISIBLE);
				b1.setVisibility(arg0.INVISIBLE);
				b2.setVisibility(arg0.INVISIBLE);
				b1.setClickable(false);
				b2.setClickable(false);
				ed.setText("Não foi dessa vez, mas não desanime tente novamente. Nota:" + nota);
				t.setText(" ");
			}
		}
	}

	public void voltar(View arg0) {
		if(contador  == 0){
			
		}
		else{
		contador = contador -2;
		avancar(arg0);}
	}

	public void respostaCerta(String i) {
		if (contador == 0) {
			if (i.equals("Ferreira Gullar  traduz a alma do artista.")){
				nota = nota +1;
			}

		}
		if (contador == 1) {
			if (i.equals("Ferreira Gullar  traduz a alma do artista.")) {
				nota = nota +1;
			}

		}
		if (contador == 2) {
			if (i.equals("Ferreira Gullar  traduz a alma do artista.")) {
				nota = nota +1;
			}

		}
		if (contador == 3) {
			if (i.equals("Ferreira Gullar  traduz a alma do artista.")) {
				nota = nota +1;
			}

		}
		if (contador == 4) {
			if (i.equals("Ferreira Gullar  traduz a alma do artista.")) {
				nota = nota +1;
			}

		}
	if(i == null){}
	}
}
