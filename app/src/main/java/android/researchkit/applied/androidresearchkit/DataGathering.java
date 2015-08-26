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
public class DataGathering extends Fragment {


    public DataGathering() {
        // Required empty public constructor
    }

    public static DataGathering newInstance(String text) {

        DataGathering f = new DataGathering();
        Bundle b = new Bundle();
        b.putString("msg", text);

        f.setArguments(b);

        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.data_gathering_view, container, false);
        TextView tv = (TextView) v.findViewById(R.id.data_gather);
        tv.setText(getArguments().getString("msg"));

        return v;
    }


}
