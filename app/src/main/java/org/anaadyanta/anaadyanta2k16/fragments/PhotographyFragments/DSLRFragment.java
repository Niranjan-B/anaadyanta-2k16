package org.anaadyanta.anaadyanta2k16.fragments.PhotographyFragments;


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
public class DSLRFragment extends Fragment {

    ObservableScrollView dslrScrollView;

    public static DSLRFragment getInstance() {
        return new DSLRFragment();
    }

    public DSLRFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=inflater.inflate(R.layout.fragment_dslr, container, false);
        TextView rules_dslr= (TextView) view.findViewById(R.id.rules_dslr);
        ImageView phone=(ImageView)view.findViewById(R.id.imageView4);
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num="+918799420710";
                Intent in=new Intent(Intent.ACTION_CALL);
                in.setData(Uri.parse("tel:" + num));
                startActivity(in);
            }
        });

        rules_dslr.setText("1. All participants should register offline at the Registration desk.\n" +
                "\n"+
                "2. The photograph must be shot on the days of the event based on the given theme.\n" +
                "\n"+
                "3. The participant can submit a maximum of 3 photos in a day.\n" +
                "\n"+
                "4. The photos can be taken using a DSLR.\n" +
                "\n"+
                "5. No editing the photograph.\n" +
                "\n"+
                "6. Photos must be submitted to the respective coordinator before the given deadline.\n" +
                "\n"+
                "7. The decision of the judge will be final and binding.");
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        dslrScrollView = (ObservableScrollView) view.findViewById(R.id.dslrScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), dslrScrollView, null);
    }

}
