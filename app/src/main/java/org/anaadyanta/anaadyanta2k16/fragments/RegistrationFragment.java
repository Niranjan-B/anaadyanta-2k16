package org.anaadyanta.anaadyanta2k16.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import org.anaadyanta.anaadyanta2k16.R;
import org.anaadyanta.anaadyanta2k16.StaticClassNavigationInstance;
import org.anaadyanta.anaadyanta2k16.adapters.CulturalEventsRecyclerAdapter;
import org.anaadyanta.anaadyanta2k16.adapters.TechnicalEventsRecyclerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class RegistrationFragment extends Fragment {

    RecyclerView culturalEventsContainer, technicalEventsContainer;
    CulturalEventsRecyclerAdapter culturalEventsRecyclerAdapter;
    TechnicalEventsRecyclerAdapter technicalEventsRecyclerAdapter;
    List<String> culturalEvents, technicalEvents;


    public RegistrationFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        try {
            ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Register Yourself");
        } catch (NullPointerException exception) {
            Log.d("anaadyanta", "" + exception.getMessage());
        }

        View view = inflater.inflate(R.layout.fragment_registration, container, false);

        culturalEvents = new ArrayList<>();
        technicalEvents = new ArrayList<>();

        culturalEventsContainer = (RecyclerView) view.findViewById(R.id.culturalEventsContainer);
        technicalEventsContainer = (RecyclerView) view.findViewById(R.id.techEventsContainer);

        culturalEventsRecyclerAdapter = new CulturalEventsRecyclerAdapter(getActivity());
        technicalEventsRecyclerAdapter = new TechnicalEventsRecyclerAdapter(getActivity());

        culturalEventsContainer.setHasFixedSize(true);
        technicalEventsContainer.setHasFixedSize(true);

        culturalEventsContainer.setLayoutManager(new LinearLayoutManager(getActivity()));
        technicalEventsContainer.setLayoutManager(new LinearLayoutManager(getActivity()));

        culturalEventsContainer.setAdapter(culturalEventsRecyclerAdapter);
        technicalEventsContainer.setAdapter(technicalEventsRecyclerAdapter);

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();

        // bad programming....last minute sucks :-(

        culturalEvents.add("Fashion Show");
        culturalEvents.add("Treasure Hunt");
        culturalEvents.add("Choreo Night");
        culturalEvents.add("Street Dance");
        culturalEvents.add("7 to Smoke");
        culturalEvents.add("Theme Dance");
        culturalEvents.add("Solo Dance");
        culturalEvents.add("Battle of Bands(Western)");
        culturalEvents.add("Battle of Bands(Eastern)");
        culturalEvents.add("Acoustics");
        culturalEvents.add("BeatBox");
        culturalEvents.add("Mini Soccer");
        culturalEvents.add("Volley Ball");
        culturalEvents.add("3x3 Basketball");
        culturalEvents.add("Street Play");
        culturalEvents.add("Mad Ad's");
        culturalEvents.add("Skime");
        culturalEvents.add("FIFA 14");
        culturalEvents.add("Counter Strike 1.6");
        culturalEvents.add("DOTA");
        culturalEvents.add("NFS MW");
        culturalEvents.add("COD MW");
        culturalEvents.add("DSLR");
        culturalEvents.add("Mobile Photography");
        culturalEvents.add("Collage");
        culturalEvents.add("Doodle Marathon");
        culturalEvents.add("What Next?");
        culturalEvents.add("Blind Art");
        culturalEvents.add("Pot Pourri");
        culturalEvents.add("General Quiz");
        culturalEvents.add("Vices Quiz");
        culturalEvents.add("Set List");
        culturalEvents.add("Fictionary");
        culturalEvents.add("Debate");
        culturalEvents.add("Hunger Games");

        technicalEvents.add("Full Throttle");
        technicalEvents.add("Line Follower");
        technicalEvents.add("Robo Wars");
        technicalEvents.add("Qaud Speed");
        technicalEvents.add("Model Making");
        technicalEvents.add("Tech Charades");
        technicalEvents.add("Circuitrix");
        technicalEvents.add("R.A.M");
        technicalEvents.add("I.C.U");
        technicalEvents.add("Mini Hackathon");
        technicalEvents.add("Techquilla");
        technicalEvents.add("E Khoj");
        technicalEvents.add("On Spot Programming");
        technicalEvents.add("Debugging");
        technicalEvents.add("Jahaaz");
        technicalEvents.add("Logical Box");
        technicalEvents.add("Watch Me Junk");
        technicalEvents.add("Fox Hunt");
        technicalEvents.add("Mechwiz");
        technicalEvents.add("Automotive Quiz");
        technicalEvents.add("Paper Presentation");
        technicalEvents.add("What The Physics");
        technicalEvents.add("Pay The Piper");
        technicalEvents.add("Figure It Out");
        technicalEvents.add("Machine It");
        technicalEvents.add("Let It Rip");
        technicalEvents.add("Setu");
        technicalEvents.add("1 BHK House");
        technicalEvents.add("Poster Presentation");
        technicalEvents.add("Quiz");
        technicalEvents.add("Draft It Out");


        culturalEventsRecyclerAdapter.addEvents(culturalEvents);

        int desnity = getResources().getDisplayMetrics().densityDpi;
        int mulfactor;

        switch (desnity) {
            case DisplayMetrics.DENSITY_LOW : mulfactor = 45;
                                              break;
            case DisplayMetrics.DENSITY_MEDIUM : mulfactor = 60;
                                                 break;
            case DisplayMetrics.DENSITY_HIGH : mulfactor = 90;
                                               break;
            case DisplayMetrics.DENSITY_XHIGH : mulfactor = 120;
                                                break;
            default : mulfactor = 0;
                      break;
        }

          int viewSize = mulfactor * culturalEvents.size();
          culturalEventsContainer.getLayoutParams().height = viewSize;

        technicalEventsRecyclerAdapter.addEvents(technicalEvents);
        int viewSizeTech = mulfactor * technicalEvents.size();
        technicalEventsContainer.getLayoutParams().height = viewSizeTech;
    }
}
