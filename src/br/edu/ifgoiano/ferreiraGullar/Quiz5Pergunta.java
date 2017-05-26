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

public class Quiz5Pergunta extends Activity {
	int contador = 0, nota = 0;
	private RadioGroup rg;
	private TextView t;
	private EditText ed;
	private RadioButton rb;
	private Button b1, b2;

	@SuppressLint("NewApi")
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quiz5_pergunta);

		getWindow().getDecorView()
		.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
getWindow().setStatusBarColor(Color.TRANSPARENT);
		
		b1 = (Button) findViewById(R.id.botaoAvancarq5);
		b2 = (Button) findViewById(R.id.botaoVoltarq5);
		ed = (EditText) findViewById(R.id.editTextEnunciadoQuiz5);
		t = (TextView) findViewById(R.id.enunciadoquiz5);
		rg = (RadioGroup) findViewById(R.id.quiz5radio);

		rg.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				rb = (RadioButton) findViewById(checkedId);
				ed.setText(rb.getText().toString());

			}
		});

		try {
			t.setText(" Voc� � mais bonita que uma refinaria da Petrobr�s de noite mais bonita que Ursula Andress... \n No trecho acima, quando o autor omite o termo 'mais bonita que' ele utiliza qual figura de som ?  ");
			((RadioButton) rg.getChildAt(0)).setText(String.valueOf("Zeugma"));
			((RadioButton) rg.getChildAt(1)).setText(String.valueOf("Elipse"));
			((RadioButton) rg.getChildAt(2))
					.setText(String.valueOf("Alitera��o"));

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
				t.setText(" Voc� � mais bonita que uma refinaria da Petrobr�s de noite mais bonita que Ursula Andress... \n No trecho acima, quando o autor omite o termo 'mais bonita que' ele utiliza qual figura de som ?  ");
				((RadioButton) rg.getChildAt(0)).setText(String.valueOf("Zeugma"));
				((RadioButton) rg.getChildAt(1)).setText(String.valueOf("Elipse"));
				((RadioButton) rg.getChildAt(2))
						.setText(String.valueOf("Alitera��o"));

			} catch (Exception e) {
				Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG).show();
			}
		}
		if (contador == 1) {
			t.setText("No poema Cantada, o autor Ferreira G. consiste numa redund�ncia cuja finalidade � refor�ar a beleza de uma pessoa \n Assinale a alternativa que representa qual figura de som segue o aspecto citado anteriormente ");
			((RadioButton) rg.getChildAt(0)).setText(String.valueOf("Pleonasmo"));
			((RadioButton) rg.getChildAt(1)).setText(String.valueOf("Ant�tese"));
			((RadioButton) rg.getChildAt(2)).setText(String.valueOf("Silepse de n�mero"));

		} else if (contador == 2) {
			t.setText("Olha, voc� � t�o bonita quanto o Rio de Janeiro em maio \n Podemos classificar a ora��o acima em: ");
			((RadioButton) rg.getChildAt(0)).setText(String.valueOf("Ora��o subordinada adverbial concessiva"));
			((RadioButton) rg.getChildAt(1)).setText(String.valueOf("Ora��o subordinada adverbial comparativa"));
			((RadioButton) rg.getChildAt(2))
					.setText(String.valueOf("Nenhuma das anteriores"));
		}/* else if (contador == 3) {
			t.setText("Uma parte de mim � todo mundo; ");
			((RadioButton) rg.getChildAt(0)).setText(String.valueOf("outra parte estranheza e solid�o."));
			((RadioButton) rg.getChildAt(1)).setText(String.valueOf("outra parte � ningu�m: fundo sem fundo"));
			((RadioButton) rg.getChildAt(2)).setText(String.valueOf("Uma parte de mim pesa, pondera"));

		} else if (contador == 4) {
			t.setText("Na parte do poema, 'outra parte, linguagem ', podemos substituir o termo linguagem por:");
			((RadioButton) rg.getChildAt(0)).setText(String.valueOf("Vertigem e tortura"));
			((RadioButton) rg.getChildAt(1)).setText(String.valueOf("Falar e comunicar"));
			((RadioButton) rg.getChildAt(2)).setText(String.valueOf("Racionalidade e intelig�ncia"));
		}*/
		if (contador == 3) {
			if ((nota == 2) || (nota == 3)) {
				b1.setVisibility(arg0.INVISIBLE);
				b2.setVisibility(arg0.INVISIBLE);
				b1.setClickable(false);
				b2.setClickable(false);
				rg.setVisibility(arg0.INVISIBLE);
				ed.setText("Parab�ns voc� passou para o proximo Quiz 6 e desbloqueou o poema 6.");
				t.setText(" ");
				recriarAquivo();

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
			if (i.equals("Zeugma")) {
				nota = nota + 1;
			}

		}
		if (contador == 1) {
			if (i.equals("Pleonasmo")) {
				nota = nota + 1;
			}

		}
		if (contador == 2) {
			if (i.equals("Ora��o subordinada adverbial comparativa")) {
				nota = nota + 1;
			}

		}
		/*if (contador == 3) {
			if (i.equals("outra parte � ningu�m: fundo sem fundo")) {
				nota = nota + 1;
			}

		}
		if (contador == 4) {
			if (i.equals("Racionalidade e intelig�ncia")) {
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
			String data = "cccccbaaa";
			arquivo.write(data.getBytes());
			arquivo.close();

		} catch (FileNotFoundException fnex) {
			fnex.printStackTrace();
		} catch (IOException ioex) {
			ioex.printStackTrace();
		}

		try {
			FileOutputStream arquivo = openFileOutput("meuArquivo2", MODE_APPEND);
			String data = "cccccbaaa";
			arquivo.write(data.getBytes());
			arquivo.close();

		} catch (FileNotFoundException fnex) {
			fnex.printStackTrace();
		} catch (IOException ioex) {
			ioex.printStackTrace();
		}

	}
}
