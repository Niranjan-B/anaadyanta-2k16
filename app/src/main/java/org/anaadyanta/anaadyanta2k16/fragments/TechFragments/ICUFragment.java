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
public class ICUFragment extends Fragment {

    ObservableScrollView icuScrollView;

    public static ICUFragment getInstance() {
        return new ICUFragment();
    }

    public ICUFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_icu, container, false);
        TextView rules_1bhk= (TextView) view.findViewById(R.id.icu);
        ImageView phone=(ImageView)view.findViewById(R.id.imageView4);
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num="+918553446432";
                Intent in=new Intent(Intent.ACTION_CALL);
                in.setData(Uri.parse("tel:" + num));
                startActivity(in);
            }
        });
        rules_1bhk.setText("● Any sort of malpractice during any of the rounds will lead to\n" +
                "disqualification.\n" +
                "● First round will be judged based on the correctness of\n" +
                "simplification.\n" +
                "● Second round will be judged by taking into consideration both\n" +
                "the correctness of implementation and the time taken to do it.\n" +
                "● The decision of the judges is final. ");
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        icuScrollView = (ObservableScrollView) view.findViewById(R.id.icuScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), icuScrollView, null);
    }

}
