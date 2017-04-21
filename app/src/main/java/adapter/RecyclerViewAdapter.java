package adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.himanshu.assignment4.R;
import com.example.himanshu.assignment4.ThirdActivity;

import java.util.ArrayList;
import model.BaseModel;

/**
 * recycler view adapter class
 */

public class RecyclerViewAdapter extends android.support.v7.widget.RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<BaseModel> baseModelList;
    private BaseModel baseModel;
    private Context context;

    public RecyclerViewAdapter(final ArrayList<BaseModel> baseModelList, final Context context) {
        this.baseModelList = baseModelList;
        this.context = context;
    }

    @Override
    public void onBindViewHolder(RecyclerViewAdapter.ViewHolder holder, int position) {
        baseModel = baseModelList.get(position);
        holder.tvName.setText(baseModel.getName());

    }

    @Override
    public ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {


        View convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.custome_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(convertView);
        /**
         * return view holder
         */
        return viewHolder;
    }

    @Override
    public int getItemCount() {
        return baseModelList.size();
    }

    /**
     * view holder
     */
    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvName;
        /**
         * @param itemView itemm view
         */
        public ViewHolder(final View itemView) {
            super(itemView);
            tvName = (TextView) itemView.findViewById(R.id.tv_name);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context,ThirdActivity.class);
                    context.startActivity(intent);
                }
            });
        }
    }
}