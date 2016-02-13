package org.anaadyanta.anaadyanta2k16.fragments.FashionShowFragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.florent37.materialviewpager.MaterialViewPagerHelper;
import com.github.ksoichiro.android.observablescrollview.ObservableScrollView;

import org.anaadyanta.anaadyanta2k16.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FashionShowFragment extends Fragment {

    private ObservableScrollView fashionShowScrollView;

    public static FashionShowFragment getInstance() {
        return new FashionShowFragment();
    }


    public FashionShowFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fashion_show, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        fashionShowScrollView = (ObservableScrollView) view.findViewById(R.id.fashionShowScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), fashionShowScrollView, null);

    }
}
