package com.example.lab03_idnp;

import android.widget.TextView;

public class Persona {

    private  String Nombre ;
    private  String Apellido;
    private  String Dni;
    private  String Colegio;
    private  String Carrera;


    Persona()
    {
        this.setNombre("no");
        this.setApellido("no");
        this.setDni("no");
        this.setColegio("no");
        this.setCarrera("no");
    }

    void setNombre(String nombre)
    {
        Nombre=nombre;
    }
    void setApellido(String apellido)
    {
        Apellido=apellido;
    }
    void setDni(String dni)
    {
        Dni=dni;
    }
    void setColegio(String colegio)
    {
        Colegio=colegio;
    }
    void setCarrera(String carrera)
    {
        Carrera=carrera;
    }
    String getNombre()
    {
        return Nombre;
    }
    String getApellido()
    {
        return Apellido;
    }
    String getDni()
    {
        return Dni;
    }
    String getColegio()
    {
        return Colegio;
    }
    String getCarrera()
    {
        return Carrera;
    }
    void muetraPersonaTextView(TextView textView, Persona persona)
    {
        String cadenaMostrar = textView.getText() + "\n"+ "\n" + "\n"+ " Datos de la persona \n" + "\n \t Nombre: " +persona.getNombre()+ "\n \t Apellido: "+persona.getApellido()+"\n \t DNI:"+persona.getDni()+"\n \t Colegio: "+persona.getColegio()+"\n \t Carrera: "+persona.getCarrera();
        textView.setText(cadenaMostrar);
    }


}
