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
public class OnSpotProgrammingFragment extends Fragment {

    ObservableScrollView onSpotProgrammingScrollView;

    public static OnSpotProgrammingFragment getInstance() {
        return new OnSpotProgrammingFragment();
    }

    public OnSpotProgrammingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_on_spot_programming, container, false);
        TextView rules_programming= (TextView) view.findViewById(R.id.rules_programming);
        ImageView phone=(ImageView)view.findViewById(R.id.imageView4);
        ImageView phone1=(ImageView)view.findViewById(R.id.imageView5);
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num="+919164841394";
                Intent in=new Intent(Intent.ACTION_CALL);
                in.setData(Uri.parse("tel:" + num));
                startActivity(in);
            }
        });
        phone1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num="+918123358131";
                Intent in=new Intent(Intent.ACTION_CALL);
                in.setData(Uri.parse("tel:" + num));
                startActivity(in);
            }
        });
        rules_programming.setText("● Number of participants in a team = 2\n" +
                "\n"+
                "● The first round will be paperpen" +
                "oriented. The second puts" +
                "you on the computer.\n" +
                "\n"+
                "● Contestants cannot open multiple tabs on their browser.\n" +
                "\n"+
                "● Winners will be announced based on the time taken to code a" +
                "particular assignment. THE PERFORMANCE IN FIRST\n" +
                "ROUND WILL NOT BE CONSIDERED. ");
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        onSpotProgrammingScrollView = (ObservableScrollView) view.findViewById(R.id.onSpotProgrammingScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), onSpotProgrammingScrollView, null);
    }

}
