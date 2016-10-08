package com.example.mohit.productlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Categories extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
    }

    public void noodle(View view) {
        Intent intent = new Intent(this, Noodle.class);
        startActivity(intent);
    }

    public void appetizers(View view) {
        Intent intent = new Intent(this, Appetizer.class);
        startActivity(intent);
    }

    public void nonVegMain(View view) {
        Intent intent = new Intent(this, NonVegMain.class);
        startActivity(intent);
    }

    public void vegMain(View view) {
        Intent intent = new Intent(this, VegMainActivity.class);
        startActivity(intent);
    }

    public void Breads(View view) {
        Intent intent = new Intent(this, Breads.class);
        startActivity(intent);
    }
}
