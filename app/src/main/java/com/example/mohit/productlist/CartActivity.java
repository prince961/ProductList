package com.example.mohit.productlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class CartActivity extends AppCompatActivity {

    Controller aController ;
    //ArrayList<ModelProducts> cartProductList = aController.getCart().getCartProducts();
    ListView cListView;
    TextView totalPrice ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        aController = (Controller) getApplicationContext();
        cListView  = (ListView) findViewById(R.id.cartLv);
        totalPrice = (TextView) findViewById(R.id.totalAmount);
        ArrayList<ModelProducts> cartProductList = aController.getCart().getCartProducts();
        final CartListAdapter cartListAdapter = new CartListAdapter(this,R.layout.cart_item,cartProductList,aController,totalPrice);
        cListView.setAdapter(cartListAdapter);


        inflateTotalAmount(cartProductList);
    }

    private void inflateTotalAmount(ArrayList<ModelProducts> productList) {
        //ArrayList<Double> priceList = new ArrayList<Double>();
        Double totalAmount = 0.0;
        int numberProducts = productList.size();
        for (int i = 0; i < numberProducts; i++){
            int pQuantity =   productList.get(i).getProductQuantity();
            int pPrice = productList.get(i).getProductPrice();
            double pAmountI = pPrice*pQuantity;
            //priceList.add(pAmountI);
            totalAmount = totalAmount + pAmountI;
        }
        totalPrice.setText(Double.toString(totalAmount));
    }
    }
