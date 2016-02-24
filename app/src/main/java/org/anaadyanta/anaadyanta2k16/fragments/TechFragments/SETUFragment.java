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
public class SETUFragment extends Fragment {

    ObservableScrollView setuScrollView;

    public SETUFragment() {
        // Required empty public constructor
    }

    public static SETUFragment getInstance() {
        return new SETUFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_setu, container, false);
        TextView rules_poster = (TextView) view.findViewById(R.id.setu);
        ImageView phone = (ImageView) view.findViewById(R.id.imageView4);
        ImageView phone1 = (ImageView) view.findViewById(R.id.imageView5);
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = "+918951551435";
                Intent in = new Intent(Intent.ACTION_CALL);
                in.setData(Uri.parse("tel:" + num));
                startActivity(in);
            }
        });
        phone1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = "+918197964555";
                Intent in = new Intent(Intent.ACTION_CALL);
                in.setData(Uri.parse("tel:" + num));
                startActivity(in);
            }
        });
        rules_poster.setText("● No. of participants in a team can be maximum 2.\n" +
                "\n"+
                "● The model built by each team will be tested till failure (yielding)" +
                "by applying an incremental static load.\n" +
                "\n"+
                "● Use popsicle sticks for modelling.\n" +
                "\n"+
                "● Sticks can be altered physically by cutting or notching at any" +
                "angle.\n" +
                "\n"+
                "● Only Fevicol can be used as adhesive, use of other adhesives will" +
                "lead to disqualifications.\n" +
                "\n"+
                "● Threads can be used during construction, however should not be" +
                "present in the final structure.\n");
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        setuScrollView = (ObservableScrollView) view.findViewById(R.id.setuScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), setuScrollView, null);
    }

}
