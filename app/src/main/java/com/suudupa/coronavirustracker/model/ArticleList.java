package com.suudupa.coronavirustracker.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ArticleList implements java.io.Serializable {

    @SerializedName("status")
    private String status;

    @SerializedName("totalResults")
    private int totalResults;

    @SerializedName("articles")
    private List<Article> articles;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int gettotalResults() {
        return totalResults;
    }

    public void settotalResults(int articleCount) {
        this.totalResults = articleCount;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
}