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

import com.example.smartdevs.proyectofinalmoviles.Models.ContactAdapter;
import com.example.smartdevs.proyectofinalmoviles.Models.ContactModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class ContactListFragment extends Fragment {
    public String[] names = {"Beto", "Luis"};
    public static final String ARG_OBJECT = "object";
    ArrayList<ContactModel> data;
    ListView listView;
    FloatingActionButton btnAdd;

    public ContactListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_contact_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        Bundle args = getArguments();
        //args.getInt(ARG_OBJECT)
        listView = ((ListView) view.findViewById(R.id.userList));
        btnAdd = (FloatingActionButton) view.findViewById(R.id.floatingActionButton);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getActivity(),"Hola beto",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), ContactActivity.class);
                startActivity(intent);
            }
        });

        this.data = new ArrayList<ContactModel>();
        this.data.add(new ContactModel("1", "Roberto", "225566339", ""));
        this.data.add(new ContactModel("2", "Luis", "6666666", ""));

        ContactAdapter adapter = new ContactAdapter(getActivity(), R.layout.item_contact_list, this.data);

        listView.setAdapter(adapter);
    }
}