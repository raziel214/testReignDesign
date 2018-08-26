package com.johnquimbaya.testreigndesign.home.view;

/**
 * created by john fredy quimbaya on 24/08/18.
 *
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.johnquimbaya.testreigndesign.R;
import com.johnquimbaya.testreigndesign.detailPost.activity_webview;
import com.johnquimbaya.testreigndesign.home.adapter.HomeListAdapter;
import com.johnquimbaya.testreigndesign.home.adapter.OnClickListenerV;
import com.johnquimbaya.testreigndesign.home.model.Hit;
import com.johnquimbaya.testreigndesign.home.presenter.HomePresenter;
import com.johnquimbaya.testreigndesign.home.presenter.HomePresenterImpl;

import java.util.ArrayList;
import java.util.List;

public class HomeListActivity extends AppCompatActivity implements  HomeListView {
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

        String Url;
        Url=hit.getStory_url();
        //Toast.makeText(this,"hollllllaaaaa"+Url, Toast.LENGTH_LONG).show();
            try {
                Intent i = new Intent(this, activity_webview.class);
                i.putExtra(activity_webview.urlPost,Url);
                startActivity(i);

            }catch (Exception e){

                Toast.makeText(this,"Url No disponible", Toast.LENGTH_LONG).show();

            }





    }

    @Override
    public void showDataPostList(List<Hit> hitList) {
        recyclerViewAdapter.setList(hitList);



    }

    @Override
    public void onItemClick(int item) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }


    /*@Override
    /**public void onItemClick(Hit hit) {
        String Url;

     /**   //Url= String.valueOf();
          Toast.makeText(this,"hollllllaaaaa", Toast.LENGTH_LONG).show();

           /* if(itemid2>=0){
               // Url= String.valueOf(hits.get(itemid2).getStory_url());
                Url=(hits.get(itemid2).getStory_url());
                //Url= ;
            }*/

          /*  try {
                Intent i = new Intent(this, activity_webview.class);
               // i.putExtra(activity_webview.urlPost,Url);
                startActivity(i);

            }catch (Exception e){

            }






    }*/
}
