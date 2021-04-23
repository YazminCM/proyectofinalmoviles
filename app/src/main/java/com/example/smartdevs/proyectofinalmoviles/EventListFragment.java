package com.example.smartdevs.proyectofinalmoviles;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.smartdevs.proyectofinalmoviles.Models.EventAdapter;
import com.example.smartdevs.proyectofinalmoviles.Models.EventModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class EventListFragment extends Fragment {
    public static final String ARG_OBJECT = "object";
    ArrayList<EventModel> data;
    ListView listView;
    FloatingActionButton btnAdd;

    public EventListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_event_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        Bundle args = getArguments();
        //args.getInt(ARG_OBJECT)
        listView = view.findViewById(R.id.eventList);
        btnAdd = view.findViewById(R.id.floatingActionButton);

        btnAdd.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), EventActivity.class);
            startActivity(intent);
        });

        this.data = new ArrayList<EventModel>();
        this.data.add(new EventModel("1", "Puente", "casa", "juan", "recordatorio", "lunes"));
        this.data.add(new EventModel("2", "cumplea", "casa", "rober", "recordatorio", "martes"));
        this.data.add(new EventModel("3", "cumplea3", "casa", "rober", "meta", "martes"));
        EventAdapter adapter = new EventAdapter(getActivity(), R.layout.item_event_list, this.data);

        listView.setAdapter(adapter);
    }
}