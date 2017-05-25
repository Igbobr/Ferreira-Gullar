package br.edu.ifgoiano.ferreiraGullar.biografia;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import br.edu.ifgoiano.ferreiraGullar.R;

@SuppressLint("NewApi")
public class ActivityBiografia extends Activity {

	private FragmentManager fm = getFragmentManager();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activity_biografia);

		getWindow().getDecorView()
				.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
		getWindow().setStatusBarColor(Color.TRANSPARENT);

		FragmentTransaction ft = fm.beginTransaction();
		FragmentBiografia t = new FragmentBiografia();
		ft.replace(R.id.telaBiografia, t);
		ft.commit();

	}
}
