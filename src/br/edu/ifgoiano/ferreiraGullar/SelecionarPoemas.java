package br.edu.ifgoiano.ferreiraGullar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import br.edu.ifgoiano.ferreiraGullar.poemas.ActivityPoema;

public class SelecionarPoemas extends Activity {

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_selecionar_poemas);

		getWindow().getDecorView()
				.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
		getWindow().setStatusBarColor(Color.TRANSPARENT);
		lerArquivo();

	}

	public void entrarPoemaTraduzirSe(View view) {

		Intent i = new Intent(this, ActivityPoema.class);
		i.putExtra("poema", "traduzirSe");
		startActivity(i);

	}

	public void entrarPoemaOAnjo(View view) {

		Intent i = new Intent(this, ActivityPoema.class);
		i.putExtra("poema", "oAnjo");
		startActivity(i);

	}

	public void entrarPoemaDoisEDois(View view) {

		Intent i = new Intent(this, ActivityPoema.class);
		i.putExtra("poema", "doisEDois");
		startActivity(i);

	}

	public void entrarPoemaOsMortos(View view) {

		Intent i = new Intent(this, ActivityPoema.class);
		i.putExtra("poema", "osMortos");
		startActivity(i);

	}

	public void entrarPoemaCantada(View view) {

		Intent i = new Intent(this, ActivityPoema.class);
		i.putExtra("poema", "cantada");
		startActivity(i);

	}

	public void entrarPoemaNaoVagas(View view) {

		Intent i = new Intent(this, ActivityPoema.class);
		i.putExtra("poema", "naoVagas");
		startActivity(i);

	}

	public void entrarPoemaPoemasNeoconcretos(View view) {

		Intent i = new Intent(this, ActivityPoema.class);
		i.putExtra("poema", "poemasNeoconcretos");
		startActivity(i);

	}

	public void entrarPoemaCantigaParaNaoMorrer(View view) {

		Intent i = new Intent(this, ActivityPoema.class);
		i.putExtra("poema", "cantigaParaNaoMorrer");
		startActivity(i);

	}

	public void entrarPoemaMeuPai(View view) {

		Intent i = new Intent(this, ActivityPoema.class);
		i.putExtra("poema", "meuPai");
		startActivity(i);

	}

	public void lerArquivo() {
		String dados = "baaaaaaaa";
		try {
			File arquivo = getFileStreamPath("meuArquivo2");
			if (arquivo.exists()) {
				FileInputStream arquivoLido = openFileInput("meuArquivo2");
				BufferedReader entrada = new BufferedReader(new InputStreamReader(arquivoLido));
				String linha;
				dados = "";
				while ((linha = entrada.readLine()) != null) {
					dados += linha;
				}
			} else {
				criarArquivo();

			}
		} catch (FileNotFoundException fnex) {
			criarArquivo();

		} catch (IOException ioex) {
			ioex.printStackTrace();
		}

		Drawable drawableTop = getResources().getDrawable(R.drawable.poema);
		Drawable drawablebottom = getResources().getDrawable(R.drawable.locked);
		Drawable drawablebottom2 = getResources().getDrawable(R.drawable.yes);

		String q = String.valueOf(dados.charAt(0));
		TextView t = (TextView) findViewById(R.id.poema1);
		if (q.equals("a")) {
			t.setCompoundDrawablesWithIntrinsicBounds(null, drawableTop, null, drawablebottom);
			t.setClickable(false);
		} else if (q.equals("b")) {
			t.setCompoundDrawablesWithIntrinsicBounds(null, drawableTop, null, null);
		} else if (q.equals("c")) {
			t.setCompoundDrawablesWithIntrinsicBounds(null, drawableTop, null, drawablebottom2);

		}

		// -------------------------------------------------------------------------------

		q = String.valueOf(dados.charAt(1));
		t = (TextView) findViewById(R.id.poema2);
		if (q.equals("a")) {
			t.setCompoundDrawablesWithIntrinsicBounds(null, drawableTop, null, drawablebottom);
			t.setClickable(false);
		} else if (q.equals("b")) {
			t.setCompoundDrawablesWithIntrinsicBounds(null, drawableTop, null, null);
		} else if (q.equals("c")) {
			t.setCompoundDrawablesWithIntrinsicBounds(null, drawableTop, null, drawablebottom2);

		}

		// ---------------------------------------------------------
		q = String.valueOf(dados.charAt(2));
		t = (TextView) findViewById(R.id.poema3);
		if (q.equals("a")) {
			t.setCompoundDrawablesWithIntrinsicBounds(null, drawableTop, null, drawablebottom);
			t.setClickable(false);
		} else if (q.equals("b")) {
			t.setCompoundDrawablesWithIntrinsicBounds(null, drawableTop, null, null);
		} else if (q.equals("c")) {
			t.setCompoundDrawablesWithIntrinsicBounds(null, drawableTop, null, drawablebottom2);

		}
		// ----------------------------------------------------------
		q = String.valueOf(dados.charAt(2));
		t = (TextView) findViewById(R.id.poema3);
		if (q.equals("a")) {
			t.setCompoundDrawablesWithIntrinsicBounds(null, drawableTop, null, drawablebottom);
			t.setClickable(false);
		} else if (q.equals("b")) {
			t.setCompoundDrawablesWithIntrinsicBounds(null, drawableTop, null, null);
		} else if (q.equals("c")) {
			t.setCompoundDrawablesWithIntrinsicBounds(null, drawableTop, null, drawablebottom2);

		}

		// ---------------------------------------------------------

		q = String.valueOf(dados.charAt(3));
		t = (TextView) findViewById(R.id.poema4);
		if (q.equals("a")) {
			t.setCompoundDrawablesWithIntrinsicBounds(null, drawableTop, null, drawablebottom);
			t.setClickable(false);
		} else if (q.equals("b")) {
			t.setCompoundDrawablesWithIntrinsicBounds(null, drawableTop, null, null);
		} else if (q.equals("c")) {
			t.setCompoundDrawablesWithIntrinsicBounds(null, drawableTop, null, drawablebottom2);

		}
		// ------------------------------------------------------------

		q = String.valueOf(dados.charAt(4));
		t = (TextView) findViewById(R.id.poema5);
		if (q.equals("a")) {
			t.setCompoundDrawablesWithIntrinsicBounds(null, drawableTop, null, drawablebottom);
			t.setClickable(false);
		} else if (q.equals("b")) {
			t.setCompoundDrawablesWithIntrinsicBounds(null, drawableTop, null, null);
		} else if (q.equals("c")) {
			t.setCompoundDrawablesWithIntrinsicBounds(null, drawableTop, null, drawablebottom2);

		}
		// -------------------------------------------------------------

		q = String.valueOf(dados.charAt(5));
		t = (TextView) findViewById(R.id.poema6);
		if (q.equals("a")) {
			t.setCompoundDrawablesWithIntrinsicBounds(null, drawableTop, null, drawablebottom);
			t.setClickable(false);
		} else if (q.equals("b")) {
			t.setCompoundDrawablesWithIntrinsicBounds(null, drawableTop, null, null);
		} else if (q.equals("c")) {
			t.setCompoundDrawablesWithIntrinsicBounds(null, drawableTop, null, drawablebottom2);

		}
		// -----------------------------------------------------------------------
		q = String.valueOf(dados.charAt(6));
		t = (TextView) findViewById(R.id.poema7);
		if (q.equals("a")) {
			t.setCompoundDrawablesWithIntrinsicBounds(null, drawableTop, null, drawablebottom);
			t.setClickable(false);
		} else if (q.equals("b")) {
			t.setCompoundDrawablesWithIntrinsicBounds(null, drawableTop, null, null);
		} else if (q.equals("c")) {
			t.setCompoundDrawablesWithIntrinsicBounds(null, drawableTop, null, drawablebottom2);

		}
		// -------------------------------------------------------------
		q = String.valueOf(dados.charAt(7));
		t = (TextView) findViewById(R.id.poema8);
		if (q.equals("a")) {
			t.setCompoundDrawablesWithIntrinsicBounds(null, drawableTop, null, drawablebottom);
			t.setClickable(false);
		} else if (q.equals("b")) {
			t.setCompoundDrawablesWithIntrinsicBounds(null, drawableTop, null, null);
		} else if (q.equals("c")) {
			t.setCompoundDrawablesWithIntrinsicBounds(null, drawableTop, null, drawablebottom2);

		}
		// -------------------------------------------------------------------
		q = String.valueOf(dados.charAt(8));
		t = (TextView) findViewById(R.id.poema9);
		if (q.equals("a")) {
			t.setCompoundDrawablesWithIntrinsicBounds(null, drawableTop, null, drawablebottom);
			t.setClickable(false);
		} else if (q.equals("b")) {
			t.setCompoundDrawablesWithIntrinsicBounds(null, drawableTop, null, null);
		} else if (q.equals("c")) {
			t.setCompoundDrawablesWithIntrinsicBounds(null, drawableTop, null, drawablebottom2);

		}
	}

	public void criarArquivo() {

		try {
			FileOutputStream arquivo = openFileOutput("meuArquivo2", MODE_APPEND);
			String data = "baaaaaaaa";
			arquivo.write(data.getBytes());
			arquivo.close();

		} catch (FileNotFoundException fnex) {
			fnex.printStackTrace();
		} catch (IOException ioex) {
			ioex.printStackTrace();
		}
	}

}
