package org.appliedinformatics.android.researchkit;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Review extends Fragment {

    private final String htmlText = "<body> &#8226; foo<br/>\n" +
            "&#8226; bar<br/>\n" +
            "&#8226; baz<br/></body>";

    public Review() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.review_view, container, false);
        TextView htmlTextView = (TextView) view.findViewById(R.id.bulletText);
        htmlTextView.setText(Html.fromHtml(htmlText));

        return view;
    }


}
