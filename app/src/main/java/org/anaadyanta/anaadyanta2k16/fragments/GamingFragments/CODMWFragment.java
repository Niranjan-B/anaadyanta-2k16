package org.anaadyanta.anaadyanta2k16.fragments.GamingFragments;


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
public class CODMWFragment extends Fragment {

    ObservableScrollView codMWScrollView;

    public static CODMWFragment getInstance() {
        return new CODMWFragment();
    }

    public CODMWFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_codmw, container, false);
        TextView rules_call_of_duty= (TextView) view.findViewById(R.id.rules_call_of_duty);
        ImageView phone=(ImageView)view.findViewById(R.id.imageView4);
        ImageView phone1=(ImageView)view.findViewById(R.id.imageView5);
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num="+918861561754";
                Intent in=new Intent(Intent.ACTION_CALL);
                in.setData(Uri.parse("tel:" + num));
                startActivity(in);
            }
        });
        phone1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num="+917406837999";
                Intent in=new Intent(Intent.ACTION_CALL);
                in.setData(Uri.parse("tel:" + num));
                startActivity(in);
            }
        });
        rules_call_of_duty.setText("1. Top 2 from each round advance to finals.\n" +
                "\n"+
                "2. No use of martyrdom and last stand (perks).\n" +
                "\n"+
                "3. Maps-Killhouse, Showdown and Bag Backlot.\n" +
                "\n"+
                "4. K/D ratio will be considered." );

        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        codMWScrollView = (ObservableScrollView) view.findViewById(R.id.codMWScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), codMWScrollView, null);
    }

}
