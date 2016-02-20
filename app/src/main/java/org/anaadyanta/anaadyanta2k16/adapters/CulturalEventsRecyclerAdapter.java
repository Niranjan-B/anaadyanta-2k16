package org.anaadyanta.anaadyanta2k16.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import org.anaadyanta.anaadyanta2k16.R;
import org.anaadyanta.anaadyanta2k16.StaticClassCheckedValues;
import org.anaadyanta.anaadyanta2k16.StaticClassNavigationInstance;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NIRANJAN on 19-02-2016.
 */
public class CulturalEventsRecyclerAdapter extends RecyclerView.Adapter <CulturalEventsRecyclerAdapter.CustomViewHolder>{

    List<String> mEvents;
    Context mContext;

    public CulturalEventsRecyclerAdapter(Context context) {
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
    public void onBindViewHolder(CustomViewHolder holder, final int position) {
        holder.eventCheckBox.setText(mEvents.get(position));
        holder.eventCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // actually if - else ain't required !
                if (isChecked) {
                    Log.d("anaadyanta","checked at position = " + position );
                    StaticClassCheckedValues.setCulturalEventsChecked(position, true);
                } else {
                    Log.d("anaadyanta","unchecked at position = " + position );
                    StaticClassCheckedValues.setCulturalEventsChecked(position, false);
                }
            }
        });
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
