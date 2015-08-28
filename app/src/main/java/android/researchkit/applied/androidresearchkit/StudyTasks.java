package android.researchkit.applied.androidresearchkit;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class StudyTasks extends Fragment {


    public StudyTasks() {
        // Required empty public constructor
    }

    public static StudyTasks newInstance(String text) {

        StudyTasks f = new StudyTasks();
        Bundle b = new Bundle();
        b.putString("msg", text);
        f.setArguments(b);

        return f;
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.study_tasks_view, container, false);
    }


}
