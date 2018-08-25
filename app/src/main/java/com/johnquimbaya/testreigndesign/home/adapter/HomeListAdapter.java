package com.johnquimbaya.testreigndesign.home.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.johnquimbaya.testreigndesign.R;
import com.johnquimbaya.testreigndesign.home.model.Hit;
import com.johnquimbaya.testreigndesign.home.view.HomeListView;

import java.util.ArrayList;
import java.util.List;

/**
 * created by john fredy quimbaya on 23/08/18.
 *
 */
public class HomeListAdapter extends RecyclerView.Adapter<HomeListAdapter.MyViewHolder>{


    private List<Hit> hits;
    private HomeListView homeListViewactivity;


    public HomeListAdapter(List<Hit> hits,  HomeListView homeListViewactivity) {
        this.hits = hits;
        this.homeListViewactivity = homeListViewactivity;
    }



    @NonNull
    @Override
    public HomeListAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeListAdapter.MyViewHolder holder, int position) {

        Hit  hit= hits.get(position);
        holder.textViewDate.setText(hit.getCreated_at());
        holder.textViewTitle.setText(hit.getStory_title());
        holder.textViewAuthor.setText(hit.getAuthor());

    }

    @Override
    public int getItemCount() {
        return hits.size();
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

    public void setList(List<Hit>hitList) {

        this.hits=  hitList;
        notifyDataSetChanged();


    }

}
