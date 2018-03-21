package com.example.davidg.ufc.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.support.v7.widget.RecyclerView.Adapter;
import android.util.EventLog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.davidg.ufc.Model.Events;
import com.example.davidg.ufc.R;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by DavidG on 21/03/2018.
 */

public class EventAdapter extends Adapter<EventAdapter.EventHolder> {


    private List<Events> eventsList = new LinkedList<>(  );

    @Override
    public EventHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new EventHolder( LayoutInflater.from( parent.getContext() ).inflate( R.layout.item_events, parent, false ) );
    }

    @Override
    public void onBindViewHolder(EventHolder holder, int position) {

        holder.bind( eventsList.get( position ) );

    }

    @Override
    public int getItemCount() {
        return eventsList.size();
    }

    public void addEvents(List<Events> events) {
        eventsList.addAll( events );
        notifyDataSetChanged();
    }

    public void emptyEvents() {
        eventsList.clear();
        notifyDataSetChanged();
    }





    public class EventHolder extends ViewHolder  implements View.OnClickListener{   /////// ViewHolder for Events

        private Events events;
        TextView tvLocation;

        public EventHolder(View itemView) {
            super( itemView );
            tvLocation = itemView.findViewById( R.id.textViewLocation);
            itemView.setOnClickListener( this );
        }

        public void bind(Events events) {
            this.events = events;
            tvLocation.setText( events.getLocation() );


        }

        @Override
        public void onClick(View v) {
            System.out.println(events.getArena());
        }
    }
}
