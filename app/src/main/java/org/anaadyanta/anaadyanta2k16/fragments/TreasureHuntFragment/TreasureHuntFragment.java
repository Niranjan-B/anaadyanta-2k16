package org.anaadyanta.anaadyanta2k16.fragments.TreasureHuntFragment;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.florent37.materialviewpager.MaterialViewPagerHelper;
import com.github.ksoichiro.android.observablescrollview.ObservableScrollView;

import org.anaadyanta.anaadyanta2k16.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TreasureHuntFragment extends Fragment {

    public static TreasureHuntFragment getInstance() {
        return new TreasureHuntFragment();
    }
    public TreasureHuntFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_treasure_hunt, container, false);
        TextView rules_treasurehunt= (TextView) view.findViewById(R.id.rules_treasurehunt);
        ImageView phone=(ImageView)view.findViewById(R.id.imageView4);
        ImageView phone1=(ImageView)view.findViewById(R.id.imageView5);
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num="+919916807227";
                Intent in=new Intent(Intent.ACTION_CALL);
                in.setData(Uri.parse("tel:" + num));
                startActivity(in);
            }
        });
        phone1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num="8553300403";
                Intent in=new Intent(Intent.ACTION_CALL);
                in.setData(Uri.parse("tel:" + num));
                startActivity(in);
            }
        });
        rules_treasurehunt.setText("1. Team must comprise of 5 members. \n" +
                "\n"+
                "2. No team from NMIT will take part in the event. \n" +
                "\n"+
                "3. Teams can comprise of students from any mix of colleges. \n" +
                "\n"+
                "4. Everybody starts with a puzzle. \n" +
                "\n"+
                "5. Each puzzle, when solved will indicate to a unique place inside the campus. \n" +
                "\n"+
                "6. The coordinator’s decision is final. \n");

        return view;


    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

       ObservableScrollView treasureHuntScrollView = (ObservableScrollView) view.findViewById(R.id.treasureHuntScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), treasureHuntScrollView, null);

    }

}
