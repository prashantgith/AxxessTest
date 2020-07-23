package com.prashant.axxesstest.app;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient
{

    public static final String BASE_URL = "https://api.imgur.com/3/gallery/search/";
    private static Retrofit retrofit = null;

    //returns retrofit object
    public static Retrofit getClient()
    {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }


}
