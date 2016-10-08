package com.example.mohit.productlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AfterCart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_cart);
    }

    public void goToCategories(View view) {
        Intent intent = new Intent(this, Categories.class);
        startActivity(intent);
    }
}
