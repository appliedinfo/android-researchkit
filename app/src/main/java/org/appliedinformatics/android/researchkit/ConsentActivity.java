package org.appliedinformatics.android.researchkit;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import org.appliedinformatics.android.researchkit.ResearchKitBrain;

/**
 * Created by mir on 31/8/15.
 */
public class ConsentActivity extends ResearchKitBrain {
    @Override
    public void init(Bundle savedInstanceState) {
        ORKConsentDocument(AddingSlides.newInstance(R.layout.start_page_view));
        ORKConsentDocument(AddingSlides.newInstance(R.layout.data_gathering_view));
        ORKConsentDocument(AddingSlides.newInstance(R.layout.privacy_view));
        ORKConsentDocument(AddingSlides.newInstance(R.layout.data_use_view));
        ORKConsentDocument(AddingSlides.newInstance(R.layout.time_commitment_view));
        ORKConsentDocument(AddingSlides.newInstance(R.layout.study_survey_view));
        ORKConsentDocument(AddingSlides.newInstance(R.layout.study_tasks_view));
        ORKConsentDocument(AddingSlides.newInstance(R.layout.withdrawing_view));

    }

    private void loadMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void onDisagreePressed() {
        loadMainActivity();
    }

    @Override
    public void onAgreePressed() {

        loadMainActivity();
    }

    public void getStarted(View v){
        loadMainActivity();
    }
}
