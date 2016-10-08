package com.example.mohit.productlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class Noodle extends AppCompatActivity {

    Controller controller = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noodle);
        ListView listViewNoodle = (ListView) findViewById(R.id.LvNoodle);
        controller = (Controller) getApplicationContext();

       /* FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

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

        ListAdapterImagLess listAdapterImagLess = new ListAdapterImagLess(getBaseContext(), R.layout.list_item_imageless, noodleProducts, controller);
        listViewNoodle.setAdapter(listAdapterImagLess);

    }



    public void goToCart(View view) {
        Intent intent = new Intent(this, CartActivity.class);
        startActivity(intent);
    }
}
