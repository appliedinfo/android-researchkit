package org.appliedinformatics.android.researchkit;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class StudySurvey extends Fragment {

    public StudySurvey() {
        // Required empty public constructor
    }
    public static StudySurvey newInstance(String text) {

        StudySurvey f = new StudySurvey();
        Bundle b = new Bundle();
        b.putString("msg", text);
        f.setArguments(b);

        return f;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.study_survey_view, container, false);
    }


}
