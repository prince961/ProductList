package com.example.mohit.productlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class Appetizer extends AppCompatActivity {

    Controller controller = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appetizer);
        ListView listViewNoodle = (ListView) findViewById(R.id.LvAppetizer);
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
