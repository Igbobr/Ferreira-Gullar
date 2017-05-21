package br.edu.ifgoiano.ferreiraGullar;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import br.edu.ifgoiano.ferreiraGullar.poemas.ActivityPoema;

public class SelecionarPoemas extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_selecionar_poemas);

		getWindow().getDecorView()
				.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
		getWindow().setStatusBarColor(Color.TRANSPARENT);

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

}
