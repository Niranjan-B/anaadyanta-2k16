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
public class FoxHuntFragment extends Fragment {

    ObservableScrollView foxHuntScrollView;

    public static FoxHuntFragment getInstance() {
        return new FoxHuntFragment();
    }

    public FoxHuntFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_fox_hunt, container, false);
        TextView rules_automotive= (TextView) view.findViewById(R.id.rules_whatdoes);
        ImageView phone=(ImageView)view.findViewById(R.id.imageView4);
        ImageView phone1=(ImageView)view.findViewById(R.id.imageView5);
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num="+917411572165";
                Intent in=new Intent(Intent.ACTION_CALL);
                in.setData(Uri.parse("tel:" + num));
                startActivity(in);
            }
        });
        phone1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num="+918105208948";
                Intent in=new Intent(Intent.ACTION_CALL);
                in.setData(Uri.parse("tel:" + num));
                startActivity(in);
            }
        });
        rules_automotive.setText("● Members Per Team24\n" +
                "\n"+
                "● Time Limit = 30 - 45" +
                "mins per round\n" +
                "\n"+
                "● At the end of finding each clue, the participants has to take a pic of clue" +
                "with the transmitter.\n" +
                "\n"+
                "● Those participants who’ll find the exact location of final transmitter and" +
                "hand over all the clues to the event coordinator will be the winners of the" +
                "event.\n" +
                "\n"+
                "● The team which is finding two or more clues at a time may lead to penalty" +
                "or chances to disqualify the team.");

        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        foxHuntScrollView = (ObservableScrollView) view.findViewById(R.id.foxHuntScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), foxHuntScrollView, null);
    }

}
