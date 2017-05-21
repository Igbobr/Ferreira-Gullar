package br.edu.ifgoiano.ferreiraGullar;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;


public class SelecaoQuiz extends Activity {
	private FragmentManager fm = getFragmentManager();
	private LinearLayout l1 ;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_selecao_quiz);
		

		getWindow().getDecorView()
	.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
		getWindow().setStatusBarColor(Color.TRANSPARENT);
		l1 = (LinearLayout) findViewById(R.id.layout1);
		
		
	}

	public void quiz1(View x){
		
		Intent i = new Intent(this, Quiz1Pergunta.class);
		startActivity(i);
		
		
	}
}
