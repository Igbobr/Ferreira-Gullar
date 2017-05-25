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

public class Quiz8Pergunta extends Activity {
	int contador = 0, nota = 0;
	private RadioGroup rg;
	private TextView t;
	private EditText ed;
	private RadioButton rb;
	private Button b1, b2;

	@SuppressLint("NewApi")
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quiz8_pergunta);

		getWindow().getDecorView()
		.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
getWindow().setStatusBarColor(Color.TRANSPARENT);
		
		b1 = (Button) findViewById(R.id.botaoAvancarq8);
		b2 = (Button) findViewById(R.id.botaoVoltarq8);
		ed = (EditText) findViewById(R.id.editTextEnunciadoQuiz8);
		t = (TextView) findViewById(R.id.enunciadoquiz8);
		rg = (RadioGroup) findViewById(R.id.quiz8radio);

		rg.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				rb = (RadioButton) findViewById(checkedId);
				ed.setText(rb.getText().toString());

			}
		});

		try {
			t.setText("	Verdadeiro ou Falso? Quando”, no primeiro verso, é uma conjunção subordinativa");
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
				t.setText("Verdadeiro ou Falso? Quando”, no primeiro verso, é uma conjunção subordinativa");
				((RadioButton) rg.getChildAt(0)).setText(String.valueOf("Verdadeiro"));
				((RadioButton) rg.getChildAt(1)).setText(String.valueOf("Falso"));

			} catch (Exception e) {
				Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG).show();
			}
		}
		if (contador == 1) {
			t.setText("Verdadeiro ou Falso?	“Me” é um pronome oblíquo átono");
			((RadioButton) rg.getChildAt(0)).setText(String.valueOf("Verdadeiro"));
			((RadioButton) rg.getChildAt(1)).setText(String.valueOf("Falso"));

		} else if (contador == 2) {
			t.setText("Verdadeiro ou Falso?	3)	“Se” , no verso “Se acaso você não possa”, é um pronome oblíquo átono");
			((RadioButton) rg.getChildAt(0)).setText(String.valueOf("Verdadeiro"));
			((RadioButton) rg.getChildAt(1)).setText(String.valueOf("Falso"));
			
		} else if (contador == 3) {
			t.setText("Verdadeirou ou Falso?4)	O título “Cantiga para não morrer” remete o leitor às cantigas de amor medievais");
			((RadioButton) rg.getChildAt(0)).setText(String.valueOf("Verdadeiro"));
			((RadioButton) rg.getChildAt(1)).setText(String.valueOf("Falso"));

		} else if (contador == 4) {
			t.setText("Verdadeirou ou Falso? A partir da segunda estrofe, é possível perceber o processo de separação entre eu-lírico e a mulher amada. ");
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
			if (i.equals("Falso")) {
				nota = nota + 1;
			}

		}
		if (contador == 3) {
			if (i.equals("Verdadeiro")) {
				nota = nota + 1;
			}

		}
		if (contador == 4) {
			if (i.equals("Verdadeiro")) {
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
			String data = "ccccccccb";
			arquivo.write(data.getBytes());
			arquivo.close();

		} catch (FileNotFoundException fnex) {
			fnex.printStackTrace();
		} catch (IOException ioex) {
			ioex.printStackTrace();
		}

		try {
			FileOutputStream arquivo = openFileOutput("meuArquivo2", MODE_APPEND);
			String data = "ccccccccb";
			arquivo.write(data.getBytes());
			arquivo.close();

		} catch (FileNotFoundException fnex) {
			fnex.printStackTrace();
		} catch (IOException ioex) {
			ioex.printStackTrace();
		}

	}
}
