package com.example.tp3v2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PantallaPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pantalla_principal);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btnAcercaDe = findViewById(R.id.btnAcercaDe);
        Button btnProgramador = findViewById(R.id.btnProgramador);
        Button btnProx1 = findViewById(R.id.btnProx1);
        Button btnProx2 = findViewById(R.id.btnProx2);
        Button btnSalir = findViewById(R.id.btnSalir);

        btnAcercaDe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PantallaPrincipal.this, "Iniciando", Toast.LENGTH_SHORT).show();
                Intent Pantalla3 = new Intent(getBaseContext(), AcercaMarca.class);
                startActivity(Pantalla3);
            }
        });

        btnProgramador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PantallaPrincipal.this, "Iniciando", Toast.LENGTH_SHORT).show();
                Intent Pantalla4 = new Intent(getBaseContext(), AcercaDeveloper.class);
                startActivity(Pantalla4);
            }
        });

        btnProx1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PantallaPrincipal.this, "Proximamente", Toast.LENGTH_SHORT).show();
            }
        });

        btnProx2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PantallaPrincipal.this, "Proximamente", Toast.LENGTH_SHORT).show();
            }
        });

        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PantallaPrincipal.this, "Cerrando Sesion", Toast.LENGTH_SHORT).show();
                Intent Salir = new Intent(getBaseContext(), MainActivity.class);
                startActivity(Salir);
            }
        });

    }
}