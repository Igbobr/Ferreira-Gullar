package br.edu.ifgoiano.ferreiraGullar;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class Pergunta extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.layout_pergunta, container, false);

		Button buttonAvancar = (Button) view.findViewById(R.id.botaoAvancar);
		buttonAvancar.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {

			}
		});

		Button buttonVoltar = (Button) view.findViewById(R.id.botaoVoltar);
		buttonVoltar.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {

			}
		});

		return view;
	}

}
