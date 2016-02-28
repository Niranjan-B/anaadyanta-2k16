package org.anaadyanta.anaadyanta2k16.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.anaadyanta.anaadyanta2k16.Model.NewsFeedModel;
import org.anaadyanta.anaadyanta2k16.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NIRANJAN on 29-01-2016.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.CardViewHolder> {

    Context context;
    List<NewsFeedModel> newsItems;

    public RecyclerViewAdapter (Context context) {
        this.context = context;
        newsItems = new ArrayList<NewsFeedModel>();
    }

    public void addData (List<NewsFeedModel> newsItems) {
        this.newsItems = newsItems;
        notifyDataSetChanged();
        Log.d("newz","data set changed");
    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.news_feed_row, parent, false);
        CardViewHolder tempCardViewHolder = new CardViewHolder(view);
        return tempCardViewHolder;
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {
        holder.messageHolder.setText(newsItems.get(position).getMessage());
        Picasso.with(context).load(newsItems.get(position).getImg_url()).fit().into(holder.imageViewHolder);
    }

    @Override
    public int getItemCount() {
        return newsItems.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {

        ImageView imageViewHolder;
        TextView messageHolder;

        public CardViewHolder(View itemView) {
            super(itemView);

            imageViewHolder = (ImageView) itemView.findViewById(R.id.imageView);
            messageHolder = (TextView) itemView.findViewById(R.id.textView2);

        }
    }

}
