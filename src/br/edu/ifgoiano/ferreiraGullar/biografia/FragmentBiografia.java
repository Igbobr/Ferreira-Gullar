package br.edu.ifgoiano.ferreiraGullar.biografia;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import br.edu.ifgoiano.ferreiraGullar.R;

public class FragmentBiografia extends Fragment {

	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.layout_biografia, container, false);

		TextView biografia = (TextView) view.findViewById(R.id.textoBiografia);

		biografia.setText(getString(R.string.biografia));

		return view;
	}
}
