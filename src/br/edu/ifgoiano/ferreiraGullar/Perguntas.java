package br.edu.ifgoiano.ferreiraGullar;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

public class Perguntas extends Activity {

	private FragmentManager fm = getFragmentManager();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_perguntas);
		
		FragmentTransaction ft = fm.beginTransaction();
		
		FragmentPergunta t = new FragmentPergunta();
		ft.replace(R.id.layoutPergunta, t);
		
	}
}
