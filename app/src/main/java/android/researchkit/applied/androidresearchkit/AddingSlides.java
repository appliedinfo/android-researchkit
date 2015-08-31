package android.researchkit.applied.androidresearchkit;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by mir on 31/8/15.
 */
public class AddingSlides extends Fragment{
    private static final String ARG_LAYOUT_RES_ID = "layoutResId";
    private int layoutResId;

    public static AddingSlides newInstance(int layoutResId) {
        AddingSlides addingSlide = new AddingSlides();

        Bundle args = new Bundle();
        args.putInt(ARG_LAYOUT_RES_ID, layoutResId);
        addingSlide.setArguments(args);
        return addingSlide;
    }



    public AddingSlides() {}

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(getArguments() != null && getArguments().containsKey(ARG_LAYOUT_RES_ID))
            layoutResId = getArguments().getInt(ARG_LAYOUT_RES_ID);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(layoutResId, container, false);
    }
}
