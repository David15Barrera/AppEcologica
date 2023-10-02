package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        setTheme(R.style.Theme_MyApplication);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
*
*Boton para el primer boton
*
* */

       Button boton = findViewById(R.id.button);

        // Agrega un OnClickListener al botón
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crea un intent para iniciar PrimerBotonActivity
                Intent intent = new Intent(MainActivity.this, PrimerBoton.class);
                startActivity(intent); // Inicia la actividad
            }
        });
/*
*
*Boton para el segundo boton
*
 * */
        Button boton2 = findViewById(R.id.button2);

        // Agrega un OnClickListener al botón
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crea un intent para iniciar SegundoBotonActivity
                Intent intent = new Intent(MainActivity.this, SegundoBoton.class);
                startActivity(intent); // Inicia la actividad
            }
        });
/*
*
*Boton para el tercer boton
*
* */
      Button boton3 = findViewById(R.id.button3);

        // Agrega un OnClickListener al botón
        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crea un intent para iniciar SegundoBotonActivity
                Intent intent = new Intent(MainActivity.this, TercerBoton.class);
                startActivity(intent); // Inicia la actividad
            }
        });
/*
*
*Boton para el cuarto boton
*
* */
        Button boton4 = findViewById(R.id.button4);

        // Agrega un OnClickListener al botón
        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crea un intent para iniciar SegundoBotonActivity
                Intent intent = new Intent(MainActivity.this, CuartoBoton.class);
                startActivity(intent); // Inicia la actividad
            }
        });
/*
*
*Boton para el quinto boton
*
* */
        Button boton5 = findViewById(R.id.button8);

        // Agrega un OnClickListener al botón
        boton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crea un intent para iniciar SegundoBotonActivity
                Intent intent = new Intent(MainActivity.this, QuintoBoton.class);
                startActivity(intent); // Inicia la actividad
            }
        });

    }
}