package org.anaadyanta.anaadyanta2k16.fragments.LiteraryFragments;


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
public class PotPourriFragment extends Fragment {

    ObservableScrollView potPourriScrollView;

    public static PotPourriFragment getInstance() {
        return new PotPourriFragment();
    }

    public PotPourriFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_pot_pourri, container, false);
        TextView rules_potpourri= (TextView) view.findViewById(R.id.rules_potpourri);
        ImageView phone=(ImageView)view.findViewById(R.id.imageView4);
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num="+919739357539";
                Intent in=new Intent(Intent.ACTION_CALL);
                in.setData(Uri.parse("tel:" + num));
                startActivity(in);
            }
        });
        rules_potpourri.setText("1. The event involves a series of rounds with trivia questions, games, and little fun puzzles, the child in you would easily be able to answer. The questions would include all of the most popular pop-cultured themes that were famous during the 90’s and early 2000’s.\n" +
                "\n"+
                "2. So brush up on your 90’s GK!\n" +
                "\n"+
                "3. Teams of 2 or 3 ");


        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        potPourriScrollView = (ObservableScrollView) view.findViewById(R.id.potPourriScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), potPourriScrollView, null);
    }

}
