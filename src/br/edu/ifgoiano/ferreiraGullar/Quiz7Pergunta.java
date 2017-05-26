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

public class Quiz7Pergunta extends Activity {
	int contador = 0, nota = 0;
	private RadioGroup rg;
	private TextView t;
	private EditText ed;
	private RadioButton rb;
	private Button b1, b2;

	@SuppressLint("NewApi")
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quiz7_pergunta);

		getWindow().getDecorView()
		.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
getWindow().setStatusBarColor(Color.TRANSPARENT);
		
		b1 = (Button) findViewById(R.id.botaoAvancarq7);
		b2 = (Button) findViewById(R.id.botaoVoltarq7);
		ed = (EditText) findViewById(R.id.editTextEnunciadoQuiz7);
		t = (TextView) findViewById(R.id.enunciadoquiz7);
		rg = (RadioGroup) findViewById(R.id.quiz7radio);


		rg.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				rb = (RadioButton) findViewById(checkedId);
				ed.setText(rb.getText().toString());

			}
		});

		try {
			t.setText("	Sobre o poema “MAR AZUL”: Mar azul” é um poema que explora o uso de apenas cinco substantivos e um adjetivo");
			((RadioButton) rg.getChildAt(0)).setText(String.valueOf("Verdadeiro"));
			((RadioButton) rg.getChildAt(1)).setText(String.valueOf("Falso"));
			

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
				t.setText("	Sobre o poema “MAR AZUL”: Mar azul” é um poema que explora o uso de apenas cinco substantivos e um adjetivo");
				((RadioButton) rg.getChildAt(0)).setText(String.valueOf("Verdadeiro"));
				((RadioButton) rg.getChildAt(1)).setText(String.valueOf("Falso"));
				

			} catch (Exception e) {
				Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG).show();
			}
		}
		if (contador == 1) {
			t.setText("Sobre o poema “MAR AZUL”: Azul” é um adjetivo comum em todos os versos");
			((RadioButton) rg.getChildAt(0)).setText(String.valueOf("Verdadeiro"));
			((RadioButton) rg.getChildAt(1)).setText(String.valueOf("Falso"));

		} else if (contador == 2) {
			t.setText("Sobre o poema “MAR AZUL”: A leitura progressiva do texto permite um efeito fônico, provocado pela repetição de letras e sons que comprovam a filiação do texto ao movimento concretista");
			((RadioButton) rg.getChildAt(0)).setText(String.valueOf("Verdadeiro"));
			((RadioButton) rg.getChildAt(1)).setText(String.valueOf("Falso"));
			
		} else if (contador == 3) {
			t.setText("O adjetivo “azul” pode remeter tanto à ideia da cor do céu quanto da cor do mar, que acaba também dando uma tonalidade “azul” ao barco");
			((RadioButton) rg.getChildAt(0)).setText(String.valueOf("Verdadeiro"));
			((RadioButton) rg.getChildAt(1)).setText(String.valueOf("Falso"));

		} else if (contador == 4) {
			t.setText("A repetição constante da vogal “a” remete ao uso da figura de linguagem denominada aliteração");
			((RadioButton) rg.getChildAt(0)).setText(String.valueOf("Verdadeiro"));
			((RadioButton) rg.getChildAt(1)).setText(String.valueOf("Falso"));
		}
		if (contador == 5) {
			if ((nota == 4) || (nota == 5)) {
				b1.setVisibility(arg0.INVISIBLE);
				b2.setVisibility(arg0.INVISIBLE);
				b1.setClickable(false);
				b2.setClickable(false);
				rg.setVisibility(arg0.INVISIBLE);
				ed.setText("Parabéns você passou para o proximo Quiz 9 e desbloqueou o poema 9.");
				t.setText(" ");
				recriarAquivo();

			} else {
				rg.setVisibility(arg0.INVISIBLE);
				b1.setVisibility(arg0.INVISIBLE);
				b2.setVisibility(arg0.INVISIBLE);
				b1.setClickable(false);
				b2.setClickable(false);
				ed.setText("Não foi dessa vez, mas não desanime tente novamente. sua nota é: " + nota);
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
			if (i.equals("Verdadeiro")) {
				nota = nota + 1;
			}

		}
		if (contador == 1) {
			if (i.equals("Verdadeiro")) {
				nota = nota + 1;
			}

		}
		if (contador == 2) {
			if (i.equals("Verdadeiro")) {
				nota = nota + 1;
			}

		}
		if (contador == 3) {
			if (i.equals("Verdadeiro")) {
				nota = nota + 1;
			}

		}
		if (contador == 4) {
			if (i.equals("Falso")) {
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
			String data = "cccccccba";
			arquivo.write(data.getBytes());
			arquivo.close();

		} catch (FileNotFoundException fnex) {
			fnex.printStackTrace();
		} catch (IOException ioex) {
			ioex.printStackTrace();
		}

		try {
			FileOutputStream arquivo = openFileOutput("meuArquivo2", MODE_APPEND);
			String data = "cccccccba";
			arquivo.write(data.getBytes());
			arquivo.close();

		} catch (FileNotFoundException fnex) {
			fnex.printStackTrace();
		} catch (IOException ioex) {
			ioex.printStackTrace();
		}

	}
}
