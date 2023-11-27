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


public class CompMeetingsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_comp_meetings, container, false);

        ImageButton meeting1Button = view.findViewById(R.id.imageButtonCompMeeting1);
        ImageButton meeting2Button = view.findViewById(R.id.imageButtonCompMeeting2);
        ImageButton meeting3Button = view.findViewById(R.id.imageButtonCompMeeting3);

        meeting1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, new MeetingInfoFragment());
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

        return view;
    }
}