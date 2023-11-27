package com.example.mylogin;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


public class CompGroupFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_comp_group,container,false);

        ImageButton user1FragmentButton = view.findViewById(R.id.userButton1);
        ImageButton user2FragmentButton = view.findViewById(R.id.userButton2);
        ImageButton user3FragmentButton = view.findViewById(R.id.userButton3);
        ImageButton user4FragmentButton = view.findViewById(R.id.userButton4);
        ImageButton user5FragmentButton = view.findViewById(R.id.userButton5);
        ImageButton messageFragmentButton = view.findViewById(R.id.messageButton);
        ImageButton meetingFragmentButton = view.findViewById(R.id.meetingsButton);

        user1FragmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new ProfileFragment());
                //transaction.addToBackStack(null); // Optional, for back navigation
                transaction.commit();
            }
        });
        user2FragmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new ProfileFragment());
                transaction.commit();
            }
        });
        user3FragmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new ProfileFragment());
                transaction.commit();
            }
        });
        user4FragmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new ProfileFragment());
                transaction.commit();
            }
        });
        user5FragmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new ProfileFragment());
                transaction.commit();
            }
        });

        messageFragmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new MessageFragment());
                transaction.commit();
            }
        });

        meetingFragmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new CompMeetingsFragment());
                transaction.commit();
            }
        });

        return view;
    }
}