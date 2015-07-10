package com.syracuse.android.foodfeast;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.facebook.CallbackManager;
import com.syracuse.eecs.sandesh.foodfeast.R;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {


    static CallbackManager callbackManager;
    private static final String ARG_OPTION = "argument_option";
    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView;
        int option = this.getArguments().getInt(ARG_OPTION);
        rootView = inflater.inflate(R.layout.login, container, false);
        return rootView;
    }


    public static MainActivityFragment newInstance(int option,CallbackManager NewcallbackManager) {
        MainActivityFragment fragment = new MainActivityFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_OPTION, option);
        fragment.setArguments(args);
        return fragment;

    }
}
