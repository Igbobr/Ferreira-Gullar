package br.edu.ifgoiano.ferreiraGullar;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
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

	@SuppressLint("NewApi")
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_pergunta);

		getWindow().getDecorView()
				.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
		getWindow().setStatusBarColor(Color.TRANSPARENT);

		b1 = (Button) findViewById(R.id.botaoAvancarq1);
		b2 = (Button) findViewById(R.id.botaoVoltarq1);
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
		ed.setText("");
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
				t.setText("O pronome reflexivo 'traduzir-se' passa ao leitor");
				((RadioButton) rg.getChildAt(0))
						.setText(String.valueOf("que a proposta do autor é interpretar a si mesmo"));
				((RadioButton) rg.getChildAt(1))
						.setText(String.valueOf("a análise das naturezas opostas espirituais dentro de nós."));
				((RadioButton) rg.getChildAt(2))
						.setText(String.valueOf("da tradução da natureza do ser humano e sua cultura."));

			} catch (Exception e) {
				Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG).show();
			}
		}
		if (contador == 1) {
			t.setText("O poema 'traduzir-se' apresenta uma característica ");
			((RadioButton) rg.getChildAt(0)).setText(String.valueOf("Eufemista e irônica"));
			((RadioButton) rg.getChildAt(1)).setText(String.valueOf("antagônico e paradoxical."));
			((RadioButton) rg.getChildAt(2)).setText(String.valueOf("Apóstrofe e personificativa"));

		} else if (contador == 2) {
			t.setText("O fato do poema ser apresentar oposições ");
			((RadioButton) rg.getChildAt(0)).setText(String.valueOf("demostra as leis dos opostos"));
			((RadioButton) rg.getChildAt(1)).setText(String.valueOf("é a natureza de cada ser humano."));
			((RadioButton) rg.getChildAt(2))
					.setText(String.valueOf("são questões culturais que influencia nas pessoas."));
		} else if (contador == 3) {
			t.setText("Uma parte de mim é todo mundo; ");
			((RadioButton) rg.getChildAt(0)).setText(String.valueOf("outra parte estranheza e solidão."));
			((RadioButton) rg.getChildAt(1)).setText(String.valueOf("outra parte é ninguém: fundo sem fundo"));
			((RadioButton) rg.getChildAt(2)).setText(String.valueOf("Uma parte de mim pesa, pondera"));

		} else if (contador == 4) {
			t.setText("Na parte do poema, 'outra parte, linguagem ', podemos substituir o termo linguagem por:");
			((RadioButton) rg.getChildAt(0)).setText(String.valueOf("Vertigem e tortura"));
			((RadioButton) rg.getChildAt(1)).setText(String.valueOf("Falar e comunicar"));
			((RadioButton) rg.getChildAt(2)).setText(String.valueOf("Racionalidade e inteligência"));
		}
		if (contador == 5) {
			if ((nota == 4) || (nota == 5)) {
				b1.setVisibility(arg0.INVISIBLE);
				b2.setVisibility(arg0.INVISIBLE);
				b1.setClickable(false);
				b2.setClickable(false);
				rg.setVisibility(arg0.INVISIBLE);
				ed.setText("Parabéns você passou para o proximo Quiz 2 e desbloqueou o poema 2.");
				recriarAquivo();
				t.setText(" ");

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
			if (i.equals("Ferreira Gullar  traduz a alma do artista.")) {
				nota = nota + 1;
			}

		}
		if (contador == 1) {
			if (i.equals("antagônico e paradoxical.")) {
				nota = nota + 1;
			}

		}
		if (contador == 2) {
			if (i.equals("é a natureza de cada ser humano.")) {
				nota = nota + 1;
			}

		}
		if (contador == 3) {
			if (i.equals("outra parte é ninguém: fundo sem fundo")) {
				nota = nota + 1;
			}

		}
		if (contador == 4) {
			if (i.equals("Racionalidade e inteligência")) {
				nota = nota + 1;
			}

		}
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
			String data = "cbaaaaaaa";
			arquivo.write(data.getBytes());
			arquivo.close();

		} catch (FileNotFoundException fnex) {
			fnex.printStackTrace();
		} catch (IOException ioex) {
			ioex.printStackTrace();
		}

		try {
			FileOutputStream arquivo = openFileOutput("meuArquivo2", MODE_APPEND);
			String data = "cbaaaaaaa";
			arquivo.write(data.getBytes());
			arquivo.close();

		} catch (FileNotFoundException fnex) {
			fnex.printStackTrace();
		} catch (IOException ioex) {
			ioex.printStackTrace();
		}

	}
}
