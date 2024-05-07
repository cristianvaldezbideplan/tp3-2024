package com.example.tp3v2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AcercaDeveloper extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_acerca_developer);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btnContactar = findViewById(R.id.btnContactar);
        ImageView imageReversa1 = findViewById(R.id.imageReversa1);

        btnContactar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AcercaDeveloper.this, "Contactando", Toast.LENGTH_SHORT).show();
                Intent Pantalla4 = new Intent(getBaseContext(), ContactarDeveloper.class);
                startActivity(Pantalla4);
            }
        });

        imageReversa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AcercaDeveloper.this, "Volviendo", Toast.LENGTH_SHORT).show();
                Intent Pantalla5 = new Intent(getBaseContext(), PantallaPrincipal.class);
                startActivity(Pantalla5);
            }
        });

    }
}