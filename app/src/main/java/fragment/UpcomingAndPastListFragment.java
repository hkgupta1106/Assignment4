package fragment;


import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.himanshu.assignment4.R;

/**
 * upcoming and past list fragment
 */
public class UpcomingAndPastListFragment extends Fragment {

    private static final String PENDING = "pending", COMPLETED = "completed", ACCEPTED = "accepted", CANCELED = "canceled";
    private String mode;
    private TextView tvHeading;

    /**
     *
     * @param mode mode
     */
    public UpcomingAndPastListFragment(final String mode) {
        this.mode = mode;
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup viewGroup, final Bundle savedInstance) {
        View view;
        view = inflater.inflate(R.layout.fragment_upcoming_and_past_list, null);
        final Button btnUpcomingDivision1, btnUpcomingDivision2;
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.vp_pager2);
        viewPager.setAdapter(new InnerPagerAdapter(getChildFragmentManager()));

        tvHeading = (TextView) view.findViewById(R.id.tv_heading);
        btnUpcomingDivision1 = (Button) view.findViewById(R.id.btn_upcoming_divison1);
        btnUpcomingDivision2 = (Button) view.findViewById(R.id.btn_upcoming_divison2);

        if ("upcoming".equals(mode)) {
            tvHeading.setText("Upcoming List");
            btnUpcomingDivision1.setText("Pending");
            btnUpcomingDivision2.setText("Accepted");
        } else {
            tvHeading.setText("Past List");
            btnUpcomingDivision1.setText("Canceled");
            btnUpcomingDivision2.setText("Completed");
        }

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(final int position, final float positionOffset, final int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(final int position) {
                switch (position) {
                    case 0:
                        btnUpcomingDivision1.setBackgroundResource(R.color.colorAccent);
                        btnUpcomingDivision2.setBackgroundResource(R.color.colorPrimary);
                        break;
                    case 1:
                        btnUpcomingDivision1.setBackgroundResource(R.color.colorPrimary);
                        btnUpcomingDivision2.setBackgroundResource(R.color.colorAccent);
                        break;
                    default:
                        btnUpcomingDivision1.setBackgroundResource(R.color.colorAccent);
                        btnUpcomingDivision2.setBackgroundResource(R.color.colorPrimary);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(final int state) {

            }
        });

        return view;
    }

    /**
     * view pager adapter
     */
    class InnerPagerAdapter extends FragmentStatePagerAdapter {

        /**
         *
         * @param fm fragment manager
         */
        public InnerPagerAdapter(final FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(final int position) {

            if ("upcoming".equals(mode)) {
                switch (position) {
                    case 0:
                        return new PendingAcceptedAndcompletedCanceledFragment(PENDING);
                    case 1:
                        return new PendingAcceptedAndcompletedCanceledFragment(ACCEPTED);
                    default:
                        return null;
                }
            } else {
                switch (position) {
                    case 0:
                        return new PendingAcceptedAndcompletedCanceledFragment(CANCELED);
                    case 1:
                        return new PendingAcceptedAndcompletedCanceledFragment(COMPLETED);
                    default:
                        return null;
                }
            }
        }

        @Override
        public int getCount() {
            return 2;
        }
    }

}
