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

public class Quiz6Pergunta extends Activity {
	int contador = 0, nota = 0;
	private RadioGroup rg;
	private TextView t;
	private EditText ed;
	private RadioButton rb;
	private Button b1, b2;

	@SuppressLint("NewApi")
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quiz6_pergunta);

		getWindow().getDecorView()
				.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
		getWindow().setStatusBarColor(Color.TRANSPARENT);

		b1 = (Button) findViewById(R.id.botaoAvancarq6);
		b2 = (Button) findViewById(R.id.botaoVoltarq6);
		ed = (EditText) findViewById(R.id.editTextEnunciadoQuiz6);
		t = (TextView) findViewById(R.id.enunciadoquiz6);
		rg = (RadioGroup) findViewById(R.id.quiz6radio);

		rg.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				rb = (RadioButton) findViewById(checkedId);
				ed.setText(rb.getText().toString());

			}
		});

		try {
			t.setText("Sobre o poema �N�o h� vagas�:O poema n�o tem pontua��o, que � uma caracter�stica do modernismo ");
			((RadioButton) rg.getChildAt(0)).setText(String.valueOf("Certo"));
			((RadioButton) rg.getChildAt(1)).setText(String.valueOf("Errado"));
			

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
				t.setText("Sobre o poema �N�o h� vagas�:O poema n�o tem pontua��o, que � uma caracter�stica do modernismo ");
				((RadioButton) rg.getChildAt(0)).setText(String.valueOf("Certo"));
				((RadioButton) rg.getChildAt(1)).setText(String.valueOf("Errado"));
				

			} catch (Exception e) {
				Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG).show();
			}
		}
		if (contador == 1) {
			t.setText("Sobre o poema 'n�o h� vagas': o poema aborda a situa��o do trabalhador que procura meios de sustento e precisa enfrentar o alto pre�o dos g�neros de primeira necessidade (feij�o e arroz");
			((RadioButton) rg.getChildAt(0)).setText(String.valueOf("Certo"));
			((RadioButton) rg.getChildAt(1)).setText(String.valueOf("Errado"));
			
		} else if (contador == 2) {
			t.setText("Sobre o poema �N�o h� vagas�: No poema, h� uma cr�tica ao Funcionalismo P�blico.");
			((RadioButton) rg.getChildAt(0)).setText(String.valueOf("Certo"));
			((RadioButton) rg.getChildAt(1)).setText(String.valueOf("Errado"));
			
		} else if (contador == 3) {
			t.setText("Sobre o poema �N�o h� vagas�: 4)	O substantivo �sonega��o�, que tamb�m n�o cabe no poema, � um substantivo concreto ");
			((RadioButton) rg.getChildAt(0)).setText(String.valueOf("Certo"));
			((RadioButton) rg.getChildAt(1)).setText(String.valueOf("Errado"));

		} else if (contador == 4) {
			t.setText("5)	O poema � metalingu�stico, pois discute o pr�prio fazer po�tico, al�m de abordar o sentido e a fun��o da poesia");
			((RadioButton) rg.getChildAt(0)).setText(String.valueOf("Certo"));
			((RadioButton) rg.getChildAt(1)).setText(String.valueOf("Errado"));
		}
		if (contador == 5) {
			if ((nota == 4) || (nota == 5)) {
				b1.setVisibility(arg0.INVISIBLE);
				b2.setVisibility(arg0.INVISIBLE);
				b1.setClickable(false);
				b2.setClickable(false);
				rg.setVisibility(arg0.INVISIBLE);
				ed.setText("Parab�ns voc� passou para o proximo Quiz 7 e desbloqueou o poema 7.");
				recriarAquivo();
				t.setText(" ");

			} else {
				rg.setVisibility(arg0.INVISIBLE);
				b1.setVisibility(arg0.INVISIBLE);
				b2.setVisibility(arg0.INVISIBLE);
				b1.setClickable(false);
				b2.setClickable(false);
				ed.setText("N�o foi dessa vez, mas n�o desanime tente novamente. Nota:" + nota);
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
			if (i.equals("Certo")) {
				nota = nota + 1;
			}

		}
		if (contador == 1) {
			if (i.equals("Certo")) {
				nota = nota + 1;
			}

		}
		if (contador == 2) {
			if (i.equals("Certo")) {
				nota = nota + 1;
			}

		}
		if (contador == 3) {
			if (i.equals("Errado")) {
				nota = nota + 1;
			}

		}
		if (contador == 4) {
			if (i.equals("Certo")) {
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
			String data = "ccccccbaa";
			arquivo.write(data.getBytes());
			arquivo.close();

		} catch (FileNotFoundException fnex) {
			fnex.printStackTrace();
		} catch (IOException ioex) {
			ioex.printStackTrace();
		}

		try {
			FileOutputStream arquivo = openFileOutput("meuArquivo2", MODE_APPEND);
			String data = "ccccccbaa";
			arquivo.write(data.getBytes());
			arquivo.close();

		} catch (FileNotFoundException fnex) {
			fnex.printStackTrace();
		} catch (IOException ioex) {
			ioex.printStackTrace();
		}

	}
}
