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
public class QuizFragment extends Fragment {

    ObservableScrollView quizScrollView;


    public static QuizFragment getInstance() {
        return new QuizFragment();
    }

    public QuizFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_quiz, container, false);
        TextView rules_quiz= (TextView) view.findViewById(R.id.rules_quiz);
        ImageView phone=(ImageView)view.findViewById(R.id.imageView4);
        ImageView phone1=(ImageView)view.findViewById(R.id.imageView5);
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num="+919066832203";
                Intent in=new Intent(Intent.ACTION_CALL);
                in.setData(Uri.parse("tel:" + num));
                startActivity(in);
            }
        });
        phone1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num="+919901728910";
                Intent in=new Intent(Intent.ACTION_CALL);
                in.setData(Uri.parse("tel:" + num));
                startActivity(in);
            }
        });
        rules_quiz.setText("● Maximum allowed participants : 2 in a team.\n" +
                "\n"+
                "● 40 Questions to be asked.\n" +
                "\n"+
                "● The several questions related to almost all the areas of Civil" +
                "Engineering.\n" +
                "\n"+
                "● CRITERIA :\n" +
                "● The answers to be considered correct should lie between +5" +
                " or -5" +
                " of the true answers.\n" +
                "● Completion of each round.\n" +
                "● The maximum no. of correct answers from the team will be " +
                "considered winner.");

        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        quizScrollView = (ObservableScrollView) view.findViewById(R.id.quizscrollview);
        MaterialViewPagerHelper.registerScrollView(getActivity(), quizScrollView, null);
    }


}
