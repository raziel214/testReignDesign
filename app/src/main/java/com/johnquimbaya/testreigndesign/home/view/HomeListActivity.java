package com.johnquimbaya.testreigndesign.home.view;

/**
 * created by john fredy quimbaya on 24/08/18.
 *
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.johnquimbaya.testreigndesign.R;
import com.johnquimbaya.testreigndesign.home.model.Hit;

public class HomeListActivity extends AppCompatActivity implements  HomeListView{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void getDataPost() {

    }

    @Override
    public void showDataPost(Hit hit) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
