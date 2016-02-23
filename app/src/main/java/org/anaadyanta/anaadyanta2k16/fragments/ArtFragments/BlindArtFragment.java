package org.anaadyanta.anaadyanta2k16.fragments.ArtFragments;

import android.content.Context;
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

public class BlindArtFragment extends Fragment {

    ObservableScrollView blindArtScrollView;

    public static BlindArtFragment getInstance() {
        return new BlindArtFragment();
    }

    public BlindArtFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_blind_art, container, false);
        TextView rules_blind_art= (TextView) view.findViewById(R.id.rules_blind_art);
        ImageView phone=(ImageView)view.findViewById(R.id.imageView4);
        ImageView phone1=(ImageView)view.findViewById(R.id.imageView5);
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num="+919845966237";
                Intent in=new Intent(Intent.ACTION_CALL);
                in.setData(Uri.parse("tel:" + num));
                startActivity(in);
            }
        });
        phone1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num="+919844037665";
                Intent in=new Intent(Intent.ACTION_CALL);
                in.setData(Uri.parse("tel:" + num));
                startActivity(in);
            }
        });
        rules_blind_art.setText("1. In this event, one person will be blindfolded and another person handcuffed. The handcuffed participant shall describe the picture and the blindfolded participant shall draw it.");

        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        blindArtScrollView = (ObservableScrollView) view.findViewById(R.id.blindArtScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), blindArtScrollView, null);
    }
}
