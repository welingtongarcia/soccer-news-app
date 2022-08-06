package com.example.soccernews.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> news;

    public NewsViewModel() {
        this.news = new MutableLiveData<>();
        List<News> news = new ArrayList<>();
        news.add(new News("Ferroviaria vence!!!"));
        news.add(new News("Ferroviarria joga no Sabado",""));
        news.add(new News("Copa do mundo Feminina está terminando",""));
        this.news.setValue(news);
    }

    public LiveData<List<News>> getNews() {
        return this.news;
    }
}