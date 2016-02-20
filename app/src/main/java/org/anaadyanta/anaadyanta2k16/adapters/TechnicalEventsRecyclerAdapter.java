package org.anaadyanta.anaadyanta2k16.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import org.anaadyanta.anaadyanta2k16.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NIRANJAN on 19-02-2016.
 */
public class TechnicalEventsRecyclerAdapter extends RecyclerView.Adapter <TechnicalEventsRecyclerAdapter.CustomViewHolder>{

    List<String> mEvents;
    Context mContext;

    public TechnicalEventsRecyclerAdapter(Context context) {
        mEvents = new ArrayList<>();
        mContext = context;
    }

    public void addEvents (List<String> events) {
        mEvents = events;
        notifyDataSetChanged();
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.custom_row_events, parent, false);
        CustomViewHolder customView = new CustomViewHolder(view);
        return customView;
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        holder.eventCheckBox.setText(mEvents.get(position));
    }

    @Override
    public int getItemCount() {
        return mEvents.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {

        CheckBox eventCheckBox;

        public CustomViewHolder(View itemView) {
            super(itemView);
            eventCheckBox = (CheckBox) itemView.findViewById(R.id.eventCheckBox);
        }
    }

}
