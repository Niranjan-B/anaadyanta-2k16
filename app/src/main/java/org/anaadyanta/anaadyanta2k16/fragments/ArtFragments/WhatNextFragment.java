package org.anaadyanta.anaadyanta2k16.fragments.ArtFragments;


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
public class WhatNextFragment extends Fragment {

    ObservableScrollView whatNextScrollView;

    public static WhatNextFragment getInstance() {
        return new WhatNextFragment();
    }

    public WhatNextFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_what_next, container, false);
        TextView rules_whatsnext= (TextView) view.findViewById(R.id.rules_whatsnext);
        ImageView phone=(ImageView)view.findViewById(R.id.imageView4);
        ImageView phone1=(ImageView)view.findViewById(R.id.imageView5);
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num="+918722969071";
                Intent in=new Intent(Intent.ACTION_CALL);
                in.setData(Uri.parse("tel:" + num));
                startActivity(in);
            }
        });
        phone1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num="+919008688443";
                Intent in=new Intent(Intent.ACTION_CALL);
                in.setData(Uri.parse("tel:" + num));
                startActivity(in);
            }
        });
        rules_whatsnext.setText("1. You will be provided with an incomplete comic strip. All you need to do is to complete it.\n" +
                "\n"+
                "2. The participants aren’t allowed to refer the internet or any pictures from their phones. This would lead to immediate disqualification.");

        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        whatNextScrollView = (ObservableScrollView) view.findViewById(R.id.whatNextScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), whatNextScrollView, null);
    }

}
