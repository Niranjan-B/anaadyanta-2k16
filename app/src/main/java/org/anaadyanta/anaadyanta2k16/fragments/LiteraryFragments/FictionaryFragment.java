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
public class FictionaryFragment extends Fragment {

    ObservableScrollView fictionaryScrollView;

    public static FictionaryFragment getInstance() {
        return new FictionaryFragment();
    }

    public FictionaryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        inflater.inflate(R.layout.fragment_fictionary, container, false);
        View view=inflater.inflate(R.layout.fragment_fictionary, container, false);
        TextView rules_fictionary= (TextView) view.findViewById(R.id.rules_fictionary);
        rules_fictionary.setText("1. Solo Event, On the spot topic.\n" +
                "2. Time limit: Two hours.\n" +
                "3. Word limit: 2 pages.\n" +
                "4. No obscene content permitted.\n" +
                "5. Theme will be given on spot.\n");
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        fictionaryScrollView = (ObservableScrollView) view.findViewById(R.id.fictionaryScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), fictionaryScrollView, null);
    }

}
