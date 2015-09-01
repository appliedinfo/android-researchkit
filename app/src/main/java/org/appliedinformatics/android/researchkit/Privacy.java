package org.appliedinformatics.android.researchkit;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Privacy extends Fragment {


    public Privacy() {
        // Required empty public constructor
    }

    public static Privacy newInstance(String text) {

        Privacy f = new Privacy();
        Bundle b = new Bundle();
        b.putString("msg", text);

        f.setArguments(b);

        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.privacy_view, container, false);
        return v;
    }


}
