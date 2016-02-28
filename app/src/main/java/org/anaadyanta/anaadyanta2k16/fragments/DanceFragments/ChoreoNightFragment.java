package org.anaadyanta.anaadyanta2k16.fragments.DanceFragments;


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
public class ChoreoNightFragment extends Fragment {

    ObservableScrollView choreoNightScrollView;

    public static ChoreoNightFragment getInstance() {
        return new ChoreoNightFragment();
    }

    public ChoreoNightFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_choreo_night, container, false);
        TextView rules= (TextView) view.findViewById(R.id.rules);
        ImageView phone=(ImageView)view.findViewById(R.id.imageView4);
        ImageView phone1=(ImageView)view.findViewById(R.id.imageView5);
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num="+918147073880";
                Intent in=new Intent(Intent.ACTION_CALL);
                in.setData(Uri.parse("tel:" + num));
                startActivity(in);
            }
        });
        phone1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num="+919686991686";
                Intent in=new Intent(Intent.ACTION_CALL);
                in.setData(Uri.parse("tel:" + num));
                startActivity(in);
            }
        });
        rules.setText(
                "1. A team of 8 to 25 member can participate..\n" +
                        "\n"+
                        "2. Time limit is 8+2 including stage setup\n" +
                        "\n"+
                        "3. Any dance form is allowed..\n" +
                        "\n"+
                        "4. A video of the past/present performance should be uploaded on YouTube and a link is to be sent to the anaadyanta committee(shashankmishra15@gmail.com) for the preliminary round..\n" +
                        "\n"+
                        "5. Video must be sent by 20th Feb and the results will be announced within a week\n" +
                        "\n"+
                        "6. Costumes are not necessary for the preliminary video\n" +
                        "\n"+
                        "7. No vulgarity is allowed\n" +
                        "\n"+
                        "8. Usage of props is allowed\n" +
                        "\n"+
                        "9. No water, powder, fire, gas or any other inflammable and hazardous things are allowed to be used\n" +
                        "\n"+
                        "10. Marks will be distributed based on choreography, innovation/creativity, coordination, stage/space usage, costumes, music and audience response");
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        choreoNightScrollView = (ObservableScrollView) view.findViewById(R.id.choreoNightScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), choreoNightScrollView, null);
    }
}
