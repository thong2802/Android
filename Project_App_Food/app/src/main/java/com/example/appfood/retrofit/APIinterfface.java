package com.example.appfood.retrofit;

import com.example.appfood.model.FoodData;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIinterfface {
    @GET(value = "fooddata.json")
    Call<List<FoodData>>getAllData();

}
