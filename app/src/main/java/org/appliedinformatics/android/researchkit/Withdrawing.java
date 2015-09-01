package org.appliedinformatics.android.researchkit;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Withdrawing extends Fragment {

    public Withdrawing() {
        // Required empty public constructor
    }

    public static Withdrawing newInstance(String text) {

        Withdrawing f = new Withdrawing();
        Bundle b = new Bundle();
        b.putString("msg", text);
        f.setArguments(b);

        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.withdrawing_view, container, false);
    }
}
