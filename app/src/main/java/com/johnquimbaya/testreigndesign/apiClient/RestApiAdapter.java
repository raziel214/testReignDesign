package com.johnquimbaya.testreigndesign.apiClient;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
/**
 * created by john fredy quimbaya on 23/08/18.
 *
 */
public class RestApiAdapter {

    public Service getClientService(){
        Retrofit retrofit= new Retrofit.Builder().
                baseUrl(Constants.ROOT_URL).
                addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(Service.class);

    }
}
