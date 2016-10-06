package com.example.mohit.productlist;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mohit on 10/5/2016.
 */

public class Controller extends Application {

    private ArrayList<ModelProducts> myProducts = new ArrayList<ModelProducts>();
    private ArrayList<ModelProducts> noodleProducts = new ArrayList<ModelProducts>();

    private  ModelCart myCart = new ModelCart();


    public ModelProducts getNoodleP(int pPosition) {

        return noodleProducts.get(pPosition);
    }

    public void addNoodlePs(List<ModelProducts> productList){
        noodleProducts.addAll(productList);
    }

    public void setProducts(ModelProducts Products) {

        myProducts.add(Products);

    }

    public ModelCart getCart() {

        return myCart;

    }

    public int getProductsArraylistSize() {

        return myProducts.size();
    }


}