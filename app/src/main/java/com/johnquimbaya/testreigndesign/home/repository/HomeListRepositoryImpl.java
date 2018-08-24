package com.johnquimbaya.testreigndesign.home.repository;

import com.google.gson.JsonObject;
import com.johnquimbaya.testreigndesign.apiClient.RestApiAdapter;
import com.johnquimbaya.testreigndesign.apiClient.Service;
import com.johnquimbaya.testreigndesign.home.model.Hit;
import com.johnquimbaya.testreigndesign.home.presenter.HomePresenter;

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
        Call<JsonObject> call=service.getDataPost();
        call.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                JsonObject  homeObject =response.body().getAsJsonObject("hits");
                Hit  hit= new Hit(
                        homeObject.get("title"),
                        homeObject.get("url"),
                        homeObject.get("author"),
                        homeObject.get("points"),
                        homeObject.get("story_text"),
                        homeObject.get("comment_text"),
                        homeObject.get("num_comments"),
                        homeObject.get("story_id"),
                        homeObject.get("story_title"),
                        homeObject.get("story_url"),
                        homeObject.get("parent_id"),
                        homeObject.get("created_at_i"),
                        homeObject.get("objectID"),
                        homeObject.get("_highlightResult")

                );
                homePresenter.showDataPost(hit);
            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {

            }
        });


    }
}
