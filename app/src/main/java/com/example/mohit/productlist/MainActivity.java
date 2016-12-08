package com.example.mohit.productlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) findViewById(R.id.productListViewA);

        ArrayList<ModelProducts> allProducts = new ArrayList<>();
        //allProducts.add(new ModelProducts("chicken",""));
        for(int i=1;i<=20;i++) {
            int price = 10 + i;
            // Create product model class object
           ModelProducts productObject = new ModelProducts( "Product"+i,"des"+i,i,0,i);

            //store product object to arraylist in controller
            allProducts.add(productObject);

        }

        AdapterTry adapterTry = new AdapterTry(getBaseContext(),R.layout.list_item,allProducts);
        listView.setAdapter(adapterTry);
    }

    //public ArrayList<ModelProducts> allProducts = new ArrayList<>();

}
