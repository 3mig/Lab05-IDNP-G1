package com.example.lab03_idnp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu2 extends AppCompatActivity {
    Button btnNuevo, btnInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);

        btnNuevo= findViewById(R.id.botonNuevo);
        btnInfo= findViewById(R.id.botonInfo);

        btnNuevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(menu2.this, infoPostulante.class);
                startActivity(intent1);
            }
        });
        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(menu2.this, infoPostulante.class);
                startActivity(intent2);
            }
        });
    }
}