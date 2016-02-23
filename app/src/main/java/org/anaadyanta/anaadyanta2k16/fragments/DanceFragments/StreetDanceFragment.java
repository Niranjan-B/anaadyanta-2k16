package org.anaadyanta.anaadyanta2k16.fragments.DanceFragments;


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
public class StreetDanceFragment extends Fragment {

    ObservableScrollView streetDanceScrollView;

    public static StreetDanceFragment getInstance() {
        return new StreetDanceFragment();
    }

    public StreetDanceFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_street_dance, container, false);
        TextView rules_streetdance= (TextView) view.findViewById(R.id.rules_streetdance);
        ImageView phone=(ImageView)view.findViewById(R.id.imageView4);
        ImageView phone1=(ImageView)view.findViewById(R.id.imageView5);
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num="+919739652563";
                Intent in=new Intent(Intent.ACTION_CALL);
                in.setData(Uri.parse("tel:" + num));
                startActivity(in);
            }
        });
        phone1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num="+919632395882";
                Intent in=new Intent(Intent.ACTION_CALL);
                in.setData(Uri.parse("tel:" + num));
                startActivity(in);
            }
        });
        rules_streetdance.setText("1. A team of 6-15 members can participate..\n" +
                "\n"+
                "2. The open round of 4+2 min is to be performed by each crew...\n" +
                "\n"+
                "3. The top 4 crews qualified will be advanced to the face off round. \n" +
                "\n"+
                "4.The crews battling are top.1st vs top.3rd and top.2nd vs top.4th 5. The crews will be battling each other for 10min\n" +
                "\n"+
                "6. The winner of the battle will be going to the finals..\n" +
                "\n"+
                "7. The crews will be battling for 12-15min\n" +
                "\n"+
                "8. Judging System:\n" +
                "\n" +
                "The crew is judged based on \n" +
                "\n" +
                "1)Foundation\n" +
                "2)Creativity\n" +
                "3)Difficulty\n" +
                "4)Execution\n" +
                "5)Show / Performance");
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        streetDanceScrollView = (ObservableScrollView) view.findViewById(R.id.streetDanceScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), streetDanceScrollView, null);
    }

}
