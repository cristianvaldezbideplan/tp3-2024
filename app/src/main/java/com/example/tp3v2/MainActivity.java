package com.example.tp3v2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        Button btnIniciarSesion = findViewById(R.id.btnIniciarSesion);

        Button btnRegistrar = findViewById(R.id.btnRegistrar);

        EditText editUsuario = findViewById(R.id.editUsuario);

        EditText editContrasena = findViewById(R.id.editContrasena);

        btnIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = editUsuario.getText().toString();
                String Contrasena = editContrasena.getText().toString();
                if (usuario.equals("alumno")){
                    if (Contrasena.equals("1234")){
                        Toast.makeText(MainActivity.this, "Iniciando Sesion", Toast.LENGTH_SHORT).show();
                        Intent Pantalla2 = new Intent(getBaseContext(), PantallaPrincipal.class);
                        startActivity(Pantalla2);
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Error, La Contraseña ingresada es erronea, intente Nuevamente", Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(MainActivity.this, "Error, El Usuario ingresado es erroneo", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Proximamente", Toast.LENGTH_SHORT).show();
            }
        });

    }
}