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
public class MachineItFragment extends Fragment {

    ObservableScrollView machineItScrollView;

    public static MachineItFragment getInstance() {
        return new MachineItFragment();
    }

    public MachineItFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_machine_it, container, false);
        TextView rules_machine= (TextView) view.findViewById(R.id.rules_machine);
        ImageView phone=(ImageView)view.findViewById(R.id.imageView4);
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num="+919483957700";
                Intent in=new Intent(Intent.ACTION_CALL);
                in.setData(Uri.parse("tel:" + num));
                startActivity(in);
            }
        });
        rules_machine.setText("● The duration of the event is 2 hours.\n" +
                "\n"+
                "● One participant per team.\n" +
                "\n"+
                "JUDGEMENT CRITERIA :\n" +
                "➢ The right dimensions of the part.\n" +
                "➢ Shape Detailing.\n" +
                "➢ Time taken to finish.\n" +
                "➢ The steps used sequentially . ");
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        machineItScrollView = (ObservableScrollView) view.findViewById(R.id.machineItScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), machineItScrollView, null);
    }

}
