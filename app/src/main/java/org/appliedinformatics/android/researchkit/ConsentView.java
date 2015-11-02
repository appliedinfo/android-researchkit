package org.appliedinformatics.android.researchkit;


import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */


public abstract class ConsentView extends Fragment {
    public String summary;
    public String title;
    public String content;
    public int image = -1;
    private String TAG="ResearchKit";

    public  abstract Context getactivity();
    public  abstract XmlResourceParser getmyfile();
    public  abstract int layout();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(getmyfile(), container, false);
//        inflater.inflate()
//        LinearLayout linLayout = new LinearLayoutView(new ContextThemeWrapper(getactivity(), R.style.ResearchKitTheme));
//        linLayout.getBackground();
////        linLayout.setBackgroundColor(Color.WHITE);
//        // specifying vertical orientation
//        // creating LayoutParams
//        ViewGroup.LayoutParams linLayoutParam = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);


        // set LinearLayout as a root element of the screen
//        setContentView(linLayout, linLayoutParam);
        String summary = this.summary;
        int image = this.image;
        String title = this.title;
        String content  = this.content;
        if (summary != null){
            Log.i(TAG, "RK" + summary);
            TextView tv = (TextView) v.findViewById(R.id.summaryview);
            tv.setText(Html.fromHtml(summary));
        }
        if (title != null){
            TextView tv = (TextView) v.findViewById(R.id.titleview);
            tv.setText(title);
        }
        TextView link = (TextView) v.findViewById(R.id.linkview);
        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View rt = v.findViewById(R.id.root_container);
                Log.i(TAG, "RK" + "9999999999998989898989898989");
                FragmentManager fm = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fm.beginTransaction();
                fragmentTransaction.replace(R.id.root_container, new ContentFragment());
                fragmentTransaction.commit();
                Log.i(TAG, "RK" + "654654654654656546546546546556");
            }
        });
//        if (content != null){
//
//            tv.setText(content);
//        }
        if (image != -1) {
            ImageView imv = (ImageView) v.findViewById(R.id.image);
            imv.setImageResource(image);
        }

        TextView textview = new TextView(this.getActivity());
        textview.setText("Something here");
//        LinearLayout ll = (LinearLayout) v.findViewById(R.id.formview);
//        TextView tv = new TextView(getActivity());
//        tv.setText("Dynamic Text!");
//        linLayout.addView(tv);


//        if (image != null){
//            Resources tv = (Resources) v.findViewById(R.id.imageview);
//            tv.setImageResource(image);
//        }

        //}
        return v;
    }


}
