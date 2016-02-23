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
public class PaperPresentationFragment extends Fragment {

    ObservableScrollView paperPresentationScrollView;

    public static PaperPresentationFragment getInstance() {
        return new PaperPresentationFragment();
    }

    public PaperPresentationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_paper_presentation, container, false);
        TextView rules_paper_presentation= (TextView) view.findViewById(R.id.rules_paper_presentation);
        ImageView phone=(ImageView)view.findViewById(R.id.imageView4);
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num="+917795574812";
                Intent in=new Intent(Intent.ACTION_CALL);
                in.setData(Uri.parse("tel:" + num));
                startActivity(in);
            }
        });
        rules_paper_presentation.setText("● The maximum duration of the presentation is 20 minutes.\n" +
                "● Max of two participants per team .\n" +
                "● The questionnaire will follow presentation for 10 minutes by\n" +
                "assigned judges .\n" +
                "JUDGEMENT CRITERIA :\n" +
                "\n"+
                "➢ Authenticity and originality.\n" +
                "➢ Technical data interpretation\n" +
                "➢ Real world application");
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        paperPresentationScrollView = (ObservableScrollView) view.findViewById(R.id.paperPresentationScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), paperPresentationScrollView, null);
    }

}
