package fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.himanshu.assignment4.R;

/**
 * pending accepted and completed canceled fragment
 */
public class PendingAcceptedAndcompletedCanceledFragment extends Fragment {

    private String mode;
    private TextView tvDispay;

    /**
     *
     * @param mode mode
     */
    public PendingAcceptedAndcompletedCanceledFragment(final String mode) {
        this.mode = mode;
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup viewGroup, final Bundle savedInstance) {
        View view;
        view = inflater.inflate(R.layout.fragment_pendinaccepted_and_completedcanceled, null);
        tvDispay = (TextView) view.findViewById(R.id.tv_display);

        if ("pending".equals(mode)) {
            tvDispay.setText("Pending");
        } else if ("accepted".equals(mode)) {
            tvDispay.setText("Accepted");
        } else if ("canceled".equals(mode)) {
            tvDispay.setText("Canceled");
        } else {
            tvDispay.setText("Completed");
        }

        return view;
    }
}
