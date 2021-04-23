package com.example.smartdevs.proyectofinalmoviles.Models;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.smartdevs.proyectofinalmoviles.R;

import java.util.ArrayList;

public class ContactAdapter extends ArrayAdapter<ContactModel> {
    private ArrayList<ContactModel> contacts;
    public ContactAdapter(@NonNull Context context, int resource, ArrayList<ContactModel> contacts) {
        super(context, resource, contacts);
        this.contacts = contacts;
        Log.d("","Constructor ContactAdapter");
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_contact_list, parent, false);
        }

        ImageView image = convertView.findViewById(R.id.profile_image);
        TextView nombre = convertView.findViewById(R.id.nombre);
        TextView num = convertView.findViewById(R.id.numero);

        nombre.setText(contacts.get(position).getName());
        num.setText(contacts.get(position).getNumber());
        image.setImageResource(R.drawable.perfil);

        return convertView;
    }
}