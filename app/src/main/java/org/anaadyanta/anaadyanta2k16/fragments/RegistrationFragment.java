package org.anaadyanta.anaadyanta2k16.fragments;


import android.app.ProgressDialog;
import android.os.AsyncTask;
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
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.anaadyanta.anaadyanta2k16.R;
import org.anaadyanta.anaadyanta2k16.StaticClassCheckedValues;
import org.anaadyanta.anaadyanta2k16.StaticClassNavigationInstance;
import org.anaadyanta.anaadyanta2k16.adapters.CulturalEventsRecyclerAdapter;
import org.anaadyanta.anaadyanta2k16.adapters.TechnicalEventsRecyclerAdapter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
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
    Button submitRegistration;
    String[] tempCulturalEventList;
    EditText registrationName, registrationTeam, registrationNumOfParticipants, registrationCollege,
             registrationCity, registrationPhoneNum;


    public RegistrationFragment() {
        // Required empty public constructor
        // TODO : add 2 clicks to return or pop up a dialog
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        tempCulturalEventList = getResources().getStringArray(R.array.cultural_events);

        try {
            ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Register Yourself");
        } catch (NullPointerException exception) {
            Log.d("anaadyanta", "" + exception.getMessage());
        }

        View view = inflater.inflate(R.layout.fragment_registration, container, false);

        submitRegistration = (Button) view.findViewById(R.id.registrationSubmit);
        registrationCity = (EditText) view.findViewById(R.id.registrationCity);
        registrationCollege = (EditText) view.findViewById(R.id.registrationCollege);
        registrationName = (EditText) view.findViewById(R.id.registrationName);
        registrationNumOfParticipants = (EditText) view.findViewById(R.id.registrationNumOfParticipants);
        registrationPhoneNum = (EditText) view.findViewById(R.id.registrationPhoneNum);
        registrationTeam = (EditText) view.findViewById(R.id.registrationTeam);

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

        submitRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new SubmitForm().execute();
            }
        });

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();

        for (String temp : tempCulturalEventList) {
            culturalEvents.add(temp);
        }

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

    public class SubmitForm extends AsyncTask<String, String, String> {

        ProgressDialog dialog;
        String text = "";
        BufferedReader reader = null;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            dialog = new ProgressDialog(getActivity());
            dialog.setMessage("Submitting your response");
            dialog.show();
        }

        @Override
        protected String doInBackground(String... params) {

            String data = getEncodedData();
            try {
                URL url = new URL(getResources().getString(R.string.google_form_submission_end_point));

                URLConnection connection = url.openConnection();
                connection.setDoOutput(true);
                connection.setConnectTimeout(30000);
                connection.setReadTimeout(15000);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(connection.getOutputStream());
                outputStreamWriter.write(data);
                outputStreamWriter.flush();

                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder stringBuilder = new StringBuilder();
                String line = "";

                while ((line = reader.readLine()) != null) {
                    stringBuilder.append(line + "\n");
                }

                text = stringBuilder.toString();
                return text;

            } catch (Exception e) {
                e.printStackTrace();
                return null;
            } finally {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            if (dialog.isShowing()) {
                dialog.cancel();
                Log.d("anaadyanta", s);
            }

        }
    }

    private String getEncodedData() {

        try {
            String data = URLEncoder.encode("entry.2114401055", "UTF-8") + "=" + URLEncoder.encode(registrationName.getText().toString(), "UTF-8");
            data += "&" + URLEncoder.encode("entry.1096355917", "UTF-8") + "=" + URLEncoder.encode(registrationTeam.getText().toString(), "UTF-8");
            data += "&" + URLEncoder.encode("entry.1092637316", "UTF-8") + "=" + URLEncoder.encode(registrationNumOfParticipants.getText().toString(), "UTF-8");
            data += "&" + URLEncoder.encode("entry.1117221263", "UTF-8") + "=" + URLEncoder.encode(registrationCity.getText().toString(), "UTF-8");
            data += "&" + URLEncoder.encode("entry.2129025763", "UTF-8") + "=" + URLEncoder.encode(registrationPhoneNum.getText().toString(), "UTF-8");
            data += "&" + URLEncoder.encode("entry.2080622680", "UTF-8") + "=" + URLEncoder.encode(registrationCollege.getText().toString(), "UTF-8");

            boolean[] temp = StaticClassCheckedValues.getCulturalEventsChecked();
                for (int i = 0; i < temp.length ; i++) {
                    if (temp[i]) {
                        data += "&" + URLEncoder.encode("entry.1676696390", "UTF-8") + "=" + URLEncoder.encode(tempCulturalEventList[i], "UTF-8");
                    }
                }
            
            return data;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }
}
