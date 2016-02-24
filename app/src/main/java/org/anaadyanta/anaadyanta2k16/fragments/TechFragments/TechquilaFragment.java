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
public class TechquilaFragment extends Fragment {

    ObservableScrollView techquillaScrollView;

    public static TechquilaFragment getInstance() {
        return new TechquilaFragment();
    }

    public TechquilaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_techquila, container, false);
        TextView rules_techquilla= (TextView) view.findViewById(R.id.rules_techquilla);
        ImageView phone=(ImageView)view.findViewById(R.id.imageView4);
        ImageView phone1=(ImageView)view.findViewById(R.id.imageView5);
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num="+919686499197";
                Intent in=new Intent(Intent.ACTION_CALL);
                in.setData(Uri.parse("tel:" + num));
                startActivity(in);
            }
        });
        phone1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num="+918892800098";
                Intent in=new Intent(Intent.ACTION_CALL);
                in.setData(Uri.parse("tel:" + num));
                startActivity(in);
            }
        });
        rules_techquilla.setText("● It is a team event with 2 members in a team.\n" +
                "\n" +
                "● The members of the team can be from different institutions" +
                "or colleges.\n" +
                "\n" +
                "● The decision of the quiz master is final.\n" +
                "\n" +
                "● The quiz contains:\n" +
                "> Preliminary round which is a qualifier.\n" +
                "> Final round. ");
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        techquillaScrollView = (ObservableScrollView) view.findViewById(R.id.techquillaScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), techquillaScrollView, null);
    }

}
