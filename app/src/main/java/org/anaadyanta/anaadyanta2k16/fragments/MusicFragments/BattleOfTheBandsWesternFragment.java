package org.anaadyanta.anaadyanta2k16.fragments.MusicFragments;


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
public class BattleOfTheBandsWesternFragment extends Fragment {

    ObservableScrollView battleOfBandsWesternScrollView;

    public static BattleOfTheBandsWesternFragment getInstance() {
        return new BattleOfTheBandsWesternFragment();
    }


    public BattleOfTheBandsWesternFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_battle_of_the_bands_western, container, false);
        TextView rules_wbattle= (TextView) view.findViewById(R.id.rules_wbattle);
        ImageView phone=(ImageView)view.findViewById(R.id.imageView4);
        ImageView phone1=(ImageView)view.findViewById(R.id.imageView5);
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num="+918095870862";
                Intent in=new Intent(Intent.ACTION_CALL);
                in.setData(Uri.parse("tel:" + num));
                startActivity(in);
            }
        });
        phone1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num="+919901584186";
                Intent in=new Intent(Intent.ACTION_CALL);
                in.setData(Uri.parse("tel:" + num));
                startActivity(in);
            }
        });
        rules_wbattle.setText("1. This is a WESTERN rock band competition open to any college or semi\u00ADpro band with three or more members. \n" +
                "2. It’s a 2 round competition, Eliminations and Finals \n" +
                "\n"+
                "3. All songs performed by the band must be in ENGLISH only. \n" +
                "\n"+
                "4. The time given per band (10+2) mins (15+5) mins for the Finals. This includes the time taken for sound-check and the performance. Strictly no extra time would be given on stage. \n" +
                "\n"+
                "5. Tuning of instruments should be done beforehand. \n" +
                "\n"+
                "6. Bands will be disqualified with immediate effect for misconduct, obscenity or intentional use of foul language. \n" +
                "\n"+
                "7. Bands have to bring their own equipment (apart from the ones mentioned below) and special effects. However, programmed music isn’t allowed. \n" +
                "\n"+
                "8. Equipment provided will be:  \n" +
                "\n"+
                "I. One bass amplifier speaker \n" +
                "II. One lead amplifier speaker \n" +
                "III. Adequate microphones \n" +
                "IV.Drum set with double base setup (you can bring your own cymbals and chokes/high hats) \n" +
                "\n"+
                "9.The judge’s decision will be final and binding. \n" +
                "\n"+
                "10.The event coordinators and the Anaadyanta committee reserves the right to make any last minute changes in the rules. \n");

        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        battleOfBandsWesternScrollView = (ObservableScrollView) view.findViewById(R.id.battleOfBandsWesternScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), battleOfBandsWesternScrollView, null);
    }

}
