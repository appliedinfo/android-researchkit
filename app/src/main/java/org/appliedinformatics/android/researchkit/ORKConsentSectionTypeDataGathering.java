package org.appliedinformatics.android.researchkit;

import android.content.Context;
import android.content.res.XmlResourceParser;

/**
 * Created by aamirbhatt on 15/10/15.
 */
public class ORKConsentSectionTypeDataGathering extends ConsentView {

    @Override
    public int layout(){
        return R.layout.data_gathering_view;
    }

    @Override
    public Context getactivity() {
        return getActivity();
    }

    @Override
    public   XmlResourceParser getmyfile(){
        return getResources().getLayout(R.layout.data_gathering_view);
    }
}
