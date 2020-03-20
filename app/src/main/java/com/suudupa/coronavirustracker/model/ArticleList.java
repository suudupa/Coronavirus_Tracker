package com.suudupa.coronavirustracker.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ArticleList {

    @SerializedName("status")
    private String status;

    @SerializedName("articleCount")
    private int articleCount;

    @SerializedName("articles")
    private List<Article> articles = null;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getArticleCount() {
        return articleCount;
    }

    public void setArticleCount(int articleCount) {
        this.articleCount = articleCount;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
}