package com.syracuse.android.foodfeast;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.syracuse.eecs.sandesh.foodfeast.R;

import org.w3c.dom.Text;


/**
 * A placeholder fragment containing a facebook login details.. to be replaced by recyler view class.
 */
public class EventFragment extends Fragment {

    private static final String ARG_OPTION = "argument_option";
    public EventFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView;
        int option = this.getArguments().getInt(ARG_OPTION);
        rootView = inflater.inflate(R.layout.event_details_fragment, container, false);
        final TextView email = (TextView) rootView.findViewById(R.id.email);

        final TextView username = (TextView) rootView.findViewById(R.id.username);
        Button button = (Button) rootView.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MyApplication application = (MyApplication) getActivity().getApplicationContext();
                MyApplication.ApplicationManager mng = application.getApplicationManager();
                email.setText(application.getApplicationManager().getEmail());
                Toast.makeText(getActivity().getApplicationContext(), application.getApplicationManager().getEmail(), Toast.LENGTH_SHORT).show();
                username.setText(application.getApplicationManager().getUserName());
            }
        });
        return rootView;
    }

    public static EventFragment newInstance(int option) {
        EventFragment fragment = new EventFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_OPTION, option);
        fragment.setArguments(args);
        return fragment;

    }
}
