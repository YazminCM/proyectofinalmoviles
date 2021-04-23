package com.example.smartdevs.proyectofinalmoviles;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class EventActivity extends AppCompatActivity{

    Button btnCancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);


        //create a list of items for the spinner 1.
        Spinner dropdown1 = findViewById(R.id.ddcontacto);
        String[] contact = new String[]{"Luisa", "Roberto", "Daniel"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, contact);
        dropdown1.setAdapter(adapter1);

        //create a list of items for the spinner 2.
        Spinner dropdown2 = findViewById(R.id.ddTipoEvent);
        String[] tipo = new String[]{"Recordatorio", "Evento", "Meta"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, tipo);
        dropdown2.setAdapter(adapter2);

        this.btnCancel = (Button) findViewById(R.id.btnCancel);

        this.btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
