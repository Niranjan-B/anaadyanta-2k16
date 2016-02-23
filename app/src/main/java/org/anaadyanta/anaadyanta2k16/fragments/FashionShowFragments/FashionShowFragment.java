package org.anaadyanta.anaadyanta2k16.fragments.FashionShowFragments;


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
        View view = inflater.inflate(R.layout.fragment_fashion_show, container, false);
        TextView rules_fashionshow= (TextView) view.findViewById(R.id.rules_fashionshow);
        ImageView phone=(ImageView)view.findViewById(R.id.imageView4);

        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num="+918147301088";
                Intent in=new Intent(Intent.ACTION_CALL);
                in.setData(Uri.parse("tel:"+num));
                startActivity(in);
            }
        });
        rules_fashionshow.setText("1. Fashion Show is open to college students only. \n" +
                "\n"+
                "2. Theme:  This is an Open Theme Event \n" +
                "\n"+
                "3. All the members of a team must have a valid college ID card. \n" +
                "\n"+
                "4. Vulgarity of any kind would lead to disqualification of the team. It is strongly advised that the team consult the organizers if the team feels that any stunt or costume design can be deemed as vulgar. The decision of the organizers would be final in any kind of resulting dispute. \n" +
                "\n"+
                "5. Team Size: Maximum 20 members. \n" +
                "\n"+
                "6. Stage time: (8+2) mins for prep and performance. Each team is responsible for clearing the stage once their performance is over. \n" +
                "\n"+
                "7. Teams are to inform the organizers of any kind of props they plan to use during the event. Use of water, fire, pets, animal skin or any hazardous materials are not allowed. Teams are instructed to consult with the organizers before using any such material. \n" +
                "\n"+
                "8. Teams are instructed to submit their audio tracks 30 minutes prior to the event. \n" +
                "\n"+
                "9. The decision of the judges will be final and cannot be questioned.");
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        fashionShowScrollView = (ObservableScrollView) view.findViewById(R.id.fashionShowScrollView);
        MaterialViewPagerHelper.registerScrollView(getActivity(), fashionShowScrollView, null);

    }
}
