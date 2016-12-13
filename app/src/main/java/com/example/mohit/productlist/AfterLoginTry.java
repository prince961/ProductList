package com.example.mohit.productlist;

import android.Manifest;
import android.app.FragmentManager;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import static java.security.AccessController.getContext;

public class AfterLoginTry extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_login_try);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        fragmentManager.beginTransaction().replace(R.id.content_Frame, new CategoriesFragmenent2()).commit();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setVisibility(View.VISIBLE);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              int count =  fragmentManager.getBackStackEntryCount();
                Toast.makeText(getBaseContext(),Integer.toString(count),
                        Toast.LENGTH_SHORT).show();
                fragmentManager.beginTransaction().replace(R.id.content_Frame, new CartFragment()).addToBackStack(null).commit();
                //Snackbar.make(view, "Your have no items in your cart", Snackbar.LENGTH_LONG)
                     //   .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

   /* public void onBackPressed() {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        startActivity(intent);
    } */

    @Override
    public void onBackPressed() {
        if (getFragmentManager().getBackStackEntryCount() == 0) {
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            startActivity(intent);
        }
        else {
            getFragmentManager().popBackStack();
        }
    }

/*
    CallFragment call_fragment = (CallFragment) getFragmentManager().findFragmentById(R.id.callFragment);
    @Override
    public void onBackPressed() {
        if (call_fragment != null && call_fragment.isVisible()) {
            int count =  fragmentManager.getBackStackEntryCount();
            Toast.makeText(getBaseContext(),Integer.toString(count),
                    Toast.LENGTH_SHORT).show();
        } else {
            getFragmentManager().popBackStack();
        }
    } */




    /*m
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.after_login_try, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    */



    FragmentManager fragmentManager = getFragmentManager();
    public void noodle(View view){
        fragmentManager.beginTransaction().replace(R.id.content_Frame, new CallFragment(),"CALL_FRAGMENT").commit();
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        //FragmentManager fragmentManager = getFragmentManager();
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_cart) {
            fragmentManager.beginTransaction().replace(R.id.content_Frame, new CartFragment(),"CART_FRAGMENT").addToBackStack(null).commit();
        } else if (id == R.id.nav_call) {
            fragmentManager.beginTransaction().replace(R.id.content_Frame, new CallFragment()).commit();
            //fragmentManager.beginTransaction().replace(R.id.content_Frame,new callFra()).commit();


        } else if (id == R.id.nav_menu) {
            fragmentManager.beginTransaction().replace(R.id.content_Frame, new CategoriesFragmenent2()).addToBackStack("menu item").commit();

            //Intent intent = new Intent(this, CategoriesFragmenent2.class);
            //startActivity(intent);

        } else if (id == R.id.contact_us) {
            Intent mapIntent = new Intent(this, MapsActivity.class);
            startActivity(mapIntent);

        }

        else if (id == R.id.nav_User) {
            fragmentManager.beginTransaction().replace(R.id.content_Frame, new MyAccountFragment()).addToBackStack("NAV USER").commit();

        }

        else if (id == R.id.nav_Logout) {
            UserLocalStore userLocalStore = new UserLocalStore(this);
            userLocalStore.ClearUserData();
            userLocalStore.SetUserLoggedIn(false);
            Intent intent = new Intent(this,Login.class);
            startActivity(intent);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


}
