package com.example.mohit.productlist;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_activity2);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.mapFragmen2t);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng Kwality56 = new LatLng(28.425350, 77.099155);
        LatLng Kwality14 = new LatLng(28.472983,77.048283);
        LatLng MidPoint = new LatLng(28.453192,77.07508477);
        //LatLngBounds latLngBounds = new LatLngBounds(Kwality14,Kwality56);
        mMap.addMarker(new MarkerOptions().position(Kwality56).title("Kwality, Sector 56 Gurugram").icon(BitmapDescriptorFactory.fromResource(R.drawable.secfiftysix_small)));
        mMap.addMarker(new MarkerOptions().position(Kwality14).title("Kwality, Sector 14 Gurugram").icon(BitmapDescriptorFactory.fromResource(R.drawable.secfourteen_small)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(MidPoint));
        mMap.animateCamera( CameraUpdateFactory.zoomTo( 12.50f ) );

    }
}
