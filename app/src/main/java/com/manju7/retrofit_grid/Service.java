package com.manju7.retrofit_grid;

import com.google.gson.JsonArray;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Service {

    @GET("/bins/kdbps")
    Call<JsonArray> readItemsArray();
}
