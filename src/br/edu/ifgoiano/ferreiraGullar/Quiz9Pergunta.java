package br.edu.ifgoiano.ferreiraGullar;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import android.app.Activity;
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

public class Quiz9Pergunta extends Activity {
	int contador = 0, nota = 0;
	private RadioGroup rg;
	private TextView t;
	private EditText ed;
	private RadioButton rb;
	private Button b1, b2;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quiz9_pergunta);

		b1 = (Button) findViewById(R.id.botaoAvancarq9);
		b2 = (Button) findViewById(R.id.botaoVoltarq9);
		ed = (EditText) findViewById(R.id.editTextEnunciadoQuiz9);
		t = (TextView) findViewById(R.id.enunciadoquiz9);
		rg = (RadioGroup) findViewById(R.id.quiz9radio);

		rg.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				rb = (RadioButton) findViewById(checkedId);
				ed.setText(rb.getText().toString());

			}
		});

		try {
			t.setText("	Verdadeiro ou Falso? A morte é um dos temas que perpassa a \n produção poética de Ferreira Gullar, a exemplo do poema “Meu pai”");
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
				t.setText("Verdadeiro ou Falso? A morte é um dos temas que perpassa a \n produção poética de Ferreira Gullar, a exemplo do poema “Meu pai”");
				((RadioButton) rg.getChildAt(0)).setText(String.valueOf("Verdadeiro"));
				((RadioButton) rg.getChildAt(1)).setText(String.valueOf("Falso"));

			} catch (Exception e) {
				Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG).show();
			}
		}
		if (contador == 1) {
			t.setText("Verdadeiro ou Falso? O poema “Meu pai” pode ser considerado um “poema-narrativo”, pois narra uma história sobre o pai do eu lírico");
			((RadioButton) rg.getChildAt(0)).setText(String.valueOf("Verdadeiro"));
			((RadioButton) rg.getChildAt(1)).setText(String.valueOf("Falso"));

		} else if (contador == 2) {
			t.setText("Verdadeiro ou Falso?	É possível evidenciar a preocupação do poeta com as mazelas sociais que afligem a sociedade, a exemplo da falta de recursos para tratar de problemas de saúde ");
			((RadioButton) rg.getChildAt(0)).setText(String.valueOf("Verdadeiro"));
			((RadioButton) rg.getChildAt(1)).setText(String.valueOf("Falso"));
			
		} else if (contador == 3) {
			t.setText("Verdadeirou ou Falso? Percebe-se a ironia nos últimos cinco versos do poema, quando o pai do eu lírico guarda a nota de compra dos óculos no bolso");
			((RadioButton) rg.getChildAt(0)).setText(String.valueOf("Verdadeiro"));
			((RadioButton) rg.getChildAt(1)).setText(String.valueOf("Falso"));

		} else if (contador == 4) {
			t.setText("Verdadeirou ou Falso? mas perdeu os óculos na viagem” é uma oração coordenada conclusiva. ");
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
				ed.setText("");
				t.setText("Parabéns você passou todas as etapas, agora você sabe o minímo do escritor Ferreira Gullar. ");

			} else {
				rg.setVisibility(arg0.INVISIBLE);
				b1.setVisibility(arg0.INVISIBLE);
				b2.setVisibility(arg0.INVISIBLE);
				b1.setClickable(false);
				b2.setClickable(false);
				ed.setText("Não foi dessa vez, mas não desanime tente novamente. Sua nota é : " + nota);
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
			String data = "ccccccccc";
			arquivo.write(data.getBytes());
			arquivo.close();

		} catch (FileNotFoundException fnex) {
			fnex.printStackTrace();
		} catch (IOException ioex) {
			ioex.printStackTrace();
		}

		try {
			FileOutputStream arquivo = openFileOutput("meuArquivo2", MODE_APPEND);
			String data = "ccccccccc";
			arquivo.write(data.getBytes());
			arquivo.close();

		} catch (FileNotFoundException fnex) {
			fnex.printStackTrace();
		} catch (IOException ioex) {
			ioex.printStackTrace();
		}

	}
}
