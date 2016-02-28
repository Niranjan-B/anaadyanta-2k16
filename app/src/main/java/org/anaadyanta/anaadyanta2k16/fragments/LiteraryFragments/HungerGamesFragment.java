package org.anaadyanta.anaadyanta2k16.fragments.LiteraryFragments;


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
public class HungerGamesFragment extends Fragment {

    ObservableScrollView hungerGamesScrollView;
    ImageView imgView;

    public static HungerGamesFragment getInstance() {
        return new HungerGamesFragment();
    }

    public HungerGamesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_hunger_games, container, false);
        TextView rules_hungerGames= (TextView) view.findViewById(R.id.rules_hungerGames);
        imgView = (ImageView) view.findViewById(R.id.imageView4);
        rules_hungerGames.setText("1. This is a team based event with 2 members per team.\n" +
                "\n"+
                "2. This will be a 3 obstacle event and at the end of each one there will be a food item which has to be finished in order to move on to the next obstacle.\n" +
                "\n"+
                "3. At the end of each obstacle,the team which finishes last will be eliminated.\n" +
                "\n"+
                "4. A big prize awaits you at the end of the three obstacles.");

        imgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:+919663743760"));
                startActivity(callIntent);
            }
        });

        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        hungerGamesScrollView = (ObservableScrollView) view.findViewById(R.id.hungerGamesScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), hungerGamesScrollView, null);
    }

}
