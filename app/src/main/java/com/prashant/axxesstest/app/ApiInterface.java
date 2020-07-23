package com.prashant.axxesstest.app;

import com.prashant.axxesstest.model.ApiResponse.Response;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface ApiInterface
{
    @GET("1/")
    Call<Response> getResponse(@Query("q") String shape,@Header("Authorization") String token);
}
