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
public class DotaFragment extends Fragment {

    ObservableScrollView dotaScrollView;

    public static DotaFragment getInstance() {
        return new DotaFragment();
    }

    public DotaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_dota, container, false);
        TextView rules_dota= (TextView) view.findViewById(R.id.rules_dota);
        ImageView phone=(ImageView)view.findViewById(R.id.imageView4);
        ImageView phone1=(ImageView)view.findViewById(R.id.imageView5);
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num="+919986986313";
                Intent in=new Intent(Intent.ACTION_CALL);
                in.setData(Uri.parse("tel:" + num));
                startActivity(in);
            }
        });
        phone1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num="+919611810077";
                Intent in=new Intent(Intent.ACTION_CALL);
                in.setData(Uri.parse("tel:" + num));
                startActivity(in);
            }
        });
        rules_dota.setText("1. A team must comprise of 5 members.\n" +
                "\n"+
                "2. It’s a knockout event.\n" +
                "\n"+
                "3. Stable 6.86C MAP.\n" +
                "\n"+
                "4. WCG rules apply.");
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        dotaScrollView = (ObservableScrollView) view.findViewById(R.id.dotaScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), dotaScrollView, null);
    }

}
