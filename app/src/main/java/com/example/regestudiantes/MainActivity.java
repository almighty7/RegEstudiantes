package com.example.regestudiantes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText nombres, apellidos,dni,cui,telefono;
    Button aceptar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombres=(EditText)findViewById(R.id.editNombres);
        apellidos=(EditText)findViewById(R.id.editApellidos);
        dni=(EditText)findViewById(R.id.editDni);
        cui=(EditText)findViewById(R.id.editCui);
        telefono=(EditText)findViewById(R.id.editTelefono);
        aceptar=(Button)findViewById(R.id.btnGuardar);

        aceptar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

            }
        });
    }
}