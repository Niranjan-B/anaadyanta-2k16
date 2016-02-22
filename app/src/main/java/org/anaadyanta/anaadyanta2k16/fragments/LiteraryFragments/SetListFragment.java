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
public class SetListFragment extends Fragment {

    ObservableScrollView setListScrollView;

    public static SetListFragment getInstance() {
        return new SetListFragment();
    }

    public SetListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_set_list, container, false);
        TextView rules_set_list= (TextView) view.findViewById(R.id.rules_set_list);
        rules_set_list.setText("1. Solo event.\n" +
                "\n"+
                "2. Participants are given 4 sets of topics one after another to speak about. 3 sets and one Big Finish. Topics are generally meant to be comical.\n" +
                "\n"+
                "3. A 20 second preparation time and a maximum of 90 seconds speaking time per set will be allotted. The speaker is allowed to pass on the set if it's too difficult for him/her to pull off.\n" +
                "\n"+
                "4. Participants will judged on their improv skills, humor and fluidity of their speech and transition from one topic to the next.\n");


        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        setListScrollView = (ObservableScrollView) view.findViewById(R.id.setListScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), setListScrollView, null);
    }

}
