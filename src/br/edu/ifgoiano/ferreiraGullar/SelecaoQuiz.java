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
import android.app.FragmentManager;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class SelecaoQuiz extends Activity {

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_selecao_quiz);

		getWindow().getDecorView()
				.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
		getWindow().setStatusBarColor(Color.TRANSPARENT);
		try {
			lerArquivo();

		} catch (Exception e) {
			Toast.makeText(this,e.getMessage(), Toast.LENGTH_LONG).show();
		}

	}

	public void quiz1(View x) {

		Intent i = new Intent(this, Quiz1Pergunta.class);
		startActivity(i);

	}
	
	public void quiz2(View x) {

		Intent i = new Intent(this, Quiz2Pergunta.class);
		startActivity(i);

	}
	public void quiz3(View x) {

		Intent i = new Intent(this, Quiz3Pergunta.class);
		startActivity(i);

	}
	public void quiz4(View x) {

		Intent i = new Intent(this, Quiz4Pergunta.class);
		startActivity(i);

	}
	public void quiz8(View x) {

		Intent i = new Intent(this, Quiz8Pergunta.class);
		startActivity(i);

	}
	
	
	public void quiz9(View x) {

		Intent i = new Intent(this, Quiz9Pergunta.class);
		startActivity(i);

	}
	

	public void lerArquivo() {
		String dados = "baaaaaaaa";
		try {
			File arquivo = getFileStreamPath("meuArquivo");
			
			if (arquivo.exists()) {
				FileInputStream arquivoLido = openFileInput("meuArquivo");
				BufferedReader entrada = new BufferedReader(new InputStreamReader(arquivoLido));
				String linha;
				dados = "";
				while ((linha = entrada.readLine()) != null) {
					dados += linha;
				}
			} else {
				criarArquivo();
				Toast.makeText(this, "",Toast.LENGTH_LONG).show();

			}
		} catch (FileNotFoundException fnex) {
			criarArquivo();
			Toast.makeText(this, "Arquivo Criado 2",Toast.LENGTH_LONG).show();

		} catch (IOException ioex) {
			ioex.printStackTrace();
		}
		Drawable drawableTop = getResources().getDrawable(R.drawable.question);
		Drawable drawablebottom = getResources().getDrawable(R.drawable.locked);
		Drawable drawablebottom2 = getResources().getDrawable(R.drawable.yes);

		String q = String.valueOf(dados.charAt(0));
		TextView t = (TextView) findViewById(R.id.quiz1);
		if (q.equals("a")) {
			t.setCompoundDrawablesWithIntrinsicBounds(null, drawableTop, null, drawablebottom);
			t.setClickable(false);
		} else if (q.equals("b")) {
			t.setCompoundDrawablesWithIntrinsicBounds(null, drawableTop, null, null);
		} else if (q.equals("c")) {
			t.setCompoundDrawablesWithIntrinsicBounds(null, drawableTop, null, drawablebottom2);

		}
		//------------------------------------------------------
		 q = String.valueOf(dados.charAt(1));
		 t = (TextView) findViewById(R.id.quiz2);
		if (q.equals("a")) {
			t.setCompoundDrawablesWithIntrinsicBounds(null, drawableTop, null, drawablebottom);
			t.setClickable(false);
		} else if (q.equals("b")) {
			t.setCompoundDrawablesWithIntrinsicBounds(null, drawableTop, null, null);
		} else if (q.equals("c")) {
			t.setCompoundDrawablesWithIntrinsicBounds(null, drawableTop, null, drawablebottom2);

		}
		
		//---------------------------------------------------------
		q = String.valueOf(dados.charAt(2));
		 t = (TextView) findViewById(R.id.quiz3);
		if (q.equals("a")) {
			t.setCompoundDrawablesWithIntrinsicBounds(null, drawableTop, null, drawablebottom);
			t.setClickable(false);
		} else if (q.equals("b")) {
			t.setCompoundDrawablesWithIntrinsicBounds(null, drawableTop, null, null);
		} else if (q.equals("c")) {
			t.setCompoundDrawablesWithIntrinsicBounds(null, drawableTop, null, drawablebottom2);

		}
		//----------------------------------------------------------
		q = String.valueOf(dados.charAt(2));
		 t = (TextView) findViewById(R.id.quiz3);
		if (q.equals("a")) {
			t.setCompoundDrawablesWithIntrinsicBounds(null, drawableTop, null, drawablebottom);
			t.setClickable(false);
		} else if (q.equals("b")) {
			t.setCompoundDrawablesWithIntrinsicBounds(null, drawableTop, null, null);
		} else if (q.equals("c")) {
			t.setCompoundDrawablesWithIntrinsicBounds(null, drawableTop, null, drawablebottom2);

		}
	
		//---------------------------------------------------------
		
		q = String.valueOf(dados.charAt(3));
		 t = (TextView) findViewById(R.id.quiz4);
		if (q.equals("a")) {
			t.setCompoundDrawablesWithIntrinsicBounds(null, drawableTop, null, drawablebottom);
			t.setClickable(false);
		} else if (q.equals("b")) {
			t.setCompoundDrawablesWithIntrinsicBounds(null, drawableTop, null, null);
		} else if (q.equals("c")) {
			t.setCompoundDrawablesWithIntrinsicBounds(null, drawableTop, null, drawablebottom2);

		}
		//------------------------------------------------------------
		
		q = String.valueOf(dados.charAt(4));
		 t = (TextView) findViewById(R.id.quiz5);
		if (q.equals("a")) {
			t.setCompoundDrawablesWithIntrinsicBounds(null, drawableTop, null, drawablebottom);
			t.setClickable(false);
		} else if (q.equals("b")) {
			t.setCompoundDrawablesWithIntrinsicBounds(null, drawableTop, null, null);
		} else if (q.equals("c")) {
			t.setCompoundDrawablesWithIntrinsicBounds(null, drawableTop, null, drawablebottom2);

		}
		//-------------------------------------------------------------
		
		q = String.valueOf(dados.charAt(5));
		 t = (TextView) findViewById(R.id.quiz6);
		if (q.equals("a")) {
			t.setCompoundDrawablesWithIntrinsicBounds(null, drawableTop, null, drawablebottom);
			t.setClickable(false);
		} else if (q.equals("b")) {
			t.setCompoundDrawablesWithIntrinsicBounds(null, drawableTop, null, null);
		} else if (q.equals("c")) {
			t.setCompoundDrawablesWithIntrinsicBounds(null, drawableTop, null, drawablebottom2);

		}
		//-----------------------------------------------------------------------
		q = String.valueOf(dados.charAt(6));
		 t = (TextView) findViewById(R.id.quiz7);
		if (q.equals("a")) {
			t.setCompoundDrawablesWithIntrinsicBounds(null, drawableTop, null, drawablebottom);
			t.setClickable(false);
		} else if (q.equals("b")) {
			t.setCompoundDrawablesWithIntrinsicBounds(null, drawableTop, null, null);
		} else if (q.equals("c")) {
			t.setCompoundDrawablesWithIntrinsicBounds(null, drawableTop, null, drawablebottom2);

		}
		//-------------------------------------------------------------
		q = String.valueOf(dados.charAt(7));
		 t = (TextView) findViewById(R.id.quiz8);
		if (q.equals("a")) {
			t.setCompoundDrawablesWithIntrinsicBounds(null, drawableTop, null, drawablebottom);
			t.setClickable(false);
		} else if (q.equals("b")) {
			t.setCompoundDrawablesWithIntrinsicBounds(null, drawableTop, null, null);
		} else if (q.equals("c")) {
			t.setCompoundDrawablesWithIntrinsicBounds(null, drawableTop, null, drawablebottom2);

		}
	//-------------------------------------------------------------------
		q = String.valueOf(dados.charAt(8));
		 t = (TextView) findViewById(R.id.quiz9);
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
			FileOutputStream arquivo = openFileOutput("meuArquivo", MODE_APPEND);
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
