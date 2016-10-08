package com.example.mohit.productlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class VegMainActivity extends AppCompatActivity {
    Controller controller = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veg_main);
        ListView listViewNoodle = (ListView) findViewById(R.id.LvVeg);
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
        ModelProducts Veg65 = new ModelProducts("Veg 65", " ", 180, 0);
        ModelProducts PaneerMbc = new ModelProducts("Paneer Mushroom Babycorn Crispy", "Veg Noodle with a twist of Schezwan", 120, 0);
        ModelProducts vegTripleNoodle = new ModelProducts("Mushroom Garlic Chilli", "Veg. Triple Noodle", 130, 0);
        ModelProducts vegMunchurianNoodle = new ModelProducts("Mushroom Soyabean", "Veg Munchurian Noodle", 180, 0);
        ModelProducts PaneerNoodle = new ModelProducts("Veg Munchurian", "Enjoy your Noodle with Paneer", 120, 0);
        ModelProducts EggNoodle = new ModelProducts("Paneer Tikka", "Noodle With eggs", 180, 0);
        ModelProducts chickenHakkaNoodle = new ModelProducts("Paneer Butterr Masala", "Delicious hakka noodle with chicken", 190, 0);
        ModelProducts chickenSchezwanNoodle = new ModelProducts("Paneer Angare", "Chicken Noodle with schezwan sauce", 150, 0);
        ModelProducts chickenTripleNoodle = new ModelProducts("Paneer Kadai", "Chicken Triple Noodle", 110, 0);
        ModelProducts chickenManchurianNoodle = new ModelProducts("Shahi Paneer", "Chicken noodle with munchurian gravy", 140, 0);
        noodleProducts.add(0, Veg65);
        noodleProducts.add(1, PaneerMbc);
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

