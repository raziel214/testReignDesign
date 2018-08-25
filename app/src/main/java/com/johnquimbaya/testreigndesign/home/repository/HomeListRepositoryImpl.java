package com.johnquimbaya.testreigndesign.home.repository;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.johnquimbaya.testreigndesign.apiClient.RestApiAdapter;
import com.johnquimbaya.testreigndesign.apiClient.Service;
import com.johnquimbaya.testreigndesign.home.model.Hit;
import com.johnquimbaya.testreigndesign.home.model.RootObject;
import com.johnquimbaya.testreigndesign.home.presenter.HomePresenter;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * created by john fredy quimbaya on 24/08/18.
 *
 */

public class HomeListRepositoryImpl implements HomeListRepository {

    private HomePresenter homePresenter;


    public HomeListRepositoryImpl(HomePresenter homePresenter) {
        this.homePresenter = homePresenter;
    }

    @Override
    public void getDataPost() {

        RestApiAdapter restApiAdapter = new RestApiAdapter();
        Service service= restApiAdapter.getClientService();
        Call<RootObject> call=service.getDataPost();
        call.enqueue(new Callback<RootObject>() {

            @Override
            public void onResponse(Call<RootObject> call, Response<RootObject> response) {

                List<Hit>hits= response.body().getHits();
                //List<Hit> hits = new Gson().fromJson(response.body().get("hits"), ArrayList.class);
                homePresenter.showDataPostList(hits);

            }

            @Override
            public void onFailure(Call<RootObject> call, Throwable t) {


            }
        });


    }
}
