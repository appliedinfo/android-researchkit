package org.appliedinformatics.android.researchkit;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import android.widget.Toast;

public class MainActivity extends ResearchKitBrain {

    final Context context = this;

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
//        DataGathering da =new  DataGathering();
        Review review = new Review();
//        da.setText("hello aamir123");
//        da.setTitlefield("Suhail");
//        da.setLinktextfield("owais din");
//        addSlide(da);
        addSlide(AddingSlides.newInstance(R.layout.data_gathering_view));
        addSlide(AddingSlides.newInstance(R.layout.privacy_view));
        addSlide(AddingSlides.newInstance(R.layout.data_use_view));
        addSlide(AddingSlides.newInstance(R.layout.time_commitment_view));
        addSlide(AddingSlides.newInstance(R.layout.study_survey_view));
        addSlide(AddingSlides.newInstance(R.layout.study_tasks_view));
        addSlide(AddingSlides.newInstance(R.layout.withdrawing_view));
        addSlide(review);

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
    private void loadInfoActivity(){
        Intent intent = new Intent(this, InfoFillingActivity.class);
        startActivity(intent);
    }
    @Override
    public void onDisagreePressed() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void onAgreePressed() {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(context);

        // Setting Dialog Title
        alertDialog.setTitle("Review");

        // Setting Dialog Message
        alertDialog.setMessage("Lorem Ipsum dolor information which can be later filled");

        // Setting Positive "Yes" Button
        alertDialog.setPositiveButton("Agree", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {

                // Write your code here to invoke Agree event
                loadInfoActivity();

            }
        });

        // Setting Negative "NO" Button
        alertDialog.setNegativeButton("Disagree", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // Write your code here to invoke NO event
                Toast.makeText(getApplicationContext(), "You clicked on Disagree", Toast.LENGTH_SHORT).show();
                dialog.cancel();
            }
        });

        // Showing Alert Message
        alertDialog.show();

    }

    //public void getStarted(View v){
    //    loadInfoActivity();
    //}
}


