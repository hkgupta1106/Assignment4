package com.example.himanshu.assignment4;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import fragment.UpcomingAndPastListFragment;

public class ThirdActivity extends AppCompatActivity {

    public static final String UP_COMING = "upcoming", PAST = "past";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        final ViewPager vpPager = (ViewPager) findViewById(R.id.vp_pager);

        class MyPagerAdapter extends FragmentStatePagerAdapter {

            public MyPagerAdapter(FragmentManager fm) {
                super(fm);
            }

            @Override
            public Fragment getItem(int position) {

                switch (position) {
                    case 0:
                        return new UpcomingAndPastListFragment(UP_COMING);
                    case 1:
                        return new UpcomingAndPastListFragment(PAST);
                    default:
                        return null;
                }
            }

            @Override
            public int getCount() {
                return 2;
            }

        }
        vpPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));

    }

}
