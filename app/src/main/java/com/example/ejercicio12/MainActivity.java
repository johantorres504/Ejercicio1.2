package com.example.ejercicio12;

import static com.example.ejercicio12.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        Button add;
        EditText nombre, apellido,correo;
        EditText edad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        add = (Button) findViewById(id.add);
        nombre = (EditText) findViewById(id.nombre);
        apellido = (EditText) findViewById(id.apellido);
        edad = (EditText) findViewById(id.edad);
        correo = (EditText) findViewById(id.correo);

        add.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(MainActivity.this, "Información: ", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getApplicationContext(),ActivityInformacion.class);

                intent.putExtra("nombre", nombre.getText().toString());
                intent.putExtra("apellido", apellido.getText().toString());
                intent.putExtra("edad", edad.getText().toString());
                intent.putExtra("correo", correo.getText().toString());

                startActivity(intent);

            }
        });
    }
}