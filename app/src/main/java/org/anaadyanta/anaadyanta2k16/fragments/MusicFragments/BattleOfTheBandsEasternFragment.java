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
public class BattleOfTheBandsEasternFragment extends Fragment {

    ObservableScrollView battleOfBandsEasternScrollView;

    public static BattleOfTheBandsEasternFragment getInstance() {
        return new BattleOfTheBandsEasternFragment();
    }

    public BattleOfTheBandsEasternFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_battle_of_the_bands_eastern, container, false);
        TextView rules_ebattle= (TextView) view.findViewById(R.id.rules_ebattle);
        ImageView phone=(ImageView)view.findViewById(R.id.imageView4);
        ImageView phone1=(ImageView)view.findViewById(R.id.imageView5);
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num="+918147073825";
                Intent in=new Intent(Intent.ACTION_CALL);
                in.setData(Uri.parse("tel:" + num));
                startActivity(in);
            }
        });
        phone1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num="+919535829316";
                Intent in=new Intent(Intent.ACTION_CALL);
                in.setData(Uri.parse("tel:" + num));
                startActivity(in);
            }
        });
        rules_ebattle.setText("1. Performances should be in Indian languages only. \n" +
                "\n"+
                "2. It’s a 2 round competition, Eliminations and Finals \n" +
                "\n"+
                "3. The time given per band- (10+2) mins (15+2) mins for the Finals. This includes the time taken for sound-check and the performance. Strictly no extra time would be given on stage.  \n" +
                "\n"+
                "4. Tuning of instruments should be done beforehand. \n" +
                "\n"+
                "5. Bands should contain at least one Instrumentalist. Acapella is not allowed. \n" +
                "\n"+
                "6. No restriction on the number of and type of musical instruments the bands may bring. \n" +
                "\n"+
                "7. Bands are allowed to bring only the keyboard part of the synthesizer (Rhythm part isn’t allowed). \n" +
                "\n"+
                "8. Bands have to bring their own equipment (apart from the ones mentioned below) and special effects. However, programmed music isn’t allowed. \n" +
                "\n"+
                "9. The judge’s decision will be final and binding. \n" +
                "\n"+
                "10. The event coordinators and the Anaadyanta committee reserves the right to make any last minute changes in the rules. \n");
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        battleOfBandsEasternScrollView = (ObservableScrollView) view.findViewById(R.id.battleOfBandsEasternScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), battleOfBandsEasternScrollView, null);
    }

}
