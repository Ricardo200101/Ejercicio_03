package com.example.ejercicio_03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class pantalla2 extends AppCompatActivity {

    EditText edad;
    Button calcular, iratres;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        edad=(EditText) findViewById(R.id.editxtEdad);
        calcular=(Button) findViewById(R.id.btn2);
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double resul;
                float edad1;

                edad1=Float.parseFloat(edad.getText().toString());

                resul= 207 - (0.7019864 * edad1);

                Toast.makeText(getApplicationContext(), "SU FRECUENCIA CARDIACA ES DE: "+resul, Toast.LENGTH_LONG).show();








            }
        });

        iratres=(Button) findViewById(R.id.btn3);
        iratres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent irpantalla3 = new Intent(getApplicationContext(), pantalla3.class);
                startActivity(irpantalla3);
            }
        });


    }
}