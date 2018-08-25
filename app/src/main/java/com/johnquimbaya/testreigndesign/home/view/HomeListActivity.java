package com.johnquimbaya.testreigndesign.home.view;

/**
 * created by john fredy quimbaya on 24/08/18.
 *
 */

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.johnquimbaya.testreigndesign.R;
import com.johnquimbaya.testreigndesign.apiClient.RestApiAdapter;
import com.johnquimbaya.testreigndesign.apiClient.Service;
import com.johnquimbaya.testreigndesign.home.adapter.HomeListAdapter;
import com.johnquimbaya.testreigndesign.home.model.Hit;
import com.johnquimbaya.testreigndesign.home.presenter.HomePresenter;
import com.johnquimbaya.testreigndesign.home.presenter.HomePresenterImpl;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;

public class HomeListActivity extends AppCompatActivity implements  HomeListView{
    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;
    HomeListAdapter recyclerViewAdapter;
    private HomePresenter homePresenter;
    List<Hit> hits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hits= new ArrayList<>();

        homePresenter=new HomePresenterImpl(this);

        recyclerView=(RecyclerView)findViewById(R.id.listaPost);
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerViewAdapter= new HomeListAdapter(hits, this);
        recyclerView.setAdapter(recyclerViewAdapter);

        getDataPost();








    }

    @Override
    public void getDataPost() {




        homePresenter.getDataPost();




    }

    @Override
    public void showDataPost(Hit hit) {



    }

    @Override
    public void showDataPostList(List<Hit> hitList) {
        recyclerViewAdapter.setList(hitList);

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
