package org.appliedinformatics.android.researchkit;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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
        ConsentView da = new ORKConsentSectionTypeDataGathering();
        da.summary="<ul><li><i>hjhj</i></li></ul>";
        da.title="Suhail";
//        da.content="owais din90";
        int img = R.drawable.datause;
        da.image = img;
//        ORKConsentSectionTypeDataGathering.newInstance(R.)
        ORKConsentDocument(da);
        ORKConsentSectionTypeDataUse du = new ORKConsentSectionTypeDataUse();
//        ORKConsentDocument(du);
//        ORKConsentSectionTypePrivacy pr = new ORKConsentSectionTypePrivacy();
//        ORKConsentDocument(pr);

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


