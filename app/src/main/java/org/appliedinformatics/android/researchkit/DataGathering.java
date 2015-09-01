package org.appliedinformatics.android.researchkit;


import android.content.res.Resources;
import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DataGathering extends Fragment {
    String textfield;
    String titlefield;
    String linktextfield;
    Resources imagefield;

    public String getTitlefield() {
        return titlefield;
    }

    public void setTitlefield(String titlefield) {
        this.titlefield = titlefield;
    }

    public String getLinktextfield() {
        return linktextfield;
    }

    public void setLinktextfield(String linktextfield) {
        this.linktextfield = linktextfield;
    }

    public Resources getImagefield() {
        return imagefield;
    }

    public void setImagefield(Resources imagefield) {
        this.imagefield = imagefield;
    }

    public DataGathering() {
        // Required empty public constructor
    }

    public static DataGathering newInstance(String text) {

        DataGathering f = new DataGathering();
        Bundle b = new Bundle();
        b.putString("msg", text);

        f.setArguments(b);

        return f;
    }

    public String getText() {
        return textfield;
    }

    public void setText(String text) {
        this.textfield = text;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.data_gathering_view, container, false);
        String text = this.getText();
        Resources image = this.getImagefield();
        String title = this.getTitlefield();
        String link  = this.getLinktextfield();
        if (text != null){
            TextView tv = (TextView) v.findViewById(R.id.textview);
            tv.setText(this.getText());
        }
        if (title != null){
            TextView tv = (TextView) v.findViewById(R.id.titleview);
            tv.setText(this.getTitlefield());
        }
        if (link != null){
            TextView tv = (TextView) v.findViewById(R.id.linktextview);
            tv.setText(this.getLinktextfield());
        }
//        if (image != null){
//            Resources tv = (Resources) v.findViewById(R.id.imageview);
//            tv.setImageResource(image);
//        }

        //}
        return v;
    }


}
