package com.example.mohit.productlist;

import android.graphics.drawable.Drawable;
import android.R.*;

public class ModelProducts {

    private String productName;
    private String productDesc;
    private int productPrice;
    private String imageLink;
    private int productQuantity;
    private int position;
    private int image;

    public ModelProducts(String productName, String productDesc, int productPrice, int productQuantity)
    {
        this.productName  = productName;
        this.productQuantity = productQuantity;
        this.productDesc  = productDesc;
        this.productPrice = productPrice;
        //this.imageLink    = imageLink;
        this.image = R.drawable.logo;

    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getProductName() {

        return productName;
    }

    public String getProductDesc() {

        return productDesc;
    }

    public int getProductPrice() {

        return productPrice;
    }


    public String getImageLink() {

        return imageLink;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }


    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }


}
