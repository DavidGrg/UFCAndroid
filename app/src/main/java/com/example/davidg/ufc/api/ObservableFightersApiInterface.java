package com.example.davidg.ufc.api;


import com.example.davidg.ufc.Model.Events;
import com.example.davidg.ufc.Model.Fighters;
import com.example.davidg.ufc.Model.News;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by DavidG on 20/03/2018.
 */

public interface ObservableFightersApiInterface {

    @GET("api/v3/us/fighters")
    Observable <List<Fighters>> getFighters();






}
