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

public class Quiz2Pergunta extends Activity {
	int contador = 0, nota = 0;
	private RadioGroup rg;
	private TextView t;
	private EditText ed;
	private RadioButton rb;
	private Button b1, b2;

	@SuppressLint("NewApi")
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quiz2_pergunta);

		getWindow().getDecorView()
		.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
getWindow().setStatusBarColor(Color.TRANSPARENT);
		
		b1 = (Button) findViewById(R.id.botaoAvancarq2);
		b2 = (Button) findViewById(R.id.botaoVoltarq2);
		ed = (EditText) findViewById(R.id.editTextEnunciadoQuiz2);
		t = (TextView) findViewById(R.id.enunciadoquiz2);
		rg = (RadioGroup) findViewById(R.id.quiz2radio);

		rg.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				rb = (RadioButton) findViewById(checkedId);
				ed.setText(rb.getText().toString());

			}
		});

		try {
			t.setText("Sobre o poema 'O Anjo' o autor tenta");
			((RadioButton) rg.getChildAt(0)).setText(String.valueOf("mostrar um poema longe da lógica."));
			((RadioButton) rg.getChildAt(1)).setText(String.valueOf("Mostrar o rumo além da poesia tradicional."));
			((RadioButton) rg.getChildAt(2))
					.setText(String.valueOf("mostra uma poesia padrão."));

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
				t.setText("Sobre o poema 'O Anjo' o autor tenta");
				((RadioButton) rg.getChildAt(0))
						.setText(String.valueOf("mostrar um poema longe da lógica."));
				((RadioButton) rg.getChildAt(1))
						.setText(String.valueOf("Mostrar o rumo além da poesia tradicional."));
				((RadioButton) rg.getChildAt(2))
						.setText(String.valueOf("mostra uma poesia padrão."));

			} catch (Exception e) {
				Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG).show();
			}
		}
		if (contador == 1) {
			t.setText("Complete: Tão todo nele me perco que de mim se arrebentam ");
			((RadioButton) rg.getChildAt(0)).setText(String.valueOf("as raízes do mundo;"));
			((RadioButton) rg.getChildAt(1)).setText(String.valueOf(" os pétreos olhos se acendem;"));
			((RadioButton) rg.getChildAt(2)).setText(String.valueOf("a leve brisa faz mover a sua túnica de pedra"));

		} else if (contador == 2) {
			t.setText("Complete: Me ilumino! todo o existido ");
			((RadioButton) rg.getChildAt(0)).setText(String.valueOf("anjo, criando-o"));
			((RadioButton) rg.getChildAt(1)).setText(String.valueOf("silêncio me esperava"));
			((RadioButton) rg.getChildAt(2))
					.setText(String.valueOf("fora apenas preparação deste encontro."));
		} /*else if (contador == 3) {
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
				ed.setText("Parabéns você passou para o proximo Quiz 3 e desbloqueou o poema 3.\nAcertos:" + nota);
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
			if (i.equals("Mostrar o rumo além da poesia tradicional.")) {
				nota = nota + 1;
			}

		}
		if (contador == 1) {
			if (i.equals("as raízes do mundo;")) {
				nota = nota + 1;
			}

		}
		if (contador == 2) {
			if (i.equals("fora apenas preparação deste encontro.")) {
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
			String data = "ccbaaaaaa";
			arquivo.write(data.getBytes());
			arquivo.close();

		} catch (FileNotFoundException fnex) {
			fnex.printStackTrace();
		} catch (IOException ioex) {
			ioex.printStackTrace();
		}

		try {
			FileOutputStream arquivo = openFileOutput("meuArquivo2", MODE_APPEND);
			String data = "ccbaaaaaa";
			arquivo.write(data.getBytes());
			arquivo.close();

		} catch (FileNotFoundException fnex) {
			fnex.printStackTrace();
		} catch (IOException ioex) {
			ioex.printStackTrace();
		}

	}
}
