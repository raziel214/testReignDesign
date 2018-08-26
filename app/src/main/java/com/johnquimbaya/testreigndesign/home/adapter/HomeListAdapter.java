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
import com.johnquimbaya.testreigndesign.home.view.HomeListActivity;
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
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.lis_item_cardview,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeListAdapter.MyViewHolder holder, final int position) {

        Hit  hit= hits.get(position);
        String Date=hit.getCreated_at();//tr.subSequence(int Start , int End)
        holder.textViewDate.setText(Date.subSequence(0,10));

        if(hit.getStory_title()!=null && hit.getTitle()==null){
            holder.textViewTitle.setText("  "+hit.getStory_title());
        }
        if(hit.getTitle()!=null && hit.getStory_title()==null){
            holder.textViewTitle.setText("  "+hit.getTitle());
        }
        if(hit.getStory_title()!=null && hit.getTitle()!=null){
            holder.textViewTitle.setText("  "+hit.getStory_title());
        }
        holder.textViewAuthor.setText(hit.getAuthor());
        //holder.textViewTitle2.setText(hit.getTitle());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //homeListViewactivity

            }
        });

    }

    @Override
    public int getItemCount() {
        return hits.size();
    }

    static public class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView textViewTitle;
        private TextView textViewAuthor;
        private TextView textViewDate;
        //private TextView textViewTitle2;


        public MyViewHolder(View itemView) {


            super(itemView);

            textViewTitle = itemView.findViewById(R.id.titleservice);
            textViewAuthor= itemView.findViewById(R.id.authorPostservice);
            textViewDate= itemView.findViewById(R.id.datePostservice);
            //textViewTitle2= itemView.findViewById(R.id.storytitleservice);

        }
    }

    public void setList(List<Hit>hitList) {

        this.hits=  hitList;
        notifyDataSetChanged();


    }

}
