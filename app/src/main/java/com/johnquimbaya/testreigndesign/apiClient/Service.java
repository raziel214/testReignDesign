package com.johnquimbaya.testreigndesign.apiClient;


import com.google.gson.JsonObject;
import com.johnquimbaya.testreigndesign.home.model.Hit;
import com.johnquimbaya.testreigndesign.home.model.RootObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
/**
 * created by john fredy quimbaya on 23/08/18.
 *
 */

public interface Service {

    @GET(Constants.URL_GET_DATA)
    Call<RootObject> getDataPost();

   /* @GET(Constants.URL_GET_DATA)
    Call<Hit> getDataUser2();*/
}
