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
public class LetItRipFragment extends Fragment {

    ObservableScrollView letItRIPScrollView;

    public static LetItRipFragment getInstance() {
        return new LetItRipFragment();
    }

    public LetItRipFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_let_it_rip, container, false);
        TextView rules_let_it_rip= (TextView) view.findViewById(R.id.rules_let_it_rip);
        ImageView phone=(ImageView)view.findViewById(R.id.imageView4);
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num="+919738337178";
                Intent in=new Intent(Intent.ACTION_CALL);
                in.setData(Uri.parse("tel:" + num));
                startActivity(in);
            }
        });
        rules_let_it_rip.setText("● Three rounds per bout .\n" +
                "● One participant per team .\n" +
                "● Winner decided on who stays within the playing arena .\n" +
                "JUDGEMENT CRITERIA :\n" +
                "➢ Damage .\n" +
                "➢ Best of 3. ");
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        letItRIPScrollView = (ObservableScrollView) view.findViewById(R.id.letItRIPScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), letItRIPScrollView, null);
    }

}
