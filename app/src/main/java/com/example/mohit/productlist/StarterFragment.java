package com.example.mohit.productlist;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by princ on 25-11-2016.
 */

public class StarterFragment extends Fragment {


    Controller controller = null;
    View myView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.activity_appetizer,container,false);

        FloatingActionButton fab = (FloatingActionButton) getActivity().findViewById(R.id.fab);
        fab.setVisibility(View.VISIBLE);


        ListView listViewAppetizer = (ListView) myView.findViewById(R.id.LvAppetizer);
        controller = (Controller) getActivity().getApplicationContext();

        ArrayList<ModelProducts> AppetizerList = new ArrayList<>();
        ModelProducts Veg65 = new ModelProducts("Veg. 65", " ", 80, 0,201);
        ModelProducts PaneerMbc = new ModelProducts("Paneer Mushroom Babycorn Crispy", "Veg Noodle with a twist of Schezwan", 120, 0,202);
        ModelProducts vegTripleNoodle = new ModelProducts("Mushroom Garlic Chilli", "Veg. Triple Noodle", 100, 0,203);
        ModelProducts vegMunchurianNoodle = new ModelProducts("Mushroom Soyabean", "Veg Munchurian Noodle", 80,0,204);
        ModelProducts PaneerNoodle = new ModelProducts("Veg Munchurian", "Enjoy your Noodle with Paneer", 100, 0, 205);
        ModelProducts EggNoodle = new ModelProducts("Paneer Tikka", "Noodle With eggs", 80, 0,206);
        ModelProducts chickenHakkaNoodle = new ModelProducts("Chicken Tandoori", "Delicious hakka noodle with chicken", 90, 0, 207);
        ModelProducts chickenSchezwanNoodle = new ModelProducts("Chicken Tikka", "Chicken Noodle with schezwan sauce", 100, 0,208);
        ModelProducts chickenTripleNoodle = new ModelProducts("Murg Pudina kabab", "Chicken Triple Noodle", 110, 0,209);
        ModelProducts chickenManchurianNoodle = new ModelProducts("Chicken Lollipop", "Chicken noodle with munchurian gravy", 100, 0,210);
        AppetizerList.add( Veg65);
        AppetizerList.add( PaneerMbc);
        AppetizerList.add( vegTripleNoodle);
        AppetizerList.add( vegMunchurianNoodle);
        AppetizerList.add( PaneerNoodle);
        AppetizerList.add( EggNoodle);
        AppetizerList.add( chickenHakkaNoodle);
        AppetizerList.add( chickenManchurianNoodle);
        AppetizerList.add( chickenSchezwanNoodle);
        AppetizerList.add( chickenTripleNoodle);

        controller.addNoodlePs(AppetizerList);

        ListAdapterImagLess listAdapterImagLess = new ListAdapterImagLess(getActivity().getBaseContext(), R.layout.list_item_imageless, AppetizerList, controller);
        listViewAppetizer.setAdapter(listAdapterImagLess);


        return myView;
    }



  //n ftxg = fragmentManager.beginTransaction().replace( R.id.fragment, new MyFragment() ).addToBackStack( "tag" ).commit();







}
