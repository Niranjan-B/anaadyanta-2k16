package org.anaadyanta.anaadyanta2k16.fragments.TechFragments;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.github.florent37.materialviewpager.MaterialViewPagerHelper;
import com.github.ksoichiro.android.observablescrollview.ObservableScrollView;

import org.anaadyanta.anaadyanta2k16.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DraftItOutFragment extends Fragment {

    ObservableScrollView draftItOutScrollView;

    public static DraftItOutFragment getInstance() {
        return new DraftItOutFragment();
    }

    public DraftItOutFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_draft_it_out, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ImageView phone=(ImageView)view.findViewById(R.id.imageView4);
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = "+918123641639";
                Intent in = new Intent(Intent.ACTION_CALL);
                in.setData(Uri.parse("tel:" + num));
                startActivity(in);
            }
        });

        draftItOutScrollView = (ObservableScrollView) view.findViewById(R.id.draftItOutScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), draftItOutScrollView, null);
    }

}
