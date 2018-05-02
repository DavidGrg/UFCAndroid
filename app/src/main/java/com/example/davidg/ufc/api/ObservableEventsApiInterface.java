package com.example.davidg.ufc.api;

import com.example.davidg.ufc.Model.Events;
import com.example.davidg.ufc.Model.Media;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by DavidG on 20/03/2018.
 */

public interface ObservableEventsApiInterface {

    @GET("api/v3/us/events")
    Observable<List<Events>> getEvents();

    @GET("api/v3/us/media")
    Observable<List<Media>> getMedia();
}
