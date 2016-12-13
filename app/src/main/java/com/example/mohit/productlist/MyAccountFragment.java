package com.example.mohit.productlist;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by princ on 11-12-2016.
 */

public class MyAccountFragment extends Fragment  {

    View myView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.my_account_layout,container,false);
        //FragmentManager fragmentManager = getFragmentManager();

        FloatingActionButton fab = (FloatingActionButton) getActivity().findViewById(R.id.fab);
        fab.setVisibility(View.INVISIBLE);




        UserLocalStore userLocalStore = new UserLocalStore(getActivity().getBaseContext());
        userLocalStore.ClearUserData();

        User user = userLocalStore.GetLoggedinUser();
        Button logoutButton = (Button) myView.findViewById(R.id.logoutButton);
        TextView name = (TextView) myView.findViewById(R.id.TvName);
        name.setText(user.getUsername());
        //Button button = new Button()
        logoutButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.content_Frame, new NoodleFragment()).addToBackStack(null).commit();
                UserLocalStore userLocalStore = new UserLocalStore(getActivity().getBaseContext());
                userLocalStore.ClearUserData();




            }
        });
        return myView;
    }

}
