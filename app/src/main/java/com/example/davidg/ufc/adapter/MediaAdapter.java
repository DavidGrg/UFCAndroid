package com.example.davidg.ufc.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.davidg.ufc.Model.Media;
import com.example.davidg.ufc.R;
import com.squareup.picasso.Picasso;

import java.util.LinkedList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by DavidG on 22/03/2018.
 */

public class MediaAdapter extends RecyclerView.Adapter<MediaAdapter.MediaHolder> {

    private List<Media> mediaList = new LinkedList<>(  );



    @Override
    public MediaHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MediaHolder( LayoutInflater.from( parent.getContext() ).inflate( R.layout.item_media, parent, false ) );
    }

    @Override
    public void onBindViewHolder(MediaHolder holder, int position) {
        holder.bind(mediaList.get( position ));

    }

    @Override
    public int getItemCount() {
        return mediaList.size();
    }

    public void addMedia ( List<Media> media){
        mediaList.addAll( media );
        notifyDataSetChanged();
    }

    public void emptyMedia() {
        mediaList.clear();
        notifyDataSetChanged();
    }



    public class MediaHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private Media media;
        private TextView tvMediaTitle, tvDescription;
        private ImageView imgMedia;

        public MediaHolder(View itemView) {
            super( itemView );

            tvMediaTitle = itemView.findViewById( R.id.textviewmediaTitle );
            tvDescription = itemView.findViewById( R.id.textviewDescription );
            imgMedia = itemView.findViewById( R.id.imageMedia );
            itemView.setOnClickListener( this );


        }



        public void bind(Media media) {

            this.media = media;
            tvMediaTitle.setText( media.getTitle() );
            tvDescription.setText( media.getDescription() );
            Picasso.with(this.imgMedia.getContext()).load(media.getThumbnail()).into(imgMedia);

        }

        @Override
        public void onClick(View v) {

            System.out.println(media.getMediaDate());

        }
    }
}
