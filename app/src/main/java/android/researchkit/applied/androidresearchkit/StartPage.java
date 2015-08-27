package android.researchkit.applied.androidresearchkit;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class StartPage extends Fragment {

        public StartPage() {
        // Required empty public constructor
    }

    public static StartPage newInstance(String text) {

        StartPage f = new StartPage();
        Bundle b = new Bundle();
        b.putString("msg", text);

        f.setArguments(b);

        return f;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.start_page_view, container, false);
    }
}
