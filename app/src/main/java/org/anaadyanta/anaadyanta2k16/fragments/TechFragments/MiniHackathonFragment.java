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
public class MiniHackathonFragment extends Fragment {

    ObservableScrollView miniHackathonScrollView;

    public static MiniHackathonFragment getInstance() {
        return new MiniHackathonFragment();
    }

    public MiniHackathonFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_mini_hackathon, container, false);
        TextView rules_hackathon= (TextView) view.findViewById(R.id.rules_hackathon);
        ImageView phone=(ImageView)view.findViewById(R.id.imageView4);
        ImageView phone1=(ImageView)view.findViewById(R.id.imageView5);
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num="+9177959778808";
                Intent in=new Intent(Intent.ACTION_CALL);
                in.setData(Uri.parse("tel:" + num));
                startActivity(in);
            }
        });
        phone1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num="+919760733669";
                Intent in=new Intent(Intent.ACTION_CALL);
                in.setData(Uri.parse("tel:" + num));
                startActivity(in);
            }
        });
        rules_hackathon.setText("● The duration of the event is 3 hours.\n" +
                "● The team should consist of not more than 3 members.\n" +
                "● The application can be developed on any platform.\n" +
                "● Laptops are allowed.\n" +
                "JUDGEMENT CRITERIA :\n" +
                "\n"+
                "➢ Creativity involved in the application developed.\n" +
                "➢ Relevance to the theme given.\n" +
                "➢ Effectiveness of the demonstration given at the end.");
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        miniHackathonScrollView = (ObservableScrollView) view.findViewById(R.id.miniHackathonScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), miniHackathonScrollView, null);
    }

}
