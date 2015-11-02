package org.appliedinformatics.android.researchkit;


import android.content.Context;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ORKConsentSectionTypeTimeCommitment extends ConsentView {

    @Override
    public int layout(){
        return R.layout.time_commitment_view;
    }

    @Override
    public Context getactivity() {
        return getActivity();
    }

    @Override
    public XmlResourceParser getmyfile(){
        return getResources().getLayout(R.layout.time_commitment_view);
    }
}
