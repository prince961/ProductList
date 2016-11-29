package com.example.mohit.productlist;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by princ on 25-11-2016.
 */

public class NoodleFragment extends Fragment {

    Controller controller = null;
    View myView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.activity_noodle,container,false);

        ListView listViewNoodle = (ListView) myView.findViewById(R.id.LvNoodle);
        controller = (Controller) getActivity().getApplicationContext();

        ArrayList<ModelProducts> noodleProducts = new ArrayList<>();
        ModelProducts vegNoodle = new ModelProducts("Veg. Noodle", "Vegetarian Noodles", 80, 0);
        ModelProducts vegShezwanNoodle = new ModelProducts("Veg Schezwan Noodle", "Veg Noodle with a twist of Schezwan", 90, 0);
        ModelProducts vegTripleNoodle = new ModelProducts("Veg. Triple Noodle", "Veg. Triple Noodle", 100, 0);
        ModelProducts vegMunchurianNoodle = new ModelProducts("Veg Munchurian Noodle", "Veg Munchurian Noodle", 90, 0);
        ModelProducts PaneerNoodle = new ModelProducts("Paneer Noodle", "Enjoy your Noodle with Paneer", 100, 0);
        ModelProducts EggNoodle = new ModelProducts("Egg Noodle", "Noodle With eggs", 80, 0);
        ModelProducts chickenHakkaNoodle = new ModelProducts("Chicken Hakka Noodle", "Delicious hakka noodle with chicken", 90, 0);
        ModelProducts chickenSchezwanNoodle = new ModelProducts("Chicken Schezwan Noodle", "Chicken Noodle with schezwan sauce", 100, 0);
        ModelProducts chickenTripleNoodle = new ModelProducts("Chicken Triple Noodle", "Chicken Triple Noodle", 110, 0);
        ModelProducts chickenManchurianNoodle = new ModelProducts("Chicken Munchurian Noodle", "Chicken noodle with munchurian gravy", 100, 0);
        noodleProducts.add(0, vegNoodle);
        noodleProducts.add(1, vegShezwanNoodle);
        noodleProducts.add(2, vegTripleNoodle);
        noodleProducts.add(3, vegMunchurianNoodle);
        noodleProducts.add(4, PaneerNoodle);
        noodleProducts.add(5, EggNoodle);
        noodleProducts.add(6, chickenHakkaNoodle);
        noodleProducts.add(7, chickenManchurianNoodle);
        noodleProducts.add(8, chickenSchezwanNoodle);
        noodleProducts.add(9, chickenTripleNoodle);


        controller.addNoodlePs(noodleProducts);

        ListAdapterImagLess listAdapterImagLess = new ListAdapterImagLess(getActivity().getBaseContext(), R.layout.list_item_imageless, noodleProducts, controller);
        listViewNoodle.setAdapter(listAdapterImagLess);


        return myView;
    }

  //n ftxg = fragmentManager.beginTransaction().replace( R.id.fragment, new MyFragment() ).addToBackStack( "tag" ).commit();







}
