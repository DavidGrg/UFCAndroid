package com.example.davidg.ufc.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.davidg.ufc.Model.Fighters;
import com.example.davidg.ufc.R;
import com.squareup.picasso.Picasso;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by DavidG on 21/03/2018.
 */

public class FightersAdapter extends RecyclerView.Adapter<FightersAdapter.FightersHolder> {

    List<Fighters> fightersList = new LinkedList<>();


    @Override
    public FightersHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new FightersHolder( LayoutInflater.from( parent.getContext() ).inflate( R.layout.item_fighters, parent, false ) );

    }

    @Override
    public void onBindViewHolder(FightersHolder holder, int position) {

        holder.bind( fightersList.get( position ) );

    }

    @Override
    public int getItemCount() {
        return fightersList.size();
    }


    public void addFighters(List<Fighters> fighters) {

        fightersList.addAll( fighters );
        notifyDataSetChanged();
    }


    public void emptyFighters() {
        fightersList.clear();
        notifyDataSetChanged();
    }


    public class FightersHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView tvfirstName, tvLastName;
        ImageView imgFighter;
        private Fighters fighters;
        Context context;


        public FightersHolder(View itemView) {
            super( itemView );
            tvfirstName = itemView.findViewById( R.id.textviewFirstName );
            tvLastName = itemView.findViewById( R.id.textviewLastName );
            imgFighter = itemView.findViewById( R.id.imageFighter );
            itemView.setOnClickListener( this );
        }

        public void bind(Fighters fighters) {
            this.fighters = fighters;
            tvfirstName.setText( fighters.getFirstName() );
            tvLastName.setText( fighters.getLastName() );
            Picasso.with(this.imgFighter.getContext()).load(fighters.getThumbnail()).into(imgFighter);    //displays the image of each fighter next to their name.

        }

        @Override
        public void onClick(View v) {

            Intent intent = new Intent( Intent.ACTION_VIEW, Uri.parse( "http://ufc-data-api.ufc.com/api/v3/us/fighters/" + fighters.getId() ) );  // takes to selected fighter's details site using the unique id for each fighter.
            v.getContext().startActivity( intent );


        }
    }
}
