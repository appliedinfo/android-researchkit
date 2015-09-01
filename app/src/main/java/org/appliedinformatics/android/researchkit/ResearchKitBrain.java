package org.appliedinformatics.android.researchkit;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.List;
import java.util.Vector;

/**
 * Created by mir on 31/8/15.
 */
public abstract class ResearchKitBrain extends AppCompatActivity {

    private PagerAdapter mPagerAdapter;
    private ViewPager pager;
    private List<Fragment> fragments = new Vector<>();
    private int slidesNumber;
    private IndicatorController mController;
    private boolean isVibrateOn = false;
    private boolean showBack = true;
    private boolean showDone = true;

        @Override
    final protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.intro_layout);

        final ImageButton backButton = (ImageButton) findViewById(R.id.back);
        final Button nextButton = (Button) findViewById(R.id.next);
        final TextView doneButton = (TextView) findViewById(R.id.done);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(@NonNull View v) {
                pager.setCurrentItem(pager.getCurrentItem() - 1);
                //onSkipPressed();
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(@NonNull View v) {
                pager.setCurrentItem(pager.getCurrentItem() + 1);
            }
        });

        doneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(@NonNull View v) {
                onDonePressed();
            }
        });

        mPagerAdapter = new PagerAdapter(super.getSupportFragmentManager(), fragments);
        pager = (ViewPager) findViewById(R.id.view_pager);

        pager.setAdapter(this.mPagerAdapter);
        /**
         *  ViewPager.setOnPageChangeListener is now deprecated. Use addOnPageChangeListener() instead of it.
         */
        pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (slidesNumber > 1)
                    mController.selectPosition(position);
                if (position == slidesNumber - 1) {
                    backButton.setVisibility(View.INVISIBLE);
                    nextButton.setVisibility(View.GONE);
                    if (showDone) {
                        doneButton.setVisibility(View.VISIBLE);
                    } else {
                        doneButton.setVisibility(View.INVISIBLE);
                    }
                } else {
                    backButton.setVisibility(View.VISIBLE);
                    doneButton.setVisibility(View.GONE);
                    nextButton.setVisibility(View.VISIBLE);
                }

                if (!showBack) {
                    backButton.setVisibility(View.INVISIBLE);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        init(savedInstanceState);
        slidesNumber = fragments.size();

        if (slidesNumber == 1) {
            nextButton.setVisibility(View.GONE);
            doneButton.setVisibility(View.VISIBLE);
        } else {
            initController();
        }
    }

    public ViewPager getPager() {
        return pager;
    }


    private void initController() {
        if (mController == null)
            mController = new DefaultIndicatorController();

        FrameLayout indicatorContainer = (FrameLayout) findViewById(R.id.indicator_container);
        indicatorContainer.addView(mController.newInstance(this));

        mController.initialize(slidesNumber);
    }


    public void addSlide(@NonNull Fragment fragment) {
        fragments.add(fragment);
        mPagerAdapter.notifyDataSetChanged();
    }

    @NonNull
    public List<Fragment> getSlides() {
        return mPagerAdapter.getFragments();
    }


    public abstract void init(@Nullable Bundle savedInstanceState);

    public abstract void onSkipPressed();

    public abstract void onDonePressed();

    public void onDotSelected(int index) {}


}
