package com.example.ejercicio12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityInformacion extends AppCompatActivity {
        TextView textViewnombre,textViewapellido,textViewedad,textViewcorreo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);

        textViewnombre = (TextView) findViewById(R.id.textViewnombre);
        textViewapellido = (TextView) findViewById(R.id.textViewapellido);
        textViewedad = (TextView) findViewById(R.id.textViewedad);
        textViewcorreo = (TextView) findViewById(R.id.textViewcorreo);

        Bundle resultado = getIntent().getExtras();
        textViewnombre.setText(resultado.getString("nombre"));
        textViewapellido.setText(resultado.getString("apellido"));
        textViewedad.setText(resultado.getString("edad"));
        textViewcorreo.setText(resultado.getString("correo"));

    }
}