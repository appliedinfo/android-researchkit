package android.researchkit.applied.androidresearchkit;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import android.researchkit.applied.androidresearchkit.ResearchKitBrain;

/**
 * Created by mir on 31/8/15.
 */
public class ConsentActivity extends ResearchKitBrain {
    @Override
    public void init(Bundle savedInstanceState) {
        addSlide(AddingSlides.newInstance(R.layout.start_page_view));
        addSlide(AddingSlides.newInstance(R.layout.data_gathering_view));
        addSlide(AddingSlides.newInstance(R.layout.privacy_view));
        addSlide(AddingSlides.newInstance(R.layout.data_use_view));
        addSlide(AddingSlides.newInstance(R.layout.time_commitment_view));
        addSlide(AddingSlides.newInstance(R.layout.study_survey_view));
        addSlide(AddingSlides.newInstance(R.layout.study_tasks_view));
        addSlide(AddingSlides.newInstance(R.layout.withdrawing_view));

    }

    private void loadMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void onSkipPressed() {
        loadMainActivity();
    }

    @Override
    public void onDonePressed() {

        loadMainActivity();
    }

    public void getStarted(View v){
        loadMainActivity();
    }
}
