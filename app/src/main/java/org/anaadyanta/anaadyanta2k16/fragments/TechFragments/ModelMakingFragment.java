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
public class ModelMakingFragment extends Fragment {

    ObservableScrollView modelmakingScrollView;

    public static ModelMakingFragment getInstance() {
        return new ModelMakingFragment();
    }

    public ModelMakingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_model_making, container, false);
        TextView rules_modelmaking= (TextView) view.findViewById(R.id.rules_modelmaking);
        ImageView phone=(ImageView)view.findViewById(R.id.imageView4);
        ImageView phone1=(ImageView)view.findViewById(R.id.imageView5);
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num="+918867731049";
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
        rules_modelmaking.setText("● The duration of the event is 2 hours.\n" +
                "\n"+
                "● 4 participant per team.\n" +
                "\n"+
                "JUDGEMENT CRITERIA :\n" +
                "● The right dimensions of the part.\n" +
                "● Shape Detailing.\n" +
                "● Demonstration of the model.\n" +
                "● The steps used sequentially.");

        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        modelmakingScrollView = (ObservableScrollView) view.findViewById(R.id.modelmakingscrollview);
        MaterialViewPagerHelper.registerScrollView(getActivity(), modelmakingScrollView, null);
    }

}
