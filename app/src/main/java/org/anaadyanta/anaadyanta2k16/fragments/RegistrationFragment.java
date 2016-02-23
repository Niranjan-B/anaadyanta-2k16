package org.anaadyanta.anaadyanta2k16.fragments;


import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import org.anaadyanta.anaadyanta2k16.R;
import org.anaadyanta.anaadyanta2k16.StaticClassCheckedValues;
import org.anaadyanta.anaadyanta2k16.Utils.Utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

/**
 * A simple {@link Fragment} subclass.
 */
public class RegistrationFragment extends Fragment {

    Button submitRegistration;
    String[] tempCulturalEventList, tempTechnicalEventsList;
    EditText registrationName, registrationTeam, registrationNumOfParticipants, registrationCollege,
             registrationCity, registrationPhoneNum;


    public RegistrationFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        tempCulturalEventList = getResources().getStringArray(R.array.cultural_events);
        tempTechnicalEventsList = getResources().getStringArray(R.array.tech_events);

        try {
            ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Register Yourself");
        } catch (NullPointerException exception) {
            Log.d("anaadyanta", "" + exception.getMessage());
        }

        final View view = inflater.inflate(R.layout.fragment_registration, container, false);

        submitRegistration = (Button) view.findViewById(R.id.registrationSubmit);
        registrationCity = (EditText) view.findViewById(R.id.registrationCity);
        registrationCollege = (EditText) view.findViewById(R.id.registrationCollege);
        registrationName = (EditText) view.findViewById(R.id.registrationName);
        registrationNumOfParticipants = (EditText) view.findViewById(R.id.registrationNumOfParticipants);
        registrationPhoneNum = (EditText) view.findViewById(R.id.registrationPhoneNum);
        registrationTeam = (EditText) view.findViewById(R.id.registrationTeam);

        initializeRecyclerViews(view);

        submitRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if (checkForValidCredentials()) {
                   if (Utility.isInternetAvailable(getActivity())) {
                       int numberOfCheckedEventsCul = getCheckedCulturalEvents();
                       int numberOfCheckedEventsTech = getCheckedTechEvents();
                       if ((numberOfCheckedEventsCul <= 0) && (numberOfCheckedEventsTech <= 0)) {
                           Toast.makeText(getActivity(), "Looks like you haven't selected any events?", Toast.LENGTH_LONG).show();
                       } else {
                           new SubmitForm().execute();
                           Log.d("anaadyanta", "passed tests");
                       }
                   } else {
                       Toast.makeText(getActivity(), "Something's wrong with your network connection :-(", Toast.LENGTH_LONG).show();
                   }
               } else {
                   Toast.makeText(getActivity(), "OOPS! Starred fields are important!", Toast.LENGTH_LONG).show();
               }
            }
        });

        return view;
    }

    private int getCheckedTechEvents() {
        int i = 0;
        boolean[] tempTech = StaticClassCheckedValues.getTechEventsChecked();
        for (int j = 0; j < tempTech.length; j++) {
            if (tempTech[j]) {
                i++;
            }
        }
        return i;
    }

    private int getCheckedCulturalEvents() {
        int j = 0;
        boolean[] temp = StaticClassCheckedValues.getCulturalEventsChecked();
        for (int i = 0; i < temp.length ; i++) {
            if (temp[i]) {
                j++;
            }
        }
        return j;
    }

    private boolean checkForValidCredentials() {

        boolean temp;

        if ((registrationName.getText().toString().isEmpty()) && (registrationNumOfParticipants.getText().toString().isEmpty()) && (registrationCollege.getText().toString().isEmpty())
                && (registrationCity.getText().toString().isEmpty()) && (registrationPhoneNum.getText().toString().isEmpty())) {
            temp = false;
        } else {
            temp = true;
        }

        return temp;
    }

    private void initializeRecyclerViews(View view) {

        LinearLayout checkBoxLayout = (LinearLayout) view.findViewById(R.id.checkBoxContainerCultural);
        LayoutInflater inflater = (LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        for (int i = 0; i < tempCulturalEventList.length ; i++) {
            final int temp = i;
            inflater.inflate(R.layout.custom_row_events, checkBoxLayout, true);
            RelativeLayout coreRelativeTemp = (RelativeLayout) checkBoxLayout.getChildAt(i);
            final CheckBox checkbox = (CheckBox) coreRelativeTemp.findViewById(R.id.eventCheckBox);
            checkbox.setText(tempCulturalEventList[i]);
            checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    Log.d("anaadyanta", "" + isChecked + " " + temp + " " + checkbox.getText());
                    StaticClassCheckedValues.setCulturalEventsChecked(temp, isChecked);
                }
            });
        }

        LinearLayout checkBoxTechLayout = (LinearLayout) view.findViewById(R.id.checkBoxContainerTech);
        LayoutInflater tempInflater = (LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        for (int i = 0; i<tempTechnicalEventsList.length; i++) {
            final int temp = i;
            tempInflater.inflate(R.layout.custom_row_events, checkBoxTechLayout, true);
            RelativeLayout coreRelativeTemp = (RelativeLayout) checkBoxTechLayout.getChildAt(i);
            final CheckBox checkbox = (CheckBox) coreRelativeTemp.findViewById(R.id.eventCheckBox);
            checkbox.setText(tempTechnicalEventsList[i]);
            checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    Log.d("anaadyanta", "" + isChecked + " " + temp + " " + checkbox.getText());
                    StaticClassCheckedValues.setTechEventsChecked(temp, isChecked);
                }
            });
        }

    }

    @Override
    public void onResume() {
        super.onResume();

    }

    public class SubmitForm extends AsyncTask<String, String, String> {

        ProgressDialog dialog;
        String text = "";
        BufferedReader reader = null;
        AlertDialog.Builder alertDialog;
        AlertDialog alertD;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            alertDialog = new AlertDialog.Builder(getActivity());
            alertDialog.setMessage("Thank You for registering. We will get back to you as early as posible.");
            alertDialog.setNeutralButton("Okay", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    registrationName.setText("");
                    registrationTeam.setText("");
                    registrationNumOfParticipants.setText("");
                    registrationCollege.setText("");
                    registrationCity.setText("");
                    registrationPhoneNum.setText("");
                }
            });
            alertD = alertDialog.create();

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
                alertD.show();
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
            boolean[] tempTech = StaticClassCheckedValues.getTechEventsChecked();
                for (int j = 0; j < tempTech.length; j++) {
                    if (tempTech[j]) {
                        data += "&" + URLEncoder.encode("entry.808051161", "UTF-8") + "=" + URLEncoder.encode(tempTechnicalEventsList[j], "UTF-8");
                    }
                }


            return data;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }
}
