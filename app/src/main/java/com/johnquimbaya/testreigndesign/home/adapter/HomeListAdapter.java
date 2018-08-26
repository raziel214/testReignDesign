package com.johnquimbaya.testreigndesign.home.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import com.johnquimbaya.testreigndesign.R;
import com.johnquimbaya.testreigndesign.detailPost.activity_webview;
import com.johnquimbaya.testreigndesign.home.model.Hit;
import com.johnquimbaya.testreigndesign.home.view.HomeListActivity;
import com.johnquimbaya.testreigndesign.home.view.HomeListView;

import java.util.ArrayList;
import java.util.List;

import static android.support.constraint.Constraints.TAG;

/**
 * created by john fredy quimbaya on 23/08/18.
 *
 */
public class HomeListAdapter extends RecyclerView.Adapter<HomeListAdapter.MyViewHolder>{


    private List<Hit> hits;
    private HomeListView homeListViewactivity;
    private OnClickListenerV onClickListenerV;

    /*public HomeListAdapter(List<Hit> hits, HomeListView homeListViewactivity, OnClickListenerV onClickListenerV) {
        this.hits = hits;
        this.homeListViewactivity = homeListViewactivity;
        this.onClickListenerV = onClickListenerV;
    }*/



    public HomeListAdapter(List<Hit> hits, HomeListView homeListViewactivity) {
        this.hits = hits;
        this.homeListViewactivity = homeListViewactivity;

    }




    @NonNull
    @Override
    public HomeListAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).
                inflate(R.layout.lis_item_cardview,parent,false);

        MyViewHolder myViewHolder=new MyViewHolder(view);
        //view.setOnClickListener((View.OnClickListener) parent.getContext());

               return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull HomeListAdapter.MyViewHolder holder, final int position) {

        final Hit  hit= hits.get(position);
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

        if (hits.get(position)!=null){

            holder.imageViewCard.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //homeListViewactivity
                    String a= String.valueOf(hits.size());

                    if (a!=null){
                        String hit1= hit.getStory_url();

                        
                        homeListViewactivity.showDataPost(hit);

                    }




                }
            });
        }

    }

    @Override
    public int getItemCount() {
        return hits.size();
    }

    static public class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView textViewTitle;
        private TextView textViewAuthor;
        private TextView textViewDate;
        private ImageView imageViewCard;
        //private TextView textViewTitle2;


        public MyViewHolder(View itemView) {


            super(itemView);

            textViewTitle = itemView.findViewById(R.id.titleservice);
            textViewAuthor= itemView.findViewById(R.id.authorPostservice);
            textViewDate= itemView.findViewById(R.id.datePostservice);
            imageViewCard=itemView.findViewById(R.id.pictureCard);
            //textViewTitle2= itemView.findViewById(R.id.storytitleservice);

        }
    }

    public void setList(List<Hit>hitList) {

        this.hits=  hitList;
        notifyDataSetChanged();


    }

}
