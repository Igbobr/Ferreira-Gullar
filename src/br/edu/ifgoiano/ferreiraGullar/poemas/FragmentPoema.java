package br.edu.ifgoiano.ferreiraGullar.poemas;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import br.edu.ifgoiano.ferreiraGullar.R;

public class FragmentPoema extends Fragment {

	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.layout_poema, container, false);

		TextView titulo = (TextView) view.findViewById(R.id.tituloPoema),
				textoPoema = (TextView) view.findViewById(R.id.textoPoema);

		Bundle bundle = getArguments();
		if (bundle != null) {
			String nomePoema = bundle.getString("poema").toString();

			if (nomePoema.equals("traduzirSe")) {
				
				titulo.setText(getString(R.string.titulo_traduzirse));
				textoPoema.setText(getString(R.string.traduzirse));

			} else if (nomePoema.equals("oAnjo")) {

			} else if (nomePoema.equals("doisEDois")) {

			} else if (nomePoema.equals("osMortos")) {

			} else if (nomePoema.equals("cantada")) {

			} else if (nomePoema.equals("naoVagas")) {

			} else if (nomePoema.equals("poemasNeoconcretos")) {

			} else if (nomePoema.equals("cantigaParaNaoMorrer")) {

			} else if (nomePoema.equals("meuPai")) {

			} else {
				
				textoPoema.setText("Campo não informado");
				
			}
			
		}

		return view;
	}
}
