package android.researchkit.applied.androidresearchkit;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;
import java.util.Vector;
import android.researchkit.applied.androidresearchkit.ResearchKitBrain;
import android.view.View;

public class MainActivity extends ResearchKitBrain {
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        //setContentView(R.layout.activity_main);
//        Intent intent = new Intent(this, ConsentActivity.class);
//        startActivity(intent);
//    }

//    public void startConsentActivity( View v){
//
//    }
    @Override
    public void init(Bundle savedInstanceState) {
        addSlide(DataGathering.newInstance("hello message"));
        addSlide(AddingSlides.newInstance(R.layout.data_gathering_view));
        addSlide(AddingSlides.newInstance(R.layout.privacy_view));
        addSlide(AddingSlides.newInstance(R.layout.data_use_view));
        addSlide(AddingSlides.newInstance(R.layout.time_commitment_view));
        addSlide(AddingSlides.newInstance(R.layout.study_survey_view));
        addSlide(AddingSlides.newInstance(R.layout.study_tasks_view));
        addSlide(AddingSlides.newInstance(R.layout.withdrawing_view));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
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


