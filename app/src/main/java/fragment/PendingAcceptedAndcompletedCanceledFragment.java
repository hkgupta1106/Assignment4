package fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.himanshu.assignment4.R;

public class PendingAcceptedAndcompletedCanceledFragment extends Fragment{

    private String mode;
    private TextView tvDispay;

    public PendingAcceptedAndcompletedCanceledFragment(String mode) {
        this.mode = mode;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle SavedInstance)
    {
        View view;
        view=inflater.inflate(R.layout.fragment_pendinaccepted_and_completedcanceled,null);
        tvDispay = (TextView) view.findViewById(R.id.tv_display);

        if(mode.equals("pending"))
        {
            tvDispay.setText("Pending");
        } else if (mode.equals("accepted"))
        {
            tvDispay.setText("Accepted");
        } else if (mode.equals("canceled"))
        {
            tvDispay.setText("Canceled");
        } else
        {
            tvDispay.setText("Completed");
        }

        return view;
    }
}
