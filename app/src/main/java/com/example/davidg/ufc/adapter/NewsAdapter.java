package com.example.davidg.ufc.adapter;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.davidg.ufc.Model.News;
import com.example.davidg.ufc.R;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by DavidG on 21/03/2018.
 */

public class NewsAdapter extends Adapter<NewsAdapter.NewsHolder> {

    private List<News> newsList = new LinkedList<>();


    @Override
    public NewsHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new NewsHolder( LayoutInflater.from( parent.getContext() ).inflate( R.layout.item_news, parent, false ) );

    }

    @Override
    public void onBindViewHolder(NewsHolder holder, int position) {
        holder.bind( newsList.get( position ) );

    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }


    public void addNews(List<News> news) {
        newsList.addAll( news );
        notifyDataSetChanged();

    }


    public void emptyNews() {
        newsList.clear();
        notifyDataSetChanged();
    }


    public class NewsHolder extends ViewHolder implements View.OnClickListener { /////// ViewHolder for News

        TextView tvAuthor, tvTitle;

        private News news;

        public NewsHolder(View itemView) {
            super( itemView );
            tvTitle = itemView.findViewById( R.id.textviewTitle );
            tvAuthor = itemView.findViewById( R.id.textviewAuthor );

            itemView.setOnClickListener( this );

        }

        public void bind(News news) {
            this.news = news;
            tvTitle.setText( news.getTitle() );
            tvAuthor.setText( news.getAuthor() );

        }

        @Override
        public void onClick(View v) {


        }
    }
}
