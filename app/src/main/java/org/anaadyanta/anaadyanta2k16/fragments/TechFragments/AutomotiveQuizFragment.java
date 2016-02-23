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
public class AutomotiveQuizFragment extends Fragment {

    ObservableScrollView automotiveQuizScrollView;

    public static AutomotiveQuizFragment getInstance() {
        return new AutomotiveQuizFragment();
    }

    public AutomotiveQuizFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_automotive_quiz, container, false);
        TextView rules_automotive= (TextView) view.findViewById(R.id.rules_automotive);
        ImageView phone=(ImageView)view.findViewById(R.id.imageView4);
        ImageView phone1=(ImageView)view.findViewById(R.id.imageView5);
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num="+919945587890";
                Intent in=new Intent(Intent.ACTION_CALL);
                in.setData(Uri.parse("tel:" + num));
                startActivity(in);
            }
        });
        phone1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num="+919738337178";
                Intent in=new Intent(Intent.ACTION_CALL);
                in.setData(Uri.parse("tel:" + num));
                startActivity(in);
            }
        });
        rules_automotive.setText("● 4 rounds of various challenges .\n" +
                "● Two participants per team .\n" +
                "● Interaction and communication based tasks .\n" +
                "JUDGEMENT CRITERIA :\n" +
                "➢ Number of correct answers .\n" +
                "➢ The performance .\n" +
                "➢ Judges’ final decision . ");

        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        automotiveQuizScrollView = (ObservableScrollView) view.findViewById(R.id.automotiveQuizScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), automotiveQuizScrollView, null);
    }

}
