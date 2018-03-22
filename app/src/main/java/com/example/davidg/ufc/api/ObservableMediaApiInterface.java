package com.example.davidg.ufc.api;

import com.example.davidg.ufc.Model.Media;
import com.example.davidg.ufc.Model.News;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by DavidG on 22/03/2018.
 */

public interface ObservableMediaApiInterface {

    @GET("api/v3/us/media")
    Observable<List<Media>> getMedia();
}
