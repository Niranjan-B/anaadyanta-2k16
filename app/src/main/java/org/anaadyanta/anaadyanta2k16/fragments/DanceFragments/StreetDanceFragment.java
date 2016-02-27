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
                String num="+918792483727";
                Intent in=new Intent(Intent.ACTION_CALL);
                in.setData(Uri.parse("tel:" + num));
                startActivity(in);
            }
        });
        phone1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num="+917353680963";
                Intent in=new Intent(Intent.ACTION_CALL);
                in.setData(Uri.parse("tel:" + num));
                startActivity(in);
            }
        });
        rules_streetdance.setText("1. This an all styles crew on crew event.\n" +
                "\n"+
                "2. A team of 6-15 members can participate.\n" +
                "\n"+
                "3. The open round of 4+2 min is to be performed by each crew.\n" +
                "\n"+
                "4.The top 4 crews qualify for the face offs.\n" +
                "\n"+
                "5. The crews battling are picked at random.\n" +
                "\n"+
                "6. The winners of the battle will be going to the finals.");
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        streetDanceScrollView = (ObservableScrollView) view.findViewById(R.id.streetDanceScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), streetDanceScrollView, null);
    }

}
