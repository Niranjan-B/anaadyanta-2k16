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
public class QuadSpeedFragment extends Fragment {

    ObservableScrollView quadSpeedScrollView;

    public static QuadSpeedFragment getInstance() {
        return new QuadSpeedFragment();
    }

    public QuadSpeedFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_quad_speed, container, false);
        TextView rules_quadspeed= (TextView) view.findViewById(R.id.rules_quadspeed);
        ImageView phone=(ImageView)view.findViewById(R.id.imageView4);
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num="+919036285404";
                Intent in=new Intent(Intent.ACTION_CALL);
                in.setData(Uri.parse("tel:" + num));
                startActivity(in);
            }
        });
        rules_quadspeed.setText("● The bought copters is limited with specifications\n" +
                "\n"+
                "● Two participants per team.\n" +
                "\n"+
                "● No modifications to a default bought copter .\n" +
                "\n"+
                "● Five rounds of increasing difficulty with filtering in each round .\n" +
                "\n"+
                "JUDGEMENT CRITERIA :\n" +
                "➢ Completion of each round .\n" +
                "➢ Time taken .\n" +
                "➢ Non Failure of the model mid flight which leads to direct disqualification.");
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        quadSpeedScrollView = (ObservableScrollView) view.findViewById(R.id.quadSpeedScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), quadSpeedScrollView, null);
    }

}
