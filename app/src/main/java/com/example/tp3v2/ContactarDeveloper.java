package com.example.tp3v2;

import android.content.Intent;
import android.net.Uri;
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

public class ContactarDeveloper extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_contactar_developer);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageView imageReversa3 = findViewById(R.id.imageReversa3);

        Button btnCorreo = findViewById(R.id.btnCorreo);
        Button btnWhatsapp = findViewById(R.id.btnWhatsapp);
        Button btnInstagram = findViewById(R.id.btnInstagram);
        Button btnFacebook = findViewById(R.id.btnFacebook);
        Button btnTelefono = findViewById(R.id.btnTelefono);
        Button btnGitHub = findViewById(R.id.btnGitHub);
        Button btnPagWeb = findViewById(R.id.btnPagWeb);

        imageReversa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ContactarDeveloper.this, "Volviendo", Toast.LENGTH_SHORT).show();
                Intent Pantalla7 = new Intent(getBaseContext(), AcercaDeveloper.class);
                startActivity(Pantalla7);
            }
        });

        btnPagWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ContactarDeveloper.this, "Abriendo", Toast.LENGTH_SHORT).show();
                Intent PaginaWeb = new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com/?hl=es-419"));
                startActivity(PaginaWeb);
            }
        });

        btnGitHub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ContactarDeveloper.this, "Abriendo", Toast.LENGTH_SHORT).show();
                Intent GitHub = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/"));
                startActivity(GitHub);
            }
        });

        btnFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ContactarDeveloper.this, "Abriendo", Toast.LENGTH_SHORT).show();
                Intent Facebook = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/ITESSR/?locale=es_LA"));
                startActivity(Facebook);
            }
        });

        btnInstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ContactarDeveloper.this, "Abriendo", Toast.LENGTH_SHORT).show();
                Intent Instagram = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/ites.santarosa/?hl=es"));
                startActivity(Instagram);
            }
        });

        btnWhatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://api.whatsapp.com/send?phone="+ "+54 9 02954700637";
                Toast.makeText(ContactarDeveloper.this, "Abriendo", Toast.LENGTH_SHORT).show();
                Intent Whatsapp = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(Whatsapp);
            }
        });

        btnCorreo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ContactarDeveloper.this, "Abriendo", Toast.LENGTH_SHORT).show();
                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.setType("message/rfc822");
                emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[] {"CorreoDelProgramador@gmail.com" });
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Asunto del Mensaje");
                emailIntent.putExtra(Intent.EXTRA_TEXT, "Mensaje a Enviar");
                startActivity(Intent.createChooser(emailIntent, "Seleccionar aplicación."));
            }
        });

        btnTelefono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ContactarDeveloper.this, "Abriendo", Toast.LENGTH_SHORT).show();
                Intent Telefono = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: 2954333333"));
                startActivity(Telefono);
            }
        });

    }
}