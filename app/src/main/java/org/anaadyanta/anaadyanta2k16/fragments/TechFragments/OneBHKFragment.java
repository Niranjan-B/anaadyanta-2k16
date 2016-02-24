package org.anaadyanta.anaadyanta2k16.fragments.TechFragments;


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
public class OneBHKFragment extends Fragment {

    ObservableScrollView oneBHKScrollView;

    public static OneBHKFragment getInstance() {
        return new OneBHKFragment();
    }

    public OneBHKFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_one_bhk, container, false);
        TextView rules_1bhk= (TextView) view.findViewById(R.id.bhk);
        ImageView phone=(ImageView)view.findViewById(R.id.imageView4);
        ImageView phone1=(ImageView)view.findViewById(R.id.imageView5);
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num="+919738817938";
                Intent in=new Intent(Intent.ACTION_CALL);
                in.setData(Uri.parse("tel:" + num));
                startActivity(in);
            }
        });
        phone1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num="+919595595389";
                Intent in=new Intent(Intent.ACTION_CALL);
                in.setData(Uri.parse("tel:" + num));
                startActivity(in);
            }
        });
        rules_1bhk.setText("● Rules & Regulation\n" +
                "\n"+
                "● No of participants:2\n" +
                "\n"+
                "● Area of plot: 20 x " +
                "40 (ft)\n" +
                "\n"+
                "● Time limits: 120 " +
                "min\n" +
                "\n"+
                "Scale factor: 1:2" +
                "\n"+
                "\n"+
                "JUDGEMENT CRITERIA :\n" +
                "➢ Aesthetic view:50%\n" +
                "➢ Dimensioning:30%\n" +
                "➢ Proper planning: 20% ");

        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        oneBHKScrollView = (ObservableScrollView) view.findViewById(R.id.oneBHKScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), oneBHKScrollView, null);
    }

}
