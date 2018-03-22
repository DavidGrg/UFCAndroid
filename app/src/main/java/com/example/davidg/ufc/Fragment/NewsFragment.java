package com.example.davidg.ufc.Fragment;

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

import com.example.davidg.ufc.Model.News;
import com.example.davidg.ufc.R;
import com.example.davidg.ufc.adapter.NewsAdapter;
import com.example.davidg.ufc.api.ObservableNewsApiInterface;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class NewsFragment extends Fragment {

    private SwipeRefreshLayout strl;
    private RecyclerView recyclerView;
    private NewsAdapter newsAdapter;


    public static NewsFragment newInstance() {

        Bundle args = new Bundle();
        NewsFragment fragment = new NewsFragment();
        fragment.setArguments( args );
        return fragment;
    }


    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.activity_news_fragment, container, false );


        recyclerView = view.findViewById( R.id.rv_news );
        recyclerView.setAdapter( newsAdapter = new NewsAdapter() );
        recyclerView.setLayoutManager( new LinearLayoutManager( getActivity(), LinearLayoutManager.VERTICAL, false ) );


        strl = view.findViewById( R.id.swipeRefreshNews );
        strl.setOnRefreshListener( new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {

                newsAdapter.emptyNews();

                strl.postDelayed( new Runnable() {
                    @Override
                    public void run() {
                        createNews();
                    }
                }, 100L );

                dotheUpdate();
            }
        } );

        createNews();
        return view;
    }

    private void dotheUpdate() {

        strl.setRefreshing( false ); // disables the refresh
    }


    private void createNews() {


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl( "http://ufc-data-api.ufc.com/" )
                .addCallAdapterFactory( RxJava2CallAdapterFactory.create() )
                .addConverterFactory( GsonConverterFactory.create() )
                .build();

        ObservableNewsApiInterface newsApiInterface = retrofit.create( ObservableNewsApiInterface.class );
        newsApiInterface.getNews()
                .subscribeOn( Schedulers.io() )
                .observeOn( AndroidSchedulers.mainThread() )
                .subscribe( new Consumer<List<News>>() {
                    @Override
                    public void accept(List<News> newsList) throws Exception {

                        newsAdapter.addNews( newsList );
                        Toast.makeText( getActivity(), newsList.get( 0 ).getTitle(), Toast.LENGTH_SHORT ).show();
                        strl.setRefreshing( false );

                    }
                } );


    }
}
