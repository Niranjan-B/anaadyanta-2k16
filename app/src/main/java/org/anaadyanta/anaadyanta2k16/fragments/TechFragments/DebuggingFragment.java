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
public class DebuggingFragment extends Fragment {

    ObservableScrollView debuggingScrollView;

    public static DebuggingFragment getInstance() {
        return new DebuggingFragment();
    }

    public DebuggingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_debugging, container, false);
        TextView rules_debugging= (TextView) view.findViewById(R.id.rules_debugging);
        ImageView phone=(ImageView)view.findViewById(R.id.imageView4);
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num="+919035566966";
                Intent in=new Intent(Intent.ACTION_CALL);
                in.setData(Uri.parse("tel:" + num));
                startActivity(in);
            }
        });

        rules_debugging.setText("1. Number of participants per team = 2\n" +
                "\n"+
                "2. No online help is allowed.\n" +
                "\n"+
                "3. 10 teams will be qualified from round 1 to participate in round 2\n" +
                "\n"+
                "4. The output expected will be informed beforehand.\n" +
                "\n"+
                "5. Errors in the program can be any of the following :\n" +
                "logical errors, syntactic errors, semantic errors, runtime errors\n" +
                "\n"+
                "6. The winner declaration will be solely based on performance in the second round.");
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        debuggingScrollView = (ObservableScrollView) view.findViewById(R.id.debuggingScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), debuggingScrollView, null);
    }

}
