package android.researchkit.applied.androidresearchkit;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class TimeCommitment extends Fragment {


    public TimeCommitment() {
        // Required empty public constructor
    }

    public static TimeCommitment newInstance(String text) {

        TimeCommitment f = new TimeCommitment();
        Bundle b = new Bundle();
        b.putString("msg", text);
        f.setArguments(b);

        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.time_commitment_view, container, false);
    }


}
