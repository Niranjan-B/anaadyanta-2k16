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
public class PosterPresentationFragment extends Fragment {

    ObservableScrollView posterPresentationScrollView;

    public static PosterPresentationFragment getInstance() {
        return new PosterPresentationFragment();
    }

    public PosterPresentationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_poster_presentation, container, false);
        TextView rules_poster= (TextView) view.findViewById(R.id.rules_poster);
        ImageView phone=(ImageView)view.findViewById(R.id.imageView4);
        ImageView phone1=(ImageView)view.findViewById(R.id.imageView5);
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num="+918123309756";
                Intent in=new Intent(Intent.ACTION_CALL);
                in.setData(Uri.parse("tel:" + num));
                startActivity(in);
            }
        });
        phone1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num="+917411485542";
                Intent in=new Intent(Intent.ACTION_CALL);
                in.setData(Uri.parse("tel:" + num));
                startActivity(in);
            }
        });
        rules_poster.setText("● The bought poster is limited with specifications\n" +
                        "\n" +
                "● Two participants per team.\n" +
                        "\n" +
                "● No modifications to a default bought poster.\n" +
                        "\n" +
                "● Two rounds of increasing difficulty with filtering in each round.\n" +
                        "\n" +
                "JUDGEMENT CRITERIA :\n" +
                "➢ Completion of each round.\n" +
                "➢ Description of the poster for the given specifications and the topic"
                );
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        posterPresentationScrollView = (ObservableScrollView) view.findViewById(R.id.posterPresentationScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), posterPresentationScrollView, null);
    }

}
