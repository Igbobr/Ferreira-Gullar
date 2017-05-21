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

				titulo.setText(getString(R.string.titulo_oanjo));
				textoPoema.setText(getString(R.string.oanjo));

			} else if (nomePoema.equals("doisEDois")) {

				titulo.setText(getString(R.string.titulo_doiedois));
				textoPoema.setText(getString(R.string.doisedois));

			} else if (nomePoema.equals("osMortos")) {

				titulo.setText(getString(R.string.titulo_osmortos));
				textoPoema.setText(getString(R.string.osmortos));

			} else if (nomePoema.equals("cantada")) {

				titulo.setText(getString(R.string.titulo_cantada));
				textoPoema.setText(getString(R.string.cantada));

			} else if (nomePoema.equals("naoVagas")) {

				titulo.setText(getString(R.string.titulo_naovagas));
				textoPoema.setText(getString(R.string.naovagas));

			} else if (nomePoema.equals("poemasNeoconcretos")) {

				titulo.setText(getString(R.string.titulo_marazul));
				textoPoema.setText(getString(R.string.marazul));

			} else if (nomePoema.equals("cantigaParaNaoMorrer")) {

				titulo.setText(getString(R.string.titulo_cantiganaomorrer));
				textoPoema.setText(getString(R.string.cantiganaomorrer));

			} else if (nomePoema.equals("meuPai")) {

				titulo.setText(getString(R.string.titulo_meupai));
				textoPoema.setText(getString(R.string.meupai));

			} else {

				titulo.setText("Algo Errado");
				textoPoema.setText("Campo não informado");

			}

		}

		return view;
	}
}
