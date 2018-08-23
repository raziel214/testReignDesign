package com.johnquimbaya.testreigndesign.apiClient;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.GET;
/**
 * created by john fredy quimbaya on 23/08/18.
 *
 */

public interface Service {

    @GET(Constants.URL_GET_DATA)
    Call<JsonObject>  getDataUser();
}
