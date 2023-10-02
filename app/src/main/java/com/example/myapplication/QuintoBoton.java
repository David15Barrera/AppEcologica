package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuintoBoton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quinto_boton);
        /*
         *
         *Boton para el primer boton
         *
         * */

        Button boton2 = findViewById(R.id.button5);

        // Agrega un OnClickListener al botón
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crea un intent para iniciar PrimerBotonActivity
                Intent intent = new Intent(QuintoBoton.this, Juego.class);
                startActivity(intent); // Inicia la actividad
            }
        });

        /*
         *
         *Boton para el Segundo boton
         *
         * */

        Button boton = findViewById(R.id.button6);

        // Agrega un OnClickListener al botón
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crea un intent para iniciar PrimerBotonActivity
                Intent intent = new Intent(QuintoBoton.this, MainActivity.class);
                startActivity(intent); // Inicia la actividad
            }
        });


    }


}