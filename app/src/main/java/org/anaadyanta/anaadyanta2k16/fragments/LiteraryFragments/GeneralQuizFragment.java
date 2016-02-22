package org.anaadyanta.anaadyanta2k16.fragments.LiteraryFragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.github.florent37.materialviewpager.MaterialViewPagerHelper;
import com.github.ksoichiro.android.observablescrollview.ObservableScrollView;

import org.anaadyanta.anaadyanta2k16.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class GeneralQuizFragment extends Fragment {

    ObservableScrollView generalQuizScrollView;

    public static GeneralQuizFragment getInstance() {
        return new GeneralQuizFragment();
    }

    public GeneralQuizFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_general_quiz, container, false);
        TextView rules_general_Quiz= (TextView) view.findViewById(R.id.rules_general_Quiz);
        rules_general_Quiz.setText("1. Teams of 3 or less.\n" +
                "\n"+
                "2. Consists of a written prelims round. And the finals which would contain multiple rounds.\n" +
                "\n"+
                "3. Quiz master's decision is final.\n");

        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        generalQuizScrollView = (ObservableScrollView) view.findViewById(R.id.generalQuizScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), generalQuizScrollView, null);
    }

}
