package com.example.lab03_idnp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class nuevoPostulante extends AppCompatActivity {

    EditText nombre, apellido,dni, colegio, carrera;
    Button btnRegistrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_postulante);
        nombre = findViewById(R.id.dniBusqueda);
        apellido= findViewById(R.id.apellido);
        dni= findViewById(R.id.dni);
        colegio= findViewById(R.id.colegio);
        carrera= findViewById(R.id.carrera);

        btnRegistrar= findViewById(R.id.btnBuscar);

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Persona persona = new Persona();
                persona.setNombre(nombre.getText().toString());
                persona.setApellido(apellido.getText().toString());
                persona.setDni(dni.getText().toString());
                persona.setColegio(colegio.getText().toString());
                persona.setCarrera(carrera.getText().toString());
              Toast.makeText(nuevoPostulante.this, "Registro Completado", Toast.LENGTH_SHORT).show();
              Intent ilo = new Intent(nuevoPostulante.this,menu2.class);
              Intent intento = new Intent(nuevoPostulante.this,infoPostulante.class);
              intento.putExtra("dato01", persona.getNombre());
              intento.putExtra("dato02",persona.getApellido());
              intento.putExtra("dato03",persona.getDni());
              intento.putExtra("dato04",persona.getColegio());
              intento.putExtra("dato05",persona.getCarrera());
              startActivity( intento );
            }
        });

    }
}



