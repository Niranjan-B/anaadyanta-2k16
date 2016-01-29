package org.anaadyanta.anaadyanta2k16.fragments;


import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import org.anaadyanta.anaadyanta2k16.Model.NewsFeedModel;
import org.anaadyanta.anaadyanta2k16.R;
import org.anaadyanta.anaadyanta2k16.adapters.RecyclerViewAdapter;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class NewsFeedFragment extends Fragment {

    RecyclerView newsFeedRecyclerContainer;
    RecyclerViewAdapter newsFeedRecyclerAdapter;
    List<NewsFeedModel> feed;
    ProgressBar progressBar;

    public NewsFeedFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view  = inflater.inflate(R.layout.fragment_news_feed,container, false);
        feed = new ArrayList<NewsFeedModel>();
        newsFeedRecyclerAdapter = new RecyclerViewAdapter(getActivity());
        progressBar = (ProgressBar) view.findViewById(R.id.news_feed_progress_bar);
        newsFeedRecyclerContainer = (RecyclerView) view.findViewById(R.id.news_feed_container);
        newsFeedRecyclerContainer.setLayoutManager(new LinearLayoutManager(getActivity()));
        newsFeedRecyclerContainer.setAdapter(newsFeedRecyclerAdapter); // empty adapter at this point
        return view;

    }

    @Override
    public void onResume() {
        super.onResume();
        new newsFeedNetworkCall().execute();
    }

    class newsFeedNetworkCall extends AsyncTask <Void,List<NewsFeedModel>,List<NewsFeedModel>> {

        String result = null;

        @Override
        protected void onPreExecute() {
            if (progressBar.getVisibility() == View.INVISIBLE) {
                progressBar.setVisibility(View.VISIBLE);
            }
        }

        @Override
        protected List<NewsFeedModel> doInBackground(Void... params) {

            URL endPoint;

            try {
                endPoint = new URL(getResources().getString(R.string.news_feed_end_point));

                HttpURLConnection endPointConnection = (HttpURLConnection) endPoint.openConnection();
                endPointConnection.setRequestMethod("GET");
                endPointConnection.setConnectTimeout(15000);
                endPointConnection.setReadTimeout(15000);

                int responseCode = endPointConnection.getResponseCode();
                Log.d("newz",""+responseCode);

                if (responseCode == 200) {
                    BufferedReader inputStream = new BufferedReader(new InputStreamReader(endPointConnection.getInputStream()));
                    String tempLine = null;
                    StringBuffer response = new StringBuffer();

                    while ((tempLine = inputStream.readLine()) != null) {
                        response.append(tempLine);
                    }
                    inputStream.close();
                    result = response.toString();
                    Log.d("newz",""+result);
                    feed = parseJson(result);
                } else {
                }

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }catch (Exception e) {
                e.printStackTrace();
            }

            return feed;
        }

        @Override
        protected void onPostExecute(List<NewsFeedModel> modelNewsFeed) {

            // TODO - add snackbars here in case of error!

            if (progressBar.getVisibility() == View.VISIBLE) {
                progressBar.setVisibility(View.INVISIBLE);
            }

            Log.d("newz","calling add data method");
            newsFeedRecyclerAdapter.addData(modelNewsFeed);

        }
    }


    /**
     * method to parse json
     * @param result will return json and add to list i.e. List<NewsFeedModel>
     */
    private List<NewsFeedModel> parseJson(String result) {

        List<NewsFeedModel> model = new ArrayList<>();

        try {
            JSONObject coreObject = new JSONObject(result);

            String status = coreObject.getString("status");
            if (status.contains("true")) {
                JSONArray array = coreObject.getJSONArray("list_of_items");

                for (int i = 0 ; i<array.length() ; i++) {
                    NewsFeedModel currentModel = new NewsFeedModel();
                    JSONObject presentObj = array.getJSONObject(i);
                    currentModel.setTitle(presentObj.getString("title"));
                    currentModel.setMessage(presentObj.getString("msg"));
                    currentModel.setImg_url(presentObj.getString("img_path"));
                    model.add(currentModel);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return model;
    }
}
