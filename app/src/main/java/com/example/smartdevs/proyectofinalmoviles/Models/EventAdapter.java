package com.example.smartdevs.proyectofinalmoviles.Models;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.smartdevs.proyectofinalmoviles.R;

import java.util.ArrayList;

public class EventAdapter extends ArrayAdapter<EventModel> {
    private ArrayList<EventModel> events;

    public EventAdapter(@NonNull Context context, int resource, ArrayList<EventModel> events) {
        super(context, resource, events);
        this.events = events;
        Log.d("", "Constructor EventAdapter");
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_event_list, parent, false);
        }

        TextView nombreEvento = convertView.findViewById(R.id.nombre_evento);
        TextView fechaEvento = convertView.findViewById(R.id.fechaEvento);

        nombreEvento.setText(events.get(position).getNombre());
        fechaEvento.setText(events.get(position).getFecha());

        return convertView;
    }

}
