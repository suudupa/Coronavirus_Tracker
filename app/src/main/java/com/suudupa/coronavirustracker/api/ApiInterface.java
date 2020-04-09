package com.suudupa.coronavirustracker.api;

import com.suudupa.coronavirustracker.model.ArticleList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("everything")
    Call<ArticleList> getLatestArticles(

            @Query("q") String keywords,
            @Query("from") String from,
            @Query("sortBy") String sortBy,
            @Query("apiKey") String apiKey
    );
}