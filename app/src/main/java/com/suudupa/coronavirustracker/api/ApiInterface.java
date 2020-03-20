package com.suudupa.coronavirustracker.api;

import com.suudupa.coronavirustracker.model.ArticleList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("top-headlines")

    Call<ArticleList> getTopHeadlines(
            @Query("q") String keyword,
            @Query("country") String country,
            @Query("sortBy") String sortBy,
            @Query("apiKey") String apiKey);

    //getEverything{}
}
