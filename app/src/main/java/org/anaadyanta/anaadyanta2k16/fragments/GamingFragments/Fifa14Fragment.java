package org.anaadyanta.anaadyanta2k16.fragments.GamingFragments;


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
public class Fifa14Fragment extends Fragment {

    ObservableScrollView fifaScrollView;

    public static Fifa14Fragment getInstance() {
        return new Fifa14Fragment();
    }

    public Fifa14Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_fifa14, container, false);
        TextView rules_fifa= (TextView) view.findViewById(R.id.rules_fifa);
        ImageView phone=(ImageView)view.findViewById(R.id.imageView4);
        ImageView phone1=(ImageView)view.findViewById(R.id.imageView5);
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num="+918971335061";
                Intent in=new Intent(Intent.ACTION_CALL);
                in.setData(Uri.parse("tel:" + num));
                startActivity(in);
            }
        });
        phone1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num="+91948375026";
                Intent in=new Intent(Intent.ACTION_CALL);
                in.setData(Uri.parse("tel:" + num));
                startActivity(in);
            }
        });
        rules_fifa.setText("1. Individual Event.\n" +
                "\n"+
                "2. It’s a knockout event.\n" +
                "\n"+
                "3. In case of a draw, extra time is given which is followed by a penalty shootout.\n" +
                "\n"+
                "4. 4 minutes a half.\n" +
                "\n"+
                "5. Joysticks are allowed. Participants are allowed to bring their own joysticks/gamepads/headphones but the Anaadyanta committee isn’t responsible for the loss of personal property.\n" +
                "\n"+
                "6. Players can pause for substitution if the ball is in their possession.");
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        fifaScrollView = (ObservableScrollView) view.findViewById(R.id.fifaScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), fifaScrollView, null);
    }

}
