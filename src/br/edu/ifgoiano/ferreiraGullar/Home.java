package br.edu.ifgoiano.ferreiraGullar;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import br.edu.ifgoiano.ferreiraGullar.biografia.ActivityBiografia;

@SuppressLint("NewApi")
public class Home extends Activity {
	private Thread thread;
	private Button buttonPoemas , buttonQuiz, buttonbibli , buttonAjuda;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		
		getWindow().getDecorView()
	.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
		getWindow().setStatusBarColor(Color.TRANSPARENT);
	
		this.buttonPoemas = (Button) findViewById(R.id.bupoemas);
		this.buttonQuiz = (Button) findViewById(R.id.buquiz);
		this.buttonbibli = (Button) findViewById(R.id.bubibli);
		this.buttonAjuda = (Button) findViewById(R.id.buajuda);
		
	}
	

	public void poemas(View x) {

		final Animation animTranslate = AnimationUtils.loadAnimation(this,R.anim.anim_translate);
		final Animation animTranslate2 = AnimationUtils.loadAnimation(this,R.anim.anim_translate2);

		x.startAnimation(animTranslate);
		this.buttonQuiz.startAnimation(animTranslate2);
		this.buttonbibli.startAnimation(animTranslate2);
		this.buttonAjuda.startAnimation(animTranslate2);
		Intent i  =  new Intent(this, SelecionarPoemas.class);
		startActivity(i);
		
	}

	public void quiz(View x) {
		
		
		final Animation animTranslate = AnimationUtils.loadAnimation(this,R.anim.anim_translate);
		final Animation animTranslate2 = AnimationUtils.loadAnimation(this,R.anim.anim_translate2);

		x.startAnimation(animTranslate);
		this.buttonPoemas.startAnimation(animTranslate2);
		this.buttonbibli.startAnimation(animTranslate2);
		this.buttonAjuda.startAnimation(animTranslate2);
		Intent i  =  new Intent(this, SelecaoQuiz.class);
		startActivity(i);
	}
	
	public void bibli(View x) {
		
		final Animation animTranslate = AnimationUtils.loadAnimation(this,R.anim.anim_translate);
		final Animation animTranslate2 = AnimationUtils.loadAnimation(this,R.anim.anim_translate2);

		x.startAnimation(animTranslate);
		this.buttonQuiz.startAnimation(animTranslate2);
		this.buttonQuiz.startAnimation(animTranslate2);
		this.buttonAjuda.startAnimation(animTranslate2);
		Intent i  =  new Intent(this, ActivityBiografia.class);
		startActivity(i);
		
	}

	public void ajuda(View x) {	
		
	}


	

}
