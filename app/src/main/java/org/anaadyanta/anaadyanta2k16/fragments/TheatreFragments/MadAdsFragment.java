package org.anaadyanta.anaadyanta2k16.fragments.TheatreFragments;


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
public class MadAdsFragment extends Fragment {

    ObservableScrollView madAdsScrollView;

    public static MadAdsFragment getInstance() {
        return new MadAdsFragment();
    }

    public MadAdsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_mad_ads, container, false);
        TextView rules_madAds= (TextView) view.findViewById(R.id.rules_madAds);
        ImageView phone=(ImageView)view.findViewById(R.id.imageView4);
        ImageView phone1=(ImageView)view.findViewById(R.id.imageView5);
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num="+919902470467";
                Intent in=new Intent(Intent.ACTION_CALL);
                in.setData(Uri.parse("tel:" + num));
                startActivity(in);
            }
        });
        phone1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num="+919535899580";
                Intent in=new Intent(Intent.ACTION_CALL);
                in.setData(Uri.parse("tel:" + num));
                startActivity(in);
            }
        });
        rules_madAds.setText("1. Team can contain a maximum of 10 members.\n" +
                "\n"+
                "2. Time on stage: 6+1 mins. After 6 mins, a buzzer/bell will be rung.\n" +
                "\n"+
                "3. Teams must bring their own costumes/props (if any).\n" +
                "\n"+
                "4. Participants must be students of a college and must carry a valid ID card.\n" +
                "\n"+
                "5. The pieces can be in any language.");
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        madAdsScrollView = (ObservableScrollView) view.findViewById(R.id.madAdsScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), madAdsScrollView, null);
    }

}
