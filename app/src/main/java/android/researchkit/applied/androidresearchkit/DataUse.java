package android.researchkit.applied.androidresearchkit;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DataUse extends Fragment {


    public DataUse() {
        // Required empty public constructor
    }


    public static DataUse newInstance(String text) {

        DataUse f = new DataUse();
        Bundle b = new Bundle();
        b.putString("msg", text);

        f.setArguments(b);

        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.data_use_view, container, false);
        TextView tv = (TextView) v.findViewById(R.id.data_use);
        tv.setText(getArguments().getString("msg"));
        return v;
    }


}
