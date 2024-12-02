package com.example.aplicacion_de_login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SegundaActividad extends AppCompatActivity {
    private TextView despedidaTextView;
    private Button regresarButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        despedidaTextView = findViewById(R.id.despedidaTextView);
        regresarButton = findViewById(R.id.regresarButton);

        String nombre = getIntent().getStringExtra("nombre");
        despedidaTextView.setText("¡ie, Adiós, " + nombre + "!");

        regresarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resultIntent = new Intent();
                resultIntent.putExtra("respuesta", "Regresaste con éxito.");
                setResult(RESULT_OK, resultIntent);
                finish();
            }
        });
    }
}