package com.example.davidg.ufc.Fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.davidg.ufc.R;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;

/**
 * Created by DavidG on 22/03/2018.
 */

public class MapViewFragment extends Fragment implements OnMapReadyCallback {

    private GoogleMap mMap;


    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.fragment_map_view, container, false );

        SupportMapFragment mapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById( R.id.map );

        mapFragment.getMapAsync( this );   //calls the onMapReady method which helps on  setting up the google Map.


        return view;


    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        mMap = googleMap;              // Displays the google map
    }
}
