package com.example.mohit.productlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class Breads extends AppCompatActivity {
    Controller controller = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breads);
        ListView listViewNoodle = (ListView) findViewById(R.id.LvBreads);
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
        ModelProducts Veg65 = new ModelProducts("Tandoori Roti", " ", 10, 0,501);
        ModelProducts PaneerMbc = new ModelProducts("Butter Roti", "Veg Noodle with a twist of Schezwan", 20, 0,502);
        ModelProducts vegTripleNoodle = new ModelProducts("Pudina Parantha", "Veg. Triple Noodle", 35, 0,503);
        ModelProducts vegMunchurianNoodle = new ModelProducts("Laccha Parantha", "Veg Munchurian Noodle", 30, 0,504);
        ModelProducts PaneerNoodle = new ModelProducts("Naan", "Enjoy your Noodle with Paneer", 120, 0,505);
        ModelProducts EggNoodle = new ModelProducts("Paneer Tikka", "Noodle With eggs", 20, 0,506);
        ModelProducts chickenHakkaNoodle = new ModelProducts("Butter naan", "Delicious hakka noodle with chicken", 190, 0,507);
        ModelProducts chickenSchezwanNoodle = new ModelProducts("Garlic Naan", "Chicken Noodle with schezwan sauce", 35, 0,508);
        ModelProducts chickenTripleNoodle = new ModelProducts("Kulcha", "Chicken Triple Noodle", 20, 0,509);
        ModelProducts chickenManchurianNoodle = new ModelProducts("Paneer Parantha", "Chicken noodle with munchurian gravy", 40, 0,510);
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

