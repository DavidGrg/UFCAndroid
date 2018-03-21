package com.example.davidg.ufc;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.davidg.ufc.Model.Fighters;
import com.example.davidg.ufc.Model.News;
import com.example.davidg.ufc.adapter.FightersAdapter;
import com.example.davidg.ufc.api.ObservableFightersApiInterface;
import com.example.davidg.ufc.api.ObservableNewsApiInterface;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by DavidG on 21/03/2018.
 */

public class FightersFragment extends Fragment {

    private SwipeRefreshLayout strl;
    private RecyclerView recyclerView;
    private FightersAdapter fightersAdapter;

    public static FightersFragment newInstance() {
        Bundle args = new Bundle();
        FightersFragment fragment = new FightersFragment();
        fragment.setArguments( args );
        return fragment;

    }

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.activity_fighters_fragment, container, false );


        recyclerView = view.findViewById( R.id.rv_fighters );
        recyclerView.setAdapter( fightersAdapter = new FightersAdapter() );
        recyclerView.setLayoutManager( new LinearLayoutManager( getActivity(), LinearLayoutManager.VERTICAL, false ) );

        strl = view.findViewById( R.id.swipeRefresfighters );
        strl.setOnRefreshListener( new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {

                fightersAdapter.emptyFighters();

                strl.postDelayed( new Runnable() {
                    @Override
                    public void run() {
                        createFighter();
                    }
                }, 100L );

                dotheUpdate();
            }
        } );


        return view;


    }

    private void dotheUpdate() {

        strl.setRefreshing( false );
    }


    private void createFighter() {


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl( "http://ufc-data-api.ufc.com/" )
                .addCallAdapterFactory( RxJava2CallAdapterFactory.create() )
                .addConverterFactory( GsonConverterFactory.create() )
                .build();

        final ObservableFightersApiInterface fightersApiInterface = retrofit.create( ObservableFightersApiInterface.class );
        fightersApiInterface.getFighters()
                .subscribeOn( Schedulers.io() )
                .observeOn( AndroidSchedulers.mainThread() )
                .subscribe( new Consumer<List<Fighters>>() {
                    @Override
                    public void accept(List<Fighters> fighters) throws Exception {
                        fightersAdapter.addFighters( fighters );
                        Toast.makeText( getActivity(), fighters.get( 0 ).getFighterStatus(), Toast.LENGTH_SHORT ).show();
                        strl.setRefreshing( false );

                    }
                } );


    }


}
