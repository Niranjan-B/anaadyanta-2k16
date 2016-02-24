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
public class JahaazFragment extends Fragment {

    ObservableScrollView jahaazScrollView;

    public static JahaazFragment getInstance() {
        return new JahaazFragment();
    }

    public JahaazFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_jahaaz, container, false);
        TextView rules_jahaaz= (TextView) view.findViewById(R.id.rules_jahaaz);
        ImageView phone=(ImageView)view.findViewById(R.id.imageView4);
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num="+919739624458";
                Intent in=new Intent(Intent.ACTION_CALL);
                in.setData(Uri.parse("tel:" + num));
                startActivity(in);
            }
        });

        rules_jahaaz.setText("● Specifications\n" +
                "\n"+
                "➢ Battery – 6V Battery\n" +
                "➢ Motor – 6V DC motor (max 3 nos.)\n" +
                "➢ Solar panel – 6V 300mAh 1.5W (max 2 nos.)\n" +
                "➢ Dimensions – 20cm * 15cm * 10cm. ");
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        jahaazScrollView = (ObservableScrollView) view.findViewById(R.id.jahaazScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), jahaazScrollView, null);
    }

}
