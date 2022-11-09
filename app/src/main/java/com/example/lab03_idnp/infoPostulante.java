package com.example.lab03_idnp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class infoPostulante extends AppCompatActivity {

    EditText dni;
    Button btnBuscar, btnBack;
    TextView tvDatos,tvDatos2;
    Persona persona, persona2;
    Persona [] directorio = new Persona[15];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_postulante);
        persona2= new Persona();
        persona2.setNombre("rodrigo");
        persona2.setApellido("olaechea");
        persona2.setDni("70479720");
        persona2.setColegio("fleming");
        persona2.setCarrera("sistemas");
        tvDatos = (TextView) findViewById(R.id.tvDatos);
        tvDatos2 = (TextView) findViewById(R.id.tvDatos);

        recibirDatos();
        btnBuscar=findViewById(R.id.btnBuscar);
        btnBack=findViewById(R.id.btnBack);

        dni = findViewById(R.id.dniBusqueda);

        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dni.getText().toString().equals(persona.getDni()) )
                {
                    persona.muetraPersonaTextView(tvDatos, persona);

                }else if (dni.getText().toString().equals(persona2.getDni())){
                    persona2.muetraPersonaTextView(tvDatos2, persona2);

                }else
                {Toast.makeText(infoPostulante.this, "No hay ningún postulante registrado con el numero de DNI ingresado", Toast.LENGTH_SHORT).show();

                }
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(infoPostulante.this,Menu.class);
                startActivity(intent);
            }
        });
       /* btnBuscar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                for(int i=0; i<=directorio.length;i++)
                {
                    if (persona.getDni().toString().equals(directorio[i].getDni().toString()))
                    {
                        personapiv =  directorio[i];
                        personapiv.muetraPersonaTextView(tvDatos,directorio[i]);
                    }
                    else
                    {
                        Toast.makeText(infoPostulante.this, "No existe algún postulante con el DNI ingresado", Toast.LENGTH_SHORT).show();
                    }
                }
            }
            }
        });
*/
       /* btnBack.findViewById(R.id.btnBack);
        btnBuscar.findViewById(R.id.btnBuscar);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(infoPostulante.this, Menu.class);
                startActivity(intent);
            }
        });
*/

    }
    public void anadirDirectorio (Persona persona)
    {
        for(int i=0; i<=directorio.length; i++)
        {
            if (directorio[i] != null)
            {
                directorio[i] = persona;
            }

        }
    }
    public void recibirDatos()
    {
        Bundle extras = getIntent().getExtras();
        String nombre = extras.getString("dato01");
        String apellido = extras.getString("dato02");
        String dni = extras.getString("dato03");
        String colegio = extras.getString("dato04");
        String carrera = extras.getString("dato05");
        persona = new Persona();
        persona.setNombre(nombre);
        persona.setApellido(apellido);
        persona.setDni(dni);
        persona.setColegio(colegio);
        persona.setCarrera(carrera);

       tvDatos = (TextView) findViewById(R.id.tvDatos);
      // tvDatos.setText(nombre+ "/n" + apellido + dni);

    }
}
