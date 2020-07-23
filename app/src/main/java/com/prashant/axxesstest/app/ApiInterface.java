package com.prashant.axxesstest.app;

import com.prashant.axxesstest.model.ApiResponse.Response;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface ApiInterface
{
    //Get data from search api
    @GET("1/")
    Call<Response> getResponse(@Query("q") String shape,@Header("Authorization") String token);
//    Observable<Response> getResponse(@Query("q") String shape, @Header("Authorization") String token);
}
