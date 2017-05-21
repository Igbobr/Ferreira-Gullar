package br.edu.ifgoiano.ferreiraGullar;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class FragmentPergunta extends Fragment {
	int contador = 0;
	private RadioGroup rg; 
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		final View view = inflater.inflate(R.layout.layout_pergunta, container, false);

		rg = (RadioGroup) view.findViewById(R.id.quiz1radio);
        rg.setOnCheckedChangeListener(new OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged (RadioGroup group,int checkedId){
            	RadioButton rb = (RadioButton) view.findViewById(checkedId);
            	
            	
            
            }
        });
		
		Button buttonAvancar = (Button) view.findViewById(R.id.botaoAvancar);
		buttonAvancar.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				if (contador  == 0){
					
				}
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
