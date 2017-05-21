package br.edu.ifgoiano.ferreiraGullar.poemas;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import br.edu.ifgoiano.ferreiraGullar.R;

public class ActivityPoema extends Activity {

	private FragmentManager fm = getFragmentManager();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activity_poema);

		getWindow().getDecorView()
				.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
		getWindow().setStatusBarColor(Color.TRANSPARENT);

		String nomePoema = "";
		Intent intent = getIntent();
		FragmentTransaction ft = fm.beginTransaction();

		if (intent.hasExtra("poema")) {

			nomePoema = intent.getStringExtra("poema").toString();

			if (nomePoema.equals("traduzirSe")) {

				FragmentPoema t = new FragmentPoema();
				Bundle bundle = new Bundle();
				bundle.putString("poema", "traduzirSe");
				t.setArguments(bundle);
				ft.replace(R.id.telaPoema, t);
				ft.commit();

			} else if (nomePoema.equals("oAnjo")) {

				FragmentPoema t = new FragmentPoema();
				Bundle bundle = new Bundle();
				bundle.putString("poema", "oAnjo");
				t.setArguments(bundle);
				ft.replace(R.id.telaPoema, t);
				ft.commit();

			} else if (nomePoema.equals("doisEDois")) {

				FragmentPoema t = new FragmentPoema();
				Bundle bundle = new Bundle();
				bundle.putString("poema", "doisEDois");
				t.setArguments(bundle);
				ft.replace(R.id.telaPoema, t);
				ft.commit();

			} else if (nomePoema.equals("osMortos")) {

				FragmentPoema t = new FragmentPoema();
				Bundle bundle = new Bundle();
				bundle.putString("poema", "osMortos");
				t.setArguments(bundle);
				ft.replace(R.id.telaPoema, t);
				ft.commit();

			} else if (nomePoema.equals("cantada")) {

				FragmentPoema t = new FragmentPoema();
				Bundle bundle = new Bundle();
				bundle.putString("poema", "cantada");
				t.setArguments(bundle);
				ft.replace(R.id.telaPoema, t);
				ft.commit();

			} else if (nomePoema.equals("naoVagas")) {

				FragmentPoema t = new FragmentPoema();
				Bundle bundle = new Bundle();
				bundle.putString("poema", "naoVagas");
				t.setArguments(bundle);
				ft.replace(R.id.telaPoema, t);
				ft.commit();

			} else if (nomePoema.equals("poemasNeoconcretos")) {

				FragmentPoema t = new FragmentPoema();
				Bundle bundle = new Bundle();
				bundle.putString("poema", "poemasNeoconcretos");
				t.setArguments(bundle);
				ft.replace(R.id.telaPoema, t);
				ft.commit();

			} else if (nomePoema.equals("cantigaParaNaoMorrer")) {

				FragmentPoema t = new FragmentPoema();
				Bundle bundle = new Bundle();
				bundle.putString("poema", "cantigaParaNaoMorrer");
				t.setArguments(bundle);
				ft.replace(R.id.telaPoema, t);
				ft.commit();

			} else if (nomePoema.equals("meuPai")) {

				FragmentPoema t = new FragmentPoema();
				Bundle bundle = new Bundle();
				bundle.putString("poema", "meuPai");
				t.setArguments(bundle);
				ft.replace(R.id.telaPoema, t);
				ft.commit();

			}

		} else {

			nomePoema = "Campo não foi informado";
			FragmentPoema t = new FragmentPoema();
			Bundle bundle = new Bundle();
			bundle.putString("poema", "Campo não foi informado");
			t.setArguments(bundle);
			ft.replace(R.id.telaPoema, t);
			ft.commit();

		}
	}
}
