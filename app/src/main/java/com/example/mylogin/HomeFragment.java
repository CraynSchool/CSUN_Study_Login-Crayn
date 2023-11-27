package com.example.mylogin;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;


public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        ImageButton mathFragmentButton = view.findViewById(R.id.mathButton);
        ImageButton historyFragmentButton = view.findViewById(R.id.historyButton);
        ImageButton compFragmentButton = view.findViewById(R.id.compButton);
        ImageButton example4FragmentButton = view.findViewById(R.id.imageButton4);
        ImageButton example5FragmentButton = view.findViewById(R.id.imageButton5);
        ImageButton example6FragmentButton = view.findViewById(R.id.imageButton6);
        Button createGroupButton= view.findViewById(R.id.buttonNewGroup);
        ImageButton meeting1Button = view.findViewById(R.id.imageButtonMeeting1);
        ImageButton meeting2Button = view.findViewById(R.id.imageButtonMeeting2);
        ImageButton meeting3Button = view.findViewById(R.id.imageButtonMeeting3);
        ImageButton meeting4Button = view.findViewById(R.id.imageButtonMeeting4);
        ImageButton meeting5Button = view.findViewById(R.id.imageButtonMeeting5);

        createGroupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new CreateGroupFragment());
                //transaction.addToBackStack(null); // Optional, for back navigation
                transaction.commit();
            }
        });

        mathFragmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Replace the current fragment with MathGroupFragment
                FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new MathGroupFragment());
                //transaction.addToBackStack(null); // Optional, for back navigation
                transaction.commit();
            }
        });

        historyFragmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Replace the current fragment with HistoryGroupFragment
                FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new HistoryGroupFragment());
                //transaction.addToBackStack(null); // Optional, for back navigation
                transaction.commit();
            }
        });

        compFragmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new CompGroupFragment());
                transaction.commit();
            }
        });
        example4FragmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Replace the current fragment with MathGroupFragment
                FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new ExampleGroupFragment());
                //transaction.addToBackStack(null); // Optional, for back navigation
                transaction.commit();
            }
        });
        example5FragmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Replace the current fragment with MathGroupFragment
                FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new ExampleGroupFragment());
                //transaction.addToBackStack(null); // Optional, for back navigation
                transaction.commit();
            }
        });
        example6FragmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Replace the current fragment with MathGroupFragment
                FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new ExampleGroupFragment());
                //transaction.addToBackStack(null); // Optional, for back navigation
                transaction.commit();
            }
        });

        meeting1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Replace the current fragment with MathGroupFragment
                FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new MeetingInfoFragment());
                //transaction.addToBackStack(null); // Optional, for back navigation
                transaction.commit();
            }
        });

        meeting2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new MeetingInfoFragment());
                transaction.commit();
            }
        });

        meeting3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new MeetingInfoFragment());
                transaction.commit();
            }
        });

        meeting4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new MeetingInfoFragment());
                transaction.commit();
            }
        });

        meeting5Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new MeetingInfoFragment());
                transaction.commit();
            }
        });

        return view;
    }
}