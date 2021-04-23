package com.example.smartdevs.proyectofinalmoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContactActivity extends AppCompatActivity {

    Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        //boton cancelar
        this.btnCancel = findViewById(R.id.btnCancel);
        this.btnCancel.setOnClickListener(v -> finish());
    }
}
