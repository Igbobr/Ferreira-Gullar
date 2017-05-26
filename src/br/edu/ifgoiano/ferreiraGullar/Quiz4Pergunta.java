package br.edu.ifgoiano.ferreiraGullar;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class Quiz4Pergunta extends Activity {
	int contador = 0, nota = 0;
	private RadioGroup rg;
	private TextView t;
	private EditText ed;
	private RadioButton rb;
	private Button b1, b2;

	@SuppressLint("NewApi")
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quiz4_pergunta);

		getWindow().getDecorView()
		.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
getWindow().setStatusBarColor(Color.TRANSPARENT);
		
		b1 = (Button) findViewById(R.id.botaoAvancarq4);
		b2 = (Button) findViewById(R.id.botaoVoltarq4);
		ed = (EditText) findViewById(R.id.editTextEnunciadoQuiz4);
		t = (TextView) findViewById(R.id.enunciadoquiz4);
		rg = (RadioGroup) findViewById(R.id.quiz4radio);

		rg.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				rb = (RadioButton) findViewById(checkedId);
				ed.setText(rb.getText().toString());

			}
		});

		try {
			t.setText("os mortos vêem o mundo pelos olhos dos vivos. \n No trecho acima, assinale a alternativa correspondente a qual figura de pensamento o mesmo se classifica ?   ");
			((RadioButton) rg.getChildAt(0)).setText(String.valueOf("Eufemismo"));
			((RadioButton) rg.getChildAt(1)).setText(String.valueOf("Antítese"));
			((RadioButton) rg.getChildAt(2))
					.setText(String.valueOf("Assonância"));

		} catch (Exception e) {
			Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG).show();
		}
	}

	public void avancar(View arg0) {
		try {
			RadioButton radio = (RadioButton) findViewById(rg.getCheckedRadioButtonId());
			respostaCerta(radio.getText().toString());
		} catch (Exception e) {
			Toast.makeText(this, "Marque uma alternativa", Toast.LENGTH_LONG).show();
			contador--;
		}

		contador++;

		if (contador == 0) {
			try {
				t.setText("os mortos vêem o mundo pelos olhos dos vivos. \n No trecho acima, assinale a alternativa correspondente a qual figura de pensamento o mesmo se classifica ?   ");
				((RadioButton) rg.getChildAt(0)).setText(String.valueOf("Eufemismo"));
				((RadioButton) rg.getChildAt(1)).setText(String.valueOf("Antítese"));
				((RadioButton) rg.getChildAt(2))
						.setText(String.valueOf("Assonância"));

			} catch (Exception e) {
				Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG).show();
			}
		}
		if (contador == 1) {
			t.setText(" Numa interpretação rápida do poema Os Mortos, pode-se afirmar que: ");
			((RadioButton) rg.getChildAt(0)).setText(String.valueOf(" Os mortos são seres que agem diferente de seres vivos."));
			((RadioButton) rg.getChildAt(1)).setText(String.valueOf("Os mortos vivem através das sensações dos vivos"));
			((RadioButton) rg.getChildAt(2)).setText(String.valueOf("Os mortos vivem dentro de nós"));

		} else if (contador == 2) {
			t.setText( "Misturam o seu ao nosso riso  se de fato quando vivos  acharam a mesma graça \n Podemos classificar a oração acima em: ");
			((RadioButton) rg.getChildAt(0)).setText(String.valueOf("Oração subordinada adverbial condicional"));
			((RadioButton) rg.getChildAt(1)).setText(String.valueOf("Oração subordinada adverbial concessiva"));
			((RadioButton) rg.getChildAt(2))
					.setText(String.valueOf("Oração subordinada adverbial proporcional."));
		}/* else if (contador == 3) {
			t.setText("Uma parte de mim é todo mundo; ");
			((RadioButton) rg.getChildAt(0)).setText(String.valueOf("outra parte estranheza e solidão."));
			((RadioButton) rg.getChildAt(1)).setText(String.valueOf("outra parte é ninguém: fundo sem fundo"));
			((RadioButton) rg.getChildAt(2)).setText(String.valueOf("Uma parte de mim pesa, pondera"));

		} else if (contador == 4) {
			t.setText("Na parte do poema, 'outra parte, linguagem ', podemos substituir o termo linguagem por:");
			((RadioButton) rg.getChildAt(0)).setText(String.valueOf("Vertigem e tortura"));
			((RadioButton) rg.getChildAt(1)).setText(String.valueOf("Falar e comunicar"));
			((RadioButton) rg.getChildAt(2)).setText(String.valueOf("Racionalidade e inteligência"));
		}*/
		if (contador == 3) {
			if ((nota == 2) || (nota == 3)) {
				b1.setVisibility(arg0.INVISIBLE);
				b2.setVisibility(arg0.INVISIBLE);
				b1.setClickable(false);
				b2.setClickable(false);
				rg.setVisibility(arg0.INVISIBLE);
				ed.setText("Parabéns você passou para o proximo Quiz 4 e desbloqueou o poema 4.");
				t.setText(" ");
				recriarAquivo();

			} else {
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
		if (contador == 0) {

		} else {
			contador = contador - 2;
			avancar(arg0);
		}
	}

	public void respostaCerta(String i) {
		if (contador == 0) {
			if (i.equals("Antítese")) {
				nota = nota + 1;
			}

		}
		if (contador == 1) {
			if (i.equals("Os mortos vivem através das sensações dos vivos")) {
				nota = nota + 1;
			}

		}
		if (contador == 2) {
			if (i.equals(" Oração subordinada adverbial condicional")) {
				nota = nota + 1;
			}

		}
		/*if (contador == 3) {
			if (i.equals("outra parte é ninguém: fundo sem fundo")) {
				nota = nota + 1;
			}

		}
		if (contador == 4) {
			if (i.equals("Racionalidade e inteligência")) {
				nota = nota + 1;
			}

		}*/
		if (i == null) {
		}
	}

	public void recriarAquivo() {

		try {
			boolean deleted = deleteFile("meuArquivo");
			boolean deleted2 = deleteFile("meuArquivo2");
			if (deleted) {

			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		try {
			FileOutputStream arquivo = openFileOutput("meuArquivo", MODE_APPEND);
			String data = "ccccbaaaa";
			arquivo.write(data.getBytes());
			arquivo.close();

		} catch (FileNotFoundException fnex) {
			fnex.printStackTrace();
		} catch (IOException ioex) {
			ioex.printStackTrace();
		}

		try {
			FileOutputStream arquivo = openFileOutput("meuArquivo2", MODE_APPEND);
			String data = "ccccbaaaa";
			arquivo.write(data.getBytes());
			arquivo.close();

		} catch (FileNotFoundException fnex) {
			fnex.printStackTrace();
		} catch (IOException ioex) {
			ioex.printStackTrace();
		}

	}
}
