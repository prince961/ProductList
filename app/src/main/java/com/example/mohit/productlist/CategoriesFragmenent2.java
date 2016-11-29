package com.example.mohit.productlist;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by princ on 24-11-2016.
 */

public class CategoriesFragmenent2 extends Fragment {
    View myView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.categories_fragment_layout,container,false);
        //FragmentManager fragmentManager = getFragmentManager();

        ImageView noodleImage = (ImageView) myView.findViewById(R.id.noodleImage);
        //Button button = new Button()
        noodleImage.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.content_Frame, new NoodleFragment()).addToBackStack("CatFragment").commit();



            }
        });
        return myView;
    }
}
