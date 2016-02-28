package org.anaadyanta.anaadyanta2k16.fragments.ArtFragments;


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
public class DoodleMarathonFragment extends Fragment {

    ObservableScrollView doodleMarathonScrollView;

    public static DoodleMarathonFragment getInstance() {
        return new DoodleMarathonFragment();
    }

    public DoodleMarathonFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_doodle_marathon, container, false);
        TextView rules_doodle_Marathan= (TextView) view.findViewById(R.id.rules_doodle_Marathan);
        ImageView phone=(ImageView)view.findViewById(R.id.imageView4);
        ImageView phone1=(ImageView)view.findViewById(R.id.imageView5);
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num="+918861685545";
                Intent in=new Intent(Intent.ACTION_CALL);
                in.setData(Uri.parse("tel:" + num));
                startActivity(in);
            }
        });
        phone1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num="+919742523033";
                Intent in=new Intent(Intent.ACTION_CALL);
                in.setData(Uri.parse("tel:" + num));
                startActivity(in);
            }
        });
        rules_doodle_Marathan.setText("1. Doodle away your thoughts as creatively as possible.\n" +
                "\n"+
                "2. The participants aren’t allowed to refer the internet or any pictures from their phones. This would lead to immediate disqualification.");
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        doodleMarathonScrollView = (ObservableScrollView) view.findViewById(R.id.doodleMarathonScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), doodleMarathonScrollView, null);
    }

}
