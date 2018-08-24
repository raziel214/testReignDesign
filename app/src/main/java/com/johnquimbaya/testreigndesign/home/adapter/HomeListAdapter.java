package com.johnquimbaya.testreigndesign.home.adapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.johnquimbaya.testreigndesign.R;
import com.johnquimbaya.testreigndesign.home.model.Hit;

import java.util.ArrayList;

/**
 * created by john fredy quimbaya on 23/08/18.
 *
 */
public class HomeListAdapter extends RecyclerView.Adapter<HomeListAdapter.MyViewHolder>{


    private ArrayList<Hit> hits;
    private int resource;
    private Activity activity;


    public HomeListAdapter(ArrayList<Hit> hits, int resource, Activity activity) {
        this.hits = hits;
        this.resource = resource;
        this.activity = activity;
    }

    @NonNull
    @Override
    public HomeListAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull HomeListAdapter.MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    static public class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView textViewTitle;
        private TextView textViewAuthor;
        private TextView textViewDate;


        public MyViewHolder(View itemView) {
            super(itemView);

            textViewTitle = itemView.findViewById(R.id.listTitle);
            textViewAuthor= itemView.findViewById(R.id.authorPost);
            textViewDate= itemView.findViewById(R.id.datePost);

        }
    }
}
